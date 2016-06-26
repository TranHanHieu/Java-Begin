import java.util.Scanner;

/**
 * Created by Hieu It on 6/26/2016.
 */
public class Day4_Selection5 {
    public static void main(String[] args) {
        System.out.println("Nhập 1 số nguyên bất kỳ : ");
        int count = 0;
        int resulf = 0;
        double average = 0;
        while (true) {
            Scanner input = new Scanner(System.in);
            int[] b = new int[10000];
            count++;
            for (int i = 0; i < count; i++) {
                int a = input.nextInt();
                b[i] = a;
                resulf = b[i] + resulf;
                average = (double) resulf / (count + 1);
                if (a == 0) {
                    System.out.println("Tồng các số nguyên vừa nhập là : " + resulf);
                    System.out.println("Trung bình cộng các số nguyên vừa nhập là : " + average);
                    break;
                }
            }
        }
    }
}
