package blackjackgame;

import java.util.*;

/**
 *
 * @author kevin
 */
public class GameFunctions extends Game {
    
    
    //getters & setters & constructors
    public GameFunctions(String a) {
        super(a);
    }

    public String getGameName() {
        return super.gameName;
    }

    public void setTokens(int a) {
        super.tokens = a;
    }

    public void setTokenWin(int a) {
        super.tokens = a * 2;
    }

    public void setTokenLoss(int a) {

        int token = getTokens() - getTokens() / 2;
        super.tokens = token;
        if (token == 1) {
            super.tokens = token - 1;
        }
    }

    public int getTokens() {
        return super.tokens;
    }

    
    //procedural logic behind the dealing of cards in blackjack
    //each hand is a separate arraylist and cards are dealt first in two's
    //then individually according to player prompt
    //dealer will randomly deal itself 2-3 cards
    public void play() {

        boolean hit = true;
        boolean playing = true;
        
        Scanner input = new Scanner(System.in);
      
            
        
        boolean error = false;
        while(!error){
            System.out.println("How many tokens would you like?");
        String token = input.nextLine();
        if(isNum(token) == true){
            error = true;
        setTokens(Integer.parseInt(token));
             }else{
            System.out.println("Please Enter a Number!");
        }
        }
             
        while (playing) {
            hit = true;

            int j = 0;
            CardFunctions one = new CardFunctions();
            ArrayList<CardFunctions> deck = one.generateDeck();
            ArrayList<CardFunctions> player = new ArrayList<>();
            ArrayList<CardFunctions> dealer = new ArrayList<>();
            for (int i = 0; i < deck.size(); i++) {

                if (i < 2) {
                    player.add(deck.get(i));
                }
                j++;

                if (j == 2) {

                    int hitMiss = 0;
                    System.out.println(Player.getName() + ": ");
                    one.printDeck(player);
                    one.printSum(player);

                    while (hit) {
                        
                        
                         boolean error2 = false;
                        while(!error2){
         
                        System.out.println("Enter 1 for hit");
                        System.out.println("Enter 2 for hold");
                        Game.hitMiss = input.nextLine();
                        if(isNum(Game.hitMiss) == true){
                            
                            error2 = true;
       
                         }else{
                            System.out.println("Please enter a number!");
                        }
                     }
                        int playerChoice = Integer.parseInt(Game.hitMiss);
                        
                        if (playerChoice == 1) {
                            i++;
                            player.add(deck.get(i));
                            System.out.println(Player.getName() + ": ");
                            one.printDeck(player);
                            one.printSum(player);
                            playerChoice = 0;

                        } else if (playerChoice == 2) {
                            for (int k = 0; k < 1 + Math.random() * 2; k++) {
                                i++;
                                dealer.add(deck.get(i));
                            }
                            System.out.println("Dealer: ");
                            one.printDeck(dealer);
                            one.printSum(dealer);

                            hit = false;

                        }else{
                            System.out.println("Enter either 1 or 2!");
                            hit = true;
                        }

                    }

                }

            }
            playing = declareWinner(player, dealer, hit);

        }

    }

    //establishes all the different win conditions for blackjack
    //created to reprompt if user makes an input mismatch
    
    public boolean declareWinner(ArrayList<CardFunctions> c, ArrayList<CardFunctions> d, boolean hit) {
        CardFunctions one = new CardFunctions();
        CardFunctions two = new CardFunctions();
        
        int playerSum = 0;
        int dealerSum = 0;

        if (two.getSum2(c) > 21 && two.getSum1(c) <= 21) {
            playerSum = two.getSum1(c);

        } else {
            playerSum = two.getSum2(c);
        }

        if (two.getSum2(d) > 21 && two.getSum1(d) <= 21) {
            dealerSum = two.getSum1(d);
        } else {
            dealerSum = two.getSum2(d);
        }

        if (playerSum == 21) {
            
            System.out.println("You win!");
            setTokenWin(getTokens());
            System.out.println("Tokens: " + getTokens());
              if (getTokens() == 0) {
            System.out.println("Game Over!");
            System.exit(0);
        }
          
            boolean exit = false;
            String cont ="";
            while(!exit){
                System.out.println("Enter 1 to continue. Enter any other num. to exit.");
            Scanner input = new Scanner(System.in);
            cont = input.nextLine();
           if(isNum(cont)){
                exit = true;                 
            }
            System.out.println("Enter a valid number!");
            }
            if (cont.equals("1")) {
                hit = true;
            } else {
                System.out.println("Tokens: " + getTokens());
                System.out.println("Game Over!");
                System.exit(0);
                hit = false;
            }
        } else if (dealerSum > 21) {
            
            System.out.println("You win!");
            setTokenWin(getTokens());
            System.out.println("Tokens: " + getTokens());
              if (getTokens() == 0) {
            System.out.println("Game Over!");
            System.exit(0);
        }
          
              boolean exit = false;
            String cont ="";
            while(!exit){
                System.out.println("Enter 1 to continue.  Enter any other num. to exit.");
            Scanner input = new Scanner(System.in);
            cont = input.nextLine();
           if(isNum(cont) ){
                exit = true;
                 
            }
            System.out.println("Enter a valid number!");
            }
            if (cont.equals("1")) {
                hit = true;
            } else {
                System.out.println("Tokens: " + getTokens());
                System.out.println("Game Over!");
                System.exit(0);
                hit = false;
            }
        } else if (playerSum < 21 && playerSum > dealerSum) {
         
            System.out.println("You win!");
            setTokenWin(getTokens());
            System.out.println("Tokens: " + getTokens());
              if (getTokens() == 0) {
            System.out.println("Game Over!");
            System.exit(0);
        }
          
              boolean exit = false;
            String cont ="";
            while(!exit){
                System.out.println("Enter 1 to continue.  Enter any other num. to exit.");
            Scanner input = new Scanner(System.in);
            cont = input.nextLine();
            if(isNum(cont) ){
                exit = true;
                 
            }
            System.out.println("Enter a valid number!");
            }
            if (cont.equals("1")) {
                hit = true;
            } else {
                System.out.println("Tokens: " + getTokens());
                System.out.println("Game Over!");
                System.exit(0);
                hit = false;
            }

        } else if (playerSum > 21) {
            
            System.out.println("You lose!");
            setTokenLoss(getTokens());
            System.out.println("Tokens: " + getTokens());
              if (getTokens() == 0) {
            System.out.println("Game Over!");
            System.exit(0);
        }
         
              boolean exit = false;
            String cont ="";
            while(!exit){
                System.out.println("Enter 1 to continue.  Enter any other num. to exit.");
            Scanner input = new Scanner(System.in);
            cont = input.nextLine();
            if(isNum(cont) ){
                exit = true;
                 
            }
            System.out.println("Enter a valid number!");
            }
            if (cont.equals("1")) {
                hit = true;
            } else {
                System.out.println("Tokens: " + getTokens());
                System.out.println("Game Over!");
                System.exit(0);
                hit = false;
            }
        } else if (playerSum < 21 && playerSum < dealerSum) {
            
            System.out.println("You lose!");
            setTokenLoss(getTokens());
            System.out.println("Tokens: " + getTokens());
              if (getTokens() == 0) {
            System.out.println("Game Over!");
            System.exit(0);
        }
            
            boolean exit = false;
            String cont ="";
            while(!exit){
                System.out.println("Enter 1 to continue.  Enter any other num. to exit.");
            Scanner input = new Scanner(System.in);
            cont = input.nextLine();
           if(isNum(cont) ){
                exit = true;
                 
            }
            System.out.println("Enter a valid number!");
            }
            if (cont.equals("1")) {
                hit = true;
            } else {
                System.out.println("Tokens: " + getTokens());
                System.out.println("Game Over!");
                System.exit(0);
                hit = false;
            }
        } else if (dealerSum == 21) {
           
            System.out.println("You lose!");
            setTokenLoss(getTokens());
            System.out.println("Tokens: " + getTokens());
              if (getTokens() == 0) {
            System.out.println("Game Over!");
            System.exit(0);
        }
           
              boolean exit = false;
            String cont ="";
            while(!exit){
                System.out.println("Enter 1 to continue. Enter any other num. to exit.");
            Scanner input = new Scanner(System.in);
            cont = input.nextLine();
           if(isNum(cont) ){
                exit = true;
                 
            }
            System.out.println("Enter a valid number!");
            }
            if (cont.equals("1")) {
                hit = true;
            } else {
                System.out.println("Tokens: " + getTokens());
                System.out.println("Game Over!");
                System.exit(0);
                hit = false;
            }
        }else if (playerSum == dealerSum){
            System.out.println("You win!");
            setTokenWin(getTokens());
            System.out.println("Tokens: " + getTokens());
              if (getTokens() == 0) {
            System.out.println("Game Over!");
            System.exit(0);
        }
            
              boolean exit = false;
            String cont ="";
            while(!exit){
                System.out.println("Enter 1 to continue.  Enter any other num. to exit.");
            Scanner input = new Scanner(System.in);
            cont = input.nextLine();
            if(isNum(cont) ){
                exit = true;
                 
            }
            System.out.println("Enter a valid number!");
            }
            if (cont.equals("1")) {
                hit = true;
            } else {
                System.out.println("Tokens: " + getTokens());
                System.out.println("Game Over!");
                System.exit(0);
                hit = false;
            }
        }

        System.out.println(playerSum);
        System.out.println(dealerSum);

      

        return hit;
    }
    
    
    public boolean isNum(String a) {
        //used in input validation, ensures integer only 
        //using regex
        String match = "[0-9]+";
        return a.matches(match);
    }
}
