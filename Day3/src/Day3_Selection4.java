import java.util.Scanner;

/**
 * Created by Hieu It on 6/26/2016.
 */
public class Day3_Selection4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi 1 : ");
        String a = input.nextLine();
        System.out.println("Nhập vào chuỗi 2 : ");
        String b = input.nextLine();
        if (b.compareTo(a) <= 0) {
            System.out.println("Chuỗi 2 là substring của chuỗi 1 ");
        } else {
            System.out.println("Chuỗi 2 không là substring của chuỗi 1 ");
        }
    }
}
