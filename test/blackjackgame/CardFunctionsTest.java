
package blackjackgame;

import blackjackgame.Card.Suit;
import static blackjackgame.Card.Suit.HEARTS;
import blackjackgame.Card.Value;
import static blackjackgame.Card.Value.ACE;
import static blackjackgame.Card.Value.TWO;

import java.util.ArrayList;
import java.util.Collections;
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

public class CardFunctionsTest {
    
    public CardFunctionsTest() {
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
     * Test of getSuit method, of class CardFunctions.
     */
    @Test
    public void testGetSuitGood() {
        System.out.println("getSuit");
        Suit s = HEARTS;
        Value v = TWO;
        CardFunctions instance = new CardFunctions(s,v);
        boolean suitFound = false;
        if(instance.getSuit() != null){
            suitFound = true;
        }
        boolean expResult = true;
       
        assertEquals(expResult, suitFound);
    
    }
       public void testGetSuitBad() {
        System.out.println("getSuit");
        Suit s = HEARTS;
        Value v = TWO;
        CardFunctions instance = new CardFunctions();
        boolean suitFound = false;
        if(instance.getSuit() != null){
            suitFound = true;
        }
        boolean expResult = false;
       
        assertEquals(expResult, suitFound);
      
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class CardFunctions.
     */
    @Test
    public void testGetValueGood() {
        System.out.println("getValue");
        Suit s = HEARTS;
        Value v = TWO;
        CardFunctions instance = new CardFunctions(s,v);
        boolean valueFound = false;
        if(instance.getSuit() != null){
            valueFound = true;
        }
        boolean expResult = true;
       
        assertEquals(expResult, valueFound);
    }
        public void testGetValueBad() {
        System.out.println("getValue");
        Suit s = HEARTS;
        Value v = TWO;
        CardFunctions instance = new CardFunctions();
        boolean valueFound = false;
        if(instance.getSuit() != null){
            valueFound = true;
        }
        boolean expResult = false;
       
        assertEquals(expResult, valueFound);
         fail("The test case is a prototype.");
    }
   
    /**
     * Test of setValue1 method, of class CardFunctions.
     */
    @Test
    public void testSetCardValue1Good() {
        System.out.println("setValue1");
        int a = 2;
        Suit s = HEARTS;
        Value v = TWO;
        CardFunctions instance = new CardFunctions(s,v);
        instance.setCardValue1(a);
        boolean correctSet = false;
        if(instance.getCardValue1() == a){
            correctSet = true;
        }
         boolean expResult = true;
        
        assertEquals(expResult, correctSet);
        
             
    }
     public void testSetCardValue1Bad() {
        System.out.println("setValue1");
        int a = -1;
        Suit s = HEARTS;
        Value v = TWO;
        CardFunctions instance = new CardFunctions(s,v);
        instance.setCardValue1(-2);
         boolean correctSet = false;
        if(instance.getCardValue1() == a || instance.getCardValue1() > 0){
            correctSet = true;
        }
         boolean expResult = false;
        
        assertEquals(expResult, correctSet);
       
        fail("The test case is a prototype.\nIncorrect value, also not valid.");
    }
     
      public void testSetCardValue1Boundary() {
        System.out.println("setValue1");
        int a = 1;
        Suit s = HEARTS;
        Value v = ACE;
        CardFunctions instance = new CardFunctions(s,v);
        instance.setCardValue1(a);
         boolean correctSet = false;
        if(instance.getCardValue1() == a){
            correctSet = true;
        }
         boolean expResult = true;
        
        assertEquals(expResult, correctSet);
      
    }

    /**
     * Test of getValue1 method, of class CardFunctions.
     */
    @Test
    public void testGetCardValue1Good() {
        System.out.println("getValue1");
        
         int a = 2;
        Suit s = HEARTS;
        Value v = TWO;
        CardFunctions instance = new CardFunctions(s,v);
        instance.setCardValue1(a);
        boolean numValueFound = false;
        if(instance.getCardValue1() == 2){
            numValueFound = true;
        }
        boolean expResult = true;
        
        assertEquals(expResult, numValueFound);
     
    }
     public void testGetCardValue1Boundary() {
        System.out.println("getValue1");
        
        int a = 1;
        Suit s = HEARTS;
        Value v = ACE;
        CardFunctions instance = new CardFunctions(s,v);
        instance.setCardValue1(a);
        boolean numValueFound = false;
        if(instance.getCardValue1() == 1){
            numValueFound = true;
        }
        boolean expResult = true;
        
        assertEquals(expResult, numValueFound);
     
    }
     public void testGetCardValue1Bad() {
        System.out.println("getValue1");
        
        int a = 2;
        Suit s = HEARTS;
        Value v = TWO;
        CardFunctions instance = new CardFunctions(s,v);
        instance.setCardValue1(3);
        boolean numValueFound = false;
        if(instance.getCardValue1() == 2){
            numValueFound = true;
        }
        boolean expResult = false;
        
        assertEquals(expResult, numValueFound);
   
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValue2 method, of class CardFunctions.
     */
    @Test
public void testSetCardValue2Good() {
        System.out.println("setValue2");
        int a = 2;
        Suit s = HEARTS;
        Value v = TWO;
        CardFunctions instance = new CardFunctions(s,v);
        instance.setCardValue2(a);
        boolean correctSet = false;
        if(instance.getCardValue2() == a){
            correctSet = true;
        }
         boolean expResult = true;
        
        assertEquals(expResult, correctSet);
        
             
    }
     public void testSetCardValue2Bad() {
        System.out.println("setValue2");
        int a = -1;
        Suit s = HEARTS;
        Value v = TWO;
        CardFunctions instance = new CardFunctions(s,v);
        instance.setCardValue2(-2);
         boolean correctSet = false;
        if(instance.getCardValue2() == a || instance.getCardValue2() > 0){
            correctSet = true;
        }
         boolean expResult = false;
        
        assertEquals(expResult, correctSet);
       
        fail("The test case is a prototype.\nIncorrect value, also not valid.");
    }
     
      public void testSetCardValue2Boundary() {
        System.out.println("setValue2");
        int a = 11;
        Suit s = HEARTS;
        Value v = ACE;
        CardFunctions instance = new CardFunctions(s,v);
        instance.setCardValue2(a);
         boolean correctSet = false;
        if(instance.getCardValue2() == a){
            correctSet = true;
        }
         boolean expResult = true;
        
        assertEquals(expResult, correctSet);
      
    }

    /**
     * Test of getValue2 method, of class CardFunctions.
     */
    @Test
   public void testGetCardValue2Good() {
        System.out.println("getValue2");
        
         int a = 2;
        Suit s = HEARTS;
        Value v = TWO;
        CardFunctions instance = new CardFunctions(s,v);
        instance.setCardValue2(a);
        boolean numValueFound = false;
        if(instance.getCardValue2() == 2){
            numValueFound = true;
        }
        boolean expResult = true;
        
        assertEquals(expResult, numValueFound);
     
    }
     public void testGetCardValue2Boundary() {
        System.out.println("getValue2");
        
        int a = 11;
        Suit s = HEARTS;
        Value v = ACE;
        CardFunctions instance = new CardFunctions(s,v);
        instance.setCardValue2(a);
        boolean numValueFound = false;
        if(instance.getCardValue2() == 1){
            numValueFound = true;
        }
        boolean expResult = true;
        
        assertEquals(expResult, numValueFound);
     
    }
     public void testGetCardValue2Bad() {
        System.out.println("getValue2");
        
        int a = 2;
        Suit s = HEARTS;
        Value v = TWO;
        CardFunctions instance = new CardFunctions(s,v);
        instance.setCardValue2(3);
        boolean numValueFound = false;
        if(instance.getCardValue2() == 2){
            numValueFound = true;
        }
        boolean expResult = false;
        
        assertEquals(expResult, numValueFound);
   
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateDeck method, of class CardFunctions.
     */
    @Test
    public void testGenerateDeckGood() {
        System.out.println("generateDeck");        
        ArrayList<CardFunctions> cards = new ArrayList<>();
        boolean result = false;
        
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
        
                for(int i = 0; i < cards.size()-1; i++){
                    if(cards.get(i).getSuit() != cards.get(i+1).getSuit() && cards.size() == 52){
                           result = true;
                       }
                }
                
                 Collections.shuffle(cards);
                
                 
                 boolean expResult = true;
        
         assertEquals(expResult, result);
    
    }
     public void testGenerateDeckBoundary() {
        System.out.println("generateDeck");        
        ArrayList<CardFunctions> cards = new ArrayList<>();
        boolean result = false;
        
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
        
                for(int i = 0; i < cards.size()-1; i++){
                    if(cards.get(i).getSuit() != cards.get(i+1).getSuit() && cards.size() == 52){
                           result = true;
                       }
                }
                
                             
                 boolean expResult = true;
        
         assertEquals(expResult, result);

    }
     public void testGenerateDeckBad() {
        System.out.println("generateDeck");        
        ArrayList<CardFunctions> cards = new ArrayList<>();
        boolean result = false;
        
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
        
                for(int i = 0; i < cards.size()-1; i++){
                    if(cards.get(i).getSuit() != cards.get(i+1).getSuit() && cards.size() == 52){
                           result = true;
                       }
                }
                
                 Collections.shuffle(cards);
                
                 
                 boolean expResult = false;
        
         assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of printDeck method, of class CardFunctions.
     */
    @Test
    public void testPrintDeckGood() {
        System.out.println("printDeck");
        ArrayList<CardFunctions> cards = new ArrayList<>();
        boolean result = false;
        
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
        
        
      for(int i = 0; i < cards.size(); i++){
          
            System.out.println(cards.get(i).getValue() + " " 
                    + cards.get(i).getSuit() + " " + cards.get(i).getCardValue1()
            + " " + cards.get(i).getCardValue2());
            
            if(cards.get(i).getSuit() != null){
              result = true;
          }
                                       
        }
      boolean expResult = true;   
      assertEquals(expResult, result);
 
    }
     public void testPrintDeckBoundary() {
        System.out.println("printDeck");
        ArrayList<CardFunctions> cards = new ArrayList<>();
        boolean result = false;
        
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
        
      
        
        
      for(int i = 0; i < cards.size(); i++){
          
            System.out.println(cards.get(i).getValue() + " " 
                    + cards.get(i).getSuit() + " " + cards.get(i).getCardValue1()
            + " " + cards.get(i).getCardValue2());
            
            if(cards.get(i).getSuit() != null){
              result = true;
          }
                                       
        }
      boolean expResult = true;   
      assertEquals(expResult, result);
    
    }
    
    
    public void testPrintDeckBad() {
        System.out.println("printDeck");
        ArrayList<CardFunctions> cards = new ArrayList<>();
        boolean result = false;
        
        for(Suit s: Suit.values())
                {
                    int cardVal = 0;
                    for(Value v: Value.values())
                    {
                       CardFunctions one = new CardFunctions();
                       one.setCardValue1(Card.cardValues1[cardVal]); 
                       one.setCardValue2(Card.cardValues2[cardVal]);
                       cards.add(one);
                       
                       cardVal++;
                    }                
        }
        
        Collections.shuffle(cards);
        
        
      for(int i = 0; i < cards.size(); i++){
          
            System.out.println(cards.get(i).getValue() + " " 
                    + cards.get(i).getSuit() + " " + cards.get(i).getCardValue1()
            + " " + cards.get(i).getCardValue2());
            
            if(cards.get(i).getSuit() != null){
              result = true;
          }
                                       
        }
      boolean expResult = false;   
      assertEquals(expResult, result);
      fail("The test case is a prototype.");
    }

    /**
     * Test of printSum method, of class CardFunctions.
     */
    @Test
    public void testPrintSumGood() {
        System.out.println("printSum");
       ArrayList<CardFunctions> cards = new ArrayList<>();
        boolean result = false;
        
        for(Suit s: Suit.values())
                {
                    int cardVal = 0;
                    for(Value v: Value.values())
                    {
                       CardFunctions one = new CardFunctions();
                       one.setCardValue1(Card.cardValues1[cardVal]); 
                       one.setCardValue2(Card.cardValues2[cardVal]);
                       cards.add(one);
                       
                       cardVal++;
                    }                
        }
        
        Collections.shuffle(cards);
        
         int sum1 = 0;
           int sum2 = 0;
        for(int i = 0; i < cards.size(); i++){                 
             sum1 += cards.get(i).getCardValue1();
             sum2 += cards.get(i).getCardValue2();
                                           
        } 
        
        if(sum1 > 0 && sum2 > 0){
          result = true;  
        }
        
        boolean expResult = true;
        assertEquals(expResult, result);
    }
    
    public void testPrintSumBad() {
        System.out.println("printSum");
       ArrayList<CardFunctions> cards = new ArrayList<>();
        boolean result = false;
        
        for(Suit s: Suit.values())
                {
                    int cardVal = 0;
                    for(Value v: Value.values())
                    {
                       CardFunctions one = new CardFunctions();
                       one.setCardValue1(Card.cardValues1[cardVal]); 
                       one.setCardValue2(Card.cardValues2[cardVal]);
                       cards.add(one);
                       
                       cardVal++;
                    }                
        }
        
        Collections.shuffle(cards);
        
         int sum1 = 0;
           int sum2 = 0;
        for(int i = 0; i < cards.size(); i++){                 
            
                                           
        } 
        
        if(sum1 > 0 && sum2 > 0){
          result = true;  
        }
        
        boolean expResult = false;
        assertEquals(expResult, result);
     
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSum1 method, of class CardFunctions.
     */
    @Test
    public void testGetSum1Good() {
        System.out.println("getSum1");
          ArrayList<CardFunctions> cards = new ArrayList<>();
        boolean result = false;
        
        for(Suit s: Suit.values())
                {
                    int cardVal = 0;
                    for(Value v: Value.values())
                    {
                       CardFunctions one = new CardFunctions();
                       one.setCardValue1(Card.cardValues1[cardVal]); 
                      
                       cards.add(one);
                       
                       cardVal++;
                    }                
        }
        
        Collections.shuffle(cards);
        
         int sum1 = 0;
          
        for(int i = 0; i < cards.size(); i++){                 
             sum1 += cards.get(i).getCardValue1();
            
                                           
        } 
       
    }
    
      public void testGetSum1Bad() {
        System.out.println("getSum1");
        ArrayList<CardFunctions> cards = new ArrayList<>();
        boolean result = false;
        
        for(Suit s: Suit.values())
                {
                    int cardVal = 0;
                    for(Value v: Value.values())
                    {
                       CardFunctions one = new CardFunctions();
                     
                      
                       cards.add(one);
                       
                       cardVal++;
                    }                
        }
        
        Collections.shuffle(cards);
        
         int sum1 = 0;
          
        for(int i = 0; i < cards.size(); i++){                 
                                    
        } 
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSum2 method, of class CardFunctions.
     */
      
    @Test
    
      public void testGetSum2Good() {
        System.out.println("getSum2");
          ArrayList<CardFunctions> cards = new ArrayList<>();
        boolean result = false;
        
        for(Suit s: Suit.values())
                {
                    int cardVal = 0;
                    for(Value v: Value.values())
                    {
                       CardFunctions one = new CardFunctions();
                       one.setCardValue2(Card.cardValues1[cardVal]); 
                      
                       cards.add(one);
                       
                       cardVal++;
                    }                
        }
        
        Collections.shuffle(cards);
        
         int sum1 = 0;
          
        for(int i = 0; i < cards.size(); i++){                 
             sum1 += cards.get(i).getCardValue1();
                                                      
        } 
       
    }
    
  public void testGetSum2Bad() {
        System.out.println("getSum2");
        ArrayList<CardFunctions> cards = new ArrayList<>();
        boolean result = false;
        
        for(Suit s: Suit.values())
                {
                    int cardVal = 0;
                    for(Value v: Value.values())
                    {
                       CardFunctions one = new CardFunctions();
                     
                      
                       cards.add(one);
                       
                       cardVal++;
                    }                
        }
        
        Collections.shuffle(cards);
        
         int sum1 = 0;
          
        for(int i = 0; i < cards.size(); i++){                 
                                    
        } 
        
        fail("The test case is a prototype.");
    }

    
   
    
}
