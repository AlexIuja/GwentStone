package Classes.Cards.Environment;

import Classes.Cards.Card;

import java.util.Arrays;

public abstract class Environment extends Card {
    String name;
    int mana;
    String description;
    String[] colors;

    public Environment(String name, int mana, String description, String[] colors) {
        this.name = name;
        this.mana = mana;
        this.description = description;
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "Environment{" +
                "name='" + name + '\'' +
                ", mana=" + mana +
                ", description='" + description + '\'' +
                ", colors=" + Arrays.toString(colors) +
                '}';
    }

    public abstract void action();
}
