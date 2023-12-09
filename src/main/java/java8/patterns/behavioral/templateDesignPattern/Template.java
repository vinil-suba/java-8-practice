package java8.patterns.behavioral.templateDesignPattern;

public class Template {
    public static void main(String[] args) {
        Game cricket = new Cricket();
        cricket.play();
        Game footBall = new FootBall();
        footBall.play();
    }
}
