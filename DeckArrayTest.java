import java.util.Scanner;

public class DeckArrayTest {
    public static void main(String[] args) {

        Deck deck = new Deck();
        // Create an object of ArrayBag<String>
        DeckArray<String> testArrayDeck = new DeckArray<String>();


        while (testArrayDeck.getCurrentSize() < 9) {
            Card cardDisplayed = deck.deal();
            testArrayDeck.addNewEntry(cardDisplayed);
        }

        deckStatusReport(testArrayDeck);
        //System.out.println(gameDeck.toString());

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first card you would like to remove?");

        String cardRemove = scan.nextLine();
        testArrayDeck.remove(cardRemove);

        deckStatusReport(testArrayDeck);

        // TODO : legal combinations working , king queen jack, or 9 and 2, 3 and 8 etc
        // point value?? look for point values and how they work
//        public boolean isLegal(List<Integer> selectedCards) {
//            // If two cards were selected, check it with containsPairSum11()
//            if (selectedCards.size() == 2) {
//                return containsPairSum11(selectedCards);
//            }
//            // If three cards were selected, check it with containsJQK()
//            else if (selectedCards.size() == 3) {
//                return containsJQK(selectedCards);
//            }
//            // If other numbers of cards were selected, it is an automatic illegal
//            // move
//            return false;
//        }
//
//        // the @override annotation means that the method anotherPlayIsPossible() in
//        // the superclass "Board" class is being override in this Eleven's class
//        @Override
//        // This methods checks if another move can be made by the player
//        public boolean anotherPlayIsPossible() {
//            List<Integer> cIndexes = cardIndexes();
//            // One of the remover methods have to be true for this method to return
//            // true
//            if (containsPairSum11(cIndexes) || containsJQK(cIndexes)) {
//                return true;
//            }
//            return false; // If return false, the game is over and the player lost
//        }

//        private boolean containsPairSum11(List<Integer> selectedCards) {
//
//            for (int numOne = 0; numOne < selectedCards.size(); numOne++) {
//                int num1 = selectedCards.get(numOne).intValue(); // get the value
//                // for the first
//                // card
//                for (int numTwo = numOne + 1; numTwo < selectedCards.size(); numTwo++) {
//                    int num2 = selectedCards.get(numTwo).intValue(); // get the
//                    // value for
//                    // the
//                    // second
//                    // card
//                    // check if the two cards adds up to 11
//                    if (cardAt(num1).pointValue() + cardAt(num2).pointValue() == 11) {
//                        return true;
//                    }
//                }
//            }
//            return false;
//        }
//
//        // This is a helper method to check if the three cards selected are a jack,
//        // a queen, and a king
//        private boolean containsJQK(List<Integer> selectedCards) {
//            boolean jack = false;
//            boolean queen = false;
//            boolean king = false;
//
//            // Scan through the selected cards to check if they match the criteria
//            for (Integer deck : selectedCards) {
//                int k = deck.intValue();
//
//                if (cardAt(k).rank().equals("jack")) {
//                    jack = true;
//                } else if (cardAt(k).rank().equals("queen")) {
//                    queen = true;
//                } else if (cardAt(k).rank().equals("king")) {
//                    king = true;
//                }
//            }
//            return (jack && queen && king); // Returns true if all of them are
//            // present
//        }
//    }

        // TODO : get it to loop until there are no cards (WIN) or no more moves left (LOST)
//        public boolean gameIsWon() {
//            if (deck.isEmpty()) {
//                for (Card c : cards) {
//                    if (c != null) {
//                        return false;
//                    }
//                }
//                return true;
//            }
//            return false;
//        }

        // TODO : give a hint on request or confirming there is no move

    }

    public static void deckStatusReport(DeckArray<String> myBag) {
        // System.out.println("Bag contents: " + myBag);
        myBag.display();
        System.out.println("Size: " + myBag.getCurrentSize());
    }
}

//Deck deck = new Deck();
//DeckArray<Card> gameDeck = new DeckArray<Card>();

//        while (gameDeck.getCurrentSize() < 10) {
//            gameDeck.addNewEntry(deck.deal());
//        }