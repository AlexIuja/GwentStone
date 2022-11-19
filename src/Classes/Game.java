package Classes;

import Classes.Cards.Card;
import fileio.ActionsInput;
import fileio.StartGameInput;

import java.util.ArrayList;

public class Game {
    private StartGame startGame;
    private ArrayList<Action> actions;

    public void createActionList(ArrayList<ActionsInput> actionList) {
        for(ActionsInput iter : actionList)
            actions.add(new Action(iter.getCommand(), iter.getHandIdx(), new Coordinates(iter.getCardAttacker().getX(), iter.getCardAttacker().getY()), new Coordinates(iter.getCardAttacked().getX(), iter.getCardAttacked().getY()), iter.getAffectedRow(), iter.getPlayerIdx(), iter.getX(), iter.getY()));
    }


    public StartGame getStartGame() {
        return startGame;
    }

    public void setStartGame(StartGame startGame) {
        this.startGame = startGame;
    }

    public ArrayList<Action> getActions() {
        return actions;
    }

    public void setActions(ArrayList<Action> actions) {
        this.actions = actions;
    }
}
