package task2;

public class Singleton {
    private static Singleton object = new Singleton();

    private Singleton() {
        System.out.println("Singleton created");
    }

    public static Singleton getObject() {
        return object;
    }
}