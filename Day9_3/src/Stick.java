/**
 * Created by Hieu It on 8/1/2016.
 */
public class Stick extends Weapons {
    public Stick(String name) {
        this.name =name;
    }

    @Override
    public void setOwnLine(String ownLine) {
        ownLine ="You poke your stick for !";
    }
}
