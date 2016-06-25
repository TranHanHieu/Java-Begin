import java.util.Scanner;

/**
 * Created by Hieu It on 6/26/2016.
 */
public class Day3_Selection3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào năm : ");
        int year = input.nextInt();
        System.out.println("Nhập vào tháng : ");
        int month = input.nextInt();
        while (month < 1 || month > 31) {
            System.out.println("Nhập lại tháng : ");
            month = input.nextInt();
        }
        int day = 0;
        if (month == 2) {
            boolean a = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
            if (a) {
                System.out.println("Nhập vào ngày của tháng " + month + " :");
                day = input.nextInt();
                while (day < 1 || day > 29) {
                    System.out.println("Nhập lại ngày của tháng " + month + " :");
                    day = input.nextInt();
                }
            } else {
                System.out.println("Nhập vào ngày của tháng " + month + " :");
                day = input.nextInt();
                while (day < 1 || day > 28) {
                    System.out.println("Nhập lại ngày của tháng " + month + "( năm " + year + " không là năm nhuận)" + month + " :");
                    day = input.nextInt();
                }
            }
        } else {
            System.out.println("Nhập vào ngày của tháng " + month + " :");
            day = input.nextInt();
            while (day < 1 || day > 31) {
                System.out.println("Nhập lại ngày của tháng " + month + " :");
                day = input.nextInt();
            }
        }
        int h;
        if (month == 1 || month == 2) {
            int j = (year - 1) / 100;
            int q = day;
            int m = month + 12;
            int k = (year - 1) % 100;
            h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        } else {
            int j = year / 100;
            int k = year % 100;
            int q = day;
            int m = month;
            h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        }
        switch (h) {
            case 0:
                System.out.println("Ngày của tuần là Thứ 7");
                break;
            case 1:
                System.out.println("Ngày của tuần là thứ CN");
                break;
            case 2:
                System.out.println("Ngày của tuần là Thứ 2");
                break;
            case 3:
                System.out.println("Ngày của tuần là Thứ 3");
                break;
            case 4:
                System.out.println("Ngày của tuần là Thứ 4");
                break;
            case 5:
                System.out.println("Ngày của tuần là Thứ 5");
                break;
            case 6:
                System.out.println("Ngày của tuần là Thứ 6");
                break;

        }
    }
}
