import java.util.Scanner;

public class DeckTest {
    // This is the main method of the program that creates three decks and test
    // all methods in the Deck class by outputting each deck's corresponding
    // informations
    private static final int NUMCARDS = 52;


    public static void main(String[] args) {
        Deck deck = new Deck();

        for (int i = 0; i < 9; i++){
            System.out.println(deck.deal());
        }

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        //String card1 = scanner.nextLine();
    }

}