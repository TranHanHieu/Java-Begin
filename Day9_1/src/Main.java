/**
 * Created by Hieu It on 7/18/2016.
 */
public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int a = 0;
        for (int i = 0; i < 1000000000; i++) {
            a++;
        }
        System.out.println("Thời gian chạy là : " + stopWatch.stop() + " milisecond");
    }
}
