package java8.patterns.singalTon;

public class AccessSingleTon {
    public static void main(String[] args) {
        SingleTonPattern instance1 = SingleTonPattern.getInstance();
        System.out.println(instance1 + "-- instance1");
        SingleTonPattern instance2 = SingleTonPattern.getInstance();
        System.out.println(instance2 + "Instance 2");
    }
}
