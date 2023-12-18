package java8.patterns.singalTon;

public class SingleTonPattern {
    private static final SingleTonPattern singleTonInstance = new SingleTonPattern();

    private SingleTonPattern() {}

    public static SingleTonPattern  getInstance() {
        return singleTonInstance;
    }
 }
