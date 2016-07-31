/**
 * Created by Hieu It on 8/1/2016.
 */
public class Bow extends Weapons {
    private int dexterity;

    public Bow(String name) {
        this.name = name;
    }

    @Override
    public void setOwnLine(String ownLine) {
        ownLine = "You shoot an arrow for !";
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
}
