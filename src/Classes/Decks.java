package Classes;

import Classes.Cards.Card;
import Classes.Cards.Environment.Firestorm;
import Classes.Cards.Environment.HeartHound;
import Classes.Cards.Environment.Winterfell;
import Classes.Cards.Minion.Special.Disciple;
import Classes.Cards.Minion.Special.Miraj;
import Classes.Cards.Minion.Special.TheCursedOne;
import Classes.Cards.Minion.Special.TheRipper;
import Classes.Cards.Minion.Standard.Berserker;
import Classes.Cards.Minion.Standard.Goliath;
import Classes.Cards.Minion.Standard.Sentinel;
import Classes.Cards.Minion.Standard.Warden;
import fileio.CardInput;

import java.util.ArrayList;

public class Decks {
    public int nrCardsInDeck;
    ArrayList<Card> cards = new ArrayList<>();

    public Decks(ArrayList<CardInput> deck) {
        nrCardsInDeck = deck.size();
        for(CardInput iter : deck)
            switch (iter.getName()) {
                case "Berserker" ->
                        cards.add(new Berserker(iter.getMana(), iter.getHealth(), iter.getAttackDamage(), iter.getDescription(), iter.getColors(), iter.getName()));
                case "Goliath" ->
                        cards.add(new Goliath(iter.getMana(), iter.getHealth(), iter.getAttackDamage(), iter.getDescription(), iter.getColors(), iter.getName()));
                case "Sentinel" ->
                        cards.add(new Sentinel(iter.getMana(), iter.getHealth(), iter.getAttackDamage(), iter.getDescription(), iter.getColors(), iter.getName()));
                case "Warden" ->
                        cards.add(new Warden(iter.getMana(), iter.getHealth(), iter.getAttackDamage(), iter.getDescription(), iter.getColors(), iter.getName()));
                case "Disciple" ->
                        cards.add(new Disciple(iter.getMana(), iter.getHealth(), iter.getDescription(), iter.getColors(), iter.getName()));
                case "Miraj" ->
                        cards.add(new Miraj(iter.getMana(), iter.getHealth(), iter.getAttackDamage(), iter.getDescription(), iter.getColors(), iter.getName()));
                case "The Cursed One" ->
                        cards.add(new TheCursedOne(iter.getMana(), iter.getHealth(), iter.getDescription(), iter.getColors(), iter.getName()));
                case "The Ripper" ->
                        cards.add(new TheRipper(iter.getMana(), iter.getHealth(), iter.getAttackDamage(), iter.getDescription(), iter.getColors(), iter.getName()));
                case "Firestorm" ->
                        cards.add(new Firestorm(iter.getName(), iter.getMana(), iter.getDescription(), iter.getColors()));
                case "Heart Hound" ->
                        cards.add(new HeartHound(iter.getName(), iter.getMana(), iter.getDescription(), iter.getColors()));
                case "Winterfell" ->
                        cards.add(new Winterfell(iter.getName(), iter.getMana(), iter.getDescription(), iter.getColors()));
        }
    }
}
