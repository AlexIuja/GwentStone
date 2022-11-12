package Classes;

public class Goliath extends Minion{
    public Goliath(int mana, int health, int attackDamage, String description, String colors, String name) {
        super(mana, health, attackDamage, description, colors, name);
        type = "Goliath";
        tank = true;
        frozen = false;
    }
}
