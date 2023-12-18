package java8.patterns.behavioral.stratagy;

public class App {
    public static void main(String[] args) {

        Context context = new Context(new OperationAdd());
        System.out.println("Addition: "+ context.executeStrategy(1,2));

        Context context1 = new Context(new Substraction());
        System.out.println("Substraction: "+ context1.executeStrategy(10,5));

        Context context2 = new Context(new OperationMultiplication());
        System.out.println("Multiplication: "+ context2.executeStrategy(2,5));

        Context context3 = new Context(new OperationDevision());
        System.out.println("Devision: "+ context3.executeStrategy(2,5));


    }
}
