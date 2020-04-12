import java.util.*;
    class Employee{
       int employeeIDnumber; 
       double grossPay, stateTax, federalTax;
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your employee ID number\t: ");
        employeeIDnumber = sc.nextInt();
        System.out.print("Enter your Gross Pay\t\t:RM ");
        grossPay = sc.nextDouble();
        System.out.print("Enter your State Tax\t\t:RM ");
        stateTax = sc.nextDouble();
        System.out.print("Enter your Federal Tax\t\t:RM ");
        federalTax = sc.nextDouble();
    }
}
    class Payroll{
        private double netPay, grossPay, stateTax, federalTax;
        
        public Payroll(double grossPay, double stateTax, double federalTax){
            this.grossPay = grossPay;
            this.stateTax = stateTax;
            this.federalTax = federalTax;
        }
        public double calculateNetPay(){
            netPay = grossPay - stateTax - federalTax;
            return netPay;
        }
        public void printOutput(){
            System.out.printf("\nNet pay is : RM %.2f",calculateNetPay());
        }
}
        public class PayrollDemo {
            public static void main(String[] args){
                Employee eply = new Employee();
                eply.input();
                Payroll pr = new Payroll(eply.grossPay, eply.stateTax, eply.federalTax);
                pr.printOutput();
    }  
}