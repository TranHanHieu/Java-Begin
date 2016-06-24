import java.util.Scanner;

/**
 * Created by Hieu It on 6/24/2016.
 */
public class Day2_Selection11 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        double F;
        double C;
        System.out.println("Chương trình đổi độ F sang độ C.");
        System.out.println("Nhập độ (F) cần đổi : ");
        F = Input.nextDouble();
        C = (F - 32)/1.8;
        System.out.println("Đổi " + F + " (F) = " + C + " (C) ");


    }
}