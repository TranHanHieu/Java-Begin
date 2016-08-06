/**
 * Created by Hieu It on 8/5/2016.
 */
public class Mouse extends Product {
    private String type;

    public Mouse(String id, String name, int price, String type) {
        super(id, name, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "type='" + type + '\'' +
                '}';
    }
}
