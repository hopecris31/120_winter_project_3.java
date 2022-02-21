package proj3; // do not erase. Gradescope expects this.

import java.util.ArrayList;

public class Deck {

    private ArrayList contents;
    public final int DEFAULT_DECK_SIZE = 52;
    public final int[] RANKS = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    public final String[] SUITS = {"Spades", "Hearts", "Diamonds", "Clubs"};



    public Deck(){
        contents = new ArrayList(DEFAULT_DECK_SIZE);


    }


}
