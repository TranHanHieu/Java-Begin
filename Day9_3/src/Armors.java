/**
 * Created by Hieu It on 7/22/2016.
 */
public class Armors {
    protected String name;
    protected int level =1;
    protected int intelligence;
    protected int dexterity;
    protected int strength;
    protected String ownLine = "";
    public Armors() {
        //this.name = name;
    }

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


    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
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

    public String getOwnLine() {
        return ownLine;
    }

    public void setOwnLine(String ownLine) {
        this.ownLine = ownLine;
    }
    /*
    public String ownLine(String name){
        String ownLine = " ";
        if (getName().equals("Clothes")){
            ownLine = " Your normal clothes blocks the attack";
        }
        if (getName().equals("Chainmail")){
            ownLine = "Your mighty chainmail blocks the attack";
        }
        if (getName().equals("Leather")){
            ownLine = "You sneaky armor allows you to dodge the attack";
        }
        if (getName().equals("Robes")){
            ownLine = "Your magical robes protect you from the attack";
        }
        return ownLine;
    }*/
}
