package algorithmProgram;

import java.util.Scanner;

public class AlgorithmProgram {


    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number, temperory, remainder, i;
        int count = 0;
        int sum = 0;

        System.out.println("Enter number to check");
        number = scanner.nextInt();

        temperory = number;

        //use for loop check whether number is prime or not
        for (i = 1; i <= temperory; i++) {
            if (temperory % i == 0) {

                count++;
            }
        }
        while (number > 0) {
            remainder = number % 10;
            sum = sum * 10 + remainder;
            number = number / 10;
        }

        //check whether the number is palindrome and Prime or not
        if (temperory == sum && count == 2) {
            System.out.println(temperory + " is a PalPrime number");
        } else {
            System.out.println(temperory + " is not a PalPrime number");
        }
    }
}