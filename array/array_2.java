import java.util.Scanner;
public class Main{


   public static void main(String[] args)
   {
     int x[] = {1,2,3,5,8,13,21,34,55,89};
     int n;
     //int y[y] = new int[5];
     for(int i=0; i<10;i++)
     {
       System.out.println("\n"+x[i]);
     }
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of elements you want to store: ");  

      n=sc.nextInt();
      
      int[] array = new int[n];  
      System.out.println("Enter the elements of the array: ");  
      for(int i=0; i<n; i++)  
     {  
        
      array[i]=sc.nextInt();  
     }  
     System.out.println("Element stored in array are:\n");
     for(int i=0; i<n; i++)  
     {  
        
      System.out.println(array[i]); 
     }  
     
     
      
     
     
   }
 }  
