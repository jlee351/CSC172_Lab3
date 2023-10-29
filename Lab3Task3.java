/*-
* AUTHOR: LEE, JOON HYUP
* Lab3Task3 implements a method that iterates through an array / a list.
*/

import java.util.ArrayList;
import java.util.Iterator;

public class Lab3Task3{
  //main method
  public static void main(String[] args) {
    //make new list and tests methods.
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(5);
    list.add(7);
    list.add(2);
    printArrayListBasicLoop(list);
    printArrayListEnhancedLoop(list);
    printArrayListForLoopListIterator(list);
    printArrayListWhileLoopListIterator(list);
  }

  /*-
 * printArrayListBasicLoop takes in a list as a parameter.
 * It iterates through the list using a basic for loop.
 */
  public static void printArrayListBasicLoop(ArrayList<Integer> al){
    for (int i = 0; i < al.size(); i++){
      System.out.println(al.get(i));
    }
  }

  /*-
 * printArrayListEnhancedLoop takes in a list as a parameter.
 * It iterates through the list using an enhanced for loop.
 */
  public static void printArrayListEnhancedLoop(ArrayList<Integer> al){
    for (Integer i : al) {
      System.out.println(i);
    }
  }

  /*-
 * printArrayListForLoopListIterator takes in a list as a parameter.
 * It iterates through the list using a basic for loop with an iterator.
 */
  public static void printArrayListForLoopListIterator(ArrayList<Integer> al){
    for (Iterator<Integer> i = al.iterator(); i.hasNext(); ){
      System.out.println(i.next());
    }
  }

  /*-
 * printArrayListWhileLoopListIterator takes in a list as a parameter.
 * It iterates through the list using a basic while loop with iterator.
 */
  public static void printArrayListWhileLoopListIterator(ArrayList<Integer> al){
    Iterator<Integer> i = al.iterator();
    while(i.hasNext()){
      System.out.println(i.next());
    }
  }
}
