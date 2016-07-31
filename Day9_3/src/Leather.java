/**
 * Created by Hieu It on 8/1/2016.
 */
public class Leather extends Weapons {
    private int dexterity;

    public Leather(String name) {
        this.name=name;
    }

    @Override
    public void setOwnLine(String ownLine) {
        ownLine = "You sneaky armor allows you to dodge the attack";
    }

    @Override
    public int getDexterity() {
        return dexterity;
    }

    @Override
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
}
