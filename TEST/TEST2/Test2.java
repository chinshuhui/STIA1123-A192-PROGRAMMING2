import java.util.Scanner;
public class Test2
{
   public static void main (String [] args)
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Staff Name ? : ");
      String name = sc.nextLine();
      System.out.print("Staff ID ? : ");
      String id = sc.nextLine();
      System.out.print("Income Type ? : ");
      String incomeType = sc.nextLine();
      System.out.print("Income ammount ? : " + "RM" );
      double amount = sc.nextDouble();
      System.out.print("Income Tax Percentage ? : ");
      double tax = sc.nextDouble();
      
      Income your = new Income(incomeType,amount,tax);
      Staff joey = new Staff(name,id,your);
       
      joey.displayStaffInfo();
      joey.displayIncomeInfo();
    }

}

class Income
{
   private String incomeType;
   private double amount;
   private double tax;
   private double totalTax;
   
   public Income(String incomeType,double amount,double tax)
   {
    this.incomeType = incomeType;
    this.amount = amount;
    this.tax = tax;
    this.totalTax = (tax/100)*this.amount;
    }
    
    public String getIncomeType(){
      return incomeType;
    }
    
    public double getAmount(){
      return amount;
      }
      
    public double getTax(){
      return tax;
      }
      
    public double getTotalTax(){
      return totalTax;
      }
    }
    
class Staff
{
   private String name;
   private String id;
   private Income income;
   
   public Staff(String name, String id, Income income){
      this.name = name;
      this.id = id;
      this.income = income;
      }
      
      public String getName(){
         return name;
         }
      
      public String getId(){
         return id;
         }
      
      public double calculateNetIncome(){
         return income.getAmount() - income.getTotalTax();
         }
      
      public void displayStaffInfo(){
         System.out.println("----------Staff Info----------");
         System.out.println("Staff name ? : " + this.name);
         System.out.println("Staff ID ? : " + this.id);
         }
         
      public void displayIncomeInfo(){
         System.out.println("----------" + this.name + "'s Income Info----------");
         System.out.println("Income Type ? : " + income.getIncomeType());
         System.out.println("Income Amount ? : " + "RM" + income.getAmount());
         System.out.println("Tax % ? : " + income.getTax() + "%");
         System.out.println("Total Tax Paid ? : " + "RM" + income.getTotalTax());
         System.out.println("Total Net Income ? : " + "RM" + calculateNetIncome());
         }
         }