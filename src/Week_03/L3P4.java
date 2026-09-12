package Week_03;

public class L3P4 {
    public static void main(String[] args) {
        generateFirstValidTable(new int[]{-3, 0, 7, 9});
    }

    static void generateFirstValidTable(int[] candidates) {
        for (int candidate : candidates) {
            if (candidate < 1) {
                System.out.println("Skipping invalid number: " + candidate);
                continue;
            }

            for (int i = 1; i <= 10; i++) {
                System.out.println(candidate + " x " + i + " = " + (candidate * i));
            }
            break;
        }
    }
}