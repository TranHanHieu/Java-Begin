/**
 * Created by Hieu It on 8/1/2016.
 */
public class Staff extends Weapons {
    private int intelligence;
    public Staff(String name) {
        this.name =name;
    }

    @Override
    public void setOwnLine(String ownLine) {
        ownLine = "You cast a spell for !";
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
}
