import java.util.Scanner;
import java.util.Random;

public class Main{


   public static void main(String[] args)
   {
       System.out.println("GAME RULE: You Only Got 5 chances to Guess The number\n");
       char[] maxMove ={1,2,3,4,5,6,7,8,9,10};
       Random random = new Random();
    
       int number = random.nextInt(10);
       int computerTurn =maxMove[number];
       
       
       int count =0;
       
       while (count <5)
       {
       Scanner inputObj = new Scanner(System.in);
       System.out.println("Enter a Number from 1 to 10");
       int userTurn = inputObj.nextInt();
       System.out.println("User pressed>>"+userTurn);
       
       
      
       
          if (userTurn > computerTurn)
          {
             System.out.println("Ops! Its higher. Try again!");
             
          }
          else if (userTurn < computerTurn)
          {
             System.out.println("Ops! Its lower. Try again!");
             
          }
          else if (userTurn == computerTurn)
          {
             System.out.println("Bingo! you guessed right.");
             break;
          }
          
          count ++;
          
          } 
          System.out.println("Game Over! Computer Guessed>>"+computerTurn);
       
       
   
   }
   
  } 
