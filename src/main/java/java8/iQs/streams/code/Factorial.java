package java8.iQs.streams.code;

import java.util.OptionalLong;
import java.util.stream.LongStream;

// ex: 5 == 5*4*3*2*1 = 120 etc...
public class Factorial {
    public static void main(String[] args) {
        findFactorial(5);
    }

    private static void findFactorial(int number) {
        if (0 < number) {
            LongStream longStream = LongStream.rangeClosed(1, number);
            long reduce = longStream.reduce((x, y) -> x * y).orElse(0);
                System.out.println(reduce + " -- reduce");
        }
    }
}
