package Week_03;

public class L3P1 {
    public static void main(String[] args) {
        printNumberPyramid(4);
    }

    static void printNumberPyramid(int n) {
        for (int row = 1; row <= n; row++) {
            StringBuilder line = new StringBuilder();
            for (int col = 1; col <= row; col++) {
                line.append(row).append(" ");
            }
            System.out.println(line.toString().trim());
        }
    }
}