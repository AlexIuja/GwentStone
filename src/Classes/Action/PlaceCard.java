package Classes.Action;

public class PlaceCard extends Action{
    private int handIdx;

    public PlaceCard(String command, int handIdx) {
        super(command);
        this.handIdx = handIdx;
    }
}
