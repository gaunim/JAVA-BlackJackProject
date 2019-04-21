
package blackjackgame;

/**
 *
 * @author Mohnish Gauni(Kevin)
 * ID: 991519320
 * Assignment: Deliverable 3
 * Team: Java Coder
 * 
 */
import java.io.*;
public class BlackJackGame {

 
    
    //executes application
    public static void main(String[] args) {
        CardFunctions one = new CardFunctions();
        GameFunctions three = new GameFunctions("BlackJack");
        Player two = new Player();
       try{
         boolean start = false;
         while(!start){
        if(two.loginPlayer() && three.getGameName().equals("BlackJack")){
        System.out.println("Welcome to Black Jack!");
        three.play();
        start = true;
                 }
         }
       }catch(IOException e){
           
       }
    }
    
}
