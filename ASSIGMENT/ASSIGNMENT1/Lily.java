public class Lily extends Flower//inherit from class Flower 
{
   // name of the flower
   public static String name = new String("Lily");

   // specifically instantiates the properties
   private static String colour = "WHITE / YELLOW";

   // constructor
      public Lily(String name, String colour) {
         this.name = name;
         this.colour = colour;
      }
   
   // distinctive characteristics 
   // colour
   public void whatColour() {   
      System.out.println("1. " + name + "is " + colour + "colour."); }
   
   // special of the flower
   public void specialSymbol() {
      System.out.println("2. Symbol of the flower is BLESSING"); }
   
   //flower is suitable for who
   public void suitable(){
     System.out.println("3. This flower is suitable for MOTHER.");} 
  
  
  }//end class 
  