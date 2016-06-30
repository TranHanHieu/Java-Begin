import java.util.Scanner;

/**
 * Created by Hieu It on 6/27/2016.
 */
public class Day4_Selection20 {
    public static String[] reverseArray(String[] arr) {
        String[] array = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[arr.length - 1 - i];
        }
        System.out.println();
        System.out.println("Chuỗi đảo ngược của chuỗi A là : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(array[i] + " ");
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số phần tử chuỗi A : ");
        int length = input.nextInt();
        String[] arr = new String[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " :");
            arr[i] = input.next();
        }
        System.out.println("Chuỗi A là : ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        reverseArray(arr);
    }
}
