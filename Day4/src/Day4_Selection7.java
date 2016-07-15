import java.util.Scanner;

/**
 * Created by Hieu It on 6/26/2016.
 */
public class Day4_Selection7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mời bạn nhập chuỗi : ");
        String str = input.nextLine();
        String s1 = " ";
        String s2 = " ";
        for (int i = 0; i < str.length() / 2; i++) {
            s1 = s1 + str.charAt(i);
        }
        for (int i = str.length() - 1; i >= str.length() / 2; i--) {
            s2 = s2 + str.charAt(i);
        }
        System.out.println(s1);
        System.out.println(s2);
        if (s1.endsWith(s2)) {
            System.out.println("Chuỗi đối xứng !");
        } else {
            System.out.println("Chuỗi không đối xứng !");
        }
    }
}
