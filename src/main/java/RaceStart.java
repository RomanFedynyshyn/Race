public class RaceStart extends Thread {

    @Override
    public void run() {
        Car car = new Car();
        System.out.println(Thread.currentThread().getId());
        for (int i = 1; i < Runner.raceDuration; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            car.setSpeed();
            car.arr[i] = car.getSpeed();
            System.out.println(car.getSpeed());
        }
        Judge.LeaderTable.put(Thread.currentThread().getName(), car);
    }


    public static void raceStarter() {

        for (int i = 0; i < Runner.carsNumber; i++) {
            new RaceStart().start();

        }
    }


}
