import java.util.Random;
public class Car {
    public int speed;

    Random random=new Random();
    int arr[]=new int[20];
    public String name_car;

    Car(){

      speed=random.nextInt(100);
      arr[0]=speed;
      name_car=random.toString();
    }

    public void setSpeed() {
        this.speed = random.nextInt(100);;
    }

    public int getSpeed() {
        return speed;
    }

    public int totalSpeed(){
        int result=0;
        for (int i = 0; i <arr.length ; i++) {
            result=result+arr[i];
        }
            return result;
    }
}
