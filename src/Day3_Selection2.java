import java.util.Scanner;

/**
 * Created by Hieu It on 6/26/2016.
 */
public class Day3_Selection2 {
    public static void main(String[] args) {
        System.out.println("Chương trình giải phương trình bậc 2.");
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập a = ");
        double a = input.nextDouble();
        System.out.println("Nhập b = ");
        double b = input.nextDouble();
        System.out.println("Nhập c = ");
        double c = input.nextDouble();
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Phương trình vô số nghiệm !");
        } else {
            if (b != 0 && c != 0) {
                System.out.println("Phương trình có 1 nghiệm là x = " + -c / b);
            } else {
                if (c != 0) {
                    System.out.println("Phương trình vô nghiệm !");
                }
            }
        }
        if (a != 0) {
            double deta = b * b - 4 * a * c;
            if (deta < 0) {
                System.out.println("Phương trình vô nghiệm !");
            } else {
                if (deta == 0) {
                    System.out.println("Phương trình có nghiệm kép x = " + (-b / 2 * a));
                } else {
                    System.out.println("Phương trình có 2 nghiệm phân biện x1 = " + ((-b + Math.sqrt(deta)) / 2 * a) + "và x2 = " + ((-b - Math.sqrt(deta)) / 2 * a));
                }
            }
        }
    }
}
