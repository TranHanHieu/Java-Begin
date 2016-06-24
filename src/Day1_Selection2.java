/**
 * Created by Hieu It on 6/23/2016.
 */
public class Day1_Selection2 {
    public static void main(String[] args) {
        int Population = 323049910;
        int Times = 5 * 365 * 24 * 60 * 60;
        System.out.println("Số dân sau 5 năm là : " + (Population + Times/8 - Times/13 + Times/27));
    }
}