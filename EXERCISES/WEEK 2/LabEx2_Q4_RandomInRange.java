import java.util.Scanner;
public class LabEx2_Q4_RandomInRange {
    public static void main (String[] args)
    {
     Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter a number as first number:");
        int num1 = sc.nextInt();
        System.out.println("Please enter a number as second number:");
        int num2 = sc.nextInt();
        
        if (num1 > num2)
        {
            System.out.println("0");
        }
        else
        {
            int x = (int)(Math.random()*((num2-num1)+1))+num1;
            
            System.out.println("The random integer is " +x);
        }
    }
}
