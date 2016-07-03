import java.util.Scanner;

/**
 * Created by Hieu It on 7/3/2016.
 */
public class Day5_Selection4 {
    public static boolean isSorted(int[] array) {
        boolean a = false;
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int j = i + 1;
            if (array[i] < array[j]) {
                //j=i+1;
                count++;
            }
        }
        if (count == array.length - 1) {
            a = true;
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ rộng của mảng : ");
        int length = input.nextInt();
        int[] arr = new int[length];
        System.out.println("Nhập mảng : ");
        for (int i = 0; i < length; i++) {
            arr[i] = input.nextInt();
        }
        if (isSorted(arr)) {
            System.out.println("Mảng đã được sắp xếp !");
        } else {
            System.out.println("Mảng chưa được sắp xếp !");
        }

    }
}
