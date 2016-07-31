/**
 * Created by Hieu It on 8/1/2016.
 */
public class Axe extends Weapons {
    private int strength;
    public Axe(String name) {
        this.name=name;
    }

    @Override
    public void setOwnLine(String ownLine) {
        ownLine = "You swing your mighty axe for !";
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
