/**
 * Created by Hieu It on 8/1/2016.
 */
public class DirectPayStrategy implements PaymentStrategy {
    private int secretPIN;
    private String userId;
    @Override
    public boolean isValidInfo(Account acc) {
        if (acc.isRightPIN(secretPIN)&&acc.getUserId()==userId){
            return true;
        }
        return false;
    }

    public DirectPayStrategy(int secretPIN, String userId) {
        this.secretPIN = secretPIN;
        this.userId = userId;
    }
}
