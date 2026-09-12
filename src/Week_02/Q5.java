package Week_02;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter feedback text: ");
        String feedback = sc.nextLine();
        printFilteredWordFrequency(feedback);
    }

    static void printFilteredWordFrequency(String feedback) {
        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};

        String cleaned = feedback.toLowerCase();
        cleaned = cleaned.replace(",", "").replace(".", "");

        String[] words = cleaned.split("\\s+");

        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            boolean isStopWord = false;
            for (String stopWord : stopWords) {
                if (word.equals(stopWord)) {
                    isStopWord = true;
                    break;
                }
            }
            if (isStopWord || word.isEmpty()) continue;

            if (frequency.containsKey(word)) {
                frequency.put(word, frequency.get(word) + 1);
            } else {
                frequency.put(word, 1);
            }
        }

        ArrayList<String> keys = new ArrayList<>(frequency.keySet());
        for (int i = 0; i < keys.size(); i++) {
            for (int j = i + 1; j < keys.size(); j++) {
                if (frequency.get(keys.get(j)) > frequency.get(keys.get(i))) {
                    String temp = keys.get(i);
                    keys.set(i, keys.get(j));
                    keys.set(j, temp);
                }
            }
        }

        for (String key : keys) {
            System.out.println(key + ": " + frequency.get(key));
        }
    }
}