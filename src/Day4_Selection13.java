import java.util.Scanner;

/**
 * Created by Hieu It on 6/27/2016.
 */
public class Day4_Selection13 {
    public static void main(String[] args) {
        int indexMax = 0, indexMin = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng : ");
        int number = input.nextInt();
        int[] A = new int[number];
        int max = A[0], min = A[0];
        for (int i = 0; i < number; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1) + " : ");
            A[i] = input.nextInt();
        }
        System.out.print("Các phần tử trong mảng là : ");
        for (int i = 0; i < number; i++) {
            System.out.print(A[i] + " ");
            if (max < A[i]) {
                max = A[i];
                indexMax = i;
            }
        }
        for (int i = 0; i < number; i++) {
            if (A[i] < min) {
                min = A[i];
                indexMin = i;
            }
        }
        System.out.println();
        System.out.println("Phần tử lớn nhất của mảng là : " + max + "\t\t Chỉ số :" + indexMax);
        System.out.println("Phần tử nhỏ nhất của mảng là : " + min + "\t\t Chỉ số :" + indexMin);
    }
}
