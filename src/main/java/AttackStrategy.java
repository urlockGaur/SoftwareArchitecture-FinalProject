/**
 * The interface Attack strategy.
 * Part of the Strategy Pattern requirement of project
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public interface AttackStrategy {
    /**
     * Executes the attack strategy and returns the resulting damage.
     *
     * @return The damage inflicted by the attack.
     */
    public int attack();

    /**
     * Retrieves the base damage associated with the attack strategy.
     *
     * @return The base damage of the attack.
     */
    public int attackDmg();
}
