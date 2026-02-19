import java.util.ArrayList;
import java.util.Random;

public class MatchCard {
    // sun.font.FontDesignMetrics a;
    // public static void main(String[] args) {
    //     int a = 2;
    //     int hitung = a * 2;                        

    //     System.out.print(hitung);
    //     System.out.println("Jambi Butuk");
    //     int l = 7;
    //     boolean a = true;
    //     char m = a ? 'T' : 'F';
    //     System.out.println(m);

    private class Card {
        String value;
        String type;

        Card(String value, String type) {
            this.value = value;
            this.type = type;
        }

        public String toString() {
            return value + " - " + type;
        }
    }

    ArrayList<Card> deck;
    Random random = new Random();

    MatchCard () {
        startGame();
    }

    public void startGame() {
        buildDeck();
        shuffleDeck();
    }

    public void buildDeck() {
        deck = new ArrayList<Card>();
        String[] types = {"H", "D", "C", "S"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (int i = 0; i < types.length; i++) {
            for (int j = 0; j < values.length; j++) {
               Card card = new Card(values[j], types[i]);
                deck.add(card);
            }
        }
        System.out.println("Deck built with ");
        System.out.println(deck);
    }

    public void shuffleDeck() {
        for (int i = 0; i < deck.size(); i++) {
            int j = random.nextInt(deck.size());
            
            Card currcard = deck.get(i);
            Card randomCard = deck.get(j);
            deck.set(i, randomCard);
            deck.set(j, currcard);
        }
        System.out.println("Deck Diacak");
        System.out.println(deck);
    }
            
}


            
}


