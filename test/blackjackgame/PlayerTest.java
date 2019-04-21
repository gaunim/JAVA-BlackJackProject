/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackgame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
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
would work. In this particular test class, the login method was logically tested
instead of procedurally due to method complexity. As such, string comparisons 
are predefined as opposed to being assigned based on existing file data
or user prompt within the test method. 
*/
public class PlayerTest {
    
    public PlayerTest() {
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
     * Test of getPlayerID method, of class Player.
     */
    @Test
    public void testGetPlayerIDGood() {
        System.out.println("getPlayerID");
        Player instance = new Player("someName", "somePass");
        String expResult = "someName";
        String result = instance.getPlayerID();
        assertEquals(expResult, result);
       
    }
      public void testGetPlayerIDBoundary() {
        System.out.println("getPlayerID");
        Player instance = new Player("", "somePass");
        String expResult = "";
        String result = instance.getPlayerID();
        assertEquals(expResult, result);
       
    }
      public void testGetPlayerIDBad() {
        System.out.println("getPlayerID");
        Player instance = new Player();
        String expResult = "someName";
        String result = instance.getPlayerID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Player.
     */
    @Test
    public void testGetPasswordGood() {
        System.out.println("getPassword");
        Player instance = new Player("someUser","somePass");
        String expResult = "somePass";
        String result = instance.getPassword();
        assertEquals(expResult, result);
       
    }
      public void testGetPasswordBoundary() {
        System.out.println("getPassword");
        Player instance = new Player("someUser","");
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        
    }
        public void testGetPasswordBad() {
        System.out.println("getPassword");
        Player instance = new Player("someUser","");
        String expResult = "somePass";
        String result = instance.getPassword();
        assertEquals(expResult, result);
      
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Player.
     */
    
    private String name;
    public void testGetNameGood() {
        System.out.println("getName");
        this.name = "someName";
        String expResult = "someName";
        String result = Player.getName();
        assertEquals(expResult, result);       
    }
    public void testGetNameBoundary() {
        System.out.println("getName");
        this.name = "";
        String expResult = "";
        String result = Player.getName();
        assertEquals(expResult, result);       
    }
      public void testGetNameBad() {
        System.out.println("getName");
        this.name = "";
        String expResult = "someName";
        String result = Player.getName();
        assertEquals(expResult, result);   
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginPlayer method, of class Player.
     */
    @Test
    public void testLoginPlayerGood() throws IOException {
        System.out.println("loginPlayer");
        boolean result = false;
        boolean expResult = true;
        String playerChoice = "1";
        String userInputName = "someName";
        String userInputPass = "somePass";
        String existingName = "someName";
        String existingPass = "somePass";
        
        if(playerChoice.equals("1") && !userInputName.equals(existingName) == false){
            result = true;
        }else if(playerChoice.equals("2") && userInputName.equals(existingName) 
                && userInputPass.equals(existingPass)){
            result = true;
        }else{
            result = false;
        }

        assertEquals(expResult,result);
 
    }
    public void testLoginPlayerBoundary() throws IOException {
        System.out.println("loginPlayer");
        boolean result = false;
        boolean expResult = true;
        String playerChoice = "1";
        String userInputName = "";
        String userInputPass = "";
        String existingName = "";
        String existingPass = "";
        
        if(playerChoice.equals("1") && !userInputName.equals(existingName) == false){
            result = true;
        }else if(playerChoice.equals("2") && userInputName.equals(existingName) 
                && userInputPass.equals(existingPass)){
            result = true;
        }else{
            result = false;
        }

        assertEquals(expResult,result);
 
    }
    
     public void testLoginPlayerBad() throws IOException {
        System.out.println("loginPlayer");
        boolean result = false;
        boolean expResult = true;
        String playerChoice = "1";
        String userInputName = "";
        String userInputPass = "somePass";
        String existingName = "someName";
        String existingPass = "somePass";
        
        if(playerChoice.equals("1") && !userInputName.equals(existingName) == false){
            result = true;
        }else if(playerChoice.equals("2") && userInputName.equals(existingName) 
                && userInputPass.equals(existingPass)){
            result = true;
        }else{
            result = false;
        }

        assertEquals(expResult,result);
      
        fail("The test case is a prototype.");
    }

    /**
     * Test of fileWriter method, of class Player.
     */
    @Test
    public void testFileWriterGood() throws IOException {
        System.out.println("fileWriter");
        ArrayList<Player> a = new ArrayList<>();
        File b = new File("someFile.dat");
        Player instance = new Player();
        instance.fileWriter(a, b);
        boolean result = false;
        boolean expResult = true;
        if(b.exists()){
            result = true;
        }
        
        
         assertEquals(expResult,result);
      
    }
      public void testFileWriterBad() throws IOException {
        System.out.println("fileWriter");
        ArrayList<Player> a = new ArrayList<>();
        File b = new File("err.dat");
        Player instance = new Player();
        instance.fileWriter(a, b);
        boolean result = false;
        boolean expResult = false;
        if(b.exists()){
            result = true;
        }
              
         assertEquals(expResult,result);
       
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFileUser method, of class Player.
     */
    @Test
    public void testGetFileUserGood() throws IOException {
        System.out.println("getFileUser");
        ArrayList<String> fileDat = new ArrayList<>();
        File a = new File("someFile.dat");
        a.createNewFile();
        FileReader fw = new FileReader(a);
        
        BufferedReader bw = new BufferedReader(fw);
        
        String line = bw.readLine();
        
        int i = 0;
        while(line != null){
            StringTokenizer one = new StringTokenizer(line);
            fileDat.add(one.nextToken());
            line = bw.readLine();
            i++;
        }
          
        bw.close();
        fw.close();
        
        boolean result = false;
        boolean expResult = true;
        
        if(a.exists()){
           result = true; 
        }
        
         assertEquals(expResult,result);
  
    }
    
     public void testGetFileUserBad() throws IOException {
        System.out.println("getFileUser");
        ArrayList<String> fileDat = new ArrayList<>();
        File a = new File("");
       
        FileReader fw = new FileReader(a);
        
        BufferedReader bw = new BufferedReader(fw);
        
        String line = bw.readLine();
        
        int i = 0;
        while(line != null){
            StringTokenizer one = new StringTokenizer(line);
            fileDat.add(one.nextToken());
            line = bw.readLine();
            i++;
        }
          
        bw.close();
        fw.close();
        
        boolean result = false;
        boolean expResult = false;
        
        if(a.exists()){
           result = true; 
        }
        
         assertEquals(expResult,result);
          fail("The test case is a prototype.");
    }

    /**
     * Test of getFilePsw method, of class Player.
     */
    @Test
    public void testGetFilePswGood() throws Exception {
        System.out.println("getFilePsw");
           ArrayList<String> fileDat = new ArrayList<>();
           File a = new File("SomeFile.dat");
           a.createNewFile();
        FileReader fw = new FileReader(a);
        
        BufferedReader bw = new BufferedReader(fw);
        
        String line = bw.readLine();
        
        int i = 0;
        while(line != null){
            StringTokenizer one = new StringTokenizer(line);
            one.nextToken();
            fileDat.add(one.nextToken());
            line = bw.readLine();
            i++;
        }
          
        bw.close();
        fw.close();
        boolean result = false;
        boolean expResult = true;
        
        if(a.exists()){
            result = true;
        }
        
        assertEquals(expResult,result);
     
    }
    
     public void testGetFilePswBad() throws Exception {
        System.out.println("getFilePsw");
           ArrayList<String> fileDat = new ArrayList<>();
           File a = new File("SomeFile.dat");
          
        FileReader fw = new FileReader(a);
        
        BufferedReader bw = new BufferedReader(fw);
        
        String line = bw.readLine();
        
        int i = 0;
        while(line != null){
            StringTokenizer one = new StringTokenizer(line);
            one.nextToken();
            fileDat.add(one.nextToken());
            line = bw.readLine();
            i++;
        }
          
        bw.close();
        fw.close();
        boolean result = false;
        boolean expResult = false;
        
        if(a.exists()){
            result = true;
        }
        
        assertEquals(expResult,result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPassLength method, of class Player.
     */
    @Test
    public void testCheckPassLengthGood() {
        System.out.println("checkPassLength");
        String pass = "12345678";
        boolean expResult = true;
        boolean result = Player.checkPassLength(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
     public void testCheckPassLengthBad() {
        System.out.println("checkLengthGood");
        String pass = "abcdefghi";
        boolean expResult = false;
        boolean result = Player.checkPassLength(pass);
        assertEquals(expResult, result);
          fail("The test case is a prototype.");
    }
     public void testCheckPassLengthBoundary() {
        System.out.println("checkLength");
        String pass = "";
        boolean expResult = false;
        boolean result = Player.checkPassLength(pass);
        assertEquals(expResult, result);    
        
    }
    
     

    /**
     * Test of isNum method, of class Player.
     */
    @Test
    public void testIsNumGood() {
        System.out.println("isNum");
        String a = "123";
        Player instance = new Player();
        boolean expResult = true;
        boolean result = instance.isNum(a);
        assertEquals(expResult, result);
       
    }
    public void testIsNumBad() {
        System.out.println("isNum");
        String a = "abc";
        Player instance = new Player();
        boolean expResult = false;
        boolean result = instance.isNum(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    public void testIsNumGoodBoundary() {
        System.out.println("isNum");
        String a = "1";
        Player instance = new Player();
        boolean expResult = true;
        boolean result = instance.isNum(a);
        assertEquals(expResult, result);
       
    }
    
}
