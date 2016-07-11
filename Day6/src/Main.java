import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.util.Scanner;

/**
 * Created by Hieu It on 7/10/2016.
 */
public class Main {
    public static Actions actions = new Actions();

    public static void main(String[] args) {
        final int max = 100;
        int number,add;
        String deleteCode,editCode;
        Student[] student = new Student[max];
        Scanner input = new Scanner(System.in);
        int m;
        int choose=0;
        while (choose!=6) {
            System.out.println("--------------Menu--------------");
            System.out.println("\t1. Nhập danh sách Sv.");
            System.out.println("\t2. Hiển thị danh sách Sv.");
            System.out.println("\t3. Thêm Sv.");
            System.out.println("\t4. Xóa Sv bằng Mã Sv.");
            System.out.println("\t5. Sửa thông tin Sv bằng Mã Sv.");
            System.out.println("\t6. Thoát.");
            System.out.println("-----> Mời bạn chọn Chương trình !");
            choose = input.nextInt();
            switch (choose){
                case 1:
                    System.out.println("--------Chương trình nhập danh sách Sv---------");
                    do {
                        System.out.println("Nhập vào số lượng Sinh Viên(0 < n < 100 ): ");
                        number = input.nextInt();
                    } while (number <= 0 || number >= 100);
                    actions.setLength(number);
                    actions.importStudent(student);
                    System.out.println("Đã nhập xong ! ");
                    System.out.println("---> Mời bạn chọn tiếp ( chọn 0 để Thoát ).");
                    break;
                case 2:
                    System.out.println("--------------Danh Sách Sv-------------");
                    actions.outputStudent(student);
                    break;
                case 3:
                    System.out.println("--------------Thêm Sv---------------");
                    System.out.println("Nhập số Sv cần thêm :");
                    add = input.nextInt();
                    actions.setAdd(add);
                    actions.addStudent(student);
                    break;
                case 4:
                    System.out.println("--------------Xóa Sv bằng Mã Sv--------------");
                    System.out.println("Nhập Mã Sv cần xóa :");
                    deleteCode = input.next();
                    actions.deleteStudent(student,deleteCode);
                    System.out.println("Đã xóa xong !");
                    break;
                case 5:
                    System.out.println("--------------Sửa thông tin Sv bằng Mã Sv--------------");
                    System.out.println("Nhập Mã Sv cần sửa :");
                    editCode = input.next();
                    actions.editStudent(student,editCode);
                    System.out.println("Đã sửa xong !");
                    break;
                case 6:
                    break;
            }

        }
    }
}