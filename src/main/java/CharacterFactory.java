

public class CharacterFactory {
    private static UI ui = new UI();
    public static Character getCharacter() {
        String name = ui.getName();
        int health = ui.getHealth();
        AttackStrategy attackStrategy = ui.getAttackStrategy();
        DefendStrategy defendStrategy = ui.getDefendStrategy();
        return  new Character(name, health, attackStrategy, defendStrategy);
    }
}