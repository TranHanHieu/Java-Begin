/**
 * Created by Hieu It on 7/3/2016.
 */
public class Day5_Selection2 {
    public static int sumOfDigit(long number){
        int sum =0;
        String temp = String.valueOf(number);
        String[] arr =new String [temp.length()];
        String[] array =new String [temp.length()];
        for (int i=0;i<temp.length();i++){
            arr[i]= String.valueOf((int) (number%10));
            number = number/10;
        }
        for (int i=0;i<temp.length();i++){
            array[i]=arr[temp.length()-1-i];
            sum+=Integer.valueOf(array[i]);
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Tổng các chữ số của 1 số nguyên là :"+ sumOfDigit(126));
    }
}
