import java.util.Scanner;

/**
 * Created by Hieu It on 8/1/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account account = new Account("1234","Tran Han Hieu",100000,160597);
        PaymentStrategy paymentStrategy = new DirectPayStrategy(160597,"1234");
        System.out.println("CardNumber : "+account.creatCardNumber());
        PaymentStrategy paymentStrategy1 = new CreditCardStrategy("Tran Han Hieu",account.creatCardNumber(),160597);
        System.out.println(account.withdraw(50000,paymentStrategy));
        System.out.println(account.withdraw(10000,paymentStrategy1));

    }
}
