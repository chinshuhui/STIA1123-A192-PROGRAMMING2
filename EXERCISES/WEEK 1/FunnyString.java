import java.util.Scanner;
public class FunnyString
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner (System.in);
        
        String colour, food, animal, friend;
        
        System.out.println("Please enter your favourite colour: " );
        colour = sc.next();
        
        System.out.println("Please enter your favourite food: ");
        food = sc.next();
        
        System.out.println("Please enter your favourite animal: ");
        animal = sc.next();
        
        System.out.println("Please enter your first name of a friend: ");
        friend = sc.next();
        
        System.out.println("I had a dream that " + friend + " ate a " + colour +
                " " + animal + " and said it tasted like " + food + "!");
    }
}
