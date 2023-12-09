package java8.patterns.behavioral.templateDesignPattern;

public class Cricket implements Game {
    @Override
    public void initialize() {
        System.out.println("Cricker initalizing");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket start");
    }

    @Override
    public void endPlay() {
        System.out.println("Cricket ends");
    }
}
