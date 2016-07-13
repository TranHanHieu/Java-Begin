import java.util.Scanner;

/**
 * Created by Hieu It on 7/11/2016.
 */
public class PhoneBook {


    public void setNumberOfEntries(int numberOfEntries) {
        this.numberOfEntries = numberOfEntries;
    }

    private int numberOfEntries=0;
    private PhoneEntry[] phoneEntries = new PhoneEntry[500];

    public PhoneBook() {

    }
    public int getNumberOfEntries() {
        return phoneEntries.length;
    }//Trả về số liên lạc hiện có trong danh bạ

    Scanner input = new Scanner(System.in);

    public boolean addEntry(PhoneEntry entry) {

        if (!isDuplicateNumber(entry.getPhoneNumber()) && numberOfEntries < phoneEntries.length) {
            phoneEntries[numberOfEntries] = entry;
            numberOfEntries++;
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

    public boolean modifyEntryNumber(String entryNumber, String newNumber) {//Sửa số điện thoại của liên hệ trong danh bạ
        if (isDuplicateNumber(entryNumber)) {
            for (int i = 0; i < numberOfEntries; i++) {
                if (entryNumber.equals(phoneEntries[i].getPhoneNumber())) {
                    phoneEntries[i].setPhoneNumber(newNumber);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean deleteEntry(String entryName) {//Xóa một liên hệ trong danh bạ
        int index;
        boolean ckech =false;
        if (isDuplicateName(entryName)) {
            for (int i = 0; i < numberOfEntries; i++) {
                if (phoneEntries[i].getName().equals(entryName)) {
                    phoneEntries[i] = phoneEntries[i+1];
                    ckech = true;
                }
                if (ckech){
                    phoneEntries[i]=phoneEntries[i+1];
                }
            }
        }else {
            ckech = false;
        }
        return ckech;
    }

    public PhoneEntry findEntryByName(String entryName){//Tìm kiếm liên hệ theo tên
        for (int i =0;i<numberOfEntries;i++){
            if (entryName.equals(phoneEntries[i].getName())){
                return phoneEntries[i];
            }
        }
        return null;
    }

    public PhoneEntry findEntryByNumber(String entryNumber){//Tìm kiếm liên hệ theo số điện thoại
        for (int i =0;i<numberOfEntries;i++){
            if (entryNumber.equals(phoneEntries[i].getPhoneNumber())){
                return phoneEntries[i];
            }
        }
        return null;
    }

    public String toString(){//Trả về một chuỗi chứa thông tin của tất cả các liên hệ trong danh bạ
        String str = " ";
        for (int i=0;i<numberOfEntries;i++){
            str = " Tên : "+phoneEntries[i].getName() + " \tSố điện thoại :"+phoneEntries[i].getPhoneNumber();
        }
        return str;
    }

    private boolean isDuplicateName(String entryName){//Kiểm tra tên truyền vào đã tồn tại trong danh bạ chưa
        if (numberOfEntries==0){
            return  false;
        }else {
            for (int i = 0; i < numberOfEntries; i++) {
                if (phoneEntries[i].getName().equals(entryName)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isDuplicateNumber(String entryNumber){//Kiểm tra số truyền vào đã tồn tại trong danh bạ chưa
        if (numberOfEntries==0){
            return false;
        }else {
            for (int i = 0; i < numberOfEntries; i++) {
                if (phoneEntries[i].getPhoneNumber().equals(entryNumber)) {
                    return true;
                }
            }
        }
        return false;
    }

}

