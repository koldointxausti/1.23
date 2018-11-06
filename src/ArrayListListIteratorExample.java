/*Copy and paste this code into an Eclipse project and try to understand what each line of the code do. Comment all the lines.
PD: You can add System.out.println-s to the code to help to understand it.
************************************************************************************* */
import java.util.ArrayList; //import the classes we need
import java.util.ListIterator;
 
public class ArrayListListIteratorExample {
  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<String>();	//Create an ArrayList
    arrayList.add("element_1");	//add elements to the ArrayList
    arrayList.add("element_2");
    arrayList.add("element_3");
    arrayList.add("element_4");
    arrayList.add("element_5");
    //create an object of ListInterator class that will use the list of arrays "arrayList"
    ListIterator it = arrayList.listIterator();
    while(it.hasNext())//a loop that will show the next token as long as there's is
         System.out.println(it.next());
    while(it.hasPrevious())//while there's a token before show it
         System.out.println(it.previous());
    //here the index of the previous token is shown
    System.out.println("Previous Index is : " + it.previousIndex()); 
    //here the index of the next token is shown
    System.out.println("Next Index is : " + it.nextIndex());
    //here the program shows the next token
    System.out.println("Next element is : " + it.next());
    //and then it shows the previous and the next index of this element
    System.out.println("Previous Index is : " + it.previousIndex());   
    System.out.println("Next Index is : " + it.nextIndex());
    it.add("element_6");//another element is added to the ArrayList
    //and here's a loop that will show all the elements on the ArrayList one by one until there are no more
    for(int i = 0; i < arrayList.size(); i++)
          System.out.println(arrayList.get(i));
    //print the next element
    System.out.println("Next element is : " + it.next());
    //remove last token
    it.remove();
    //the elements in the array will be shown
    for(int i = 0; i < arrayList.size(); i++)
            System.out.println(arrayList.get(i));
    //tell which is the next element
    System.out.println("Next element is : " + it.next());
    //change the token there to another one:
    it.set("element_7");
    //print the list again
    for(int i = 0; i < arrayList.size(); i++)
           System.out.println(arrayList.get(i)); 

  }
}