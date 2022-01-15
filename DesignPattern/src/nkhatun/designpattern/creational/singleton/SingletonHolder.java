package nkhatun.designpattern.creational.singleton;

public class SingletonHolder {
    private SingletonHolder(){}

    private static class Singleton{
        private static final SingletonHolder SINGLE_INSTANCE = new SingletonHolder();
    }
    /**
     * On the first execution of SingletonHolder.getInstance(), Singleton is loaded
     * and instance is returned
     */
    public static SingletonHolder getInstance() {
        return Singleton.SINGLE_INSTANCE;
    }
}
