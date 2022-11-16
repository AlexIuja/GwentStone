package Classes.Cards.Minion.Standard;

import Classes.Cards.Minion.Minion;

import java.util.ArrayList;

public class Goliath extends Minion {
    public Goliath(int mana, int health, int attackDamage, String description, ArrayList<String> colors, String name) {
        super(mana, health, attackDamage, description, colors, name);
        setTank(true);
        setFrozen(false);
    }

    @Override
    public void execSpecialAbility() {
        // this card doesn't have a special ability, so we leave this method empty
    }
}
