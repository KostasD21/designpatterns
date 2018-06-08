public class Main {

    public static void main(String[] args) {
        Singleton.initialize();
        Singleton singleton = Singleton.INSTANCE;
        Singleton.initialize();
        Singleton singleton1 = Singleton.INSTANCE;

        System.out.println(singleton);
        System.out.println(singleton1);

    }

}
