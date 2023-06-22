import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scannerInput = new Scanner(System.in);
        int userInput;

        System.out.println("Enter an Integer:");

        //keep looping as long as user input is invalid
        while (true) {
            try {
                userInput = Integer.parseInt(scannerInput.next());/* Capture user input as a string and convert it to an integer to verify if the input is correct
                This allows as to catch errors resulting from inputting a non-integer*/

                if (userInput >= 0) {
                    break;
                } else {
                    System.out.println("Input should be positive:");
                }
            } catch (Exception e) {
                System.out.println("Number should be an integer:");
            }
        }
//print the sequence
        //uncomment to run the recursive approach
//        for (int i = 0; i <= userInput; i++) {
//            System.out.print(fibonacci(i) + ",");
//        }

        //dynamic approach

        dynamicFibonacci(userInput);

    }


    //recursive approach
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /*The recursive approach has an exponential runtime complexity. This is because for every fibonacci number the method is called twice hence O(2^n).
     *This can be improved using dynamic programming approach where we save each fibonacci number in an array to avoid redundant computations.
     * */

    public static void dynamicFibonacci(int input) {
        int[] fibArray = new int[input + 1];//arrays are 0 based so we have to add 1 to prevent index out of bounce exception
        fibArray[0] = 0;
        fibArray[1] = 1;

        for (int i = 2; i < fibArray.length; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }
        for (int j : fibArray) {
            System.out.print(j + ",");
        }
    }
}