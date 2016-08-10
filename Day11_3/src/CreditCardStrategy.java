/**
 * Created by Hieu It on 8/1/2016.
 */
public class CreditCardStrategy implements PaymentStrategy  {
    private String name;
    private String cardNumber;
    private int secretPIN;
    @Override
    public boolean isValidInfo(Account acc) {
        if (acc.getCardNumber()==cardNumber&&acc.getName()==name&&acc.isRightPIN(secretPIN)){
            return true;
        }
        return false;
    }

    public CreditCardStrategy(String name, String cardNumber, int secretPIN) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.secretPIN = secretPIN;
    }
}
