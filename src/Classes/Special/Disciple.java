package Classes.Special;

import Classes.Minion;

public class Disciple extends Minion {
    public Disciple(int mana, int health, String description, String colors, String name) {
        super(mana, health, 0, description, colors, name);
        type = "Disciple";
        tank = false;
        frozen = false;
        specialAbility = "God's Plan";
    }
}
