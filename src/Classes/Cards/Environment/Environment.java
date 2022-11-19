package Classes.Cards.Environment;

import Classes.Cards.Card;

import java.util.ArrayList;

public abstract class Environment extends Card {
    private String name;
    private int mana;
    private String description;
    private ArrayList<String> colors;

    public Environment(String name, int mana, String description, ArrayList<String> colors) {
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
                ", colors=" + colors +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    public abstract void action();
}
