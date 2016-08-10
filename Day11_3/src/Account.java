/**
 * Created by Hieu It on 8/1/2016.
 */
public class Account {
    private String userId;
    private String name;
    private String phoneNumber;
    private String cardNumber = "";
    private double balance;
    private int secretPIN;

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getSecretPIN() {
        return secretPIN;
    }

    public void setSecretPIN(int secretPIN) {
        this.secretPIN = secretPIN;
    }

    public Account(String userId, String name, int secretPIN) {
        this.userId = userId;
        this.name = name;
        this.secretPIN = secretPIN;
    }

    public Account(String userId, String name, double balance, int secretPIN) {
        this.userId = userId;
        this.name = name;
        this.balance = balance;
        this.secretPIN = secretPIN;
    }

    public double deposit(double value) {
        this.balance += value;
        return balance;
    }

    public double withdraw(double value, PaymentStrategy paymentStrategy) {
        if (paymentStrategy.isValidInfo(this)){
            if (value>0&&value<balance){
                this.balance -= value;
            }
        }
        return balance;
    }

    public boolean isRightPIN(int secretPin) {
        if (secretPin == secretPIN) {
            return true;
        }
        return false;
    }
    public String creatCardNumber (){
        this.setCardNumber(RandomCreditCardNumberGenerator.generateMasterCardNumber());
        return getCardNumber();
    }
}
