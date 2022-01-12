package nkhatun.designpattern.structural.adapter;

public class CardObjectAdapterImpl implements CardAdapter{
    private GeneratorMachine generatorMachine = new GeneratorMachine();
    @Override
    public Card getSilverCardTouchPoints() {
        Card card = generatorMachine.getTouchPoints();
        return calculateTouchPoints(card,5);
    }

    @Override
    public Card getGoldCardTouchPoints() {
        Card card = generatorMachine.getTouchPoints();
        return calculateTouchPoints(card,4);
    }

    @Override
    public Card getPlatinumCardTouchPoints() {
        Card card = generatorMachine.getTouchPoints();
        return calculateTouchPoints(card,2);
    }

    @Override
    public Card getTitaniumCardTouchPoints() {
        return generatorMachine.getTouchPoints();
    }

    private Card calculateTouchPoints(Card type, int score){
        return new Card(type.getTouchPoints()/ score);
    }
}
