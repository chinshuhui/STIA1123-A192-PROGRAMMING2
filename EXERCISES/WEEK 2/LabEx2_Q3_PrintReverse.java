public class LabEx2_Q3_PrintReverse {
public static void main(String[] args){

   String sentence = new String ("Joey Chin Shu Hui, SME BANK");   
   StringBuilder rev = new StringBuilder();
   
   rev.append(sentence);       // append the String ayat to StringBuilder rev
   rev = rev.reverse();    // reverse the StringBuilder rev
   System.out.println("The above sentence if reversed will be..."+ rev);  // display the reversed String ayat
   
   }
}

