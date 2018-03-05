import java.util.Random;

public class Car {
    Random random = new Random();

    public int speed;

    public int arr[] = new int[Runner.raceDuration];

    Car() {

        speed = random.nextInt(100);
        arr[0] = speed;
    }

    public void setSpeed() {
        this.speed = random.nextInt(100);

    }

    public int getSpeed() {
        return speed;
    }

    public int totalSpeed() {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result + arr[i];
        }
        return result;
    }
}
