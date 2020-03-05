import java.util.Scanner;
public class LabEx2_Q4_RandomInRange {
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   
   int start, finish, count = 0;
   
   System.out.print("Starting number?: ");
      start = sc.nextInt();
      
   System.out.print("Finishing number?: ");
      finish = sc.nextInt();
      
   for (int c = start; c <= finish; c++)  // A for loop counts steps so far
         System.out.print(c + " "); 
   
   }
}
