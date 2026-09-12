package Week_03;

public class L1P4 {
    public static void main(String[] args) {
        sumOfNaturalNumbers(5);
    }

    static void sumOfNaturalNumbers(int n) {
        int counter = 1;
        int sum = 0;
        while (counter <= n) {
            sum += counter;
            counter++;
        }
        System.out.println("Sum of numbers from 1 to " + n + " = " + sum);
    }
}