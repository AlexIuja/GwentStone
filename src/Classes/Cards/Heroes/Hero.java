package Classes.Cards.Heroes;

import Classes.Cards.Card;

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
}
