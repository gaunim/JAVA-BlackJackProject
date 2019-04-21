
package blackjackgame;

/**
 *
 * @author kevin
 */
import java.util.*;

public abstract class Card 
{
        
    
    //abstract class
       public enum Suit {HEARTS, SPADES, CLUBS, DIAMONDS};
       public enum Value{ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,
                            JACK,QUEEN,KING};
       public Suit s;
       public Value v;
       public final static int [] cardValues1 = {1,2,3,4,5,6,7,8,9,10,10,10,10};
       public final static int [] cardValues2 = {11,2,3,4,5,6,7,8,9,10,10,10,10};
       public int cardValue1;
       public int cardValue2;
        
       public Card(Suit s, Value v){
            this.s = s;
            this.v = v;
        }
       public Card(){
           
       }
        
    public abstract ArrayList generateDeck();
    public abstract Suit getSuit();
    public abstract Value getValue();
    public abstract void setCardValue1(int a);
    public abstract int getCardValue1();
    public abstract void setCardValue2(int a);
    public abstract int getCardValue2();
  
   
}

