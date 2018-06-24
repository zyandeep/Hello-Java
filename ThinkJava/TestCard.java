import java.util.Arrays;

class Card {
    //class variables
    public final static String[] RANKS = {null, "Ace", "2", "3", "4", "5", "6",
                        "7", "8", "9", "10", "Jack", "Queen", "King"};
    public final static String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};

    // instance variables
    private final int rank;
    private final int suit;

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }
    public String toString() {
        return RANKS[this.rank] + " of " + SUITS[this.suit];
    }
    public int compareTo(Card that) {
        if (this.suit < that.suit) {
            return -1;
        }
        if (this.suit > that.suit) {
            return 1;
        }

        if (this.rank == 1 && that.rank == 13) {
            return 1; 
        }
        if (this.rank == 13 && that.rank == 1) {
            return -1;
        }


        if (this.rank < that.rank) {
            return -1;
        }
        if (this.rank > that.rank) {
            return 1;
        }
        return 0;
    }
    public int getRank() {
        return this.rank;
    }
    public int getSuit() {
        return this.suit;   
    }
}

class TestCard {

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(makeDeck()));
/*
        Card c1 = new Card(1, 1);
        Card c2 = new Card(13, 1);
        Card c3 = new Card(5, 1);

        System.out.println(c1.compareTo(c2));
        System.out.println(c2.compareTo(c1));
        System.out.println(c3.compareTo(c2));*/

        Card[] c = {
            new Card(1, 0), new Card(3, 0), new Card(12, 1),
            new Card(10, 2), new Card(8, 0), new Card(8, 3),
            new Card(8, 0),new Card(8, 0), 
        };

        System.out.println(Arrays.toString(suitHist(c)));
        System.out.println(hasFlush(c));
    }

    static Card[] makeDeck() {
        Card[] cards = new Card[52];
        int index = 0;

        for (int suit=0; suit < 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards[index++] = new Card(rank, suit);
            }
        }
        return cards;
    }

    static int[] suitHist(Card[] cards) {
        int[] hist = new int[4];

        for (int i = 0; i < cards.length; i++) {
            hist[cards[i].getSuit()]++;
        }
        return hist;
    }

    static boolean hasFlush(Card[] cards) {
        int[] hist = suitHist(cards);

        for (int e : hist) {
            if (e >= 5) {
                return true;
            }
        }
        return false;
    }
}