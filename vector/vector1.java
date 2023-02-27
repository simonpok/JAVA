import java.util.Vector;

public class VectorLearning 
{
   public static void main(String[] args)
   {
     int[] age = {10,20,30};
     
     Vector age2 = new Vector(7, 10);
     System.out.println(age.length);
     age2.add(10);
     age2.add(20); 
     age2.add('c');
     age2.add(30);
     age2.add(30);
     age2.add(30);
     age2.add(30);
     age2.add(30);
    
     System.out.println(age2);
     System.out.println(age2.capacity());
     
     
   }

}
