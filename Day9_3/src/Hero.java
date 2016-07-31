/**
 * Created by Hieu It on 7/22/2016.
 */
public abstract class Hero {//chưa bit dùng lgi.
    protected String name;
    protected int level=1;
    protected int hp = 100;
    protected int strength;
    protected int dexterity;
    protected int attack;
    protected int defense;
    protected Weapons weapon;
    protected Armors armor;
    protected int intelligence;

    public Hero(String name, int level, int hp, int strength, int dexterity, int attack, int defense,int intelligence) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.strength = strength;
        this.dexterity = dexterity;
        this.attack = attack;
        this.defense = defense;
        //this.weapon = weapon;
        //this.armor = armor;
        this.intelligence = intelligence;
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
        attack = attack - this.level + level;
        defense = defense -this.level + level;
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        //hp=hp-attack;
        this.hp = hp;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

    public Armors getArmor() {
        return armor;
    }

    public void setArmor(Armors armor) {
        this.armor = armor;
    }

    public String tauntLine() {
        return "I'm ready for anything!";
    }

    public abstract void fight();
}
