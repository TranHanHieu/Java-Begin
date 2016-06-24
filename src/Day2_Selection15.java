import java.util.Scanner;

/**
 * Created by Hieu It on 6/24/2016.
 */
public class Day2_Selection15 {
    public static void Tinh_BMI(){
        Scanner scanIn = new Scanner(System.in);
        String name;
        double hight;
        double weight;
        System.out.println("Chương trình tính sự cân bằng giữa chiều cao và cân nặng của một người");
        System.out.println("Nhập Họ và tên : " );
        name = scanIn.nextLine();
        System.out.println("Nhập chiều cao (m): ");
        hight = scanIn.nextDouble();
        System.out.println("Nhập cân nặng (kg) : ");
        weight = scanIn.nextDouble();
        double BMI = (weight)/(hight*hight);
        if (BMI < 18.5)
            System.out.println( name + ". Bạn là người thiếu cân, bạn đang quá gầy !");
        if (BMI >=18.5 && BMI < 25)
            System.out.println(name + ". Bạn có thân hình thật lí tưởng, thật tuyệt !");
        if (BMI >= 25 && BMI <=30)
            System.out.println(name + ". Bạn đang thừa cân rồi !");
        if (BMI > 30)
            System.out.println(name + ". Bạn đang bị béo phì, cần giảm cân !");

    }
    public static void main(String[] args) {
        Tinh_BMI();
    }
}