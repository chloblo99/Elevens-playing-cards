import java.util.Random;

public class Deck {

    private static final int NUMCARDS = 52;
    private final Card[] cards = new Card[52];
    private int cardIndex;
    private int size;

    public Deck(){
        for(int thisCard = 0 ; thisCard < NUMCARDS; thisCard++){
            this.cards[thisCard] = new Card(thisCard % 13, thisCard / 13);
        }

        // index starts at 0
        this.cardIndex = NUMCARDS - 1;
        this.shuffle();
    }

    private void shuffle(){
        int index;
        Card temp;

        Random random = new Random();
        for(int i = this.cards.length - 1; i > 0; i--){
            index = random.nextInt(i + 1);
            temp = this.cards[index];
            this.cards[index] = this.cards[i];
            this.cards[i] = temp;
        }
    }

    public Card deal(){
        return this.cards[this.cardIndex--];
    }
}