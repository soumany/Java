import java.util.Random;
import java.util.Scanner;

public class Array_Exercise13 {
    
    public static void main(String[] args) {

        // User-Input
        Scanner scanner = new Scanner(System.in);

        // Using While loop to find the winner of the game
        while(true){

            // Declare elements in array
            String[] Games = {"Rock", "Paper", "Scissor"};

            // Using Random and length of the elements in the array
            String Computer_Player = Games[new Random().nextInt(Games.length)];
            String User_Player;

            // Using This while loop if user input didnt input Rock, Paper, or Scissor
            while(true){
                System.out.println("Please, Enter Your Favorite Role In This Games(Rock, Paper, Scissor): ");
                User_Player = scanner.nextLine();

                if(User_Player.equals("Rock") || User_Player.equals("Paper") || User_Player.equals("Scissor")){
                    break;
                }

                System.out.println("[Sorry], Your Game is not Invalid." + User_Player);
            }

            // output the computer role
            System.out.println("Computer's Role is: " + Computer_Player);

            // Logic Game starts to play
            if(User_Player.equals(Computer_Player)){
                System.out.println("[It is a draw.]");
            }

            else if(User_Player.equals("Rock")){

                if(Computer_Player.equals("Paper")){
                    System.out.println("[Sorry,] You Lose The Game. Sad:(");
                }
                else if(Computer_Player.equals("Scissor")){
                    System.out.println("[Bravo :)] You Win The Game.");
                    break;
                }
            }

            else if(User_Player.equals("Paper")){

                if(Computer_Player.equals("Rock")){
                    System.out.println("[Bravo :)] You Win The Game.");
                    break;
                }
                else if(Computer_Player.equals("Scissor")){
                    System.out.println("[Sorry], You Lose The Game. Sad:(");
                }
            }

            else if(User_Player.equals("Scissor")){

                if(Computer_Player.equals("Paper")){
                    System.out.println("[Bravo :)] You Win The Game.");
                    break;
                }
                else if(Computer_Player.equals("Rock")){
                    System.out.println("[Sorry,] You Lose The Game. Sad:(");
                }
            }

            // Asking the user play it again or not
            System.out.println("Do You Want To Play The Game Again? Please, Enter(Yes or No): ");
            
            // input yes or not
            String Play_Again = scanner.nextLine();

            // checking if Play Agian input No, so the program break
            // checking if Play Again input Yes, so the program continue
            if(!Play_Again.toLowerCase().equals("yes")){
                break;
            }
        }

        scanner.close();
    }
}
