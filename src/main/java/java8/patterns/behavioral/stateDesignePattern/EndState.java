package java8.patterns.behavioral.stateDesignePattern;

public class EndState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Player ended the state");
        context.setState(this);
    }
}
