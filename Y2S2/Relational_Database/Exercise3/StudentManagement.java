package Exercise3;
import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class StudentManagement {
    int studentID;
    String studentName ;
    String gender;
    String DOB;
    String phoneNumber;
    String address;
    int year, Generation ;
    String Degree;
    Scanner input = new Scanner(System.in);
    static final String studentFile = "StudentMange.txt" ;
    HashMap<Integer, StudentManagement> StudentMap = new HashMap<>();
    void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    void setGender(String gender) {
        this.gender = gender;
    }
    void setDOB(String DOB) {
        this.DOB = DOB;
    }
    void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    void setAddress (String address){
        this.address = address;
    }
    void setYear (int year){
        this.year = year;
    }
    void setGeneration (int year) {
        this.year = year;
    }
    void setDegree (String degree) {
        this.Degree = Degree;
    }


    StudentManagement (int studentID, String name, String gender, String DOB, String phoneNumber , String adreess,
                       int year, int Generation , String Degree){
        this.studentID = studentID;
        this.studentName = name;
        this.gender = gender;
        this.DOB = DOB;
        this.phoneNumber = phoneNumber;
        this.address = adreess;
        this.year = year;
        this.Generation = Generation;
        this.Degree = Degree;
    }

    void inputFile () {
        System.out.print("Input New Student ID : ");
        studentID = input.nextInt();

        System.out.print("Input New Student name : ");
        studentName = input.next();
        input.nextLine();

        System.out.print("Input Gender : ");
        gender = input.nextLine();

        System.out.print("Input DOB ");
        DOB = input.nextLine();

        System.out.print("Input Phone Number ");
        phoneNumber = input.nextLine();

        System.out.print("Input Address : ");
        address = input.nextLine();

        System.out.print("Input Year of Student : ");
        year = input.nextInt();

        System.out.print("Input Generation of Student : ");
        Generation = input.nextInt();

        System.out.print("Input Degree : ");
        Degree = input.next();
        input.nextLine();
    }
    void readFile (){
        try(FileWriter studentfile = new FileWriter(studentFile)){
            for(StudentManagement students : StudentMap.values()){
                studentfile.write(studentID + " " + studentName + " " + gender +
                       " " + DOB + " " + phoneNumber + " " + address +
                        " " + year + " " + Generation + " " + students.Degree + " " +"\n");

            }
            studentfile.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    void searchFile (int IdForSearch){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(studentFile));
            String line;
            // Add a variable to track if employee is found
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(" ");
                if (Integer.parseInt(data[0]) == IdForSearch) {
                  headMenu();
                    System.out.printf("|%-5s | %-10s | %-3s | %-10s| %-10s | %-10s | %-3s| %-3s| %-10s|\n",
                            IdForSearch, data[1], data[2], data[3],data[4],data[5],data[6],data[7], Degree);
                    // Set found to true
                    break;
                }
            }
            reader.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    void addFile (){
        try {
            FileWriter writer = new FileWriter(studentFile, true);
            writer.write(studentID + " " + studentName + " " + gender +
                    " " + DOB + " " + phoneNumber + " " + address +
                    " " + year + " " + Generation + " " + Degree + "\n");
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    void deleteFile (HashMap<Integer, StudentManagement> deleteStudent, int IDforDelete) {
        try {
            if (deleteStudent.containsKey(IDforDelete)) {
                deleteStudent.remove(IDforDelete);
               addFile();
            }
        } catch (Exception e) {
            System.out.println("Search Not Found ...");
        }
    }
    void updateFile (HashMap<Integer, StudentManagement> updateStudent, int IDforupdate) {
        try {

            if (updateStudent.containsKey(IDforupdate)) {
                System.out.print("Input New Student name : ");
                studentName = input.next();
                input.nextLine();

                System.out.print("Input Gender : ");
                gender = input.nextLine();

                System.out.print("Input DOB ");
                DOB = input.nextLine();

                System.out.print("Input Phone Number ");
                phoneNumber = input.nextLine();

                System.out.print("Input Address : ");
                address = input.nextLine();

                System.out.print("Input Year of Student : ");
                year = input.nextInt();

                System.out.print("Input Generation of Student : ");
                Generation = input.nextInt();

                System.out.print("Input Degree : ");
                Degree = input.next();
                input.nextLine();
                updateStudent.get(IDforupdate).setStudentName(studentName);
                updateStudent.get(IDforupdate).setGender(gender);
                updateStudent.get(IDforupdate).setDOB(DOB);
                updateStudent.get(IDforupdate).setPhoneNumber(phoneNumber);
                updateStudent.get(IDforupdate).setAddress(address);
                updateStudent.get(IDforupdate).setYear(year);
                updateStudent.get(IDforupdate).setGeneration(Generation);
                updateStudent.get(IDforupdate).setDegree(Degree);

                readFile();
            }
        } catch (Exception e) {
            System.out.println("Search Not Found ...");
        }
    }
    void Menu () {
        System.out.println("-> Student Management system <-");
        System.out.print ("""
                     a. add new Student Name \s
                     b. Search a Student by ID \s
                     c. Update a Student       \s
                     d. Delete a Student by ID \s
                     e. Exit program \s
                    """);
    }
    void headMenu() {
        symbole();
        System.out.printf("|%-5s | %-10s | %-3s | %-10s| %-10s | %-10s | %-3s| %-3s| %-10s|\n", "StuID", "StudentName",
                "Sex", "DOB", "Phone-No", "Address", "Year", "Gen", "Degree");
        symbole();
    }
    void symbole () {
        for (int i = 0 ; i < 80 ; i ++){
            System.out.print("-");
        }
        System.out.println();
    }
}

class Testprogram {
    static File file = new File(StudentManagement.studentFile);
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, StudentManagement> StudentMap = new HashMap<>();
        StudentManagement studentTemp = new StudentManagement(0,"null",
                "null","","","",0,0,"");

        //check file exist
        if(!file.exists()){
            studentTemp.readFile();
        }

        boolean exit = false;
        while(!exit){
            studentTemp.symbole();
            studentTemp.Menu();
            studentTemp.symbole();
            System.out.print("   make a chioce : ");
            String chioce = input.nextLine();

            switch (chioce){
                case "a":
                    studentTemp.inputFile();

                    if(StudentMap.containsKey(studentTemp.studentID)){
                        System.out.println("id already exists!");
                    }
                    else{
                        StudentMap.put(studentTemp.studentID,studentTemp);
                        studentTemp.addFile();
                        System.out.println("  Adding new Student successfully ...");
                    }
                    break;
                case "b":
                    System.out.print("Enter id to Search : ");
                    int id = input.nextInt();
                    input.nextLine();
                    if (StudentMap.containsKey(id)){
                        System.out.println();
                        studentTemp.searchFile(id);
                    }
                    else {
                        System.out.println("ID not exit ... ");
                    }

                    break;
                case "c":
                    System.out.print("  Enter ID to Update Student : ");
                    int IDforUpdate = input.nextInt();
                    input.nextLine();
                    if (StudentMap.containsKey(IDforUpdate)){
                        try {
                            studentTemp.updateFile(StudentMap,IDforUpdate);
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                        }

                        System.out.println(" Updating Successfully ...");
                    }
                    else {
                        System.out.println("  Search not Found ... ");
                    }
                    break;
                case "d":
                    System.out.print("  Enter ID to delete Student  : ");
                    int IDdelete = input.nextInt();
                    input.nextLine();
                    if (StudentMap.containsKey(IDdelete)){
                        try {
                            studentTemp.deleteFile(StudentMap,IDdelete);
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                        }

                        System.out.println(" Deleting Successfully ...");
                    }
                    else {
                        System.out.println("  Search not Found ... ");
                    }
                    break;
                case "e":
                    System.out.println("Your Program have exit ...");
                    exit = true;
                default:
                    System.out.println("Invalid ...");
            }
        }
    }
}
