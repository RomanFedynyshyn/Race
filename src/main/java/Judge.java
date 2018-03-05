import java.util.HashMap;
import java.util.Map;

public class Judge {
    public static Map<String, Car> LeaderTable = new HashMap();

    public static void some() {

        System.out.println("Just trying to run this" + LeaderTable.entrySet());

        int max = 0;
        int num = 0;
        for (int i = 0; i < Runner.carsNumber; i++) {
            System.out.println(i + " car speed " + LeaderTable.get("Thread-" + i).totalSpeed());
            if (max < LeaderTable.get("Thread-" + i).totalSpeed()) {
                max = LeaderTable.get("Thread-" + i).totalSpeed();
                num = i;
            }
        }
        System.out.println("Yeah fastest car is in Thread " + num + "with speed " + LeaderTable.get("Thread-" + num).totalSpeed());

    }


}
