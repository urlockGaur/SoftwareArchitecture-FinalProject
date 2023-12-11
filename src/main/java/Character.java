import java.util.List;

public class Character {
    private final CharacterName name;
    private int health;
    private AttackStrategy attackStrategy;
    private DefendStrategy defendStrategy;

    public Character(CharacterName name, AttackStrategy attackStrategy, DefendStrategy defendStrategy) {
        this.name = name;
        this.health = CharacterFactory.getInitialHealth(name);
        this.attackStrategy = attackStrategy;
        this.defendStrategy = defendStrategy;
    }

    public CharacterName getName() {
        return name;
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

    public void defend(Character opponent) {
        int opponentAttack = opponent.attack();
        health = defendStrategy.defend(health, opponentAttack);
    }

    public void displayStats() {
        System.out.println("Character: " + name + " | ");
        System.out.println("Health: " + health + " | ");
        System.out.println("Attack: " + attackStrategy.getClass().getSimpleName() + " | ");
        System.out.println("Attack Dmg: " + attackStrategy.attackDmg() + " | ");
        System.out.println("Defend: " + defendStrategy.getClass().getSimpleName() + "\n");
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
    public Character removeSelectedCharacter(List<Character> characters, int index) {
        // Ensure the index is within bounds
        if (index >= 0 && index < characters.size()) {
            return characters.get(index);
        } else {
            return null;
        }
    }
}

