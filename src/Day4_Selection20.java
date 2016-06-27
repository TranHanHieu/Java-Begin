import java.util.Scanner;

/**
 * Created by Hieu It on 6/27/2016.
 */
public class Day4_Selection20 {
    public static void reverseArray(String[] A) {
        String[] B = new String[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[A.length - 1 - i];
        }
        System.out.println();
        System.out.println("Chuỗi đảo ngược của chuỗi A là : ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số phần tử chuỗi A : ");
        int c = input.nextInt();
        String[] A = new String[c];
        for (int i = 0; i < c; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " :");
            A[i] = input.next();
        }
        System.out.println("Chuỗi A là : ");
        for (int i = 0; i < c; i++) {
            System.out.print(A[i] + " ");
        }
        reverseArray(A);
    }
}
