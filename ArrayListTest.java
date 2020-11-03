package mattiAllgemein;

import java.util.ArrayList;


public class ArrayListTest {
    
    /*
     *  test and practice class for use of ArrayList
     */

    public ArrayList<String> arrayListMethod() {
       String subject1 = "maths";
       String subject2 = "geography";
       String subject3 = "history";
        
       ArrayList<String> myList = new ArrayList<String>();
       myList.add(0, subject1);
       myList.add(1, subject2);
       myList.add(2, subject3);
      
       // print out of ArrayList:
       System.out.println("My favorite subjects: ");
       for  (int  i=0;  i<myList.size(); i++) {
           System.out.println(myList.get(i));
       }
       // change element of ArrayList: 
       subject1 = "sports"; 
       myList.set(0, subject1);
       myList.remove(1);
       
       // print out of ArrayList:
       System.out.println("My favorite subjects revised: ");
       for  (int  i=0;  i<myList.size(); i++) {
           System.out.println(myList.get(i));
       }
       return myList;
    }
}
