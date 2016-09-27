
import com.teamTunde.Treet;

import java.util.Arrays;
import java.util.Date;

public class Example {
   public static void main(String []args){
     
       /* 1st Sample treet */
      Treet treet = new Treet(   "Max Payne", 
                                 "You want? to be famous just@ tweet$ about me_ heheh!!" , 
                                 new Date(1473919826000L) 
                             );
     
       /*2nd Sample treet */
      Treet secondTreet = new Treet(  "Mad Max Payne", 
                                      "Zumber..  about me_ heheh!!" , 
                                       new Date(1473919826000L) 
                                   );
     
     System.out.printf("This is a new treet: %s %n", treet);
     System.out.println("The words are: ");
     
     /* searches and print out all the words in the sentence. */
     for(String word: treet.getWords()){
       System.out.println(word);
     }
     
     /* stores each treet and sorts. */
     Treet[] treets = {treet, secondTreet};
     Arrays.sort(treets);
     for (Treet exTreet : treets){
       System.out.println( exTreet );
     }
   }
  
}