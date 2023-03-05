package ProjectRUPP.week7;
import java.util.ArrayList;

public class Exercise06 {
  public static void main(String args[]) {
  
    String string = "YoU$@!# aRe@$%@# sO @$%#cUte"; 
    //Call Method
    split(string);
  }

  public static ArrayList<String> split(String string){

    int count = 0;
    // create a ArrayList String type
    ArrayList<String> vocaburys = new ArrayList();
    //​​ all occurrences of "\\w" is replaceAll with "spacee"
    string = string.replaceAll("\\W"," ");

    string = string.toUpperCase();
    
    for(int i = 0; i < string.length()-1; i++) {
      //Find space
      if((string.charAt(i) == ' ') && (string.charAt(i + 1) != ' ')) {  
      
        //If space found then consider it as vocaburys and add it to ArrayList
        
        vocaburys.add(string.substring(count, i));
        count = i + 1;
        
      }
    }
    vocaburys.add(string.substring(count)); // Adding last vocabury
    

    System.out.println("\nWords in the sentence are :");
   
    for(int i = 0; i < vocaburys.size(); i++) {
      //Display word
      System.out.println("\t\t\t\t["+i+"]-" + vocaburys.get(i));
    }
    return vocaburys;
    
  }
}
