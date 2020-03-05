import java.util.Scanner;
public class Date_3 {
   public static void main(String[] args){ 
   Scanner sc = new Scanner(System.in);
   
   String date;
   
   System.out.print("Date For Today Is ");
      date = sc.next();
           
   date = date.replace("/", ".");
   System.out.print(date);
   
   }
}