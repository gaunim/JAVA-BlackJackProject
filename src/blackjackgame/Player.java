
package blackjackgame;

/**
 *
 * @author kevin
 */

import java.util.*;
import java.io.*;

public class Player 
{
    public String playerID; 
    public String password;
    public String pass;
    public String loginChoice;
    private ArrayList <Player> players = new ArrayList<>();
    public static String name;
    
    
    
    //getters & setters & constructors
    public Player() {
    }
    
    public Player(String name, String pass)
    {
        this.playerID = name;
        this.password = pass;
    }
    
    public String getPlayerID() 
    {
        return this.playerID;
    }
    
      public String getPassword() 
    {
        return this.password;
    }
      public static String getName(){
          return name;
      }
       
   
      //used to login and store player data, takes user prompt and
      //queries a sequential file 
    public boolean loginPlayer() throws IOException{
        Scanner input = new Scanner(System.in);
        File data = new File("login.dat");
        boolean doesNotExist = true;
              
        boolean error = false;
        while(!error){
            System.out.println("Select 1 to Create Account");
        System.out.println("Select 2 to Login");
        loginChoice = input.nextLine();
        
        if(isNum(loginChoice) == true){
            error = true;
       
             }else{
            System.out.println("Please enter a number!");
        }
        }
        int logChoice = Integer.parseInt(loginChoice);
        
       
        if(logChoice == 1){
                        
            boolean createAcc = false;
            boolean isValid = false;
            while(!createAcc){
               
            System.out.println("Enter Username: ");
           
            String name = input.nextLine();
            
                
            while(!isValid){
            System.out.println("Enter Pass (Must be less than 8 char.): ");
            pass = input.nextLine();
            isValid = checkPassLength(pass);
            }
                if(getFileUser(data).size() == 0){
                    Player one = new Player(name,pass);
                    players.add(one);
                    this.name = name;
                    System.out.println(name + " added"); 
                    
            }else{
                    Player one = new Player(name,pass);
                for(int i = 0; i < getFileUser(data).size(); i++){
                    
                    
                    if(getFileUser(data).get(i).equals(one.getPlayerID())){  
                     System.out.println("Username exists");
                     doesNotExist = false;
                     break;
                    }
                           
            }
                if(doesNotExist){
                players.add(one);
                this.name = name;
                System.out.println(name + " added"); 
                
                doesNotExist = true;
                }
          }
                
            try{
                
                if(!data.exists()){
                    if(data.createNewFile()){                        
                    }
                }
                
                fileWriter(players, data);
                               
            }catch(IOException e){
                
            }
            
            return doesNotExist;
           
            
                }
            }else if(logChoice == 2){
               boolean incorrectLogin = true;
                System.out.println("Enter username: ");
             
                String loginUser = input.nextLine();
                
                System.out.println("Enter password: ");
                String loginPass = input.nextLine();
                for(int i = 0; i < getFileUser(data).size(); i++){
                    
                    if(getFileUser(data).get(i).equals(loginUser) && getFilePsw(data).get(i).equals(loginPass) ){
                        System.out.println("Log in Succesful");
                        
                        this.name = loginUser;
                        
                        incorrectLogin = false;
                        break;
                       
                    }
                                            
                }
                if(incorrectLogin){
                        System.out.println("Incorrect Username/Pass");
                        doesNotExist = false;                        
                    }               
            }else{
                System.out.println("Enter either 1 or 2");
                doesNotExist = false;
            }
        
            return doesNotExist;
           
        }
     
    
    //writes new login data onto sequential file, stores user as first token and
    //pswrd as second token
     public void fileWriter(ArrayList<Player> a, File b) throws IOException{
                 
            FileWriter fw = new FileWriter(b, true);
           
            BufferedWriter bw = new BufferedWriter(fw);          
            if(a.size() == 1){
            for(int i = 0; i < a.size(); i++){
              bw.write(a.get(i).getPlayerID() + " " + a.get(i).getPassword()
              + "\n");
            }
            }else{
                 for(int i = 0; i < a.size(); i++){
              bw.write("\n" + a.get(i).getPlayerID() + " " + a.get(i).getPassword()
              + "\n");
                }
            }
            
            bw.close();
            fw.close();
           
        }
     
     
     //accesses the first token of a sequential file
     public ArrayList<String> getFileUser(File a) throws IOException{
        ArrayList<String> fileDat = new ArrayList<>();
      
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
       
        
        return fileDat;
        
        }
    
     
     //accecss the second token of a sequential file
     public ArrayList<String> getFilePsw(File a) throws IOException{
        ArrayList<String> fileDat = new ArrayList<>();
      
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
       
        
        return fileDat;
        
        }
    
     //ensures password is less than 8 char
     public static boolean checkPassLength(String pass)
    {
        //checks length of string, returns true if 8 or more in length
        if(pass.length()<=8)
        {
            return true;
        }
        return false;
    }
     
     
     public boolean isNum(String a) {
        //used in input validation, ensures integer only 
        //using regex
        String match = "[0-9]+";
        return a.matches(match);
    }
}
     
        
    
       
 

