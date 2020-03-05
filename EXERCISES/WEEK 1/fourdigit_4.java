import java.util.Scanner;
public class fourdigit_4 {
   public static void main(String[] args){    
   Scanner sc = new Scanner(System.in);  
   
   int sum = 0;
   String cha = "";
     
   System.out.println("Enter 4 digits here...");
      String num4 = sc.next();

   for (int a=0; a < num4.length(); a++) {
      System.out.println(num4.charAt(a));
      cha = String.valueOf(num4.charAt(a));
      sum = sum + Integer.parseInt(cha);
      } 
      
   System.out.println("Sum of the 4 digits is "+ sum);
   
   String strA;
   String strB;
   
   strA = new String("The Dog");
   strB = new String("The Dog");
   
   if(strA.equals(strB))
      System.out.println("This will Print.");
   
   }
}
