package OOP;
class myDate{
    private int day;
    private int month;
    private int year;

    myDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return day + "-" + month + "-" + year;
    }
}

// Parent class
class Person{

    //fields
    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    // constructor
    Person(String name, String address, String phoneNumber, String emailAddress){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String toString(){
        return "Person: " + name + "\naddress: " + address + "\nphoneNumber: " + phoneNumber + "\nemailAddress: " + emailAddress;
    }
}

// child class
class Students extends Person{
    private static final String[] classStatus = {"Freshman", "Sophomore", "Junior", "Senior"};
    private int studentStatus;

    Students(String name, String address, String phoneNumber, String emailAddress, int studentStatus){
        super(name, address, phoneNumber, emailAddress);
        this.studentStatus = studentStatus;
    }

    public String toString(){
        return "Student:" + super.toString() + ",\nstatus: " + classStatus[studentStatus];
    }
}

// child class
class Employess extends Person{
    private String office;
    private double salary;;
    private myDate dateHired;

    Employess(String name, String address, String phoneNumber, String emailAddress, String office, double salary, myDate dateHired){
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String toString(){
        return "Employee: " + super.toString() + "\nOffice: " + office + "\nSalary: " + salary + "\nDate Hired: " + dateHired.toString();
    }
}

// child class of employess
class FacultyMember extends Employess{
    private String officeHours;
    private String position;

    FacultyMember(String name, String address, String phoneNumber, String emailAddress, String office, double salary, myDate datHired, String officeHours, String position){
        super(name, address, phoneNumber, emailAddress, officeHours, salary, datHired);
        this.officeHours = officeHours;
        this.position = position;
    }

    public String toString(){
        return "Faculty-Member: " + super.toString() + "\nOffice-Hours: " + officeHours + "\nPosition: " + position;
    }
}

// child class of employess
class Staff extends Employess{
    private String title;

    Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, myDate dateHired, String title){
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    public String toString(){
        return "Staff: " + super.toString() + "\nTitle: " + title;
    }
}

public class ExerciseOOP1 {
    public static void main(String[] args) {

        // create a object
        Person person = new Person("Sou Many", "Phnom Penh", "012 345 678", "soumany@gmail.com");
        Students student = new Students("Saing Sopheak", "Preah Vihea", "097-456-567", "Sopheak@gmail.com", 3);
        Employess employess = new Employess("Heat Kimnak", "Battambang", "098 765 890", "kimnak@gmail.com", "A001", 1000.0, new myDate(2, 4, 2024));
        FacultyMember facultyMember = new FacultyMember("Son Khive", "Kompong Cham", "012-567 875", "khive@gmail.com", "B002", 1500.0, new myDate(4, 12, 2023), "7Am - 11pm", "delivery-food");
        Staff staff = new Staff("Srun Chhaylin", "Pailin", "096-678 564", "chhaylin@gmail.com", "C101", 500.0, new myDate(1, 9, 2022), "Manager");

        // display
        System.out.println(person.toString());
        System.out.println("============================================");
        System.out.println(student.toString());
        System.out.println("============================================");
        System.out.println(employess.toString());
        System.out.println("============================================");
        System.out.println(facultyMember.toString());
        System.out.println("============================================");
        System.out.println(staff.toString());
    }
}
