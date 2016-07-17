import java.util.*;
import java.util.ArrayList;

/**
 * Created by Hieu It on 7/11/2016.
 */
public class PhoneBook {
    private int numberOfEntries;
    private ArrayList<PhoneEntry> arrayList = new ArrayList<>();

    public ArrayList<PhoneEntry> getArrayList() {
        return arrayList;
    }

    public PhoneBook() {

    }

    public int getNumberOfEntries() {
        return numberOfEntries;
    }//Trả về số liên lạc hiện có trong danh bạ

    public boolean addEntry(PhoneEntry entry) {

        if (!isDuplicateNumber(entry.getPhoneNumber())) {
            arrayList.add(numberOfEntries, entry);
            numberOfEntries++;
            return true;
        }
        return false;
    }

    public boolean modifyEntryName(String oldName, String newName) {//Sửa tên một liên hệ trong danh dạ
        if (isDuplicateName(oldName)) {
            for (int i = 0; i < getNumberOfEntries(); i++) {
                if ((oldName.equals(arrayList.get(i).getName()))) {
                    arrayList.get(i).setName(newName);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean modifyEntryNumber(String entryNumber, String newNumber) {//Sửa số điện thoại của liên hệ trong danh bạ
        if (isDuplicateNumber(entryNumber)) {
            for (int i = 0; i < getNumberOfEntries(); i++) {
                if (entryNumber.equals(arrayList.get(i).getPhoneNumber())) {
                    arrayList.get(i).setPhoneNumber(newNumber);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean deleteEntry(String entryName) {//Xóa một liên hệ trong danh bạ
        if (isDuplicateName(entryName)) {
            for (int i = 0; i < getNumberOfEntries(); i++) {
                if (arrayList.get(i).getName().equals(entryName)) {
                    arrayList.remove(i);
                    numberOfEntries--;
                }
            }
            return true;
        }
        return false;
    }

    public PhoneEntry findEntryByName(String entryName) {//Tìm kiếm liên hệ theo tên
        for (int i = 0; i < getNumberOfEntries(); i++) {
            if (entryName.equals(arrayList.get(i).getName())) {
                return arrayList.get(i);
            }
        }
        return null;
    }

    public PhoneEntry findEntryByNumber(String entryNumber) {//Tìm kiếm liên hệ theo số điện thoại
        for (int i = 0; i < getNumberOfEntries(); i++) {
            if (entryNumber.equals(arrayList.get(i).getPhoneNumber())) {
                return arrayList.get(i);
            }
        }
        return null;
    }

    public String toString() {//Trả về một chuỗi chứa thông tin của tất cả các liên hệ trong danh bạ
        String resulft = " ";
        for (int i = 0; i < getNumberOfEntries(); i++) {
            resulft = resulft + arrayList.get(i).toString();
        }
        return resulft;
    }

    private boolean isDuplicateName(String entryName) {//Kiểm tra tên truyền vào đã tồn tại trong danh bạ chưa
        for (int i = 0; i < getNumberOfEntries(); i++) {
            if (arrayList.get(i).getName().equals(entryName)) {
                return true;
            }
        }
        return false;
    }

    private boolean isDuplicateNumber(String entryNumber) {//Kiểm tra số truyền vào đã tồn tại trong danh bạ chưa
        for (int i = 0; i < getNumberOfEntries(); i++) {
            if (arrayList.get(i).getPhoneNumber().equals(entryNumber)) {
                return true;
            }
        }
        return false;
    }

}

