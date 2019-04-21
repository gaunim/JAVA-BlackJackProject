
package blackjackgame;

/**
 *
 * @author kevin
 */
import java.util.*;
public class CardFunctions extends Card{
    
   
    public static ArrayList <CardFunctions> cards = new ArrayList <>();

    public CardFunctions(Suit s, Value v) {
        super(s, v);
    }
    public CardFunctions(){
        
    }
                
    public Suit getSuit(){
        return this.s;
    }
    
     public Value getValue(){
        return this.v;
    }
    
     
    public void setCardValue1(int a){
        super.cardValue1 = a;
    }
    public int getCardValue1(){
        return super.cardValue1;
    }
    
    public void setCardValue2(int a){
        super.cardValue2 = a;
    }
    
    public int getCardValue2(){
        return super.cardValue2;
    }
    
    //generates a deck of 52 cards then shuffles them, returns them as
    //an arraylist
    public ArrayList generateDeck(){
                  
		for(Suit s: Suit.values())
                {
                    int cardVal = 0;
                    for(Value v: Value.values())
                    {
                       CardFunctions one = new CardFunctions(s,v);
                       one.setCardValue1(Card.cardValues1[cardVal]); 
                       one.setCardValue2(Card.cardValues2[cardVal]);
                       cards.add(one);            
                       cardVal++;
                    }                
        }
                 Collections.shuffle(cards);
                
                return cards;
    }
    
    //outputs the cards in an arraylist, whether it is a deck or a hand
    public void printDeck(ArrayList<CardFunctions> cards){
           
        for(int i = 0; i < cards.size(); i++){                 
            System.out.println(cards.get(i).getValue() + " " 
                    + cards.get(i).getSuit());
                                           
        } 
    }
    
    //prints the associated sums of a hand/arraylist
        public void printSum(ArrayList<CardFunctions> cards){
           int sum1 = 0;
           int sum2 = 0;
        for(int i = 0; i < cards.size(); i++){                 
             sum1 += cards.get(i).getCardValue1();
             sum2 += cards.get(i).getCardValue2();
                                           
        } 
            System.out.print(sum1 + " or ");
            System.out.print(sum2 + "\n");
    }
    
    //in blackjack ace can be 1 or 11 as such there are two possible sums
    //in a hand with an ace, as such this method prints the first possible
    //sum
         public int getSum1(ArrayList<CardFunctions> cards){
           int sum1 = 0;
           
        for(int i = 0; i < cards.size(); i++){                 
             sum1 += cards.get(i).getCardValue1();
                                                  
        } 
            return sum1;
            
    }
         
         //second possible sum print
          public int getSum2(ArrayList<CardFunctions> cards){
           
           int sum2 = 0;
        for(int i = 0; i < cards.size(); i++){                 
             sum2 += cards.get(i).getCardValue2();
                                                  
        } 
            return sum2;
            
    }
    
   
}
