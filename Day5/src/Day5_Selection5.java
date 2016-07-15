import java.util.Scanner;

/**
 * Created by Hieu It on 7/4/2016.
 */
public class Day5_Selection5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10000];
        int count1 = 1, count = 0, temp = 0, sum = 0;
        System.out.println("Nhập các số nguyên (từ khoảng 0->100): ");
        for (int i = 0; i < 10000; i++) {
            arr[i] = input.nextInt();
            count++;
            if (arr[i] == 0) {
                System.out.println("Kết thúc !");
                for (int k = 0; k < count; k++) {
                    count1 = 1;
                    for (int j = k + 1; j < count; j++) {
                        if (arr[k] == arr[j] && arr[k] != temp) {
                            count1++;
                        }
                        if (arr[k] == temp) {
                            k++;
                        }
                    }
                    temp = arr[k];
                    sum = sum + count1;
                    System.out.println("Số " + temp + " xuất hiện " + count1 + " lần");
                    if (sum == count - 1) {
                        break;
                    }
                }
            }
        }
    }

}
