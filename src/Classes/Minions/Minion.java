package Classes.Minions;

public abstract class Minion {
    public int mana;
    public int health;
    public int attackDamage;
    public String description;
    public String colors;
    public String name;
    public String type;
    public boolean tank;
    public boolean frozen;
    public String specialAbility;


    public Minion(int mana, int health, int attackDamage, String description, String colors, String name) {
        this.mana = mana;
        this.health = health;
        this.attackDamage = attackDamage;
        this.description = description;
        this.colors = colors;
        this.name = name;
    }

    public abstract void execSpecialAbility();
}
