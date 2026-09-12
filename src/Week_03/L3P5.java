package Week_03;

public class L3P5 {
    public static void main(String[] args) {
        guessTheNumber(42, 4, new int[]{20, 60, 42});
        guessTheNumber(42, 2, new int[]{10, 15});
    }

    static void guessTheNumber(int secretNumber, int maxTries, int[] guesses) {
        int tries = 0;
        boolean guessed = false;

        while (tries < maxTries && !guessed) {
            int guess = guesses[tries];

            if (guess < secretNumber) {
                System.out.println("Too low");
            } else if (guess > secretNumber) {
                System.out.println("Too high");
            } else {
                System.out.println("Correct! You guessed it");
                guessed = true;
                break;
            }

            tries++;
        }

        if (!guessed) {
            System.out.println("Out of tries — the number was " + secretNumber);
        }
    }
}