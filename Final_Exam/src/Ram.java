/**
 * Created by Hieu It on 8/5/2016.
 */
public class Ram extends Product {
    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Ram(String id, String name, int price, int capacity) {
        super(id, name, price);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Tên Ram : " + getName() + "\nId: " + getId() + "\nPrice : " + getPrice() + "\nCapacity : " + getCapacity();
    }
}
