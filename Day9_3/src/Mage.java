/**
 * Created by Hieu It on 7/22/2016.
 */
public class Mage extends Hero {

    public Mage(String name, int level, int hp, int strength, int dexterity, int attack, int defense, int intelligence) {
        super(name, level, hp, strength, dexterity, attack, defense, intelligence);
    }

    @Override
    public void fight() {
        System.out.println("uuuuuu");
    }

    public void setAttack(Weapons weapons) {
        this.attack += level + weapons.getLevel() + weapons.getIntelligence();
        weapons.getOwnLine();
    }

    public void setDefense(Armors armors) {
        this.defense += level + armors.getLevel() + armors.getIntelligence();
        armors.getOwnLine();
    }
}
