import java.util.Collections;
import java.util.ArrayList;

public class Exercise09 {
    public static int getValue(String card) {
        String[] parts = card.split(" ");
        String rank = parts[0];
        if (rank.equals("Jack") || rank.equals("Queen") || rank.equals("King")) {
            return 10;
        } else if (rank.equals("Ace")) {
            return 1;
        } else {
            return Integer.parseInt(rank);
        }
    }
    public static void main(String[] args) {

        // Create 52 cards using ArrayList
        ArrayList<String> deck = new ArrayList<String>();
        String[] suits = {"Spades", "Diamonds", "Heart", "Clubs"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Ace", "Queen", "King", "Jack"};
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }

        // Shuffle the deck
        Collections.shuffle(deck);

        // Deal the cards
        int pcScore = 0;
        int userScore = 0;
        boolean userBoom = false;
        boolean pcBoom = false;

        // Deal the first card to the computer
        String pcCard1 = deck.remove(deck.size() - 1);
        int pcValue1 = getValue(pcCard1);
        pcScore += pcValue1;
        System.out.println("The PC's first card is " + pcCard1);

        // Deal one card to user
        String userCard1 = deck.remove(deck.size() - 1);
        int userValue1 = getValue(userCard1);
        userScore += userValue1;
        System.out.println("Your first card is " + userCard1);

        // Deal one card to computer
        String pcCard2 = deck.remove(deck.size() - 1);
        int pcValue2 = getValue(pcCard2);
        pcScore += pcValue2;
        System.out.println("The PC's second card is " + pcCard2);

        // Deal one card to user again
        String userCard2 = deck.remove(deck.size() - 1);
        int userValue2 = getValue(userCard2);
        userScore += userValue2;
        System.out.println("Your second card is " + userCard2);

        // Check for 8 or 9
        if (pcScore == 8 || pcScore == 9 || pcValue1 == 8 || pcValue1 == 9 || pcValue2 == 8 || pcValue2 == 9) {
            System.out.println("PC Win!!");
            pcBoom = true;
        }
        if (userScore == 8 || userScore == 9 || userValue1 == 8 || userValue1 == 9 || userValue2 == 8 || userValue2 == 9) {
            System.out.println("You Win!!");
            userBoom = true;
        }
       

        // Continue playing until someone wins
        while (!userBoom && !pcBoom) {
            if (pcScore < 4) {
                int lastCardIndex = deck.size() - 1;
                String lastCard = deck.get(lastCardIndex);
                int lastCardValue = getValue(lastCard);
                pcScore += lastCardValue;
                System.out.println("The PC's third card is " + lastCard);
            } else if (pcScore == 4) {
                int randomNumber = (int) (Math.random() * 10);
                if (randomNumber < 8) {
                    int lastCardIndex = deck.size() - 1;
                    String lastCard = deck.get(lastCardIndex);
                    int lastCardValue = getValue(lastCard);
                    pcScore += lastCardValue;
                    System.out.println("The PC's third card is " + lastCard);
                } else {
                    System.out.println("The PC does not pull a third card");
                }
            } else if (pcScore == 5) {
                int randomNumber = (int) (Math.random() * 10);
                if (randomNumber < 4) {
                    int lastCardIndex = deck.size() - 1;
                    String lastCard = deck.get(lastCardIndex);
                    int lastCardValue = getValue(lastCard);
                    pcScore += lastCardValue;
                    System.out.println("The PC's third card is " + lastCard);
                } else {
                    System.out.println("The PC does not pull a third card");
                }
            } else if (pcScore == 6) {
                int randomNumber = (int) (Math.random() * 10);
                if (randomNumber == 0) {
                    int lastCardIndex = deck.size() - 1;
                    String lastCard = deck.get(lastCardIndex);
                    int lastCardValue = getValue(lastCard);
                    pcScore += lastCardValue;
                    System.out.println("The PC's third card is " + lastCard);
                } else {
                    System.out.println("The PC does not pull a third card");
                }
            } else {
                System.out.println("The PC does not pull a third card");
            }

            // Determine if someone has won
            if (userScore > pcScore) {
                System.out.println("You win!");
                break;
            } else if (userScore < pcScore) {
                System.out.println("The PC wins!");
                break;
            } else {
                System.out.println("It's a tie! The game continues...");
            }
        }
    }

    
}
