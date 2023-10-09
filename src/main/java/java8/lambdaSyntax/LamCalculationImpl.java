package java8.lambdaSyntax;

import java.util.function.IntBinaryOperator;

class LambdaCalculationImpl{

    public static void main(String[] args) {

        Calculation addition = (value1, value2) -> {
            //business logic
            System.out.println("Method Addition : "+ (value1 + value2));
        };

        Calculation multiplication = (value1, value2) -> {
            //business logic
            System.out.println("Method Multiplication : "+ value1 * value2);
        };

        IntBinaryOperator division = (value1, value2) -> {
            //business logic
            int finalResult =  value1 / value2;
            System.out.println("Override Method Division from block   : "+ finalResult);
            return finalResult;
        };

        addition.calculate(1,2);
        multiplication.calculate(2,3);
        System.out.println(division.applyAsInt(3,3));
    }
}
