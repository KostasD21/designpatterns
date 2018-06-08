package singleton;

/**
 * This class represents a singleton, which means that only one instance of this class can live in JVM
 */
public class Singleton {
    /**
     * The instance that was initialized
     */
    private static Singleton INSTANCE;

    /**
     * Private constructor in order to override the default public constructor
     */
    private Singleton() {

    }

    /**
     * This method checks if an instance is already initialized
     */
    public static Singleton initialize() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
