package java8.patterns.FactoryPattern;

public class Colgate implements FactoryToothPast {
    @Override
    public void printToothPast() {
        System.out.println("From Colgate impl");
    }
}
