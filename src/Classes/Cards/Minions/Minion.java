package Classes.Cards.Minions;

import Classes.Cards.Card;

import java.util.Arrays;

public abstract class Minion extends Card {
    public int mana;
    public int health;
    public int attackDamage;
    public String description;
    public String[] colors;
    public String name;
    public boolean tank;
    public boolean frozen;
    public String specialAbility;


    public Minion(int mana, int health, int attackDamage, String description, String[] colors, String name) {
        this.mana = mana;
        this.health = health;
        this.attackDamage = attackDamage;
        this.description = description;
        this.colors = colors;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Minion{" +
                "mana=" + mana +
                ", health=" + health +
                ", attackDamage=" + attackDamage +
                ", description='" + description + '\'' +
                ", colors=" + Arrays.toString(colors) +
                ", name='" + name + '\'' +
                ", tank=" + tank +
                ", frozen=" + frozen +
                ", specialAbility='" + specialAbility + '\'' +
                '}';
    }

    public abstract void execSpecialAbility();
}
