import java.util.Objects;
import java.util.Scanner;

/**
 * Created by Hieu It on 6/26/2016.
 */
public class Day3_Selection5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số hạng 1 : ");
        double a = input.nextDouble();
        System.out.println("Nhập số hạng 2 : ");
        double b = input.nextDouble();
        System.out.println("Nhập phép tính : ");
        String c = input.next();
        double resulf = 0;
        if (Objects.equals(c, "+")) {
            resulf = a + b;
            System.out.println("Kết quả : " + resulf);
        } else {
            if (Objects.equals(c, "-")) {
                resulf = a - b;
                System.out.println("Kết quả : " + resulf);
            } else {
                if (Objects.equals(c, "*")) {
                    resulf = a * b;
                    System.out.println("Kết quả : " + resulf);
                } else {
                    System.out.println("Bạn đã nhập sai toán tử !");
                }
            }
        }
    }
}
