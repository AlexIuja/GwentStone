package Classes.Cards.Minion.Special;

import Classes.Cards.Minion.Minion;

import java.util.ArrayList;

public class Miraj extends Minion {
    public Miraj(int mana, int health, int attackDamage, String description, ArrayList<String> colors, String name) {
        super(mana, health, attackDamage, description, colors, name);
        setTank(false);
        setFrozen(false);
        specialAbility = "Skyjack";
    }

    @Override
    public void execSpecialAbility() {
        //TODO
    }
}
