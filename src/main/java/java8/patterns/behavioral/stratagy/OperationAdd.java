package java8.patterns.behavioral.stratagy;

public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        int c = a + b;
        return c;
    }
}
