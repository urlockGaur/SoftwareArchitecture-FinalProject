
public class Game {
    private static Game instance;

    private Game() {

    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }

    public boolean isGameDone(Character a, Character b) {
        return a.getHealth() > 0 && b.getHealth() > 0;
    }

    public void fight(Character a, Character b) {
        int aAttack = a.attack();
        int bAttack = b.attack();
        a.defend(bAttack);
        b.defend(aAttack);
        System.out.println("==============");
        System.out.println("Attack: " + aAttack);
        System.out.println("Attack: " + bAttack);
        System.out.println(a);
        System.out.println(b);
    }
}
