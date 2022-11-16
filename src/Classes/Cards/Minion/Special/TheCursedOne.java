package Classes.Cards.Minion.Special;

import Classes.Cards.Minion.Minion;

import java.util.ArrayList;

public class TheCursedOne extends Minion {
    public TheCursedOne(int mana, int health, String description, ArrayList<String> colors, String name) {
        super(mana, health, 0, description, colors, name);
        setTank(false);
        setFrozen(false);
        specialAbility = "Shapeshift";
    }

    @Override
    public void execSpecialAbility() {
        //TODO
    }
}
