package Classes;

public class Warden extends Minion{
    public Warden(int mana, int health, int attackDamage, String description, String colors, String name) {
        super(mana, health, attackDamage, description, colors, name);
        type = "Warden";
        tank = true;
        frozen = false;
    }
}
