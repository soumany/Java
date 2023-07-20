package OOP;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Students {
    private String name;
    private int id;
    private double grade;
    private Map<String, Integer> classesTaken;

    public Students(String name, int id , String classesTaken ,double grade ) {
        this.name = name;
        this.id = id;
        this.grade = grade ;
        this.classesTaken = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    public double getGrade(){
        return grade; 
    }

    public Map<String, Integer> getClassesTaken() {
        return classesTaken;
    }

    public void addClass(String className, int grade) {
        classesTaken.put(className, grade);
    }

    public void dropClass(String className) {
        classesTaken.remove(className);
    }

    public double calculateGPA() {
        if (classesTaken.isEmpty()) {
            return 0.0;
        }

        double sumGrades = 0;
        int totalClasses = 0;

        for (int grade : classesTaken.values()) {
            sumGrades += grade;
            totalClasses++;
        }

        return sumGrades / totalClasses;
    }

    private static Map<Integer, Students> studentsMap;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        studentsMap = new HashMap<>();
        studentsMap.put(1, new Students("John Doe", 1, "Software Engineering", 89));
        studentsMap.put(2, new Students("Jane Doe", 2, "Computer Science", 45));
        studentsMap.put(3, new Students("Peter Smith", 3, "Electrical Engineering", 78));
        studentsMap.put(4, new Students("Sarah Jones", 4, "Mechanical Engineering", 89));
        studentsMap.put(5, new Students("Michael Brown", 5, "Civil Engineering", 99));

        // print all hashmap
        for (Students student : studentsMap.values()) {
            System.out.printf("%-5d %-15s %s %.2f\n",
                    student.getId(),
                    student.getName(),
                    student.getClassesTaken(),
                    student.getGrade()
                    
            );
        }

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        Students student = new Students(
                name,
                id,
                "",
                0.0
        );

        boolean addMoreClasses = true;

        while (addMoreClasses) {
            System.out.print("Enter class name (or 'quit' to stop): ");
            String className = scanner.nextLine();

            if (className.equalsIgnoreCase("quit")) {
                addMoreClasses = false;
                continue;
            }

            System.out.print("Enter grade: ");
            int grade = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            student.addClass(className, grade);
        }

        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getId());
        System.out.println("Classes Taken: " + student.getClassesTaken());

        double gpa = student.calculateGPA();
        System.out.println("GPA: " + gpa);

        boolean dropMoreClasses = true;

        while (dropMoreClasses) {
            System.out.print("Enter class name to drop (or 'quit' to stop): ");
            String className = scanner.nextLine();

            if (className.equalsIgnoreCase("quit")) {
                dropMoreClasses = false;
                continue;
            }

            student.dropClass(className);
        }

        gpa = student.calculateGPA();
        System.out.println("Updated GPA after dropping classes: " + gpa);

        scanner.close();
    }
}
