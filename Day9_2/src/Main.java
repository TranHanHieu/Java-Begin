/**
 * Created by Hieu It on 7/18/2016.
 */
public class Main {

    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.setLaiSuatNam(4.5);
        account.rutTien(2500);
        account.napTien(3000);
        System.out.println("Số dư = " + account.getSodu());
        System.out.println("Lợi nhuận tháng = " + account.getLoiNhuanHangThang(account.getSodu(), account.getLaiSuatThang(account.getLaiSuatNam())));
        System.out.println("Ngày tạo tài khoản : " + account.getNgayTao());
    }
}
