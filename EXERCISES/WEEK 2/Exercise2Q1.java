public class Exercise2Q1
{
    public static void main(String[] args)
    {
     final int start = 0;//starting number 
     final int end = 10;//ending number
     
     System.out.println("Number\tSquare\tCube");
     
     for (int i = start; i != end; i++)// Print the curr number, square of the number and cube of the number
        {
            System.out.println(i + "\t\t\t" + (int) Math.pow(i, 2) + "\t\t\t" + (int) Math.pow(i, 3));
        } 
    } 
} 