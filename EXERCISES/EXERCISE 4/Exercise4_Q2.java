import java.util.Scanner;
class Exercise4_Q2 {
	static Scanner console = new Scanner(System.in);	
   public static void main(String arg[]){
	
	String name, staffID;
	int workingDay;

	System.out.print("Staff name?: ");
		name = console.next();

   System.out.print("Staff ID?: ");
      staffID = console.next();
   
   System.out.print("How many days of work?: ");
   	workingDay = console.nextInt();
   
   double salary = workingDay * 35.0;
   
   System.out.print("\nName: "+ name);
   System.out.print("\nID: "+ staffID);
   System.out.print("\nWorking days: "+ workingDay);
   System.out.printf("\nSalary: %.2f", salary);
   
   }	
}//end class