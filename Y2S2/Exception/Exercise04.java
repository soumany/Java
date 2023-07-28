import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise04{
    public static void main (String[] args) {
        // declare variables
        int characterCount = 0;
        int wordsCount = 0;
        int lineCount = 0;
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader("TextFile04.txt"));
            String line;
            
            while((line = reader.readLine()) != null){
                lineCount++;
                characterCount += line.length();
                String[] words = line.split(" ");
                wordsCount += words.length;
            }
            reader.close();
        }
        catch(IOException e){
            System.out.println(e);
            System.exit(1);
        }
        
        // display
        System.out.println("character's count: " + characterCount);
        System.out.println("Word's count: " + wordsCount);
        System.out.println("Line's count: " + lineCount);
    }
}