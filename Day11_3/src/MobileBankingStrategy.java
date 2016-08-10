/**
 * Created by Hieu It on 8/1/2016.
 */
public class MobileBankingStrategy implements PaymentStrategy {
    private String phoneNumber;
    private int secretPIN;

    @Override
    public boolean isValidInfo(Account acc) {
        if (acc.getPhoneNumber()==phoneNumber&&acc.isRightPIN(secretPIN)){
            return true;
        }
        return false;
    }

    public MobileBankingStrategy(String phoneNumber, int secretPIN) {
        this.phoneNumber = phoneNumber;
        this.secretPIN = secretPIN;
    }
}
