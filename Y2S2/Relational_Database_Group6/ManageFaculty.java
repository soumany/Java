import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Faculty {
  private String facultyID;
  private String facultyName;
  private String facultyDeanName;
  private String officeNo;

  public Faculty(String facultyID, String facultyName, String facultyDeanName, String officeNo) {
    this.facultyID = facultyID;
    this.facultyName = facultyName;
    this.facultyDeanName = facultyDeanName;
    this.officeNo = officeNo;
  }

  public String getFacultyID() {
    return facultyID;
  }

  public String getFacultyName() {
    return facultyName;
  }

  public String getFacultyDeanName() {
    return facultyDeanName;
  }

  public String getOfficeNo() {
    return officeNo;
  }
}
public class ManageFaculty{
  private static final String facultiesfile = "faculties.txt";

  private static void addFaculty(Scanner scanner) {

    scanner.nextLine();
    System.out.print("\tEnter faculty's ID: ");
    String facultyID = scanner.nextLine();
    System.out.print("\tEnter faculty's Name: ");
    String facultyName = scanner.nextLine();
    System.out.print("\tEnter faculty's Dean Name: ");
    String facultyDeanName = scanner.nextLine();
    System.out.print("\tEnter Office_No: ");
    String officeNo = scanner.nextLine();

    // Create the faculty object
    Faculty faculty = new Faculty(facultyID, facultyName, facultyDeanName, officeNo);
    saveFaculty(faculty);
    System.out.println("\tFaculty added successfully!");
  }

  private static void searchFacultyById(Scanner scanner) {
  System.out.print("\tEnter the faculty ID to search: ");
  String facultyId = scanner.next();

    try {
      // Read the file
      FileReader reader = new FileReader("faculties.txt");
      BufferedReader bufferedReader = new BufferedReader(reader);

      String line;
      boolean found = false;
      while ((line = bufferedReader.readLine()) != null) {
        String[] facultyData = line.split(",");
        if (facultyData[0].equals(facultyId)) {
          System.out.println("\n\tFaculty found:");
          System.out.println("\tID: " + facultyData[0]);
          System.out.println("\tName: " + facultyData[1]);
          System.out.println("\tDeanName: " + facultyData[2]);
          System.out.println("\tOffice: " + facultyData[3]+"\n");
          found = true;
          break;
        }
      }
      bufferedReader.close();
      if (!found) {
        System.out.println("Not found!");
      }
    } catch (IOException e) {
      System.out.println("\tAn error occurred while searching for the faculty.");
    }
  }

  private static void updateFacultyById(Scanner scanner) {
    System.out.print("\tEnter the faculty ID to update: ");
    String facultyId = scanner.next();

    try {
      // Read the file
      FileReader reader = new FileReader("faculties.txt");
      BufferedReader bufferedReader = new BufferedReader(reader);

      StringBuilder updatedFileContent = new StringBuilder();
      String line;
      boolean found = false;
      while ((line = bufferedReader.readLine()) != null) {
        String[] facultyData = line.split(",");
        if (facultyData[0].equals(facultyId)) {
          System.out.println("\n\tFaculty found:");
          System.out.println("\tID: " + facultyData[0]);
          System.out.println("\tName: " + facultyData[1]);
          System.out.println("\tDeanName: " + facultyData[2]);
          System.out.println("\tOffice: " + facultyData[3] + "\n");

          // Prompt the user to enter the new information for the faculty
          scanner.nextLine();
          System.out.print("\tEnter the new faculty ID: ");
          String newFacultyId = scanner.nextLine();
          System.out.print("\tEnter the new faculty name: ");
          String newFacultyName = scanner.nextLine();
          System.out.print("\tEnter the new faculty dean name: ");
          String newFacultyDeanName = scanner.nextLine();
          System.out.print("\tEnter the new faculty office number: ");
          String newOfficeNo = scanner.nextLine();

          // Update the line with the new information
          line = newFacultyId + "," + newFacultyName + "," + newFacultyDeanName + "," + newOfficeNo;
          found = true;
        }
        updatedFileContent.append(line).append("\n");
      }

      bufferedReader.close();

      if (!found) {
        System.out.println("Not found!");
      } else {
        // Append the new data if not found in the original file
        if (updatedFileContent.length() == 0 && found) {
          updatedFileContent.append(line);
        }
        
        // Write the updated content to the file
        FileWriter fileWriter = new FileWriter("faculties.txt");
        fileWriter.write(updatedFileContent.toString());
        fileWriter.close();
        System.out.println("\tFaculty updated successfully!");
      }
    } catch (IOException e) {
      System.out.println("\tAn error occurred while updating the faculty.");
    }
  }
    
  private static void deleteFacultyById(Scanner scanner) {
    System.out.print("\tEnter the faculty ID to delete: ");
    String facultyId = scanner.next();

    try {
      // Read the file
      FileReader reader = new FileReader("newfaculties.txt");
      BufferedReader bufferedReader = new BufferedReader(reader);

      String line;
      boolean found = false;
      StringBuffer newFileContent = new StringBuffer();
      while ((line = bufferedReader.readLine()) != null) {
        String[] facultyData = line.split(",");
        if (!facultyData[0].equals(facultyId)) {
          newFileContent.append(line + "\n");
        } else {
          found = true;
        }
      }

      if (!found) {
        System.out.println("Not found!");
      } else {
        // Update the file with the new information
        bufferedReader.close();
        FileWriter fileWriter = new FileWriter("newfaculties.txt");
        fileWriter.write(newFileContent.toString());
        fileWriter.close();

        System.out.println("\tFaculty deleted successfully!");
      }
    } catch (IOException e) {
      System.out.println("\tAn error occurred while deleting the faculty.");
    }
  }

  private static void saveFaculty(Faculty faculty) {
    try {
      FileWriter fileWriter = new FileWriter(facultiesfile, true);
      fileWriter.write(
        faculty.getFacultyID() + "," +
        faculty.getFacultyName() + "," +
        faculty.getFacultyDeanName() + "," +
        faculty.getOfficeNo() + "," + "\n"
      );
      fileWriter.close();
    } catch (IOException e) {
      System.out.println("\tAn error occurred while saving the faculty.");
    }
  }
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int choice;
    do {
      System.out.println("\t===============================================");
      System.out.println("\t\t\tMANAGEMENT FACULTIES");
      System.out.println("\t===============================================");
      System.out.println("\t1. Add a new faculty");
      System.out.println("\t2. Search a faculty by id");
      System.out.println("\t3. Update a faculty");
      System.out.println("\t4. Delete a faculty by id");
      
      System.out.println("\t===============================================");
      System.out.print("\tEnter your choice: ");
      choice = scanner.nextInt();
      switch (choice) {
        case 1:
          addFaculty(scanner);
          break;
        case 2:
          searchFacultyById(scanner);
          break;
        case 3:
          updateFacultyById(scanner);
          break;
        case 4:
          deleteFacultyById(scanner);
          break;
        case 5:
          break;
        default:
          System.out.println("\tInvalid choice!");
      }
    } while (choice != 5);
  }
}