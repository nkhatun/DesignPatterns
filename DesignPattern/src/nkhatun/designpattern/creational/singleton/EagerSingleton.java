package nkhatun.designpattern.creational.singleton;

public class EagerSingleton {
    /**
     * Here the object is created eagerly while the class is loaded first time.
     * As the member variable is static and final, only one instance gets created.
     */
    private static final EagerSingleton SINGLE_INSTANCE = new EagerSingleton();

    /**
     * private constructor prevents user for creating another instance of this class
     */
    private EagerSingleton() {
    }

    /**
     * Returns the eagerly created instance of this class
     */
    public static EagerSingleton getInstance() {
        return SINGLE_INSTANCE;
    }

}
