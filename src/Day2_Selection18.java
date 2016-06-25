import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Hieu It on 6/24/2016.
 */
public class Day2_Selection18 {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.println("Nhập năm :");
        int nam = scanIn.nextInt();
        boolean a = (nam % 4 == 0 && nam % 100 != 0 || nam % 400 == 0);
        System.out.println(a);
    }
}
