/**
 * Created by Hieu It on 8/5/2016.
 */
public class Cpu extends Product {
    private float freq;

    public Cpu(String id, String name, int price, float freq) {
        super(id, name, price);
        this.freq = freq;
    }

    public float getFreq() {
        return freq;
    }

    public void setFreq(float freq) {
        this.freq = freq;
    }

    @Override
    public String toString() {
        return "Tên Cpu : " + getName() + "\nId: " + getId() + "\nPrice : " + getPrice() + "\nfreq : " + getFreq();
    }
}
