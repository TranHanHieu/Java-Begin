/**
 * Created by Hieu It on 8/5/2016.
 */
public class Case extends Product {
    Ram ram;
    Cpu cpu;

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Case(String id, String name, int price, Ram ram, Cpu cpu) {
        super(id, name, price);
        this.setPrice((int)0.1*(ram.getPrice()+cpu.getPrice()));
        this.ram = ram;
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Case{" +
                "ram=" + ram +
                ", cpu=" + cpu +
                '}';
    }
}
