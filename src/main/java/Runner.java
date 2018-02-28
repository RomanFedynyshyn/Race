import javafx.collections.transformation.SortedList;

import java.util.*;

public class Runner {
    //public static  List<Car> myList = new LinkedList<Car>();

    public static void main(String[] args) throws InterruptedException {


        for (int i = 0; i < 10; i++) {
            new Race().start();

        }
        Thread.sleep(20000);
        Finding_TOP.matrixBuilder();
      //  System.out.println("my list have an sdlijihdshoigoih      " + myList.size());
        //System.out.println(myList.values());
      //  System.out.println(myList.get(1));



       /* for (int i = 0; i <10 ; i++) {
            Car car=myList.get(i);
            System.out.println(car.totalSpeed());
            System.out.println(car.arr[7]);*/

        }




    }





