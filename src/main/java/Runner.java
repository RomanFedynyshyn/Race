public class Runner {
    public static int raceDuration = 20;
    public static int carsNumber = 10;

    public static void main(String[] args) throws InterruptedException {


        RaceStart.raceStarter();
        Thread.sleep(20000);
        Judge.top3Finding();
       // Judge.matrixBuilder();
        Judge.outpoot();
        Judge.top3Finding();
    }
}
