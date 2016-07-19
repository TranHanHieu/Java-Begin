import java.util.ArrayList;

/**
 * Created by Hieu It on 7/11/2016.
 */
public class PhoneBook {
    private int numberOfEntries;

    private PhoneEntry[] phoneEntries = new PhoneEntry[numberOfEntries];

    public void setNumberOfEntries(int numberOfEntries) {
        this.numberOfEntries = numberOfEntries;
    }


    public PhoneEntry[] getPhoneEntries() {
        return phoneEntries;
    }


    public PhoneBook() {

    }

    public int getNumberOfEntries() {
        return numberOfEntries;
    }//Trả về số liên lạc hiện có trong danh bạ


    public boolean addEntry(PhoneEntry entry) {
        if (!isDuplicateName(entry.getName())) {
            PhoneEntry[] newPhoneEntry = new PhoneEntry[numberOfEntries + 1];
            for (int i = 0; i < numberOfEntries; i++) {
                newPhoneEntry[i] = phoneEntries[i];
            }
            newPhoneEntry[numberOfEntries] = entry;
            numberOfEntries++;
            phoneEntries = newPhoneEntry;
            return true;
        }
        if (findEntryByName(entry.getName()) == null){
            return false;
        }
        if (findEntryByName(entry.getName()).getName().equals(entry.getName()) ) {
            for (int i = 0; i < findEntryByName(entry.getName()).getPhoneNumber().size(); i++) {
                entry.getPhoneNumber().add(0, findEntryByName(entry.getName()).getPhoneNumber().get(i));// gán số cũ của liên hệ vào cùng số thêm.
            }
            findEntryByName(entry.getName()).setPhoneNumber(entry.getPhoneNumber());
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
                for (int j = 0; j < findEntryByNumber(entryNumber).getPhoneNumber().size(); j++) {
                    newNumber.add(j+1, phoneEntries[i].getPhoneNumber().get(j));//1 liên hệ có 2,3... số thì thêm những số k muốn sửa vào newNumber
                }
                for (int j = 0; j < findEntryByNumber(entryNumber).getPhoneNumber().size(); j++) {
                    if (entryNumber.get(0).equals(findEntryByNumber(entryNumber).getPhoneNumber().get(j))) {
                        newNumber.remove(j+1);
                        phoneEntries[i].setPhoneNumber(newNumber);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean deleteEntry(String entryName) {//Xóa một liên hệ trong danh bạ
        if (isDuplicateName(entryName)) {
            for (int i = 0; i < numberOfEntries; i++) {
                if (phoneEntries[i].getName().equals(entryName)) {
                    for (int j = i + 1; j < numberOfEntries; j++) {
                        phoneEntries[j - 1] = phoneEntries[j];
                    }
                }
            }
            numberOfEntries--;
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

    public PhoneEntry findEntryByNumber(ArrayList entryNumber) {//Tìm kiếm liên hệ theo số điện thoại
        for (int i = 0; i < numberOfEntries; i++) {
            for (int j = 0; j < phoneEntries[i].getPhoneNumber().size(); j++) {
                if (entryNumber.get(0).equals(phoneEntries[i].getPhoneNumber().get(j))) {
                    return phoneEntries[i];
                }
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
            for (int j = 0; j < findEntryByNumber(entryNumber).getPhoneNumber().size(); j++) {
                if (phoneEntries[i].getPhoneNumber().get(j).equals(entryNumber.get(0))) {
                    return true;
                }
            }
        }
        return false;
    }

}

