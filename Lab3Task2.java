/*-
* AUTHOR: LEE, JOON HYUP
* Lab3Task2 implements a method that produces running sum
*/

import java.util.ArrayList;

public class Lab3Task2{
  //main method
  public static void main(String[] args) {
    //2d array and runningSum2DArray
    int[][] a = {{10, 15, 30, 40},{15, 5, 8, 2}, {20, 2, 4, 2},{1, 4, 5, 0}};
    runningSum2DArray(a,1);

    //2d ArrayList and runningSum2DArrayList
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
    runningSum2DArrayList(b,1);
  }

  /*-
 * runningSum2DArray takes in a 2-dimensional Int array and an integer as parameters.
 * It prints a formatted modified array after producing the running sums according to the direction.
 * Uses different nested for loops according to direction and thus its parameters.
 */
  public static void runningSum2DArray(int[][] array, int dir){
    if(dir == 1){
      for(int i = 0; i < 4; i++){
        for(int j = 2; j > -1; j--){
          array[i][j] += array[i][j+1];
        }
      }
    }
    else if(dir == 2){
      for(int i = 0; i < 4; i++){
        for(int j = 0; j < 3; j++){
          array[i][j+1] += array[i][j];
        }
      }
    }
    else if(dir ==3){
      for(int i = 2; i > -1; i--){
        for(int j = 0; j < 4; j++){
          array[i][j] += array[i+1][j];
        }
      }
    }
    else{
      for(int i = 0; i < 3; i++){
        for(int j = 0; j < 4; j++){
          array[i+1][j] += array[i][j];
        }
      }
    }

    //prints out the array
    for (int i = 0; i < 4; i++){
      for(int j = 0; j < 4; j++){
        System.out.printf("%2d%2s", array[i][j], "");
      }
      System.out.println();
    }
  }

  /*-
 * runningSum2DArrayList takes in a 2-dimensional list and an integer as parameters.
 * It prints a formatted modified list after producing the running sums according to the direction.
 * Uses different nested for loops according to direction and thus its parameters.
 */
  public static void runningSum2DArrayList(ArrayList<ArrayList<Integer>> list, int dir){
    if(dir ==1){
      for(int i = 0; i < 4; i++){
        for(int j = 2; j > -1; j--){
          list.get(i).set(j,list.get(i).get(j) + list.get(i).get(j+1));
        }
      }
    }
    else if(dir == 2){
      for(int i = 0; i < 4; i++){
        for(int j = 0; j < 3; j++){
          list.get(i).set(j+1,list.get(i).get(j+1) + list.get(i).get(j));
        }
      }
    }
    else if(dir ==3){
      for(int i = 2; i > -1; i--){
        for(int j = 0; j < 4; j++){
          list.get(i).set(j,list.get(i+1).get(j) + list.get(i).get(j));
        }
      }
    }
    else{
      for(int i = 0; i < 3; i++){
        for(int j = 0; j < 4; j++){
          list.get(i+1).set(j,list.get(i).get(j) + list.get(i+1).get(j));
        }
      }
    }

    //prints out the list
    for (int i = 0; i < 4; i++){
      for(int j = 0; j < 4; j++){
        System.out.printf("%2d%2s", list.get(i).get(j), "");
      }
      System.out.println();
    }
  }

}
