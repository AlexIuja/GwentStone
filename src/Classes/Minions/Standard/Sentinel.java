package Classes.Minions.Standard;

import Classes.Minions.Minion;

public class Sentinel extends Minion {
    public Sentinel(int mana, int health, int attackDamage, String description, String colors, String name) {
        super(mana, health, attackDamage, description, colors, name);
        type = "Sentinel";
        tank = false;
        frozen = false;
    }



}
