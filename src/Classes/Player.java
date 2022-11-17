package Classes;

import Classes.Cards.Heroes.*;
import fileio.CardInput;
import fileio.DecksInput;

import java.util.ArrayList;

public class Player {
    private int nrDecks;
    private Hero hero = null;
    private ArrayList<Decks> decks = new ArrayList<>();

    public void setHero(CardInput input) {
        switch (input.getName()) {
            case "Empress Thorina" ->
                    hero = new EmpressThorina(input.getMana(), input.getDescription(), input.getColors());
            case "General Kocioraw" ->
                    hero = new GeneralKocioraw(input.getMana(), input.getDescription(), input.getColors());
            case "King Mudface" -> hero = new KingMudface(input.getMana(), input.getDescription(), input.getColors());
            case "Lord Royce" -> hero = new LordRoyce(input.getMana(), input.getDescription(), input.getColors());
        }
    }

    public Player(DecksInput input) {
        nrDecks = input.getNrDecks();
        for(int counterDecks = 0; counterDecks < nrDecks; counterDecks++)
            decks.add(counterDecks, new Decks(input.getDecks().get(counterDecks)));

    }

    public int getNrDecks() {
        return nrDecks;
    }

    public void setNrDecks(int nrDecks) {
        this.nrDecks = nrDecks;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public ArrayList<Decks> getDecks() {
        return decks;
    }

    public void setDecks(ArrayList<Decks> decks) {
        this.decks = decks;
    }


}
