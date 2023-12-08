public class Character {
    private String name;
    private int health;
    private AttackStrategy attackStrategy;
    private DefendStrategy defendStrategy;

    public Character(String name, int health, AttackStrategy attackStrategy, DefendStrategy defendStrategy) {
        this.name = name;
        this.health = health;
        this.attackStrategy = attackStrategy;
        this.defendStrategy = defendStrategy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setDefendStrategy(DefendStrategy defendStrategy) {
        this.defendStrategy = defendStrategy;
    }

    public int attack() {
        return attackStrategy.attack();
    }

    public void defend(int attack) {
        health = (int) (health - defendStrategy.defend(attack));
    }

    public void displayStats() {
        System.out.println("Character: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack: " + attackStrategy.getClass().getSimpleName());
        System.out.println("Defend: " + defendStrategy.getClass().getSimpleName());
        System.out.println("---------------------");
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}

