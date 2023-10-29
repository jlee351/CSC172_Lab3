/*-
* AUTHOR: LEE, JOON HYUP
* Lab3Task1 implements a method that produces a formatted array/list.
*/

import java.util.ArrayList;

public class Lab3Task1{
  //main method
  public static void main(String[] args) {
    //2d array and print2Darray
    int[][] a = {{10, 15, 30, 40},{15, 5, 8, 2}, {20, 2, 4, 2},{1, 4, 5, 0}};
    print2Darray(a);

    //2d ArrayList and print2DList
    ArrayList<ArrayList<Integer>> b = new ArrayList<>();
    ArrayList<Integer> b1 = new ArrayList<Integer>();
    ArrayList<Integer> b2 = new ArrayList<Integer>();
    ArrayList<Integer> b3 = new ArrayList<Integer>();
    ArrayList<Integer> b4 = new ArrayList<Integer>();
    b1.add(10);
    b1.add(15);
    b1.add(30);
    b1.add(40);
    b2.add(15);
    b2.add(5);
    b2.add(8);
    b2.add(2);
    b3.add(20);
    b3.add(2);
    b3.add(4);
    b3.add(2);
    b4.add(1);
    b4.add(4);
    b4.add(5);
    b4.add(0);
    b.add(b1);
    b.add(b2);
    b.add(b3);
    b.add(b4);
    print2DList(b);
  }

  /*-
 * print2Darray takes in a 2-dimensional Int array as a parameter.
 * It prints a formatted 4x4 two dimensional integer array using a nested for loop.
 */
  public static void print2Darray(int[][] array){
    for (int i = 0; i < 4; i++){
      System.out.print("  ");
      for(int j = 0; j < 4; j++){
        System.out.printf("%2d%2s", array[i][j], "");
      }
      System.out.println();
    }
  }

  /*-
 * print2DList takes in a 2-dimensional list as a parameter.
 * It prints a formatted 4x4 two dimensional integer list using a nested for loop.
 */
  public static void print2DList(ArrayList<ArrayList<Integer>> list){
    for (int i = 0; i < 4; i++){
      System.out.print("  ");
      for(int j = 0; j < 4; j++){
        System.out.printf("%2d%2s", list.get(i).get(j), "");
      }
      System.out.println();
    }
  }
}
