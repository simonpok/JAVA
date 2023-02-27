import java.util.Scanner;
import java.util.Random;

public class Main{


   public static void main(String[] args)
   {
   boolean flag=true;
   do {
   //int i=0;
   //while (i=0){
     // take user input
     //S,P,R
     Scanner inputObj = new Scanner(System.in);
     System.out.println("Please Enter S,P,R");
     //String userMove = inputObj.next().toUpperCase();
     char userMove = inputObj.next().charAt(0);  
     System.out.println("User pressed>>>>"+userMove);
     
    char[] maxMove ={'S', 'P', 'R'};
    Random random = new Random();
    //0-2
    
    int number = random.nextInt(3);
    char computerMove =maxMove[number];
    System.out.println("Computer move>>"+computerMove);
    
    
    
     
     //make computer to make move either S,P,R
     //computer =user -> DRAW
     //Computer "S"
       //user "P" -> computer wins.
       //user Wins.
       
     //Computer "P"
     //User "S" -> user  wins
     //computer wins.
      if(userMove =='S' && computerMove =='S' )
   {
      System.out.println("tie!!");
   }
  else if(userMove =='S' && computerMove =='R' )
   {
      System.out.println("you lose");
   }
   else if(userMove =='S' && computerMove =='P' )
   {
      System.out.println("You win");
   }
   else if(userMove =='P' && computerMove =='S' )
   {
      System.out.println("You lose!!");
   }
   else if(userMove =='P' && computerMove =='R' )
   {
      System.out.println("you win");
   }
   else if(userMove =='P' && computerMove =='P' )
   {
      System.out.println("tie!!");
   }
   else if(userMove =='R' && computerMove =='S' )
   {
      System.out.println("You win!!");
   }
   else if(userMove =='R' && computerMove =='R' )
   {
      System.out.println("tie!!");
   }
   else if(userMove =='R' && computerMove =='P' )
   {
      System.out.println("You lose");
   }
   else if(userMove =='R' && computerMove =='P' )
   {
      System.out.println("You lose");
   }
   else 
   {
      System.out.println("Type the valid input, please!");
   }
   
  }while(flag=true);
  
  
  
  }
   
} 
