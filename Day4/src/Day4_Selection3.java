/**
 * Created by Hieu It on 7/1/2016.
 */
public class Day4_Selection3 {
    public static void main(String[] args) {
        System.out.println("Vòng lặp For");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        int s = 0;
        //Vòng lặp While
        System.out.println("Vòng lặp While");
        while (s < 1000) {
            s += 9;
        }
        System.out.println(s);
        //Vòng lặp Do- While
        s = 0;
        //So sánh while và do - while
        System.out.println("Vòng lặp While");
        while (s < 0) {
            System.out.println(s);
            s++;
        }
        s = 0;
        System.out.println("Vòng lặp Do - While");
        do {
            System.out.println(s);
            s++;
        } while (s < 0);
    }
}
