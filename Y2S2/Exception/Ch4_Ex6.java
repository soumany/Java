//Exercise6 Chapter4
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
class Employee{
    int id;
    String name;
    String gender;
    double salary;

    Employee(int id, String name, String gender, double salary){
        this.id = id;
        this.name = name;
        this.gender= gender;
        this.salary= salary;

    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public static HashMap<Integer, Employee> employees = new HashMap<>();
    public static Scanner scanner = new Scanner(System.in);

    
    public static void deleteEmployee() {
            System.out.print("Enter ID of employee to delete: ");
            int id = scanner.nextInt();
            if (employees.containsKey(id)) {
                employees.remove(id);
                System.out.println("Employee deleted successfully.");
                System.out.println();
            } else {
                System.out.println();
                System.out.println("ID not found.");
                System.out.println();
            }
    }
    public void readEmployee() {
        
        System.out.print("Enter ID: ");
        id = scanner.nextInt();
        if (employees.containsKey(id)){
            String message = "Employee with ID "+ id +" already exists.";
            System.out.println();
            throw new RuntimeException(message);
        }
        System.out.print("Enter Name: ");
        scanner.nextLine();
        name = scanner.nextLine();
        System.out.print("Enter Gender: ");
        gender = scanner.nextLine();
        System.out.print("Enter Salary: ");
        salary = scanner.nextDouble();

    }

    public static void addEmployee() {
        Employee employee = new Employee(0, null, null, 0);
        boolean isAdded = false;
        do {
            try {
                employee.readEmployee();
                isAdded = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!isAdded);
        employees.put(employee.getId(), employee);

        File file = new File("C:\\Github Repo\\APL\\APL-S2\\Assignment4\\Employee.txt");
        
        if(file.exists()){
                System.out.println("New employee has been added successful into file "+file.getPath());
            }else{
                System.out.println("That file does not exist..");
        }
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            String formattedLine = String.format("|%-5d| %-20s| %-10s| %8.2f|%n", employee.getId(), employee.getName(), employee.getGender(), employee.getSalary());
            writer.write(formattedLine);
            writer.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void displayAllEmployee() {

        File file = new File("C:\\Github Repo\\APL\\APL-S2\\Assignment4\\Employee.txt");
        
        String line;
         try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
            
         }catch (Exception e){
                System.out.println(e);
            }
        if(file.exists()){
            System.out.println("Employee saved into file location "+file.getPath());
        }else{
            System.out.println("That file does not exist..");
        }
        
        try{
                FileWriter writer = new FileWriter(file);
                writer.write("----------------<<Employee List>>------------------\n");
                writer.write("---------------------------------------------------\n");
                String columnTitles = String.format("|%-5s| %-20s| %-10s| %8s|%n", "ID", "Name", "Gender", "Salary");
                writer.write(columnTitles);
                writer.write("---------------------------------------------------\n");
                for(Employee employee : employees.values()) {
                    //sort by id
                    String formattedLine=String.format("|%-5d| %-20s| %-10s| %8.2f|%n",employee.getId(),employee.getName(),employee.getGender(),employee.getSalary());
                    writer.write(formattedLine);
                }
                writer.close();

        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        
    };
    
    public static void searchEmployee() {
        System.out.print("Search by employee ID: ");
        int id = scanner.nextInt();
        if (employees.containsKey(id)) {
            Employee employee = employees.get(id);
            System.out.println();
            System.out.println("---------------------------------------------------");
            System.out.printf("|%-5s| %-20s| %-10s| %8s|%n", "ID", "Name", "Gender","Salary" );
            System.out.println("---------------------------------------------------");
            System.out.printf("|%-5d| %-20s| %-10s| %8.2f|%n",
                   employee.getId(),
                    employee.getName(),
                    employee.getGender(),
                    employee.getSalary()
            );
            System.out.println("---------------------------------------------------\n");
  
        } else {
            System.out.println("Search not found.\n");

        }
    }


}


public class Ch4_Ex6 {
    
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
            Employee employeeOne = new Employee(1, "Lucy", "F",300);
            Employee employeeTwo = new Employee(2, "John", "M",400);
            Employee employeeThree = new Employee(3, "Alex", "M",500);

            Employee.employees.put(employeeOne.getId(), employeeOne);
            Employee.employees.put(employeeTwo.getId(), employeeTwo);
            Employee.employees.put(employeeThree.getId(), employeeThree);

            boolean exit = false;
        while (!exit) {
            System.out.println("Please select an option:");
            System.out.println("a. Add new employee");
            System.out.println("b. Delete employee by id");
            System.out.println("c. Search employee by id");
            System.out.println("d. Display all employee");
            System.out.println("e. Exit the program");
            System.out.print("Enter Choice:");
            String choice = scanner.nextLine();
            switch (choice) {
                case "a":
                    Employee.addEmployee();
                    break;
                case "b":
                    Employee.deleteEmployee();
                    break;
                case "c":
                    Employee.searchEmployee();
                    break;
                case "d":
                    Employee.displayAllEmployee();
                    break;
                case "e":
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
};
