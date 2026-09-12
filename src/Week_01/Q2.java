package Week_01;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter original text: ");
        String original = sc.nextLine();
        System.out.print("Enter typed text: ");
        String typed = sc.nextLine();
        checkTypingAccuracy(original, typed);
    }

    static void checkTypingAccuracy(String original, String typed) {
        int length = original.length();
        int matched = 0;
        int firstMismatchPos = -1;

        for (int i = 0; i < length; i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatchPos == -1) {
                firstMismatchPos = i + 1;
            }
        }

        double accuracy = ((double) matched / length) * 100;
        System.out.printf("Matched: %d/%d | Accuracy: %.2f%%", matched, length, accuracy);

        if (firstMismatchPos == -1) {
            System.out.println(" | No Mismatches");
        } else {
            char origChar = original.charAt(firstMismatchPos - 1);
            char typedChar = typed.charAt(firstMismatchPos - 1);
            System.out.println(" | First Mismatch at position " + firstMismatchPos +
                    " ('" + origChar + "' vs '" + typedChar + "')");
        }
    }
}
