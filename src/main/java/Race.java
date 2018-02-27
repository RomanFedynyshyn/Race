public class Race extends Thread {

    @Override
    public void run(){
       // System.out.println("new thread " +Thread.currentThread().getId()+" started");
        Car car =new Car();
        System.out.println("Speed "+car.getSpeed()+" in thread "+ Thread.currentThread().getName()+ " with name "+car.name_car);
        for (int i = 1; i < 20 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            car.setSpeed();
           car.arr[i]=car.getSpeed();
            System.out.println("new speed in thread  "+Thread.currentThread().getId()+" " + car.getSpeed());
            System.out.println("total speed of thread "+Thread.currentThread().getId()+" "+ car.totalSpeed() );
        }

    }
}
