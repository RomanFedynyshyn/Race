import java.util.LinkedList;
import java.util.List;

public class Finding_TOP {
    public static List<Car> myList = new LinkedList<Car>();

    public static void TOP3() {
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;

        for (int i = 0; i < 10; i++)

        {
            Car car = myList.get(i);
            for (int j = 0; j < car.arr.length; j++) {
                if (car.arr[j]>max1 ) {
                    max3=max2;
                    max2=max1;
                    max1 = car.arr[j];
                }
                else if (car.arr[j] > max2)
                {
                    max3=max2;
                    max2=car.arr[j];
                }
                else if (car.arr[j] > max3)
                {
                    max3=car.arr[j];
                }


            }

            System.out.println("top 3 speeds "+max1+" "+max2+" "+max3);
        }
    }

    public static void matrixBuilder(){
        int [][] matrix=new int [10][20];
        for (int i = 0; i <10 ; i++) {
            Car car=myList.get(i);
            System.out.println("\n");
            int sum=0;
            for (int j = 0; j <20 ; j++) {
                matrix[i][j]=car.arr[j];
                sum =sum+matrix[i][j];
                System.out.print(matrix[i][j]+" ");
            }
            System.out.print("and sum of this shgit ==  " + sum);


        }


    }
}
