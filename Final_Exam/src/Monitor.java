/**
 * Created by Hieu It on 8/5/2016.
 */
public class Monitor extends Product {
    private String resolution;

    public Monitor(String id, String name, int price,String resolution) {
        super(id, name, price);
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "resolution='" + resolution + '\'' +
                '}';
    }
}
