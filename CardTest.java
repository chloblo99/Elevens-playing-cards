public class CardTest {

    public static int countSnap = 0, numSupedrsnap = 0;

    public static void main(String[] args){

        for(int i=0; i<50; i++){
            Card card1 = new Card();
            Card card2 = new Card();

            System.out.println("Card 1 is the " + card1);
            System.out.println("Card 2 is the " + card2);
            if(card1.compareTo(card2) > 0) {
                continue;
            }else if(card1.compareTo(card2) < 0) {
                continue;
            }else{
                System.out.println("SNAP!");
                countSnap++;
            }
        }
    }
}