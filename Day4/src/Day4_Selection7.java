import java.util.Scanner;

/**
 * Created by Hieu It on 6/26/2016.
 */
public class Day4_Selection7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mời bạn nhập chuỗi : ");
        String str = input.nextLine();
        char[] ch = str.toCharArray();
        boolean b = false;
        for (int i = 0; i < str.length(); i++) {
            for (int j = str.length() - 1; j >= 0; j--) {
                b = (ch[i] == ch[j]);
            }
        }
        if (b) {
            System.out.println(b);
        } else {
            System.out.println("Xâu không đối xứng !");
        }
    }
}
