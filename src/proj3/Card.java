package proj3; // do not erase. Gradescope expects this.

/**
 * represents a single card
 */

public class Card {

    private int cardRank;
    private String cardSuit;


    /**
     * constructor, initializes the card
     */
    public Card(int rank, String suit){
        cardRank = rank;
        cardSuit = suit;
    }

    public getRank(){
        return cardRank;
    }
    public getSuit(){
        return cardSuit;
    }

}
