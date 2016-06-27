import java.util.Scanner;

/**
 * Created by Hieu It on 6/27/2016.
 */
public class Day4_Selection13 {
    public static void main(String[] args) {
        int max = 0, min = 0;
        int indexA = 0, indexB = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng : ");
        int number = input.nextInt();
        int[] A = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " : ");
            A[i] = input.nextInt();
        }
        System.out.print("Các phần tử trong mảng là : ");
        for (int i = 0; i < number; i++) {
            System.out.print(A[i] + " ");
            if (max < A[i]) {
                max = A[i];
                indexA = i;
            }
        }
        min = max;
        for (int i = 0; i < number; i++) {
            if (A[i] < min) {
                min = A[i];
                indexB = i;
            }
        }
        System.out.println();
        System.out.println("Phần tử lớn nhất của mảng là : " + max + "\t\t chỉ số :" + indexA);
        System.out.println("Phần tử nhỏ nhất của mảng là : " + min + "\t\t chỉ số :" + indexB);
    }
}
