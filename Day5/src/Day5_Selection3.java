import java.util.Scanner;

/**
 * Created by Hieu It on 7/3/2016.
 */
public class Day5_Selection3 {

    public static int getPrefix(long number, int n) {//Trả về n chữ số đầu tiên của mã (ví dụ number = 456, n  = 2 thì trả về 45)
        int length = getSize(number);
        int[] arr = new int[length];
        String[] array = new String[length];
        for (int i = 0; i < length; i++) {
            arr[i] = (int) (number % 10);
            number = (number / 10);
        }
        for (int i = 0; i < length; i++) {
            array[i] = String.valueOf(arr[length - 1 - i]);
        }
        String str = "";
        for (int j = 0; j < n; j++) {
            str = str + array[j];
        }
        return Integer.valueOf(str);
    }

    public static boolean isRightPrefix(long number) {//Trả về true nếu mã bắt đầu bằng 4, 5, 6 hoặc 37
        return (getPrefix(number, 1) == 4 || getPrefix(number, 1) == 5 || getPrefix(number, 1) == 6 || getPrefix(number, 2) == 37);
    }

    public static int getSize(long number) {//Trả về số chữ số của một số nguyên number
        String snumber = String.valueOf(number);
        return snumber.length();
    }

    public static int sumOfOddPlace(long number) {//Lấy kết quả của bước 3 (tổng các chữ số ở vị trí lẻ)
        int length = getSize(number);
        int sum = 0;
        int[] arr = new int[length];
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = (int) (number % 10);
            number = (number / 10);
        }
        for (int i = 0; i < length; i++) {
            array[i] = arr[length - 1 - i];
        }
        for (int j = length - 1; j >= 0; j -= 2) {
            sum = sum + array[j];
        }
        return sum;
    }

    public static int sumOfDoubleEvenPlace(long number) {//Lấy kết quả của bước 2 (tổng các chữ số ở vị trí chẵn x2)
        int length = getSize(number);
        int integrals = 0;//tính tích
        int sum = 0;
        int[] arr = new int[length];
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = (int) (number % 10);
            number = (number / 10);
        }
        for (int i = 0; i < length; i++) {
            array[i] = arr[length - 1 - i];
        }
        for (int j = length - 2; j >= 0; j -= 2) {
            integrals = 2 * array[j];
            integrals = getDigit(integrals);
            sum += integrals;
        }
        return sum;
    }

    public static int getDigit(int number) {//Trả về number nếu number là số có 1 chữ số. Nếu number là số có 2 chữ số thì trả về tổng 2 chữ số của number
        if (number <= 9 && number >= 0) {
            return number;
        } else {
            return number % 10 + number / 10;
        }
    }

    public static boolean isValid(long number) {//Trả về true nếu mã number là mã thẻ đúng
        int resulf = 0;
        resulf = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        boolean b = resulf % 10 == 0;
        if (b&&(getPrefix(number,1)==4||getPrefix(number,1)==5||getPrefix(number,1)==6||getPrefix(number,2)==37)) {
            System.out.println("Mã thẻ " + number + " hợp lệ !");
        } else {
            System.out.println("Mã thẻ " + number + " không hợp lệ !");
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number;
        do {
            System.out.println("Nhập mã thẻ cần ckech (Nhập 0 để dừng chương trình) :");
            number = input.nextLong();
            if (number == 0) {
                break;
            }
            while ((getSize(number) < 13 || getSize(number) > 16)&&number!=0) {
                System.out.println("Nhập lại mã thẻ cần ckech (Nhập 0 để dừng chương trình) :");
                number = input.nextLong();
            }
            isValid(number);
        } while (number != 0);
    }
}
