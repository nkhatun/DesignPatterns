package nkhatun.designpattern.creational.singleton;

import nkhatun.designpattern.structural.adapter.Card;
import nkhatun.designpattern.structural.adapter.CardAdapter;
import nkhatun.designpattern.structural.adapter.CardClassAdapterImpl;
import nkhatun.designpattern.structural.adapter.CardObjectAdapterImpl;
import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SingletonPatternTest {
    private static final Logger log = Logger.getLogger(SingletonPatternTest.class.getName());
    public static void main(String[] args) {
        testEagerSingleton();
        testLazySingletonUsingDoubleChecked();
        testLazySingletonUsingSynchronized();
        testSingletonUsingEnum();
        testSingleton();
    }
    @Test
    private static void testEagerSingleton() {
        final EagerSingleton firstInstance = EagerSingleton.getInstance();
        final EagerSingleton secondInstance = EagerSingleton.getInstance();
        assertTrue(firstInstance == secondInstance);
        assertTrue(firstInstance.equals(secondInstance));
        log.info("Logging eager singleton..");
    }
    @Test
    private static void testSingletonUsingEnum() {
        final SingletonUsingEnum firstInstance = SingletonUsingEnum.SINGLE_INSTANCE;
        final SingletonUsingEnum secondInstance = SingletonUsingEnum.SINGLE_INSTANCE;
        assertTrue(firstInstance == secondInstance);
        assertTrue(firstInstance.equals(secondInstance));
        log.info("Logging singleton using enum..");
    }
    @Test
    private static void testLazySingletonUsingSynchronized() {
        final LazySingletonUsingSynchronizedMethod firstInstance = LazySingletonUsingSynchronizedMethod.getInstance();
        final LazySingletonUsingSynchronizedMethod secondInstance = LazySingletonUsingSynchronizedMethod.getInstance();
        assertTrue(firstInstance == secondInstance);
        assertTrue(firstInstance.equals(secondInstance));
        log.info("Logging lazy singleton using synchronized..");
    }
    @Test
    private static void testLazySingletonUsingDoubleChecked() {
        final LazySingletonUsingDoubleCheckedLocking firstInstance = LazySingletonUsingDoubleCheckedLocking.getInstance();
        final LazySingletonUsingDoubleCheckedLocking secondInstance = LazySingletonUsingDoubleCheckedLocking.getInstance();
        assertTrue(firstInstance == secondInstance);
        assertTrue(firstInstance.equals(secondInstance));
        log.info("Logging lazy singleton using double checked..");
    }

    @Test
    private static void testSingleton() {
        final SingletonHolder firstInstance = SingletonHolder.getInstance();
        final SingletonHolder secondInstance = SingletonHolder.getInstance();
        assertTrue(firstInstance == secondInstance);
        assertTrue(firstInstance.equals(secondInstance));
        log.info("Logging singleton..");
    }
}