import java.util.Scanner;
public class Main{


   public static void main(String[] args)
   {
       int[] x = new int[5];
       int[] y = {10,20,30};
       
       //System.out.println("Y>>"+y[0] +" "+y[1]);
       //Scanner inputObj = new Scanner(System.in);
       //int number = inputObj.nextInt();
       for(int element : y)
       {
         System.out.println(element); // prints all the elements of y
       }
   
   }
}
