/**
 * Created by Hieu It on 7/22/2016.
 */
public class Warrior extends Hero {
    public Warrior(String name, int level, int hp, int strength, int dexterity, int attack, int defense, int intelligence) {
        super(name, level, hp, strength, dexterity, attack, defense, intelligence);
    }

    @Override
    public void fight() {
        System.out.println("pppp");
    }

    public void setAttack(Weapons weapons) {
        this.attack += level + weapons.getLevel() + weapons.getStrength();
        weapons.getOwnLine();
    }

    public void setDefense(Armors armors) {
        this.defense += level + armors.getLevel() + armors.getStrength();
        armors.getOwnLine();
    }
}
