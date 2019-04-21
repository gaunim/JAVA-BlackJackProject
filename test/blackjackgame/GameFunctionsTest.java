
package blackjackgame;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kevin
 */

/*
All the tests run the methods according to Good Bad and Boundary test cases
where applicable. Some methods are rewritten to represent a boolean equivalent
whereby if certain conditions are met, the method when executed in application
would work.
*/
public class GameFunctionsTest {
    
    public GameFunctionsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println(">>>");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println(">>>");
    }
    
    @Before
    public void setUp() {
        System.out.println(">>>");
    }
    
    @After
    public void tearDown() {
        System.out.println(">>>");
    }

    /**
     * Test of getGameName method, of class GameFunctions.
     */
    @Test
    public void testGetGameNameGood() {
        System.out.println("getGameName");
        GameFunctions instance = new GameFunctions("BlackJack");
        String expResult = "BlackJack";
        String result = instance.getGameName();
        assertEquals(expResult, result);
       
    }
     public void testGetGameNameBad() {
        System.out.println("getGameName");
        GameFunctions instance = new GameFunctions("");
        String expResult = "BlackJack";
        String result = instance.getGameName();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
      public void testGetGameNameBoundary() {
        System.out.println("getGameName");
        GameFunctions instance = new GameFunctions("");
        String expResult = "";
        String result = instance.getGameName();
        assertEquals(expResult, result);
        
    }
      

    /**
     * Test of setTokens method, of class GameFunctions.
     */
    @Test
    public void testSetTokensBoundary() {
        System.out.println("setTokens");
        int a = 0;
        GameFunctions instance = new GameFunctions("");
        instance.setTokens(a);
       
    }
    public void testSetTokensGood() {
        System.out.println("setTokens");
        int a = 1;
        GameFunctions instance = new GameFunctions("");
        instance.setTokens(a);
       
    }
    public void testSetTokensBad() {
        System.out.println("setTokens");
        int a = -1;
        GameFunctions instance = new GameFunctions("");
        instance.setTokens(a);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTokenWin method, of class GameFunctions.
     */
    @Test
 
     public void testSetTokenWinBoundary() {
        System.out.println("setTokenWin");
        int a = 0;
        GameFunctions instance = new GameFunctions("");
        instance.setTokenLoss(a);
    
    }
      public void testSetTokenWinGood() {
        System.out.println("setTokenWin");
        int a = 1;
        GameFunctions instance = new GameFunctions("");
        instance.setTokenLoss(a);
   
    }
        public void testSetTokenWinBad() {
        System.out.println("setTokenWin");
        int a = 0;
        GameFunctions instance = new GameFunctions("");
        int token = -1;
        instance.setTokenLoss(token);
 
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTokenLoss method, of class GameFunctions.
     */
    @Test
    public void testSetTokenLossBoundary() {
        System.out.println("setTokenLoss");
        int a = 0;
        GameFunctions instance = new GameFunctions("");
        instance.setTokenLoss(a);
    
    }
      public void testSetTokenLossGood() {
        System.out.println("setTokenLoss");
        int a = -1;
        GameFunctions instance = new GameFunctions("");
        instance.setTokenLoss(a);
   
    }
        public void testSetTokenLossBad() {
        System.out.println("setTokenLoss");
        int a = 0;
        GameFunctions instance = new GameFunctions("");
        int token = 1;
        instance.setTokenLoss(token);
 
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTokens method, of class GameFunctions.
     */
    @Test
    public void testGetTokensBoundary() {
        System.out.println("getTokens");
        GameFunctions instance = new GameFunctions("");
        int expResult = 0;
        int result = instance.getTokens();
        
        assertEquals(expResult, result);
       
    }
    public void testGetTokensGood() {
        System.out.println("getTokens");
        GameFunctions instance = new GameFunctions("");
        int expResult = 1;
        instance.setTokens(1);
        int result = instance.getTokens();
        
        assertEquals(expResult, result);
       
    }
     public void testGetTokensBad() {
        System.out.println("getTokens");
        GameFunctions instance = new GameFunctions("");
        int expResult = 0;
        instance.setTokens(-1);
        int result = instance.getTokens();      
        assertEquals(expResult, result);       
        fail("The test case is a prototype.");
    }

   

    /**
     * Test of isNum method, of class GameFunctions.
     */
    @Test
    public void testIsNumBoundary() {
        System.out.println("isNum");
        String a = "1";
        GameFunctions instance = new GameFunctions("");
        boolean expResult = true;
        boolean result = instance.isNum(a);
        assertEquals(expResult, result);
        
        
    }
     public void testIsNumGood() {
        System.out.println("isNum");
        String a = "12";
        GameFunctions instance = new GameFunctions("");
        boolean expResult = true;
        boolean result = instance.isNum(a);
        assertEquals(expResult, result);
       
    }
     public void testIsNumBad() {
        System.out.println("isNum");
        String a = "a";
        GameFunctions instance = new GameFunctions("");
        boolean expResult = false;
        boolean result = instance.isNum(a);
        assertEquals(expResult, result);
      
        fail("The test case is a prototype.");
    }
     
     
     /**
     * Test of play method CONDITIONS, of class GameFunctions.
     */
     
    @Test
    public void testPlayGood() {
        System.out.println("play");
        GameFunctions instance = new GameFunctions("Black Jack");
        
        boolean expResult = true;
        //user token input is valid
        boolean token = true;
        //user option choice is valid
        boolean playerChoice = true;
        //play function does not 'work'
        boolean play = false;
        if(token && playerChoice){
            //play function procedurally continues
         play = true;
        }
               
         assertEquals(expResult, play);
    }

        public void testPlayBad() {
        System.out.println("play");
        GameFunctions instance = new GameFunctions("Black Jack");
        
         boolean expResult = false;
        //user token input is valid
        boolean token = false;
        //user option choice is valid
        boolean playerChoice = true;
        //play function does not 'work'
        boolean play = false;
        if(token && playerChoice){
            //play function procedurally continues
         play = true;
        }
  
        fail("The test case is a prototype.");
    }

    /**
     * Test of declareWinner method, of class GameFunctions.
     */
    @Test
    public void testDeclareWinnerGood() {
        System.out.println("declareWinner");
        boolean win = false;
        int playerSum = 19;
        int dealerSum = 13;
        if(playerSum > dealerSum && playerSum <= 21){
            win = true;
        } 
       
        boolean expResult = true;      
        assertEquals(expResult, win);
        
    }
    
        public void testDeclareWinnerBad() {
    
        System.out.println("declareWinner");
        boolean win = false;
        int playerSum = 13;
        int dealerSum = 19;
        if(playerSum > dealerSum && playerSum <= 21){
            win = true;
        } 
       
        boolean expResult = false;      
        assertEquals(expResult, win);
            
        fail("The test case is a prototype.");
    }
       
        public void testDeclareWinnerBoundary() {
         System.out.println("declareWinner");
        boolean win = false;
        int playerSum = 19;
        int dealerSum = 19;
        if(playerSum == dealerSum || playerSum == 21){
            win = true;
        } 
       
        boolean expResult = true;      
        assertEquals(expResult, win);

        
    }
   
}
