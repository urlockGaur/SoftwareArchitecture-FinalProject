import java.util.List;
/**
 * The class Character represents a game character with health, attack, and defense strategies.
 *
 * Each character has a name, health, attack strategy, and defend strategy. The character
 * can perform an attack, defend against an opponent's attack, and display its statistics.
 *
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class Character {
    private final CharacterName name;
    private int health;
    private AttackStrategy attackStrategy;
    private DefendStrategy defendStrategy;

    /**
     * Creates a new character with the specified name, attack strategy, and defend strategy.
     *
     * @param name            The name of the character.
     * @param attackStrategy  The attack strategy of the character.
     * @param defendStrategy  The defend strategy of the character.
     */

    public Character(CharacterName name, AttackStrategy attackStrategy, DefendStrategy defendStrategy) {
        this.name = name;
        this.health = CharacterFactory.getInitialHealth(name);
        this.attackStrategy = attackStrategy;
        this.defendStrategy = defendStrategy;
    }

    /**
     * Gets the name of the character.
     *
     * @return The name of the character.
     */
    public CharacterName getName() {
        return name;
    }

    /**
     * Gets the current health of the character.
     *
     * @return The current health of the character.
     */
    public int getHealth() {
        return health;
    }

    /**
     * Sets the health of the character.
     *
     * @param health The new health value.
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Sets the attack strategy of the character.
     *
     * @param attackStrategy The new attack strategy.
     */
    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    /**
     * Sets the defend strategy of the character.
     *
     * @param defendStrategy The new defend strategy.
     */
    public void setDefendStrategy(DefendStrategy defendStrategy) {
        this.defendStrategy = defendStrategy;
    }

    /**
     * Performs an attack using the character's attack strategy.
     *
     * @return The damage inflicted by the attack.
     */
    public int attack() {
        return attackStrategy.attack();
    }

    /**
     * Defends against an opponent's attack using the character's defend strategy.
     *
     * @param opponent The opponent character.
     */
    public void defend(Character opponent) {
        int opponentAttack = opponent.attack();
        health = defendStrategy.defend(health, opponentAttack);
    }

    /**
     * Displays the statistics of the character.
     */
    public void displayStats() {
        System.out.println("Character: " + name + " | ");
        System.out.println("Health: " + health + " | ");
        System.out.println("Attack: " + attackStrategy.getClass().getSimpleName() + " | ");
        System.out.println("Attack Dmg: " + attackStrategy.attackDmg() + " | ");
        System.out.println("Defend: " + defendStrategy.getClass().getSimpleName() + "\n");
    }

    /**
     * Overrides the default toString method to provide a string representation of the character.
     *
     * @return The string representation of the character.
     */
    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
    /**
     * Removes the selected character from the list based on the provided index.
     *
     * @param characters The list of characters.
     * @param index      The index of the character to remove.
     * @return The removed character, or null.
     */
    public Character removeSelectedCharacter(List<Character> characters, int index) {
        // Ensure the index is within bounds
        if (index >= 0 && index < characters.size()) {
            return characters.get(index);
        } else {
            return null;
        }
    }
}

