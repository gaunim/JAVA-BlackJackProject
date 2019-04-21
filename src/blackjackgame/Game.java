
package blackjackgame;

/**
 *
 * @author kevin
 */
import java.util.ArrayList;

//abstract class
public abstract class Game 
{
    public final String gameName;
    public static String hitMiss;
    public int tokens;    
      
    
    public Game(String givenName)
    {
        gameName = givenName;
       
    }
    

   
    public abstract String getGameName() ;
    
    public abstract void setTokens(int a);
    
    public abstract int getTokens();
    
    public abstract void play();
        
    public abstract boolean declareWinner(ArrayList<CardFunctions> c, ArrayList<CardFunctions> d, boolean hit);
        
    

   
    
}
