import java.util.concurrent.locks.Lock;

public class Race extends Thread {

    @Override
    public void run() {
        Car car = new Car();
        for (int i = 1; i < 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            car.setSpeed();
            car.arr[i] = car.getSpeed();
            System.out.println("total speed of thread " + Thread.currentThread().getId() + " " + car.totalSpeed());

        }
         Finding_TOP.myList.add(car);
    }





}
