public class Tulip extends Flower//inherit from class Flower 
{
   
   // name of the flower
   public static String name = new String("Tulip");

   // specifically instantiates the properties
   private static String colour = "PURPLE";

   // constructor
      public Tulip(String name, String colour) {
         this.name = name;
         this.colour = colour;
      }
   
   // distinctive characteristics 
   // colour
   public void whatColour() {   
      System.out.println("1. " + name + " is " + colour + " colour."); }
   
   // special of the flower
   public void specialSymbol() {
      System.out.println("2. Symbol of the flower is FOREVER LOVE"); }
   
   //flower is suitable when
   public void when(){
     System.out.println("3. This flower is suitable during BIRTHDAY of LOVERS.");} 
  
  
  }//end class 
  