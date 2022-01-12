package nkhatun.designpattern.structural.adapter;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdapterPatternTest {
    public static void main(String[] args) {

        testClassAdapter();
        testObjectAdapter();
    }
@Test
public static void testClassAdapter() {
        CardAdapter cardAdapter = new CardClassAdapterImpl();
        Card cardTitan = calculateTouchPoints(cardAdapter,1);
        Card cardPlat = calculateTouchPoints(cardAdapter,2);
        Card cardGold = calculateTouchPoints(cardAdapter,4);
        Card cardSilver = calculateTouchPoints(cardAdapter,5);
        assertEquals(100, cardTitan.getTouchPoints());
        assertEquals(50, cardPlat.getTouchPoints());
        assertEquals(25, cardGold.getTouchPoints());
        assertEquals(20, cardSilver.getTouchPoints());
}
    @Test
    private static void testObjectAdapter() {
        CardAdapter cardAdapter = new CardObjectAdapterImpl();
        Card cardTitan = calculateTouchPoints(cardAdapter,1);
        Card cardPlat = calculateTouchPoints(cardAdapter,2);
        Card cardGold = calculateTouchPoints(cardAdapter,4);
        Card cardSilver = calculateTouchPoints(cardAdapter,5);
        assertEquals(100, cardTitan.getTouchPoints());
        assertEquals(50, cardPlat.getTouchPoints());
        assertEquals(25, cardGold.getTouchPoints());
        assertEquals(20, cardSilver.getTouchPoints());
    }

    private static Card calculateTouchPoints(CardAdapter cardAdapter, int i) {
        switch (i){
            case 1: return cardAdapter.getTitaniumCardTouchPoints();
            case 2: return cardAdapter.getPlatinumCardTouchPoints();
            case 4: return cardAdapter.getGoldCardTouchPoints();
            default: return cardAdapter.getSilverCardTouchPoints();
        }
    }
}