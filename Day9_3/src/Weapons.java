/**
 * Created by Hieu It on 7/22/2016.
 */
public class Weapons {
    protected String name;
    protected int level ;
    //protected int attack;
    //protected int defense;
    protected int intelligence;
    protected int dexterity;
    protected int strength;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public Weapons() {
        //this.name = name;
    }
    private String ownLine = " ";

    public String getOwnLine() {
        return ownLine;
    }

    public void setOwnLine(String ownLine) {
        this.ownLine = ownLine;
    }

    /*
    public String ownLine(String name) {

        if (getName().equals("Stick")) {
            ownLine = "You poke your stick for !";
        }
        if (getName().equals("Axe")) {
            ownLine = "You swing your mighty axe for !";
        }
        if (getName().equals("Bow")) {
            ownLine = "You shoot an arrow for !";
        }
        if (getName().equals("Staff")) {
            ownLine = "You cast a spell for !";
        }
        return ownLine;
    }*/
}
