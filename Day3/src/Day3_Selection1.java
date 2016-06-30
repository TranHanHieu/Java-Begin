import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Hieu It on 6/26/2016.
 */
public class Day3_Selection1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào năm : ");
        int year = input.nextInt();
        System.out.println("Nhập vào tháng : ");
        int month = input.nextInt();
        switch (month) {
            case 1:
                System.out.println("Tháng " + month + " năm " + year + " có 31 ngày");
                break;
            case 2:
                boolean a = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
                if (a) {
                    System.out.println("Tháng " + month + " năm " + year + " có 29 ngày");
                    break;
                } else {
                    System.out.println("Tháng " + month + " năm " + year + "có 28 ngày");
                    break;
                }
            case 3:
                System.out.println("Tháng " + month + " năm " + year + " có 31 ngày");
                break;
            case 4:
                System.out.println("Tháng " + month + " năm " + year + " có 30 ngày");
                break;
            case 5:
                System.out.println("Tháng " + month + " năm " + year + " có 31 ngày");
                break;
            case 6:
                System.out.println("Tháng " + month + " năm " + year + " có 30 ngày");
                break;
            case 7:
                System.out.println("Tháng " + month + " năm " + year + " có 31 ngày");
                break;
            case 8:
                System.out.println("Tháng " + month + " năm " + year + " có 31 ngày");
                break;
            case 9:
                System.out.println("Tháng " + month + " năm " + year + " có 30 ngày");
                break;
            case 10:
                System.out.println("Tháng " + month + " năm " + year + " có 31 ngày");
                break;
            case 11:
                System.out.println("Tháng " + month + " năm " + year + " có 30 ngày");
                break;
            case 12:
                System.out.println("Tháng " + month + " năm " + year + " có 31 ngày");
                break;
        }

    }
}
