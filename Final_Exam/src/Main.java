import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Hieu It on 8/5/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choose = 0;
        int price = 0;
        List<Product> list = new ArrayList<>();
        ProductManager productManager = new ProductManager(list);
        while (choose != 7) {
            System.out.println("\t\t\t\t\t=============BEST COMPUTER=============\t\t\t\t\t");
            System.out.println("\t\t1. Thêm sản phẩm.");
            System.out.println("\t\t2. Xóa sản phẩm theo Id.");
            System.out.println("\t\t3. Sắp xếp sản phẩm theo tên.");
            System.out.println("\t\t4. Sắp xếp sản phẩm theo giá.");
            System.out.println("\t\t5. Tìm kiếm sản phẩm theo tên.");
            System.out.println("\t\t6. Hiển thị các sản phẩm");
            System.out.println("\t\t7. Thoát.");
            System.out.println("=========> Mời bạn chọn chức năng !");
            choose = input.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("\t\t\t--------------Thêm sản phẩm----------\t\t\t");
                    System.out.println("\t1. Case.");
                    System.out.println("\t2. Cpu.");
                    System.out.println("\t3. Ram.");
                    System.out.println("Nhập loại sản phẩm : ");
                    int sanPham = input.nextInt();
                    switch (sanPham) {
                        case 1:
                            System.out.println("Nhập Id cho sản phẩm : ");
                            input.nextLine();
                            String id = input.nextLine();
                            System.out.println("Nhập tên sản phẩm : ");
                            String name = input.nextLine();
                            System.out.println("Nhập tên ram : ");
                            String nameRam1 = input.nextLine();
                            System.out.println("Nhập giá : ");
                            int priceRam1 = input.nextInt();
                            System.out.println("Nhập tốc độ Ram : ");
                            int capacity1 = input.nextInt();
                            Ram ram = new Ram(id, nameRam1, priceRam1, capacity1);
                            System.out.println("Nhập tên Cpu : ");
                            input.nextLine();
                            String nameCpu1 = input.nextLine();
                            System.out.println("Nhập giá : ");
                            int priceCpu1 = input.nextInt();
                            System.out.println("Nhập tốc độ Cpu : ");
                            int freq1 = input.nextInt();
                            Cpu cpu = new Cpu(id, nameCpu1, priceCpu1, freq1);
                            Case cases = new Case(id, name, price, ram, cpu);
                            list.add(0, cases);
                            break;
                        case 2:
                            System.out.println("Nhập tên Cpu : ");
                            input.nextLine();
                            String nameCpu = input.nextLine();
                            System.out.println("Nhập Id cho sản phẩm : ");
                            String idCpu = input.nextLine();
                            System.out.println("Nhập giá : ");
                            int priceCpu = input.nextInt();
                            System.out.println("Nhập tốc độ Cpu : ");
                            int freq = input.nextInt();
                            Cpu cpu1 = new Cpu(idCpu, nameCpu, priceCpu, freq);
                            list.add(0, cpu1);
                            break;
                        case 3:
                            System.out.println("Nhập tên ram : ");
                            input.nextLine();
                            String nameRam = input.nextLine();
                            System.out.println("Nhập Id cho sản phẩm : ");
                            String idRam = input.nextLine();
                            System.out.println("Nhập giá : ");
                            int priceRam = input.nextInt();
                            System.out.println("Nhập tốc độ Ram : ");
                            int capacity = input.nextInt();
                            Ram ram1 = new Ram(idRam, nameRam, priceRam, capacity);
                            list.add(0, ram1);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("----------------Xóa sản phẩm theo Id------------------");
                    System.out.println("Nhập Id cần xóa : ");
                    input.nextLine();
                    String idRemove = input.nextLine();
                    if (productManager.removeProduct(idRemove)) {
                        System.out.println("Xóa thành công !");
                    }
                    break;
                case 3:
                    System.out.println("-------------Sắp xếp sp theo tên-------------");
                    productManager.sortProductByName();
                    System.out.println("Sắp xếp thành công!");
                    break;
                case 4:
                    System.out.println("---------------Sắp xếp sp theo giá----------------- ");
                    productManager.sortProductByPrice();
                    System.out.println("Sắp xếp thành công!");
                    break;
                case 5:
                    System.out.println("---------------Tìm kiếm theo tên ----------------");
                    input.nextLine();
                    System.out.println("Nhập tên cần tìm : ");
                    String nameFind = input.nextLine();
                    System.out.println(productManager.findProduct(nameFind));
                    break;
                case 6:
                    System.out.println("------------Hiển thị các sp---------------");
                    productManager.showAllProduct();
                    break;
                case 7:
                    choose = 7;
                    break;
            }
        }
    }
}
