package Week_01;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter signal log: ");
        String signalLog = sc.nextLine();
        findLongestStreak(signalLog);
    }

    static void findLongestStreak(String signalLog) {
        if (signalLog.length() == 0) {
            System.out.println("Empty signal log");
            return;
        }

        char longestChar = signalLog.charAt(0);
        int longestCount = 1;
        char currentChar = signalLog.charAt(0);
        int currentCount = 1;

        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == currentChar) {
                currentCount++;
            } else {
                currentChar = signalLog.charAt(i);
                currentCount = 1;
            }
            if (currentCount > longestCount) {
                longestCount = currentCount;
                longestChar = currentChar;
            }
        }

        System.out.println("Longest Streak: '" + longestChar + "' repeated " + longestCount + " times");
    }
}