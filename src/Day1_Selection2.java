/**
 * Created by Hieu It on 6/23/2016.
 */
public class Day1_Selection2 {
    public static void main(String[] args) {
        int population = 323049910;
        int times = 5 * 365 * 24 * 60 * 60;
        System.out.println("Số dân sau 5 năm là : " + (population + times / 8 - times / 13 + times / 27));
    }
}