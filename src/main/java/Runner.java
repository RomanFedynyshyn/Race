public class Runner {
    public static int raceDuration = 20;
    public static int carsNumber = 10;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("3\n" + "2\n" + "1\n" + "go   Their running waiting for results");

        RaceStart.raceStarter();
        Thread.sleep(20000);
        Judge.outpoot();
    }
}
