package proj3; // do not erase. Gradescope expects this.

import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private ArrayList contents;
    public final int DEFAULT_DECK_SIZE = 52;
    public final int[] RANKS = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    public final String[] SUITS = {"Spades", "Hearts", "Diamonds", "Clubs"};
    public int nextToDeal = 0;


    /**
     * Constructor, initializes the deck
     */
    public Deck(){
        contents = new ArrayList(DEFAULT_DECK_SIZE);


    }

    /**
     * for each card in the deck
     *
     */
    private Shuffle (Deck){

    }

    /**
     * if deck is empty, return null
     * else, return the first element in deck
     */
    private Deal (Deck){
        if (Deck.length == 0){
            return null;
        else{
            return Deck.get(0);
            }

        }

    }


}
