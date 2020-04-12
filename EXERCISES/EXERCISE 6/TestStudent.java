import java.util.*;
class Student {

	//list of data members
   private String matricNo;
	private double test1, test2, averageMark;
	
	//constructor
	public Student(String matric, double ts1, double ts2) {
		matricNo = matric;
		test1 = ts1;
		test2 = ts2; }
      
	//method that returns some of students’ info
	public String getStudentInfo() {
		return matricNo +"\t\t\t\t"+ averageMark; }
      
	//method that calculates the average of 2 tests
   public void calculateAverage() {
		averageMark = (test1 + test2)/2; }
       
}//end of class Student


public class TestStudent {  
   public static void main (String [] args) {
   	Scanner input = new Scanner(System.in);
      
      String matricNo;
   	double test1, test2;
   	
   	Student [] studDegree = new Student[3];
         	
      for(int i=0; i<studDegree.length; i++) {
         System.out.print("Matric No: ");
            matricNo = input.next();
            
         System.out.print("Test 1: ");
            test1 = input.nextDouble();
            
         System.out.print("Test 2: ");
            test2 = input.nextDouble();   
            
         studDegree[i] = new Student(matricNo, test1, test2); }
      
      System.out.println("*****************************");
      System.out.println("\t\tSTUDENT INFORMATION\t\t");
      System.out.println("*****************************");
      System.out.println("Matric No\t\tAverageMark");
      
      for(int a=0; a<studDegree.length; a++) {
         studDegree[a].calculateAverage();
         System.out.println(studDegree[a].getStudentInfo() ); }
         
  }//end of main method
}//end of class TestStudent