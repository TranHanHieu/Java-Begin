import java.util.Scanner;

/**
 * Created by Hieu It on 7/3/2016.
 */
public class Day5_Selection3 {

    public static int getPrefix(long number, int n) {//Trả về n chữ số đầu tiên của mã (ví dụ number = 456, n  = 2 thì trả về 45)
        String snumber = String.valueOf(number);
        int[] arr = new int[snumber.length()];
        String[] array = new String[snumber.length()];
        for (int i = 0; i < snumber.length(); i++) {
            arr[i] = (int) (number % 10);
            number = (int) (number / 10);
        }
        for (int i = 0; i < snumber.length(); i++) {
            array[i] = String.valueOf(arr[(int) snumber.length() - 1 - i]);
        }
        String str = "";
        for (int j = 0; j < n; j++) {
            str = str + array[j];
        }
        return Integer.valueOf(str);
    }
    public static boolean isRightPrefix(long number){//Trả về true nếu mã bắt đầu bằng 4, 5, 6 hoặc 37
        return (getPrefix(number,1)==4||getPrefix(number,1)==5||getPrefix(number,1)==6||getPrefix(number,2)==37);
    }

    public static int getSize(long number){//Trả về số chữ số của một số nguyên number
        String snumber = String.valueOf(number);
        return snumber.length();
    }

    public static int sumOfOddPlace(long number){//Lấy kết quả của bước 3 (tổng các chữ số ở vị trí lẻ)
        String snumber = String.valueOf(number);
        int sum = 0;
        int[] arr = new int[snumber.length()];
        int[] array = new int[snumber.length()];
        for (int i = 0; i < snumber.length(); i++) {
            arr[i] = (int) (number % 10);
            number = (int) (number / 10);
        }
        for (int i = 0; i < snumber.length(); i++) {
            array[i] = arr[snumber.length()-1-i];
        }
        for (int j = snumber.length()-1; j >=0 ; j-=2) {
            sum = sum + array[j];
        }
        return sum;
    }

    public static int sumOfDoubleEvenPlace(long number){//Lấy kết quả của bước 2 (tổng các chữ số ở vị trí chẵn x2)
        String snumber = String.valueOf(number);
        int integrals = 0;//tính tích
        int[] arr = new int[snumber.length()];
        int[] array = new int[snumber.length()];
        for (int i = 0; i < snumber.length(); i++) {
            arr[i] = (int) (number % 10);
            number = (int) (number / 10);
        }
        for (int i = 0; i < snumber.length(); i++) {
            array[i] = arr[snumber.length()-1-i];
        }
        int sumT=0;
        for (int j = snumber.length()-2; j >=0; j-=2) {
            integrals = 2* array[j];
            //System.out.println(integrals);
            int sum =0;
            if(integrals>9){
                String ab = String.valueOf(integrals);
                for (int i=0;i<ab.length();i++){
                    arr[i] = (int) (integrals%10);
                    sum=sum + arr[i];
                    integrals = (int) (integrals/10);
                }
                integrals = sum;
                //System.out.println(integrals);
            }
            sumT+=integrals;
        }
        return sumT;
    }

    public static int getDigit(int number){//Trả về number nếu number là số có 1 chữ số. Nếu number là số có 2 chữ số thì trả về tổng 2 chữ số của number
        return 0;
    }

    public static boolean isValid(long number){//Trả về true nếu mã number là mã thẻ đúng
        int resulf =0;
        resulf= sumOfDoubleEvenPlace(number)+ sumOfOddPlace(number);
        boolean b = resulf%10==0;
        if(b){
            System.out.println("hợp lệ");
        }else {
            System.out.println("k");
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập mã thẻ cần ckech (Nhập 0 để dừng chương trình) :");
        long number = input.nextLong();
        //getPrefix(number,3);
        System.out.println(getPrefix(number, 4));
        System.out.println(getSize(number));
        System.out.println(sumOfOddPlace(number));
        System.out.println(sumOfDoubleEvenPlace(number));
        isValid(number);
    }
}
