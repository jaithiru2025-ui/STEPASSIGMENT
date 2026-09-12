package Week_03;

public class L2P5 {
    public static void main(String[] args) {
        checkPrime(17);
        checkPrime(18);
    }

    static void checkPrime(int number) {
        boolean isPrime = true;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}