/**
 * Created by Hieu It on 7/11/2016.
 */
public class PhoneEntry {//một liên lạc trong danh bạ

    public String getName() {
        return name;
    }
    public PhoneEntry() {

    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private String phoneNumber;
    public PhoneEntry(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String toString(){
        return this.getName() +"\t "+ this.getPhoneNumber();
    }
}
