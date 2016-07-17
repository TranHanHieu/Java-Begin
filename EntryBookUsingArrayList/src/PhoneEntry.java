/**
 * Created by ThangNguyen on 7/11/2016.
 */
public class PhoneEntry {
    private String name;
    private String phoneNumber;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    PhoneEntry() {
    }

    PhoneEntry(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "\tTên : " + this.getName() + "\t---> " + "Số điện thoại : " + this.getPhoneNumber();
    }
}