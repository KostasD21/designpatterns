import singleton.Singleton;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.initialize();
        Singleton singleton1 = Singleton.initialize();

        System.out.println(singleton);
        System.out.println(singleton1);

    }

}
