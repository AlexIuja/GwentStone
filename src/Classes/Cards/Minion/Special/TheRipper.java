package Classes.Cards.Minion.Special;

import Classes.Cards.Minion.Minion;

import java.util.ArrayList;

public class TheRipper extends Minion {
    public TheRipper(int mana, int health, int attackDamage, String description, ArrayList<String> colors, String name) {
        super(mana, health, attackDamage, description, colors, name);
        setTank(false);
        setFrozen(false);
        specialAbility = "Weak Knees";
    }

    @Override
    public void execSpecialAbility() {
        //TODO
    }
}
