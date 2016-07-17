import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Hieu It on 7/11/2016.
 */
public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        int choose = 0;

        while (choose != 8) {
            System.out.println("------DANH BẠ ĐIỆN THOẠI-------");
            //System.out.println("\t1. Nhập liên hệ.");
            System.out.println("\t1. Thêm một liên hệ.");
            System.out.println("\t2. Thêm số điện thoại vào liên hệ.");
            System.out.println("\t3. Sửa liên hệ.");
            System.out.println("\t4. Xóa liên hệ.");
            System.out.println("\t5. Tìm kiếm liên hệ theo tên.");
            System.out.println("\t6. Tìm kiếm liên hệ theo số.");
            System.out.println("\t7. Hiển thị tất cả liên hệ.");
            System.out.println("\t8. Thoát.");
            System.out.println("----->Mời lựa chọn chức năng: ");
            choose = input.nextInt();
            switch (choose) {
                case 1:
                    ArrayList inputPhoneNumber = new ArrayList();
                    PhoneEntry phoneEntry1 = new PhoneEntry();
                    System.out.println("-------------Thêm một liên hệ--------------");
                    input.nextLine();
                    System.out.println("Nhập tên liên hệ :");
                    phoneEntry1.setName(input.nextLine());
                    System.out.println("Nhập số điện thoại :");
                    inputPhoneNumber.add(0, input.nextLine());
                    phoneEntry1.setPhoneNumber(inputPhoneNumber);
                    if (phoneBook.addEntry(phoneEntry1)) {
                        System.out.println("Thêm thành công !");
                    } else {
                        System.out.println("Thêm thất bại !");
                    }
                    break;

                case 2:
                    ArrayList inputPhoneNumber1 = new ArrayList();
                    System.out.println("-------------Thêm số điên thoại vào 1 liên hệ-------------");
                    input.nextLine();
                    System.out.println("Nhập tên liên hệ muốn thêm số điện thoại : ");
                    String nameNumber = input.nextLine();
                    System.out.println(phoneBook.findEntryByName(nameNumber).getName());
                    if (phoneBook.findEntryByName(nameNumber).getName().equals(nameNumber)) {
                        inputPhoneNumber1 = phoneBook.findEntryByName(nameNumber).getPhoneNumber();
                        System.out.println("Nhập số điện thoại cần thêm : ");
                        inputPhoneNumber1.add(1, input.nextLine());
                        phoneBook.findEntryByName(nameNumber).setPhoneNumber(inputPhoneNumber1);
                        System.out.println("Thêm thành công !");
                    } else {
                        System.out.println("Tên không tồn tại !");
                    }

                    break;
                case 3:
                    System.out.println("-------------Sửa liên hệ----------------");
                    int choose2 = 0;
                    System.out.println("1. Sửa tên liên hệ.");
                    System.out.println("2. Sửa số liên hệ.");
                    choose2 = input.nextInt();
                    switch (choose2) {
                        case 1:
                            System.out.println("Nhập tên liên hệ cần sửa : ");
                            String entryName = input.next();
                            System.out.println("Nhập tên mới cho liên hệ :");
                            String newName = input.next();
                            if (phoneBook.modifyEntryName(entryName, newName)) {
                                System.out.println("Sửa tên thành công !");
                            } else {
                                System.out.println("Sửa tên thất bại !");
                            }
                            break;
                        case 2:
                            System.out.println("Nhập số liên hệ cần sửa : ");
                            ArrayList entryNumber = new ArrayList();
                            input.nextLine();
                            entryNumber.add(0, input.nextLine());
                            System.out.println("Nhập số mới cho liên hệ :");
                            ArrayList newNumber = new ArrayList();
                            newNumber.add(0, input.nextLine());
                            if (phoneBook.modifyEntryNumber(entryNumber, newNumber)) {
                                System.out.println("Sửa số thành công !");
                            } else {
                                System.out.println("Sửa số thất bại !");
                            }
                            break;

                    }
                    break;
                case 4:
                    System.out.println("-------------Xóa liên hệ----------------");
                    System.out.println("Nhập tên liên hệ cần xóa :");
                    String nameDetele = input.next();
                    if (phoneBook.deleteEntry(nameDetele)) {
                        System.out.println("Xóa thành công !");
                    } else {
                        System.out.println("Xóa thất bại !");
                    }
                    break;
                case 5:
                    System.out.println("-------------Tìm kiếm liên hệ theo tên-------------");
                    System.out.println("Nhập tên liên hệ cần tìm : ");
                    String findName = input.next();
                    System.out.println("Liên hệ cần tìm : " + phoneBook.findEntryByName(findName));
                    break;
                case 6:
                    System.out.println("-------------Tìm kiếm liên hệ theo số-------------");
                    System.out.println("Nhập số liên hệ cần tìm : ");
                    String findNumber = input.next();
                    System.out.println("Liên hệ cần tìm : " + phoneBook.findEntryByNumber(findNumber));
                    break;
                case 7:
                    System.out.println("-------------Hiển thị tất cả các liên hệ--------------");
                    System.out.println(phoneBook.toString());
                    break;
                case 8:
                    break;
            }
        }
    }
}
