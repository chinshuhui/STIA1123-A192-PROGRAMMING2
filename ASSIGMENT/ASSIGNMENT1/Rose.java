public class Rose extends Flower//inherit from class Flower 
{
   // name of the flower
   public static String name = new String("Rose");

   // specifically instantiates the properties
   private static String colour = "RED / PINK";

   // constructor
      public Rose(String name, String colour) {
         this.name = name;
         this.colour = colour;
      }
   
   // distinctive characteristics 
   // colour
   public void whatColour() {   
      System.out.println("1. " + name +"is " + colour + "colour."); }
   
   // special of the flower
   public void specialSymbol() {
      System.out.println("2. Symbol of the flower is LOVE YOUR CHARMING SMILE"); }
   
   //flower use in where
   public void uses(){
     System.out.println("3. This flower is usually use in WEDDING PARTY.");} 
  
  
  }//end class 
  