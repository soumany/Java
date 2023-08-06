import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Student implements Serializable {
    private String id;
    private String name;
    private int age;

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class StudentManagementSystem {
    private List<Student> students;
    private String filePath;

    public StudentManagementSystem(String filePath) {
        this.students = new ArrayList<>();
        this.filePath = filePath;
    }

    public void addStudent(Student student) {
        students.add(student);
        saveDataToFile();
        System.out.println("Student added successfully.");
    }

    public void updateStudent(String id, Student updatedStudent) {
        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                students.set(i, updatedStudent);
                found = true;
                break;
            }
        }
        if (found) {
            saveDataToFile();
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void deleteStudent(String id) {
        boolean removed = students.removeIf(student -> student.getId().equals(id));
        if (removed) {
            saveDataToFile();
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void printAllStudents() {
        for (Student student : students) {
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("------------------------");
        }
    }

    private void saveDataToFile() {
        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(students);
        } catch (IOException e) {
            System.out.println("Error occurred while saving data to file.");
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    private List<Student> loadDataFromFile() {
        List<Student> loadedStudents = null;
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            loadedStudents = (List<Student>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error occurred while loading data from file.");
            e.printStackTrace();
        }
        return loadedStudents != null ? loadedStudents : new ArrayList<>();
    }

    public void loadStudentsFromFile() {
        students = loadDataFromFile();
        System.out.println("Data loaded successfully from file.");
    }
}

public class Exercise03 {
    public static void main(String[] args) {
        String filePath = "students.dat";
        StudentManagementSystem sms = new StudentManagementSystem(filePath);

        // Load existing students from the file
        sms.loadStudentsFromFile();

        // Add a student
        Student newStudent = new Student("1001", "John Doe", 20);
        sms.addStudent(newStudent);

        // Update a student
        Student updatedStudent = new Student("1001", "John Smith", 21);
        sms.updateStudent("1001", updatedStudent);

        // Delete a student
        sms.deleteStudent("1001");

        // Print all students
        sms.printAllStudents();
    }
}

