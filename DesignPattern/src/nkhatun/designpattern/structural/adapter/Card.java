package nkhatun.designpattern.structural.adapter;

public class Card {
    private int touchPoints;

    public Card(int touchPoints) {
        this.touchPoints = touchPoints;
    }

    public int getTouchPoints() {
        return touchPoints;
    }

    public void setTouchPoints(int touchPoints) {
        this.touchPoints = touchPoints;
    }
}
