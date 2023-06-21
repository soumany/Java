//Exercise4
//HeatKoemnak

import java.util.HashMap;
import java.util.Scanner;

class Score{
    double Math_score;
    double Phy_score;
    double Chem_score;

    Score(double Math_score, double Phy_score, double Chem_score){
        this.Math_score = Math_score;
        this.Phy_score = Phy_score;
        this.Chem_score = Chem_score;

    }
    
    double GetTotal(){
        return Math_score + Phy_score + Chem_score;
    }

}

class Student{

    int id;
    String name;
    Score score;

    Student(int id, String name, Score score){
        this.id = id;
        this.name = name;
        this.score = score;

    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Score getScore() {
        return score;
    }

    public static HashMap<Integer, Student> students = new HashMap<>();
    public static Scanner scanner = new Scanner(System.in);

    public void readStudent() {

        System.out.print("Enter ID: ");
        id = scanner.nextInt();
        if (students.containsKey(id)){
            String message = "Student with ID "+ id +" already exists.";
            System.out.println();
            throw new RuntimeException(message);

        }
        System.out.print("Enter Name: ");
        scanner.nextLine();
        name = scanner.nextLine();
        System.out.print("Enter Math Score: ");
        double mathScore = scanner.nextDouble();
        System.out.print("Enter Physics Score: ");
        double phyScore = scanner.nextDouble();
        System.out.print("Enter Chemistry Score: ");
        double chemScore = scanner.nextDouble();
        score = new Score(mathScore, phyScore, chemScore);
        System.out.println("student added successfully");

    }
    public static void addStudent() {
        Student student = new Student(0, null, null);
        boolean isAdded=false;
        do{
            try{
                student.readStudent();
                isAdded=true;
            }
            catch(RuntimeException e){
                System.out.println(e.getMessage());
            }
        }while(!isAdded);
        students.put(student.getId(), student);
    }

    public static void displayAllStudents() {

        System.out.println("----------------------------------------------------------------");
        System.out.printf("%-5s %-15s %-10s %-10s %-12s %-10s\n", "ID", "Name", "Math", "Physics", "Chemistry", "Total" );
        System.out.println("----------------------------------------------------------------");
        for (Student student : students.values()) {
            System.out.printf("%-5d %-15s %-10.02f %-10.02f %-12.02f %-10.02f\n",
                    student.getId(),
                    student.getName(),
                    student.getScore().Math_score,
                    student.getScore().Phy_score,
                    student.getScore().Chem_score,
                    student.getScore().GetTotal()
            );
        }
        System.out.println("----------------------------------------------------------------");
    }

    public static void deleteStudent() {
            System.out.print("Enter ID of student to delete: ");
            int id = scanner.nextInt();
            if (students.containsKey(id)) {
                students.remove(id);
                System.out.println("Student deleted successfully.");
                System.out.println();
            } else {
                System.out.println();
                System.out.println("Student not found.");
                System.out.println();
            }
    }

    public static void searchStudent() {
        System.out.print("Enter ID of student to search: ");
        int id = scanner.nextInt();
        if (students.containsKey(id)) {
            Student student = students.get(id);
            System.out.println();
            System.out.println("----------------------------------------------------------------");
            System.out.printf("%-5s %-15s %-10s %-10s %-12s %-10s\n", "ID", "Name", "Math", "Physics", "Chemistry", "Total" );
            System.out.println("----------------------------------------------------------------");
            System.out.printf("%-5d %-15s %-10.02f %-10.02f %-12.02f %-10.02f\n",
                    student.getId(),
                    student.getName(),
                    student.getScore().Math_score,
                    student.getScore().Phy_score,
                    student.getScore().Chem_score,
                    student.getScore().GetTotal()
            );
            System.out.println("----------------------------------------------------------------");
            System.out.println();
  
        } else {
            System.out.println();
            System.out.println("Search not found.");
            System.out.println();

        }
    }


}


public class Program {
    
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Student studentOne = new Student(1, "Lucy", new Score(50, 30, 70));
        Student studentTwo = new Student(2, "John", new Score(60, 40, 80));
        Student studentThree = new Student(3, "Alex", new Score(70, 50, 90));

        Student.students.put(studentOne.getId(), studentOne);
        Student.students.put(studentTwo.getId(), studentTwo);
        Student.students.put(studentThree.getId(), studentThree);

        boolean exit = false;

        while (!exit) {
            System.out.println("Please select an option:");
            System.out.println("a. Add new student");
            System.out.println("b. Delete student by id");
            System.out.println("c. Search student by id");
            System.out.println("d. Display student by id");
            System.out.println("e. Exit the program");
            System.out.print("Enter Choice:");
            String choice = scanner.nextLine();
            
            switch (choice) {
                case "a":
                    Student.addStudent();
                    break;
                case "b":
                    Student.deleteStudent();
                    break;
                case "c":
                    Student.searchStudent();
                    break;
                case "d":
                    Student.displayAllStudents();
                    break;
                case "e":
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }


    
}
