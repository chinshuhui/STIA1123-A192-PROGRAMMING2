import java.util.Scanner;

   class MyFCStaff_Ex4q4 {   // class MyFCStaff
   
      String name, staffID;
      double work_hrs, total_sales, total_salary, commission;
     
      public MyFCStaff_Ex4q4(String name, String staffID, double work_hrs, double total_sales) {
         this.name = name;
         this.staffID = staffID;
         this.work_hrs = work_hrs;
         this.total_sales = total_sales; }   // end of Constructor method
      
      public double calculateCommission() {
         if (total_sales >= 150.00 && total_sales <= 300.00) {
            commission = (0.05) * total_sales; }
       
         else if (total_sales > 300.00 && total_sales <= 500.00) {
            commission = (0.10) * total_sales; }
            
         else if (total_sales > 500.00) {
            commission = (0.15) * total_sales; } 
            
         else {
            commission = 0; }   
      return commission; }   // end of commission method
         
      public double calculateSalary() {
         total_salary = (work_hrs * 8) + calculateCommission();
      return total_salary; } // end of calculate salary method
      
      public String toString() {
         System.out.print("------------------------------------------------");
         String NAME = String.format("\nStaff Name: "+ name);
         String ID = String.format("\nStaff ID: "+ staffID);
         String HOURS = String.format("\nHours Work: "+ work_hrs);
         String REVENUE = String.format("\nTotal Sale: "+ total_sales);
         String TOTAL = String.format("\nTotal Salary: "+ calculateSalary() );  
      return NAME + ID + HOURS + REVENUE + TOTAL;   }  // end of display salary method
         
   } // end of class MyFCStaff
   
   
   
   public class TestMyFCStaff_modified {  // class TestMyFCStaff
      public static void main (String[] arg){
      Scanner nai = new Scanner(System.in);
      
      String name, staffID;
      double work_hrs, total_sales;
      
      // enter staff name, id, working hours and total sales     
      System.out.print("Enter staff name: ");
         name = nai.nextLine();
         
      System.out.print("Enter staff ID: ");
         staffID = nai.next();
         
      System.out.print("Enter staff's working hours: ");
         work_hrs = nai.nextDouble();
         
      System.out.print("Enter total sales: ");
         total_sales = nai.nextDouble();
         
      // display the information from class MyFCStaff         
      MyFCStaff_Ex4q4 show = new MyFCStaff_Ex4q4 (name, staffID, work_hrs, total_sales);     
      System.out.println(show.toString());      
       
      }
   }