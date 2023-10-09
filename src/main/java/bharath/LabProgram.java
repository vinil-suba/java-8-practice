package bharath;

import java.util.Arrays;
import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        getTheBuggiestNumberInGivenArray();
    }

    private static void getTheBuggiestNumberInGivenArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter how many number you wish to add");
        int length = sc.nextInt();

        // create a Inter array to save user input
        Integer[] input = new Integer[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Please enter the "+ (i+1) +" elements");
            input[i] = sc.nextInt();
        }

        System.out.println("The Integer array input from user is : ");
        System.out.println(Arrays.toString(input));
//        Integer[] givenArray = new Integer[] {1,22,55,33,44, 12, 0, -1};
        int biggerstNumber = 0;
        // If we replace < from > the logic will become as Find the smallest integer value
        for (int a = 0; a < input.length; a++) {
            if( biggerstNumber < input[a])
                biggerstNumber = input[a];
        }
        System.out.println("The biggest number is: "+ biggerstNumber);
    }
}
