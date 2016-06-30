import java.util.Scanner;

/**
 * Created by Hieu It on 6/24/2016.
 */
public class Day2_Selection18 {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.println("Nhập năm :");
        int year = scanIn.nextInt();
        boolean a = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        System.out.println(a);
    }
}
