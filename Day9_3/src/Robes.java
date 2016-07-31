/**
 * Created by Hieu It on 8/1/2016.
 */
public class Robes extends Armors {
    private int intelligence;

    public Robes(String name) {
        //super(name);
        this.name = name;
    }

    @Override
    public void setOwnLine(String ownLine) {
        ownLine = "Your magical robes protect you from the attack";

    }


    @Override
    public int getIntelligence() {
        return intelligence;
    }

    @Override
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
}
