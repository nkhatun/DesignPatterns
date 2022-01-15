package nkhatun.designpattern.creational.singleton;

public class LazySingletonUsingSynchronizedMethod {
    private static LazySingletonUsingSynchronizedMethod SINGLE_INSTANCE;
    private LazySingletonUsingSynchronizedMethod() {
    }

    /**
     * This method call is more expensive than double check singleton, as the entire method is synchronized
     */
    public synchronized static LazySingletonUsingSynchronizedMethod getInstance() {
        if (SINGLE_INSTANCE == null) {
            SINGLE_INSTANCE = new LazySingletonUsingSynchronizedMethod();
        }
        // most of the time we just drop straight down to here and return the single instance
        return SINGLE_INSTANCE;
    }

}
