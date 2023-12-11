/**
 * The interface Defend strategy.
 * Part of the Strategy Pattern requirement of project
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public interface DefendStrategy {

    /**
     * Defends against an opponent's attack, considering the current health and opponent's attack.
     *
     * @param currentHealth The current health of the defending entity.
     * @param opponentAttack The attack damage inflicted by the opponent.
     * @return The updated health after defending against the opponent's attack.
     */
    int defend(int currentHealth, int opponentAttack);
}