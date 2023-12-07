
import java.util.Scanner;  // Import the Scanner class

public class UI {
    Scanner keyboard = new Scanner(System.in);

    public String getName() {
        System.out.print("Please enter Player's Name: ");
        return keyboard.nextLine();
    }
    public int getHealth() {
        System.out.print("Please enter Player's Health (30-100): ");
        return Integer.parseInt(keyboard.nextLine());
    }
    public AttackStrategy getAttackStrategy() {
        System.out.println("1. Arrow Attack");
        System.out.println("2. Empty Hand Attack");
        System.out.println("3. Sword Attack");
        System.out.print("==> ");
        char answer = keyboard.nextLine().charAt(0);
        switch (answer) {
            case 1: return new ArrowAttack();
            case 2: return new EmptyHandAttack();
            case 3: return new SwordAttack();
        }
        return new EmptyHandAttack();
    }

    public DefendStrategy getDefendStrategy() {
        System.out.println("1. Hand Defense");
        System.out.println("2. Shield Defense");
        System.out.print("==> ");
        char answer = keyboard.nextLine().charAt(0);
        switch (answer) {
            case 1: return new HandDefend();
            case 2: return new ShieldDefend();
        }
        return new HandDefend();
    }

}

