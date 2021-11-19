public class DeckArrayTest {
    public static void main(String[] args) {

        // Create an object of ArrayBag<String>
        DeckArray<String> testArrayDeck = new DeckArray<String>();
        System.out.println("------------------------------------------------------");
        System.out.println("BAG TEST:");
        System.out.println("Initial state of Bag:");

        // Output the current status of the bag:
        bagStatusReport(testArrayDeck);
        System.out.println("\n");

        System.out.println("Adding 8 strings to the bag: A, A, B, B, C, C, D, D");

        // TODO: Add the following strings to the bag: "A", "A", "B", "B". "C", "C", "D", "D":
        testArrayDeck.addNewEntry("A");
        testArrayDeck.addNewEntry("A");
        testArrayDeck.addNewEntry("B");
        testArrayDeck.addNewEntry("B");
        testArrayDeck.addNewEntry("C");
        testArrayDeck.addNewEntry("C");
        testArrayDeck.addNewEntry("D");
        testArrayDeck.addNewEntry("D");

        // Output the current status of the bag:
        bagStatusReport(testArrayDeck);
        System.out.println("\n");

        System.out.println("---------------------");
        System.out.println("Remove C from the bag");

        // TODO: Remove C from the bag:
        testArrayDeck.remove("C");

        // Output the current status of the bag:
        bagStatusReport(testArrayDeck);
        System.out.println("\n");

        System.out.println("---------------------------");
        System.out.println("Remove A and B from the bag");

        // TODO: Remove A and B from the bag:
        testArrayDeck.remove("A");
        testArrayDeck.remove("B");

        /// Output the current status of the bag:
        bagStatusReport(testArrayDeck);
        System.out.println("\n");

        System.out.println("----------------------------------------");
        System.out.println("Remove an unspecified entry from the bag");

        // TODO: Remove an unspecified entry from the bag:
        testArrayDeck.remove();


        // Output the current status of the bag:
        bagStatusReport(testArrayDeck);
        System.out.println("\n");

        System.out.println("Bag test completed");
        System.out.print("---------------------------");

        Deck deck = new Deck();
        DeckArray<Card> gameDeck = new DeckArray<Card>();
        
//        while (gameDeck.getCurrentSize() < 10) {
//            gameDeck.addNewEntry(deck.deal());
//        }



        System.out.println("The first 9 cards are: ");
        System.out.println(gameDeck.toString());
    }

    public static void bagStatusReport(DeckArray<String> myBag) {
        // System.out.println("Bag contents: " + myBag);
        myBag.display();
        System.out.println("Size: " + myBag.getCurrentSize());
        System.out.println("Is empty: " + myBag.isEmpty());
        System.out.println("Frequency of A: " + myBag.getFrequencyOf("A"));
        System.out.println("Frequency of B: " + myBag.getFrequencyOf("B"));
        System.out.println("Frequency of C: " + myBag.getFrequencyOf("C"));
        System.out.println("Frequency of D: " + myBag.getFrequencyOf("D"));
    }
}