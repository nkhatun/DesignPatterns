package nkhatun.designpattern.creational.singleton;

public class LazySingletonUsingDoubleCheckedLocking {
    /**
     * Volatile uses the latest value for the instance
     */
    private volatile static LazySingletonUsingDoubleCheckedLocking SINGLE_INSTANCE;

    private LazySingletonUsingDoubleCheckedLocking() {
    }

    /**
     *
     * Returns the lazily created single instance of this class.
     */
    public static LazySingletonUsingDoubleCheckedLocking getInstance() {
        if(SINGLE_INSTANCE == null){
            synchronized (LazySingletonUsingDoubleCheckedLocking.class){
                // Double check for the instance
                if(SINGLE_INSTANCE == null) {
                    SINGLE_INSTANCE = new LazySingletonUsingDoubleCheckedLocking();
                }
            }
        }
        return  SINGLE_INSTANCE;
    }

    }
