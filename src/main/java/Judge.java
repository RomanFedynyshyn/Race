import java.util.HashMap;
import java.util.Map;
//https://stackoverflow.com/questions/7427758/how-to-use-sortedmap-interface-in-java




public class Judge {
    public static Map<String, Car> LeaderTable = new HashMap();
    static int[][] matrix = new int[Runner.carsNumber][Runner.raceDuration];

    public static void top3Finding() {

        int firstPlase = 0;
        int firsCar = 0;
        int secondPlace = 0;
        int secondCar = 0;
        int thirdPlase = 0;
        int thirdCar = 0;

        for (int i = 0; i < Runner.carsNumber; i++) {
            //  System.out.println(i + " car speed " + LeaderTable.get("Thread-" + i).totalSpeed());
            if (LeaderTable.get("Thread-" + i).totalSpeed() > firstPlase) {
                thirdPlase = secondPlace;
                thirdCar = secondCar;
                secondPlace = firstPlase;
                secondCar = firsCar;
                firstPlase = LeaderTable.get("Thread-" + i).totalSpeed();
                firsCar = i;

            } else if (LeaderTable.get("Thread-" + i).totalSpeed() > secondPlace) {
                thirdPlase = secondPlace;
                thirdCar = secondCar;
                secondPlace = LeaderTable.get("Thread-" + i).totalSpeed();
                secondCar = i;
            } else if (LeaderTable.get("Thread-" + i).totalSpeed() > thirdPlase) {
                thirdPlase = LeaderTable.get("Thread-" + i).totalSpeed();
                thirdCar = i;
            }
        }
        System.out.println("first car is " + "thread " + firsCar + " with speed " + firstPlase);
        System.out.println("second car is " + "thread " + secondCar + " with speed " + secondPlace);
        System.out.println("first car is " + "thread " + thirdCar + " with speed " + thirdPlase);


    }


    public static void matrixBuilder() {

        for (int i = 0; i < Runner.carsNumber; i++) {
            Car car = LeaderTable.get("Thread-" + i);
            //  System.out.println("\n");
            int sum = 0;
            for (int j = 0; j < Runner.raceDuration; j++) {
                matrix[i][j] = car.arr[j];
                sum = sum + matrix[i][j];
                //   System.out.print(matrix[i][j] + " ");
            }
        }

    }

    public static void outpoot() {
        int[] arr = new int[Runner.carsNumber];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        matrixBuilder();

        // finding top 3 on each second
        for (int i = 0; i < Runner.raceDuration; i++) {


            for (int j = 0; j < Runner.carsNumber; j++) {
                arr[j] = arr[j] + matrix[j][i];
            }
            //finding top of cars
            int firstPlace = 0;
            int firstCar = 0;
            int secondPlace = 0;
            int secondCar = 0;
            int thirdPlace = 0;
            int thirdCar = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > firstPlace) {
                    thirdPlace = secondPlace;
                    secondPlace = firstPlace;
                    firstPlace = arr[j];
                    firstCar = j;
                } else if (arr[j] > secondPlace) {
                    thirdPlace = secondPlace;
                    secondPlace = arr[j];
                    secondCar = j;
                } else if (arr[j] > thirdPlace) {
                    thirdPlace = arr[j];
                    thirdCar = j;
                }
            }
            System.out.println("first place on " + i + " second is car with speed " + firstPlace + "in thread" + firstCar +"\n");
            System.out.println("second place on " + i + " second is car with speed " + secondPlace + "in thread" + secondCar+"\n");
            System.out.println("third  place on " + i + " second is car with speed " + thirdPlace + "in thread" + thirdCar+"\n");
        }


    }


}