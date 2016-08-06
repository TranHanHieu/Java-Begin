import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Hieu It on 8/5/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cpu cpu = new Cpu("123","Ngọc Hiếu",4000,3.1f);
        Cpu cpu1 = new Cpu("1234","Minh Hiếu",2000,3.3f);
        Cpu cpu2 = new Cpu("12345","Hán Hiếu",5000,3.2f);
        Cpu cpu3 = new Cpu("123456","Quý Hiếu",1000,3.0f);
        List<Product> c = new ArrayList<Product>();
        c.add(0,cpu);
        c.add(1,cpu1);
        c.add(2,cpu2);
        c.add(3,cpu3);
        //System.out.println(cpu);
        System.out.println(c);
        ProductManager productManager = new ProductManager(c);
        System.out.println("Nhập ID cần remove : ");
        String id;
        id=input.nextLine();
        productManager.removeProduct(id);
        productManager.sortProductByName();
        productManager.sortProductByPrice();
        for (int i=0;i<c.size();i++) {
            System.out.println(c.get(i));
        }
    }
}
