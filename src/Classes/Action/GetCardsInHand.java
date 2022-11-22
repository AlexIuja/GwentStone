package Classes.Action;

public class GetCardsInHand extends Action{
    private int playerIdx;
    public GetCardsInHand(String command, int playerIdx) {
        super(command);
        this.playerIdx = playerIdx;
    }


    public int getPlayerIdx() {
        return playerIdx;
    }

    public void setPlayerIdx(int playerIdx) {
        this.playerIdx = playerIdx;
    }
}
