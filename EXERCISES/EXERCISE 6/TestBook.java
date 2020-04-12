import java.util.Scanner; 
class TestBook_E6t4 {
    private String title;      //book’s title
    private double price;      //book’s price
   
    public TestBook_E6t4 (String t, double p) {
      title = t;
      price = p;
    }
    public String getTitle() {
      return title;
    }
   
    public double getPrice() {
      return price;
    }
}

// class with main method  
public class TestBook {
   public static void main(String[] arg){
   Scanner scan = new Scanner(System.in);
   
   String title, MaxCostBook = " ";
   double price;
   double max_cost = 0;

   // read integer n
   System.out.print("How many number of books?...");
      int n = scan.nextInt();
      
   TestBook_E6t4 myLibrary[] = new TestBook_E6t4[n];
   
   // loop of the array myLibrary
   for (int i=0; i < myLibrary.length; i++) {
      scan.nextLine();
      System.out.print("Title of the book...");
         title = scan.nextLine();
             
      System.out.print("Price of the book...");
         price = scan.nextDouble();
         
      System.out.println("--------------------------------------");              
       
      myLibrary[i] = new TestBook_E6t4(title, price); 
      
      if (myLibrary[i].getPrice() > max_cost) {
         max_cost = myLibrary[i].getPrice();
         MaxCostBook = myLibrary[i].getTitle(); }
         
    } // end of loop
   
   // the book with the highest price
   System.out.printf("The most expensive book here is "
                     + MaxCostBook + " of RM%.2f", max_cost);
                     
   System.out.printf("\n-------------------------------");
   System.out.println("-------------------------------");
   
   // the books with the term "Java" in their title
   System.out.println("The book(s) with word 'Java' in their title(s):");
      for (int k=0; k < n; k++) {
         if (myLibrary[k].getTitle().indexOf("Java") != -1) 
            System.out.println("- "+ myLibrary[k].getTitle()); 
      }

   }
}