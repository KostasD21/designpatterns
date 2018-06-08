/**
 * This class represents a singleton, which means that only one instance of this class can live in JVM
 */
class Singleton {
    /**
     * The instance that was initialized
     */
    static Singleton INSTANCE;
    /**
     * The flag that helps to determine if an instance already initialized
     */
    private static boolean init = false;

    /**
     * Private constructor in order to override the default public constructor
     */
    private Singleton() {

    }

    /**
     * This method checks if an instance is already initialized
     */
    static void initialize() {
        if (!init) {
            init = true;
            INSTANCE = new Singleton();
        }
    }
}
