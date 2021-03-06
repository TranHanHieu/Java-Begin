import java.util.ArrayList;

/**
 * Created by Hieu It on 7/11/2016.
 */
public class PhoneEntry {//một liên lạc trong danh bạ
    private ArrayList phoneNumber = new ArrayList();

    private String name;

    public PhoneEntry() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhoneNumber(ArrayList phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList getPhoneNumber() {
        return phoneNumber;
    }

    public PhoneEntry(String name, ArrayList phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "\tTên : " + this.getName() + "\t---> " + "Số điện thoại : " + this.getPhoneNumber();
    }
}
