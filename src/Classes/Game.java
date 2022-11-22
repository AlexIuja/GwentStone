package Classes;

import Classes.Action.*;
import fileio.ActionsInput;

import java.util.ArrayList;

public class Game {
    private StartGame startGame;
    private ArrayList<Action> actions = new ArrayList<>();

    private int playerTurn;
    private Player playerOne;
    private Player playerTwo;

    private Decks playingPlayerOne;
    private Decks playingPlayerTwo;

    public Decks getPlayingPlayerOne() {
        return playingPlayerOne;
    }

    public void setPlayingPlayerOne(Decks playingPlayerOne) {
        this.playingPlayerOne = playingPlayerOne;
    }

    public Decks getPlayingPlayerTwo() {
        return playingPlayerTwo;
    }

    public void setPlayingPlayerTwo(Decks playingPlayerTwo) {
        this.playingPlayerTwo = playingPlayerTwo;
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(Player playerOne) {
        this.playerOne = playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(Player playerTwo) {
        this.playerTwo = playerTwo;
    }

    public void initActionList(ArrayList<ActionsInput> actionList) {
        for(int i = 0; i < actionList.size(); i++)
            if(actionList.get(i).getCommand().equals("getPlayerDeck"))
                actions.add(new GetPlayerDeck(actionList.get(i).getCommand(), actionList.get(i).getPlayerIdx()));
            else if(actionList.get(i).getCommand().equals("getPlayerHero"))
                actions.add(new GetPlayerHero(actionList.get(i).getCommand(), actionList.get(i).getPlayerIdx()));
            else if(actionList.get(i).getCommand().equals("getPlayerTurn"))
                actions.add(new GetPlayerTurn(actionList.get(i).getCommand()));
            else if(actionList.get(i).getCommand().equals("endPlayerTurn"))
                actions.add(new EndPlayerTurn(actionList.get(i).getCommand()));
            else if(actionList.get(i).getCommand().equals("placeCard"))
                actions.add(new PlaceCard(actionList.get(i).getCommand(), actionList.get(i).getHandIdx()));
            

    }


    public int getPlayerTurn() {
        return playerTurn;
    }

    public void setPlayerTurn(int playerTurn) {
        this.playerTurn = playerTurn;
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
