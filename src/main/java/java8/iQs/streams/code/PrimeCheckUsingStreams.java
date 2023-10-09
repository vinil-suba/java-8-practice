package java8.iQs.streams.code;

import java.util.stream.LongStream;

// given number is divided by 2 or not!
public class PrimeCheckUsingStreams {
    public static void main(String[] args) {
        findGivenNumberIsPrimeOrNot();
    }

    private static void findGivenNumberIsPrimeOrNot() {
        boolean checkPrime = LongStream.rangeClosed(2, (long)Math.sqrt(10))
                .noneMatch(value -> value % 2 == 0);

        System.out.println("Given Number is prime: "+ checkPrime);
    }
}
