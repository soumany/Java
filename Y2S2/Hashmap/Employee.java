package Hashmap;
import java.util.HashMap;
import java.util.Scanner;


public class Employee {
    private int id;
    private String name;
    private String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
   
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
    
    public static HashMap<Integer, Employee> employees = new HashMap<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("Please select an option:");
            System.out.println("a. Display all employees");
            System.out.println("b. Add a new employee");
            System.out.println("c. Delete employee by id");
            System.out.println("d. Update employee by id");
            System.out.println("e. Search employee by id");
            System.out.println("f. Exit the program");
            System.out.print("Enter Choice:");
            String choice = scanner.nextLine();

            switch (choice) {
                case "a":
                    displayAllEmployees();
                    break;
                case "b":
                    addNewEmployee();
                    break;
                case "c":
                    deleteEmployeeById();
                    break;
                case "d":
                    updateEmployeeById();
                    break;
                case "e":
                    searchEmployeeById();
                    break;
                case "f":
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayAllEmployees() {
       

        if (employees.isEmpty()) {
            System.out.println("There are no employees to display.");
        } else {
            System.out.println("-------------------------------------------------------");
            System.out.println("ID \t\t" + "Name \t\t\t"+ "Department\t\t");
            System.out.println("-------------------------------------------------------");
            for (Employee employee : employees.values()) {
            
                System.out.println(employee.getId() + " \t\t" + employee.getName() + " \t\t" + employee.getDepartment());
            }
            System.out.println("-------------------------------------------------------");

        }
    }

    private static void addNewEmployee() {
        System.out.print("Enter employee id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee department: ");
        String department = scanner.nextLine();

        Employee newEmployee = new Employee(id, name, department);
        employees.put(id, newEmployee);

        System.out.println("New employee added successfully.");
    }

    private static void deleteEmployeeById() {
        System.out.print("Enter employee id to delete: ");
        int id = Integer.parseInt(scanner.nextLine());

        if (employees.containsKey(id)) {
            employees.remove(id);
            System.out.println("Employee with id " + id + " deleted successfully.");
        } else {
            System.out.println("Employee with id " + id + " not found.");
        }
    }

    private static void updateEmployeeById() {
        System.out.print("Enter employee id to update: ");
        int id = Integer.parseInt(scanner.nextLine());

        if (employees.containsKey(id)) {
            Employee employeeToUpdate = employees.get(id);

            System.out.print("Enter new name for employee: ");
            String newName = scanner.nextLine();
            employeeToUpdate.setName(newName);

            System.out.print("Enter new department for employee: ");
            String newDepartment = scanner.nextLine();
            employeeToUpdate.setDepartment(newDepartment);

            employees.put(id, employeeToUpdate);

            System.out.println("Employee with id " + id + " updated successfully.");
        } else {
            System.out.println("Employee with id " + id + " not found.");
        }
    }

    private static void searchEmployeeById() {
        System.out.print("Enter employee id to search: ");
        int id = Integer.parseInt(scanner.nextLine());

        if (employees.containsKey(id)) {
            Employee searchedEmployee = employees.get(id);
            System.out.println(searchedEmployee.getId() + " - " + searchedEmployee.getName() + " - " + searchedEmployee.getDepartment());
        } else {
            System.out.println("Employee with id " + id + " not found.");
        }
    }
}

