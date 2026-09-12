package Week_01;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        int[] sectionA = new int[n];
        int[] sectionB = new int[n];

        System.out.println("Enter Section A quantities:");
        for (int i = 0; i < n; i++) sectionA[i] = sc.nextInt();

        System.out.println("Enter Section B quantities:");
        for (int i = 0; i < n; i++) sectionB[i] = sc.nextInt();

        analyzeInventory(sectionA, sectionB);
    }

    static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0, totalB = 0;
        for (int val : sectionA) totalA += val;
        for (int val : sectionB) totalB += val;

        String status = (totalA == totalB) ? "Balanced" : "Not Balanced";

        int maxValue = sectionA[0];
        String maxSection = "Section A";
        int maxIndex = 1;

        for (int i = 0; i < sectionA.length; i++) {
            if (sectionA[i] > maxValue) {
                maxValue = sectionA[i];
                maxSection = "Section A";
                maxIndex = i + 1;
            }
        }
        for (int i = 0; i < sectionB.length; i++) {
            if (sectionB[i] > maxValue) {
                maxValue = sectionB[i];
                maxSection = "Section B";
                maxIndex = i + 1;
            }
        }

        System.out.println("Section A Total: " + totalA + " | Section B Total: " + totalB +
                " | Status: " + status + " | Highest Quantity: " + maxValue +
                " (" + maxSection + ", Item " + maxIndex + ")");
    }
}