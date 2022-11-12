package Classes.Minions.Special;

import Classes.Minions.Minion;

public class TheCursedOne extends Minion {
    public TheCursedOne(int mana, int health, String description, String colors, String name) {
        super(mana, health, 0, description, colors, name);
        type = "TheCursedOne";
        tank = false;
        frozen = false;
        specialAbility = "Shapeshift";
    }

    @Override
    public void execSpecialAbility() {
        //not implemented yet
    }
}
