package nkhatun.designpattern.structural.adapter;

public class CardClassAdapterImpl extends GeneratorMachine implements CardAdapter{

    @Override
    public Card getSilverCardTouchPoints() {
        Card card = getTouchPoints();
        return calculateTouchPoints(card,5);
    }

    @Override
    public Card getGoldCardTouchPoints() {
        Card card = getTouchPoints();
        return calculateTouchPoints(card,4);
    }

    @Override
    public Card getPlatinumCardTouchPoints() {
        Card card = getTouchPoints();
        return calculateTouchPoints(card,2);    }

    @Override
    public Card getTitaniumCardTouchPoints() {
        return getTouchPoints();  }

    private Card calculateTouchPoints(Card type, int score){
    return new Card(type.getTouchPoints()/ score);
    }
}
