package java8.patterns.behavioral.stateDesignePattern;

public class StartState implements State {
    @Override
    public void doAction(Context conetxt) {
        System.out.println("Player started the state");
        conetxt.setState(this);
    }
}
