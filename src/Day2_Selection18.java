import java.util.Scanner;

/**
 * Created by Hieu It on 6/24/2016.
 */
public class Day2_Selection18 {
    public static void main(String[] args) {
        Scanner scanIn= new Scanner(System.in);
        int nam;
        System.out.println("Nhập năm : ");
        nam = scanIn.nextInt();
        while (nam % 4 ==0 && nam % 100 != 0 || nam % 400 == 0) {
            System.out.println("True !");
            break;
        }
        System.out.println("False !");
    }
}
