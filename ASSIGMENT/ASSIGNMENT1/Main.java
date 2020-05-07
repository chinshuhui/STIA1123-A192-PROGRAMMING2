public class Main 
{
 public static void main (String [] args)
 {
   Flower1 f1 = new Flower1();
   Flower2 f2 = new Flower2();
   Flower3 f3 = new Flower3();
   
   System.out.println("This flower is " + (f1.type));//take data from variable in class Flower1
   System.out.println("The colour of flower is " + (f1.colour));
   System.out.println("This flower brings the meaning " + (f1.symbol));
   
   f2.reserve();//take data from method in class Flower2
   f2.pedal();
   f1.branch();
   }
}
