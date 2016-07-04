import java.util.Scanner;

/**
 * Created by Hieu It on 7/4/2016.
 */
public class Day5_Selection6 {
    public static void main(String[] args) {
        char[] arr;
        int index = 0;
        double result = 0;
        //int a = 0, b = 0;
        Scanner input = new Scanner(System.in);
        String add = input.nextLine();
        arr = add.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '+' || arr[i] == '-' || arr[i] == 'x' || arr[i] == ':') {
                index = i;
            }
        }
        if (arr[index] != '+' && arr[index] != '-' && arr[index] != 'x' && arr[index] != ':') {
            System.out.println("Bạn nhập sai toán tử !");
        }
        String s1 = "";
        String s2 = "";
        //System.out.println(index);
        for (int i = 0; i < index; i++) {
            if (add.charAt(i)==' '){
                i++;
                if(i==index) {
                    break;
                }
            }
            s1 += add.charAt(i);
        }
        for (int i = index + 1; i < arr.length; i++) {
            if (add.charAt(i)==' '){
                i++;
                if(i==arr.length) {
                    break;
                }
            }
            s2 += add.charAt(i);
        }
        //System.out.println(s1);
        if (arr[index] == '+') {
            System.out.println("Kết quả");
            result = Double.valueOf(s1) + Double.valueOf(s2);
            System.out.println(result);
        } else {
            if (arr[index] == '-') {
                System.out.println("Kết quả :");
                result = Double.valueOf(s1) - Double.valueOf(s2);
                System.out.println(result);
            } else {
                if (arr[index] == 'x') {
                    System.out.println("Kết quả :");
                    result = Double.valueOf(s1) * Double.valueOf(s2);
                    System.out.println(result);
                } else {
                    if (arr[index] == ':') {
                        System.out.println("Kết quả :");
                        result = Double.valueOf(s1) / Double.valueOf(s2);
                        System.out.println(result);
                    }
                }
            }
        }
    }
}
