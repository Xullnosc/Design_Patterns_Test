package Singleton;

// Singleton.Singleton: Only one instance of a class can be created
public class Singleton {
    private static volatile Singleton instance;
    // Why do we use "volatile" variable ?
    // https://www.youtube.com/watch?v=71dgtPrbToE
    private String data;
    private Singleton(String data) {this.data = data;}
    public static Singleton getInstance(String data) {
        Singleton result = instance;
        // Double-checked locking idiom: reduce overhead of synchronization
        if (result == null) {
            synchronized (Singleton.class) {
                result = instance;
                // Calling "result" again here to avoid multiple reading
                // Using synchronized to ensure that only one instance is created across multiple threads
                if (result == null) {
                    //Chained assigning: new Singleton.Singleton(data) is assigned to both "instance" and "result"
                    instance = result = new Singleton(data);
                }
            }
        }
        return result;
    }
}
