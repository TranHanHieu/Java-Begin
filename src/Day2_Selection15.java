import java.util.Scanner;

/**
 * Created by Hieu It on 6/24/2016.
 */
public class Day2_Selection15 {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.println("Chương trình tính sự cân bằng giữa chiều cao và cân nặng của một người");
        System.out.println("Nhập Họ và tên : " );
        String Name = scanIn.nextLine();
        System.out.println("Nhập chiều cao (m): ");
        double Hight = scanIn.nextDouble();
        System.out.println("Nhập cân nặng (kg) : ");
        double Weight = scanIn.nextDouble();
        double BMI = (Weight)/(Hight*Hight);
        if (BMI < 18.5) {
            System.out.println(Name + ". Bạn là người thiếu cân, bạn đang quá gầy !");
        } else {
            if (BMI >= 18.5 && BMI < 25) {
                System.out.println(Name + ". Bạn có thân hình thật lí tưởng, thật tuyệt !");
            } else {
                if (BMI >= 25 && BMI <= 30) {
                    System.out.println(Name + ". Bạn đang thừa cân rồi !");
                } else {
                    if (BMI > 30) {
                        System.out.println(Name + ". Bạn đang bị béo phì, cần giảm cân !");
                    }
                }
            }
        }
    }
}