import java.util.ArrayList;

/**
 * Created by Hieu It on 7/11/2016.
 */
public class PhoneBook {


    public void setNumberOfEntries(int numberOfEntries) {
        this.numberOfEntries = numberOfEntries;
    }

    private int numberOfEntries;

    public PhoneEntry[] getPhoneEntries() {
        return phoneEntries;
    }

    private PhoneEntry[] phoneEntries = new PhoneEntry[numberOfEntries];

    public PhoneBook() {

    }

    public int getNumberOfEntries() {
        return numberOfEntries;
    }//Trả về số liên lạc hiện có trong danh bạ

    public boolean addEntry(PhoneEntry entry) {

        if (!isDuplicateNumber(entry.getPhoneNumber())) {
            PhoneEntry[] newPhoneEntry = new PhoneEntry[numberOfEntries + 1];
            for (int i = 0; i < numberOfEntries; i++) {
                newPhoneEntry[i] = phoneEntries[i];
            }
            newPhoneEntry[numberOfEntries] = entry;
            numberOfEntries++;
            phoneEntries = newPhoneEntry;
            //System.out.println(Arrays.toString(phoneEntries));
            return true;
        }
        return false;
    }

    public boolean modifyEntryName(String oldName, String newName) {//Sửa tên một liên hệ trong danh dạ
        if (isDuplicateName(oldName)) {
            for (int i = 0; i < numberOfEntries; i++) {
                if ((oldName.equals(phoneEntries[i].getName()))) {
                    phoneEntries[i].setName(newName);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean modifyEntryNumber(ArrayList entryNumber, ArrayList newNumber) {//Sửa số điện thoại của liên hệ trong danh bạ
        if (isDuplicateNumber(entryNumber)) {
            for (int i = 0; i < numberOfEntries; i++) {
                if (entryNumber.equals(phoneEntries[i].getPhoneNumber().get(i))) {
                    phoneEntries[i].setPhoneNumber(newNumber);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean deleteEntry(String entryName) {//Xóa một liên hệ trong danh bạ
        if (isDuplicateName(entryName)) {
            for (int i = 0; i < numberOfEntries; i++) {
                if (phoneEntries[i].getName().equals(entryName)) {
                    System.out.println("aaaaaaaaa");
                    System.out.println("i=" + i);
                    for (int j = i + 1; j < numberOfEntries; j++) {
                        System.out.println("hhihi");
                        phoneEntries[j - 1] = phoneEntries[j];
                    }
                }
            }
            numberOfEntries--;
            System.out.println(numberOfEntries);
            return true;
        }
        return false;
    }

    public PhoneEntry findEntryByName(String entryName) {//Tìm kiếm liên hệ theo tên
        for (int i = 0; i < numberOfEntries; i++) {
            if (entryName.equals(phoneEntries[i].getName())) {
                return phoneEntries[i];
            }
        }
        return null;
    }

    public PhoneEntry findEntryByNumber(String entryNumber) {//Tìm kiếm liên hệ theo số điện thoại
        for (int i = 0; i < numberOfEntries; i++) {
            if (entryNumber.equals(phoneEntries[i].getPhoneNumber().get(i))) {
                return phoneEntries[i];
            }
        }
        return null;
    }

    public String toString() {//Trả về một chuỗi chứa thông tin của tất cả các liên hệ trong danh bạ
        String resulft = " ";
        for (int i = 0; i < numberOfEntries; i++) {
            resulft = resulft + phoneEntries[i].toString() + "\n";
        }
        return resulft;
    }

    private boolean isDuplicateName(String entryName) {//Kiểm tra tên truyền vào đã tồn tại trong danh bạ chưa
        for (int i = 0; i < numberOfEntries; i++) {
            if (phoneEntries[i].getName().equals(entryName)) {
                return true;
            }
        }

        return false;
    }

    private boolean isDuplicateNumber(ArrayList entryNumber) {//Kiểm tra số truyền vào đã tồn tại trong danh bạ chưa
        for (int i = 0; i < numberOfEntries; i++) {
            System.out.println("hi");
            System.out.println(phoneEntries[i].getPhoneNumber().get(i));
            System.out.println(entryNumber.get(i));
            if (phoneEntries[i].getPhoneNumber().get(i).equals(entryNumber.get(i))) {
                return true;
            }
        }
        return false;
    }

}

