import java.util.*;
public class LabEx2_Q2_CountA 
{
public static void main(String[] args)
{
   String sentence;
   int n = 0;
        
   Scanner sc = new Scanner (System.in);//allow input from keyboard
        
   System.out.print("Enter a sentence\t:");
   sentence= sc.nextLine();
        
   n=CountA(sentence);
                
   System.out.println("The number of A character is "+ n);

   }    
    public static int CountA(String word){
    
        int j = 0;
           
        for(int i = 0; i != word.length(); i++){

            if(word.charAt(i) == 'A'){
                
                j++;
            }        
        
        }
    return j;    
    }
    
}
