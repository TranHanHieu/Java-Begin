/**
 * Created by Hieu It on 8/1/2016.
 */
public class Chainmail extends Armors {
    private int strength;

    public Chainmail(String name) {
        //super(name);
        this.name = name;
    }


    @Override
    public void setOwnLine(String ownLine) {

        ownLine = "Your mighty chainmail blocks the attack";
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public void setStrength(int strength) {
        this.strength = strength;
    }
}
