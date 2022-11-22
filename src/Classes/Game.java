package Classes;

import Classes.Action.*;
import fileio.ActionsInput;

import java.util.ArrayList;

public class Game {
    private StartGame startGame = new StartGame();
    private ArrayList<Action> actions = new ArrayList<>();

    private int currentPlayerIdx = startGame.getStartingPlayer();

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
        for (ActionsInput actionsInput : actionList)
            switch (actionsInput.getCommand()) {
                case "getPlayerDeck" ->
                        actions.add(new GetPlayerDeck(actionsInput.getCommand(), actionsInput.getPlayerIdx()));
                case "getPlayerHero" ->
                        actions.add(new GetPlayerHero(actionsInput.getCommand(), actionsInput.getPlayerIdx()));
                case "getPlayerTurn" -> actions.add(new GetPlayerTurn(actionsInput.getCommand()));
                case "endPlayerTurn" -> actions.add(new EndPlayerTurn(actionsInput.getCommand()));
                case "placeCard" -> actions.add(new PlaceCard(actionsInput.getCommand(), actionsInput.getHandIdx()));
                case "getCardsInHand" ->
                        actions.add(new GetCardsInHand(actionsInput.getCommand(), actionsInput.getPlayerIdx()));
                case "getPlayerMana" ->
                        actions.add(new GetPlayerMana(actionsInput.getCommand(), actionsInput.getPlayerIdx()));
                case "getCardsOnTable" -> actions.add(new GetCardsOnTable(actionsInput.getCommand()));
                case "getEnvironmentCardsInHand" ->
                        actions.add(new GetEnvironmentCardsInHand(actionsInput.getCommand()));
                case "useEnvironmentCard" ->
                        actions.add(new UseEnvironmentCard(actionsInput.getCommand(), actionsInput.getHandIdx(), actionsInput.getAffectedRow()));
                case "getCardAtPosition" ->
                        actions.add(new GetCardAtPosition(actionsInput.getCommand(), actionsInput.getX(), actionsInput.getY()));
                case "cardUsesAttack" ->
                        actions.add(new CardUsesAttack(actionsInput.getCommand(), actionsInput.getCardAttacker(), actionsInput.getCardAttacked()));
                case "cardUsesAbility" ->
                        actions.add(new CardUsesAbility(actionsInput.getCommand(), actionsInput.getCardAttacker(), actionsInput.getCardAttacked()));
                case "useAttackHero" ->
                        actions.add(new UseAttackHero(actionsInput.getCommand(), actionsInput.getCardAttacker()));
                case "useHeroAbility" ->
                        actions.add(new UseHeroAbility(actionsInput.getCommand(), actionsInput.getAffectedRow()));
                case "getFrozenCardsOnTable" -> actions.add(new GetFrozenCardsOnTable(actionsInput.getCommand()));
                case "getPlayerOneWins" -> actions.add(new GetPlayerOneWins(actionsInput.getCommand()));
                case "getPlayerTwoWins" -> actions.add(new GetPlayerTwoWins(actionsInput.getCommand()));
                case "getTotalGamesPlayed" -> actions.add(new GetTotalGamesPlayed(actionsInput.getCommand()));
            }
    }

    public int getCurrentPlayerIdx() {
        return currentPlayerIdx;
    }

    public void setCurrentPlayerIdx(int currentPlayerIdx) {
        this.currentPlayerIdx = currentPlayerIdx;
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
