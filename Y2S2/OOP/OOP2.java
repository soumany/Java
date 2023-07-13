package OOP;
abstract class StudentList{
    private String name;
    private String major;
    private String courses;

    StudentList(String name, String major, String courses){
        this.name = name;
        this.major = major;
        this.courses = courses;
    }

    String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }
    String getMajor(){
        return major;
    }
    void setMajor(String major){
        this.major = major;
    }
    String getCourses(){
        return courses;
    }
    void setCourses(String courses){
        this.courses = courses;
    }
    abstract void takeExam();
}

class PhdStudent1 extends StudentList{
    PhdStudent1(String name, String major, String courses){
        super(name, major, courses);
    }
    void takeExam(){
        System.out.println("Phd student is giving their final defense presentation.");
    }
}

class GradStudent1 extends StudentList{
    GradStudent1(String name, String major, String courses){
        super(name, major, courses);
    }
    void takeExam(){
        System.out.println("Grad student is giving a written paper.");
    }

} 
public class OOP2 {
    public static void main(String[] args) {
        PhdStudent1 phdStudent1 = new PhdStudent1("Sou Many", "Information-Technology", "Java-Programming");
        System.out.println("---------- Phd Student -----------");
        System.out.println("Name: " + phdStudent1.getName());
        System.out.println("Major: " + phdStudent1.getMajor());
        System.out.println("COurses: " + phdStudent1.getMajor());
        System.out.println("------ Phd Student's method ------");
        phdStudent1.takeExam();
        
        System.out.println();

        GradStudent1 gradStudent1 = new GradStudent1("Saing Sopheak", "Computer-science", "Python Programming");
        System.out.println("---------- Grad Student ----------");
        System.out.println("Name: " + gradStudent1.getName());
        System.out.println("Major: " + gradStudent1.getMajor());
        System.out.println("COurses: " + gradStudent1.getMajor());
        System.out.println("-------- Grad Student's method ------");
        gradStudent1.takeExam();
    }
}
