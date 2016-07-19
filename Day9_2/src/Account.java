import java.util.Date;

/**
 * Created by Hieu It on 7/18/2016.
 */
public class Account {
    private int id;
    private double sodu;
    private double laiSuatNam;
    private double laiSuatThang;
    private double loiNhuanHangThang;
    private Date ngayTao;

    public Account() {
    }

    public Account(int id, double sodu) {
        this.id = id;
        this.sodu = sodu;
        ngayTao = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public double getSodu() {
        return sodu;
    }

    public void setSodu(double sodu) {
        if (sodu > 0) {
            this.sodu = sodu;
        }
    }

    public double getLaiSuatNam() {
        return laiSuatNam;
    }

    public void setLaiSuatNam(double laiSuatNam) {
        if (laiSuatNam > 0) {
            this.laiSuatNam = laiSuatNam;
        }
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public double getLaiSuatThang(double laiSuatNam) {
        return laiSuatThang = laiSuatNam / 12;
    }

    public double getLoiNhuanHangThang(double sodu, double laiSuatThang) {
        return loiNhuanHangThang = sodu * laiSuatThang;
    }

    public double rutTien(double value) {
        this.sodu = sodu - value;
        return sodu;
    }

    public void napTien(double value) {
        this.sodu = sodu + value;
    }
}
