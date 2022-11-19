package Classes;

import Classes.Cards.Heroes.*;
import fileio.StartGameInput;

public class StartGame {
    private int playerOneDeckIdx;
    private int playerTwoDeckIdx;
    private int shuffleSeed;
    private Hero playerOneHero;
    private Hero playerTwoHero;
    private int startingPlayer;

    public StartGame(StartGameInput input, Player playerOne, Player playerTwo) {
        playerOneDeckIdx = input.getPlayerOneDeckIdx();
        playerTwoDeckIdx = input.getPlayerTwoDeckIdx();
        shuffleSeed = input.getShuffleSeed();
        switch (input.getPlayerOneHero().getName()) {
            case "Empress Thorina" ->
                    playerOne.setHero(new EmpressThorina(input.getPlayerOneHero().getMana(), input.getPlayerOneHero().getDescription(), input.getPlayerOneHero().getColors()));
            case "General Kocioraw" ->
                    playerOne.setHero(new GeneralKocioraw(input.getPlayerOneHero().getMana(), input.getPlayerOneHero().getDescription(), input.getPlayerOneHero().getColors()));
            case "King Mudface" ->
                    playerOne.setHero(new KingMudface(input.getPlayerOneHero().getMana(), input.getPlayerOneHero().getDescription(), input.getPlayerOneHero().getColors()));
            case "Lord Royce" ->
                    playerOne.setHero(new LordRoyce(input.getPlayerOneHero().getMana(), input.getPlayerOneHero().getDescription(), input.getPlayerOneHero().getColors()));
        }
        switch (input.getPlayerTwoHero().getName()) {
            case "Empress Thorina" ->
                    playerTwo.setHero(new EmpressThorina(input.getPlayerTwoHero().getMana(), input.getPlayerOneHero().getDescription(), input.getPlayerOneHero().getColors()));
            case "General Kocioraw" ->
                    playerTwo.setHero(new GeneralKocioraw(input.getPlayerTwoHero().getMana(), input.getPlayerOneHero().getDescription(), input.getPlayerOneHero().getColors()));
            case "King Mudface" ->
                    playerTwo.setHero(new KingMudface(input.getPlayerTwoHero().getMana(), input.getPlayerOneHero().getDescription(), input.getPlayerOneHero().getColors()));
            case "Lord Royce" ->
                    playerTwo.setHero(new LordRoyce(input.getPlayerTwoHero().getMana(), input.getPlayerOneHero().getDescription(), input.getPlayerOneHero().getColors()));
        }
        startingPlayer = input.getStartingPlayer();

    }

    public int getPlayerOneDeckIdx() {
        return playerOneDeckIdx;
    }

    public void setPlayerOneDeckIdx(int playerOneDeckIdx) {
        this.playerOneDeckIdx = playerOneDeckIdx;
    }

    public int getPlayerTwoDeckIdx() {
        return playerTwoDeckIdx;
    }

    public void setPlayerTwoDeckIdx(int playerTwoDeckIdx) {
        this.playerTwoDeckIdx = playerTwoDeckIdx;
    }

    public int getShuffleSeed() {
        return shuffleSeed;
    }

    public void setShuffleSeed(int shuffleSeed) {
        this.shuffleSeed = shuffleSeed;
    }

    public Hero getPlayerOneHero() {
        return playerOneHero;
    }

    public void setPlayerOneHero(Hero playerOneHero) {
        this.playerOneHero = playerOneHero;
    }

    public Hero getPlayerTwoHero() {
        return playerTwoHero;
    }

    public void setPlayerTwoHero(Hero playerTwoHero) {
        this.playerTwoHero = playerTwoHero;
    }

    public int getStartingPlayer() {
        return startingPlayer;
    }

    public void setStartingPlayer(int startingPlayer) {
        this.startingPlayer = startingPlayer;
    }
}
