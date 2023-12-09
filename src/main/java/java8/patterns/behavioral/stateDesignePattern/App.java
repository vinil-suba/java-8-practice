package java8.patterns.behavioral.stateDesignePattern;

import java8.patterns.behavioral.stateDesignePattern.State;

public class App {
    public static void main(String[] args) {
        Context context = new Context();

        State startState = new StartState();
        startState.doAction(context);

        State endState = new EndState();
        endState.doAction(context);
    }
}
