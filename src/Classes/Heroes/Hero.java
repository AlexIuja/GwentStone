package Classes.Heroes;

public abstract class Hero {
    public int mana;
    public String description;
    public String colors;
    public int health = 30;
    public boolean alive = true;

    public abstract void execAbility();
}
