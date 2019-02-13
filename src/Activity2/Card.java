package Activity2;

/**
 * Created by Teacher on 1/7/2019.
 */
public class Card {
    String suit;
    int rank;

    public Card(String suit, int rank){
        this.suit=suit;
        this.rank=rank;
    }

    public String getSuit(){
        return suit;
    }

    public int getRank(){
        return rank;
    }

    public int getPointValue(){
        return rank;
    }

    public String toString(){
        return (rank + " of " + suit + " (point value = " + getPointValue());
    }
}
