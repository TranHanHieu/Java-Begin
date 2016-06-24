import java.util.Scanner;

/**
 * Created by Hieu It on 6/24/2016.
 */
public class Day2_Selection20 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b;
        System.out.println("Nhập số (1->11): ");
        b = a.nextInt();
        while (b<1||b>11){
            System.out.println("Nhập lại số (1->11): ");
            b = a.nextInt();
        }
        switch (b) {
            case 1:
                System.out.println("Tháng 1.");
                break;
            case 2:
                System.out.println("Tháng 2.");
                break;
            case 3:
                System.out.println("Tháng 3.");
                break;
            case 4:
                System.out.println("Tháng 4.");
                break;
            case 5:
                System.out.println("Tháng 5.");
                break;
            case 6:
                System.out.println("Tháng 6.");
                break;
            case 7:
                System.out.println("Tháng 7.");
                break;
            case 8:
                System.out.println("Tháng 8.");
                break;
            case 9:
                System.out.println("Tháng 9.");
                break;
            case 10:
                System.out.println("Tháng 10.");
                break;
            case 11:
                System.out.println("Tháng 11.");
                break;
            case 12:
                System.out.println("Tháng 12.");
                break;
        }
    }
}
