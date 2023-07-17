package OOP;
class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}

// Employee class inheriting from Person
class Employee extends Person {
    private int employeeID;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, String gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender);
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }
}

// Customer class inheriting from Person
class Customer extends Person {
    private int customerID;
    private String address;
    private String phoneNumber;

    public Customer(String name, int age, String gender, int customerID, String address, String phoneNumber) {
        super(name, age, gender);
        this.customerID = customerID;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

// main class
public class OOP6 {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee("John Doe", 30, "Male", 1234, "Software Developer", 5000.0);
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Gender: " + employee.getGender());
        System.out.println("Employee ID: " + employee.getEmployeeID());
        System.out.println("Job Title: " + employee.getJobTitle());
        System.out.println("Salary: $" + employee.getSalary());

        System.out.println();

        // Creating a Customer object
        Customer customer = new Customer("Jane Smith", 25, "Female", 5678, "123 Main Street", "555-1234");
        System.out.println("Customer Details:");
        System.out.println("Name: " + customer.getName());
        System.out.println("Age: " + customer.getAge());
        System.out.println("Gender: " + customer.getGender());
        System.out.println("Customer ID: " + customer.getCustomerID());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("Phone Number: " + customer.getPhoneNumber());
    }
}