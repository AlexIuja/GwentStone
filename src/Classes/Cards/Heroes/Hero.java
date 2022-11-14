package Classes.Cards.Heroes;

import Classes.Cards.Card;

import java.util.Arrays;

public abstract class Hero extends Card {
    public int mana;
    public String description;
    public String[] colors;
    public int health = 30;
    public boolean alive = true;

    public Hero(int mana, String description, String[] colors) {
        this.mana = mana;
        this.description = description;
        this.colors = colors;
    }

    public abstract void execAbility();

    @Override
    public String toString() {
        return "Hero{" +
                "mana=" + mana +
                ", description='" + description + '\'' +
                ", colors=" + Arrays.toString(colors) +
                ", health=" + health +
                ", alive=" + alive +
                '}';
    }
}
