import java.util.Scanner;

/**
 * exercise10
 */
public class exercise12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Get Player's name
        System.out.println("[Player1], What is your name?");
        String Player1 = scanner.nextLine();
        System.out.println("[Player 2], what is your name? ");
        String Player2 = scanner.nextLine();

        char[][] Board = new char[3][3];

        /* display board game
            ---
            ---
            ---
         */

        //fill the board with dashes
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                Board[i][j] = '-';
            }
        }

        //Keep track of whose it is
        boolean isPlayer1 = true;

        //Keep track if the game is ended
        boolean isGameEnded = false;

        while(!isGameEnded){
            //Drae the board
            Draw_Board(Board);

            //Keep track of what symbol we are using to play
            char symbol = ' ';
            if(isPlayer1){
                symbol = 'X';
            }else{
                symbol = 'O';
            }

            //Print out the player's turn
            if(isPlayer1){
                System.out.println(Player1 + "'s turn(X): ");
            }else{
                System.out.println(Player2 + "'s turn(O): ");
            }

            //row and col variable
            int row = 0;
            int col = 0;

            while(true){
                //Get row and col from user
                System.out.println("Enter a row (0,1, and 2): ");
                row = scanner.nextInt();
                System.out.println("Enter a col (0,1, and 2): ");
                col = scanner.nextInt();

                //Check if row and col are valid
                if(row < 0 || col < 0 || row > 2 || col > 2){
                    // row and col are out bound
                    System.out.println("Your row and col are out of bound.");
                }else if(Board[row][col] != '-'){
                    // Board position has an x or o
                    System.out.println("Someone has already move there.");
                }else{
                    //row and col are valid
                    break;
                }
            }

            //Setting the position on the board to the player's symbol
            Board[row][col] = symbol;

            //Check if a player has won
            if(hasWon(Board) == 'X'){
                //Player 1 win
                System.out.println(Player1 + " has won the game ;) [Bravo]!");
                isGameEnded = true;
            }else if(hasWon(Board) == 'O'){
                //Player 2 win
                System.out.println(Player2 + " has won the game :) [Bravo]!");
                isGameEnded = true;
            }else{
                //Nobody won
                if(hasTied(Board)){
                    //Tied
                    System.out.println("Wow! It is a tied.");
                    isGameEnded = true;
                }else{
                    //Contiue the game and toggles the turn
                    isPlayer1 = !isPlayer1;
                }
            }
        }

        //print out final state of the board
        Draw_Board(Board);

        scanner.close();
    }

    //printing out the board
    public static void Draw_Board(char[][] Board){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(Board[i][j]);
            }
            System.out.println();
        }
    }

    public static char hasWon(char[][] Board){
        //row
        for(int i=0; i<3; i++){
            if(Board[i][0]==Board[i][1] && Board[i][1]==Board[i][2] && Board[i][0]!='-'){
                return Board[i][0];
            }
        }

        //col
        for(int j=0; j<3; j++){
            if(Board[0][j]==Board[1][j] && Board[1][j]==Board[2][j] && Board[0][j]!='-'){
                return Board[0][j];
            }
        }

        //Diagonals
        if(Board[0][0]==Board[1][1] && Board[1][1]==Board[2][2] && Board[0][0]!='-'){
            return Board[0][0];
        }
        if(Board[2][0]==Board[1][1] && Board[1][1]==Board[0][2] && Board[2][0]!='-'){
            return Board[2][0];
        }

        //Nobdy win
        return '-';
    }

    public static boolean hasTied(char[][] Board){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(Board[i][j] == '-'){
                    return false;
                }
            }
        }
        return true;
    }
}