import java.util.Scanner;
public class LabEx2_Q3_PrintReverse 
{
    public static void main(String[]args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter a sentence : ");
      String sent = sc.nextLine();

        for (int i = sent.length() - 1; i >= 0; i--) 
        {
            System.out.print(sent.charAt(i));
        }
    }
}
