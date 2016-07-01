import java.util.Scanner;

public class Day4_Selection19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.println("Nhập 2 số cần hoán vị: ");
        x = input.nextInt();
        y = input.nextInt();

        Swap(x, y);
    }

    public static void Swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("2 số vừa được hoán vị là: " + x + "  " + y);
    }
}