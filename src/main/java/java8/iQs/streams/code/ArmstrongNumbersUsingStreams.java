package java8.iQs.streams.code;

import java.util.stream.IntStream;

public class ArmstrongNumbersUsingStreams {
    public static void main(String[] args) {

        /*
        *  153 -> 1*1*1 + 5*5*5 + 3*3*3
        *             1 + 125 + 27
        *           = 153
        *
        int startRange = 1;
        int endRange = 5;

        System.out.println("Armstrong numbers between " + startRange + " and " + endRange + " are:");
        IntStream.rangeClosed(startRange, endRange)
                .filter(ArmstrongNumbersUsingStreams::isArmstrong)
                .forEach(value -> System.out.println("fina; result : "+value));*/

        System.out.println(isArmstrong(24));
    }

    private static boolean isArmstrong(int num) {
        int sumOfCubes = String.valueOf(num)
                .chars()
                .map(Character::getNumericValue)
                .map(n -> n * n * n)
                .peek(System.out::println)
                .sum();

        return sumOfCubes == num;
    }
}
