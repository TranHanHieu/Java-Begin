import java.util.Scanner;

/**
 * Created by Hieu It on 7/10/2016.
 */
public class Student {
    private String name;

    private int age;

    private String code;

    private String phoneNumber;

    private double math;

    private double literature;

    private double english;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge(String s) {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getLiterature() {
        return literature;
    }

    public void setLiterature(double literature) {
        this.literature = literature;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public void inputStudent() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên Sv : ");
        setName(input.next());
        System.out.println("Nhập mã Sv : ");
        setCode(input.next());
        System.out.println("Nhập tuổi Sv : ");
        setAge(input.nextInt());
        System.out.println("Nhập điểm toán : ");
        setMath(input.nextDouble());
        System.out.println("Nhập điểm văn : ");
        setLiterature(input.nextDouble());
        System.out.println("Nhập điểm Anh :");
        setEnglish(input.nextDouble());
    }

    public void displayStudent() {
        System.out.println("Họ và tên : " + name);
        System.out.println("Mã Sv : " + code);
        System.out.println("Tuổi : " + age);
        System.out.println("Điểm Toán : " + math);
        System.out.println("Điểm Văn : " + literature);
        System.out.println("Điểm Anh : " + english);
    }
}