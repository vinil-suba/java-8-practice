package java8.patterns.behavioral.templateDesignPattern;

public interface Game {
    /*
    We kept some of the rules in template each and every,
    the client need to be provided the actual call
    * */
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public default void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
