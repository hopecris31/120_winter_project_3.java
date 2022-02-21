package proj3; // do not erase. Gradescope expects this.

import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private ArrayList contents;
    public final int DEFAULT_DECK_SIZE = 52;
    public final int[] RANKS = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    public final String[] SUITS = {"Spades", "Hearts", "Diamonds", "Clubs"};
    public int nextToDeal;


    /**
     * Constructor, initializes the deck
     */
    public Deck(){
        contents = new ArrayList(DEFAULT_DECK_SIZE); //makes empty list of n elements
        nextToDeal = 0;
        for (int rank : RANKS){
            for (String suit : SUITS){

            }
        }

    }

    /**
     * for each index in the deck
     *swap with another random index
     */
    public void shuffle (Deck){

    }

    public boolean isEmpty (){

    }

    /**
     * deal a single card from deck
     * if nextToDeal is equal to length of array -1, return null
     * else, get the nextToDeal element in deck and return it
     * add one to nextToDeal
     * nextToDeal has to be in the range of the deck size
     *
     * start at next to deal index, pick random number fron mext to deal to the end of the deck,
     *
     */
    public Card deal() {
        if (nextToDeal == contents.size()-1){ //this goes into its own method
            return null;
        else{
            return contents.get(nextToDeal);
            }

        }

    }


}
