/**
 * Created by Hieu It on 7/22/2016.
 */
public class Archer extends Hero {
    //Weapons weapons = new Weapons();
    //Armors armors = new Armors();
    public Archer(String name, int level, int hp, int strength, int dexterity, int attack, int defense, int intelligence) {
        super(name, level, hp, strength, dexterity, attack, defense, intelligence);
    }

    @Override
    public void fight() {
        System.out.println("000");
    }

    public void setAttack(Weapons weapons) {
        //super.setAttack(attack);
        this.attack += level + weapons.getLevel() + weapons.getDexterity();
        //System.out.println(weapons.getLevel());
        weapons.getOwnLine();
    }

    public void setDefense(Armors armors) {
        super.setDefense(defense);
        this.defense += level + armors.getLevel() + armors.getDexterity();
        armors.getOwnLine();
    }
    /*
    public Archer(String name, int level, int hp, int strength, int dexterity, int attack, int defense,int intelligence, String weapon, String armor) {
        super(name, level, hp, strength, dexterity, attack, defense, intelligence,weapon, armor);
        this.strength = 3;
        this.dexterity = 4;
        this.attack = 5;
        this.defense = 3;
        this.intelligence =4;
        this.weapon = "";
        this.armor = "";
    }

    Weapons weapons = new Weapons(weapon);
    Armors armors = new Armors(armor);
    @Override
    public void fight() {
        System.out.println("aaa");
    }

    @Override
    public String tauntLine() {
        return "Aim twice, shoot once !";
    }

    protected void setFight() {
        if (weapons.getName().equals(null)) {
            this.attack += level;
            this.defense += level;
        }
        if (weapons.getName().equals("Stick") || armors.getName().equals("Clothes")) {
            this.attack += level + weapons.getLevel();
            this.defense += level + armors.getLevel();
            weapons.ownLine("Stick");
            armors.ownLine("Closes");
        }
        if (weapons.getName().equals("Axe") || armors.getName().equals("Chainmail")) {
            this.attack += level + weapons.getLevel();
            this.defense += level + armors.getLevel();
            weapons.ownLine("Axe");
            armors.ownLine("Chainmail");
        }
        if (weapons.getName().equals("Bow") || armors.getName().equals("Leather")) {
            this.attack += level + weapons.getLevel() + dexterity;
            this.defense += level + armors.getLevel() + dexterity;
            weapons.ownLine("Bow");
            armors.ownLine("Leather");
        }
        if (weapons.getName().equals("Staff") || armors.getName().equals("Robes")) {
            this.attack += level + weapons.getLevel();
            this.defense += level + armors.getLevel();
            weapons.ownLine("Staff");
            armors.ownLine("Robes");
        }
    }*/
}
