package Classes.Cards.Minions.Special;

import Classes.Cards.Minions.Minion;

public class TheRipper extends Minion {
    public TheRipper(int mana, int health, int attackDamage, String description, String[] colors, String name) {
        super(mana, health, attackDamage, description, colors, name);
        tank = false;
        frozen = false;
        specialAbility = "Weak Knees";
    }

    @Override
    public void execSpecialAbility() {
        //TODO
    }
}
