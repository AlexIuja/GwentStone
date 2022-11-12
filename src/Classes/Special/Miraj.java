package Classes.Special;

import Classes.Minion;

public class Miraj extends Minion {
    public Miraj(int mana, int health, int attackDamage, String description, String colors, String name) {
        super(mana, health, attackDamage, description, colors, name);
        type = "Miraj";
        tank = false;
        frozen = false;
        specialAbility = "Skyjack";
    }
}
