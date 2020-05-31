public class Main 
{
 public static void main (String [] args)
 {   
   // reference to the superclass Flower
      Flower f = new Flower();
   
   // reference to the subclass
      Lily l = new Lily("Lily", "WHITE / YELLOW");
   
   // reference to the subclass      
      Rose r = new Rose("Rose", "RED / PINK");
   
   // reference to the subclass of 3rd shoe
      Tulip t = new Tulip("Tulip", "PURPLE"); 
      
   // LILY
   System.out.println("-----------------------------------------------------------------");
   System.out.println("FLOWER 1: " + l.name.toUpperCase());
   System.out.println(" ");   
      f.hasPedals(); f.hasBranches(); f.hasLeaves();
      l.whatColour();l.specialSymbol();l.suitable();
   System.out.println("-----------------------------------------------------------------");
   
   // ROSE
   System.out.println("FLOWER 2: " + r.name.toUpperCase());
   System.out.println(" ");
     f.hasPedals(); f.hasBranches(); f.hasLeaves();
     r.whatColour();r.specialSymbol();r.uses();
   System.out.println("-----------------------------------------------------------------");
   
   // TULIP
   System.out.println("FLOWER 3: " + t.name.toUpperCase());
   System.out.println(" ");
      f.hasPedals(); f.hasBranches(); f.hasLeaves();
      t.whatColour();t.specialSymbol();t.when();
   System.out.println("-----------------------------------------------------------------");
 
   }
} // the end 