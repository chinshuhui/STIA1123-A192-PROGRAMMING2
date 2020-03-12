import java.util.Scanner;
public class Test1_3
{
   public static void main(String[] arg)
   {
   Scanner sc = new Scanner (System.in);   

   System.out.println("Please enter sentence one : ");
   String one = sc.nextLine();
   
   System.out.println("Please enter sentence two : ");
   String two = sc.nextLine();
      
   if (one.equals(two)) //Check whether two Strings are equal or not
      System.out.println("The strings are EQUAL.");
   else
      System.out.println("The strings are DIFFERENT.");
   
   }
}