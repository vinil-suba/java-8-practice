package practice.abs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class Challenge {
    public static void main(String[] args) {
        reverseTheString("vinilSuba");
    }

    private static void reverseTheString(String input) {
        char[] chars = input.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i =  chars.length -1 ; i >= 0; i--) {
            stringBuffer.append(chars[i]);
        }
        System.out.println("Reverse String: "+stringBuffer);

        StringBuffer stringReverse = new StringBuffer(input)
                .reverse();
        System.out.println(stringReverse+" -- Adv");

        getReverseStringWithStreams(input);
    }

    private static void getReverseStringWithStreams(String input) {
//        Arrays.stream(input.toCharArray()).mapToObj(c -> (char) c);

    }
}
