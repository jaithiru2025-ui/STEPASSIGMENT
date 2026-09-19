package Week_7;

class Character {
    private final int maxHealth;
    private int health;

    Character(int maxHealth) {
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    void takeDamage(int amount) {
        int newHealth = health - amount;
        health = Math.max(newHealth, 0); // floor at 0
    }

    void heal(int amount) {
        int newHealth = health + amount;
        health = Math.min(newHealth, maxHealth); // cap at max
    }

    int getHealth() {
        return health;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Character c = new Character(100);

        c.takeDamage(30);
        System.out.println("After takeDamage(30): " + c.getHealth());

        c.heal(50);
        System.out.println("After heal(50) [capped]: " + c.getHealth());

        c.takeDamage(150);
        System.out.println("After takeDamage(150) [floored]: " + c.getHealth());
    }
}