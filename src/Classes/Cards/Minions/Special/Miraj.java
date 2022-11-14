package Classes.Cards.Minions.Special;

import Classes.Cards.Minions.Minion;

public class Miraj extends Minion {
    public Miraj(int mana, int health, int attackDamage, String description, String[] colors, String name) {
        super(mana, health, attackDamage, description, colors, name);
        tank = false;
        frozen = false;
        specialAbility = "Skyjack";
    }

    @Override
    public void execSpecialAbility() {
        //TODO
    }
}
