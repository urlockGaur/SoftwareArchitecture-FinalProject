import java.util.ArrayList;
import java.util.List;
/**
 * The class CharacterFactory is responsible for creating characters and providing initial health values.
 * The Factory Method was part of the project requirements
 *
 * The factory creates a list of characters with different attack and defend strategies. It also
 * contains a method to retrieve the initial health based on the character's name.
 *
 * @author Anthony Framke
 * @version 1.0
 * @since 12/10/2023
 */
public class CharacterFactory {
    private static UI ui = new UI();

    public static List<Character> createCharacters() {
        List<Character> characters = new ArrayList<>();

        /**
         * Creates a list of characters with different attack and defend strategies.
         *
         * @return The list of characters.
         */

        characters.add(new Character(CharacterName.FREEZE, new FrostPunchAttack(), new IceWallDefend()));
        characters.add(new Character(CharacterName.VULKANO, new FireBreathAttack(), new BoulderDefend()));
        characters.add(new Character(CharacterName.STRYKER,  new OneInchPunchAttack(), new PoorlyTrainedDefend()));
        characters.add(new Character(CharacterName.CYRPTARQ, new EnergyBlastAttack(), new BlastShieldDefend()));
        characters.add(new Character(CharacterName.ROGAL, new EmperorsBladeAttack(), new UnbreakableShieldDefend()));
        characters.add(new Character(CharacterName.TANITH, new HiddenBladeAttack(), new CamoCloakDefend()));
        characters.add(new Character(CharacterName.QUAKE, new ThunderousKickAttack(), new SeismicBlockDefend()));
        characters.add(new Character(CharacterName.VEE, new ShimmerSwordAttack(), new BladeParryDefend()));

        return characters;
    }
    /**
     * Retrieves the initial health based on the character's name.
     *
     * @param characterName The name of the character.
     * @return The initial health of the character.
     */
    public static int getInitialHealth(CharacterName characterName) {
        // Logic to determine and return the initial health based on the character type
        // For example:
        switch (characterName) {
            case FREEZE:
                return 100;
            case VULKANO:
                return 110;
            case STRYKER:
                return 85;
            case CYRPTARQ:
                return 95;
            case ROGAL:
                return 100;
            case TANITH:
                return 90;
            case QUAKE:
                return 100;
            case VEE:
                return 100;
            default:
                return 100; // Default initial health
        }
    }
}