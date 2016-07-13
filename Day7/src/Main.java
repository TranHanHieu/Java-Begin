import java.util.Scanner;

/**
 * Created by Hieu It on 7/11/2016.
 */
public class Main {
    static Scanner input = new Scanner(System.in);
   // private static int numberOfEntries;
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        PhoneEntry phoneEntry = new PhoneEntry("","");
        int choose=0;
        while (choose!=8){
            System.out.println("------DANH BẠ ĐIỆN THOẠI-------");
            System.out.println("\t1. Nhập liên hệ.");
            System.out.println("\t2. Thêm một liên hệ.");
            System.out.println("\t3. Sửa liên hệ.");
            System.out.println("\t4. Xóa liên hệ.");
            System.out.println("\t5. Tìm kiếm liên hệ theo tên.");
            System.out.println("\t6. Tìm kiếm liên hệ theo số.");
            System.out.println("\t7. Hiển thị tất cả liên hệ.");
            System.out.println("\t8. Thoát.");
            System.out.println("----->Mời lựa chọn chức năng: ");
            choose = input.nextInt();
            switch (choose){
                case 1:
                    System.out.println("-------------Nhập liên hệ-------------");
                    System.out.println("Nhập số lượng liên hệ: ");
                    int number = input.nextInt();
                    for(int i = 0; i < number; i++) {
                        input.nextLine();
                        System.out.println("Nhập tên liên hệ: ");
                        phoneEntry.setName(input.nextLine());
                        //input.nextLine();
                        System.out.println("Nhập số điện thoại: ");
                        phoneEntry.setPhoneNumber(input.nextLine());
                        if (phoneBook.addEntry(phoneEntry)){
                            System.out.println("Nhập thành công !");
                        }else {
                            System.out.println("Số liên lạc đã tồn tại !");
                        }
                    }
                    break;
                case 2:
                    System.out.println("-------------Thêm một liên hệ--------------");
                    input.nextLine();
                    System.out.println("Nhập tên liên hệ :");
                    phoneEntry.setName(input.nextLine());
                    System.out.println("Nhập số liên hệ cần thêm :");
                    phoneEntry.setPhoneNumber(input.nextLine());
                    if(phoneBook.addEntry(phoneEntry)){
                        System.out.println("Thêm thành công !");
                    }else {
                        System.out.println("Thêm thất bại !");
                    }
                    break;
                case 3:
                    System.out.println("-------------Sửa liên hệ----------------");
                    int choose1=0;
                    System.out.println("1. Sửa tên liên hệ.");
                    System.out.println("2. Sửa số liên hệ.");
                    choose1 = input.nextInt();
                    switch (choose1){
                        case 1:
                            System.out.println("Nhập tên liên hệ cần sửa : ");
                            String entryName = input.next();
                            System.out.println("Nhập tên mới cho liên hệ :");
                            String newName = input.next();
                            if (phoneBook.modifyEntryName(entryName,newName)){
                                System.out.println("Sửa tên thành công !");
                            }else {
                                System.out.println("Sửa tên thất bại !");
                            }
                            break;
                        case 2:
                            System.out.println("Nhập số liên hệ cần sửa : ");
                            String entryNumber = input.next();
                            System.out.println("Nhập số mới cho liên hệ :");
                            String newNumber = input.next();
                            if (phoneBook.modifyEntryNumber(entryNumber,newNumber)){
                                System.out.println("Sửa số thành công !");
                            }else {
                                System.out.println("Sửa số thất bại !");
                            }
                            break;

                    }
                    break;
                case 4:
                    System.out.println("-------------Xóa liên hệ----------------");
                    System.out.println("Nhập tên liên hệ cần xóa :");
                    String nameDetele = input.next();
                    if (phoneBook.deleteEntry(nameDetele)){
                        System.out.println("Xóa thành công !");
                    }else {
                        System.out.println("Xóa thất bại !");
                    }
                    break;
                case 5:
                    System.out.println("-------------Tìm kiếm liên hệ theo tên-------------");
                    System.out.println("Nhập tên liên hệ cần tìm : ");
                    String findName = input.next();
                    System.out.println("Liên hệ cần tìm : "+ phoneBook.findEntryByName(findName));
                    break;
                case 6:
                    System.out.println("-------------Tìm kiếm liên hệ theo số-------------");
                    System.out.println("Nhập số liên hệ cần tìm : ");
                    String findNumber = input.next();
                    System.out.println("Liên hệ cần tìm : "+ phoneBook.findEntryByName(findNumber));
                    break;
                case 7:
                    System.out.println("-------------Hiển thị tất cả các liên hệ--------------");
                   // phoneEntry.toString();
                    //phoneBook.toString();
                    //for (int i = 0;i<phoneBook.getNumberOfEntries();i++) {
                        System.out.println(phoneBook.toString());
                    //}
                    //phoneBook.disp();
                    break;
                case 8:
                    break;
            }
        }
    }
}
