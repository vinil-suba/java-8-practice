package java8.iQs.streams.code;

// is equalTo perfect square root or not!
public class FibonacciSeries {

    /*
    Fibonacci series -> 1,1, 2, 3, 5, 8, 13, 21, 34. etc..
    * */

    public static void main(String[] args) {
        int numberToCheck = 13;  // Change this to the number you want to check
        getTheValue();
        if (isFibonacci(numberToCheck)) {
            System.out.println(numberToCheck + " is a Fibonacci number.");
        } else {
            System.out.println(numberToCheck + " is not a Fibonacci number.");
        }
    }

    public static boolean isPerfectSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }

    public static boolean isFibonacci(int number) {
        if (number < 0) {
            return false;
        }

        return isPerfectSquare(5 * number * number + 4) ||
                isPerfectSquare(5 * number * number - 4);
    }
    // in old way we use this....

    public static void getTheValue() {
        int a = 1, b = 1, c = 0;
        System.out.print("1, 1,");
        int untilWhatNumberToFindFibonacci = 15;
        while(c < untilWhatNumberToFindFibonacci) {
            c = a+b;
            System.out.print(c + ", ");
            a = b;
            b = c;
        }
    }
}
