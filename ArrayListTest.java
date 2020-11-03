package mattiAllgemein;

import java.util.ArrayList;
import java.util.ListIterator;


public class ArrayListTest {
    
    /*
     *  class for practicing with ArrayList
     */

    private String subject1;
    private String subject2;
    private String subject3;
    
   public ArrayListTest(String subject1, String subject2, String subject3) {
       this.subject1 = subject1;
       this.subject2 = subject2;
       this.subject3 = subject3;
   };
    
   public void arrayListMethod() {
       
        
       ArrayList<String> myList = new ArrayList<String>();
       myList.add(0, subject1);
       myList.add(1, subject2);
       myList.add(2, subject3);
      
      /* alternative print out :
       * System.out.println("My favorite subjects: ");
       for  (int i=0;  i<myList.size(); i++) {
           System.out.println(myList.get(i));
       }
       */
       
      
       // print out of ArrayList with ListIterator:
       System.out.println("My favorite subjects: ");
       ListIterator<String> li1 = myList.listIterator();
       while (li1.hasNext()) {
       System.out.println(li1.next());
       }
       
       // change element of ArrayList: 
       subject1 = "sports"; 
       myList.set(0, subject1);
       
       myList.remove(1);
       
       // print out of ArrayList with ListIterator:
       System.out.println("My favorite subjects revised: ");
       ListIterator<String> li2 = myList.listIterator();
       while (li2.hasNext()) {
       System.out.println(li2.next());
       }
       
    }
}
