package algorithmProgram;

import java.util.Scanner;

public class AlgorithmProgram {

    static void permutations(String str, String answer) {
        if (str.length() == 0) {
            System.out.print(answer + "  ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            String left_substr = str.substring(0, i);
            String right_substr = str.substring(i + 1);
            String rest = left_substr + right_substr;
            permutations(rest, answer + character);
        }
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        String string = "ABC";
        String answer = "";

        System.out.print("\nAll possible strings are : ");
        permutations(string, answer);
    }
}
