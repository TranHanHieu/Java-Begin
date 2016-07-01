import java.util.Scanner;
/**
 * Created by Hieu It on 7/1/2016.
 */
public class Day4_Selection21 {
    public static void in(String arr) {
        System.out.println("Bạn tên : "+arr);
    }
    public static void in(int classes) {
        System.out.println("Bạn học lớp : "+classes);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập tên : ");
        String name=sc.nextLine();
        System.out.println("Nhập lớp : ");
        int classes=sc.nextInt();
        in(name);
        in(classes);


    }
}