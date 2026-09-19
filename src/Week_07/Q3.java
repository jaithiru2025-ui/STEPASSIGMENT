package Week_7;

class PasswordChecker {
    private final String password;

    PasswordChecker(String password) {
        this.password = password;
        // No getter for 'password' exists anywhere in this class
    }

    String getStrength() {
        int length = password.length();
        if (length < 6) {
            return "Weak";
        } else if (length < 10) {
            return "Medium";
        } else {
            return "Strong";
        }
    }
}

public class Q3 {
    public static void main(String[] args) {
        PasswordChecker pc = new PasswordChecker("abcd");
        System.out.println("\"abcd\" -> " + pc.getStrength());

        PasswordChecker pc2 = new PasswordChecker("abcdefgh");
        System.out.println("\"abcdefgh\" -> " + pc2.getStrength());

        PasswordChecker pc3 = new PasswordChecker("abcdefghij");
        System.out.println("\"abcdefghij\" -> " + pc3.getStrength());
    }
}