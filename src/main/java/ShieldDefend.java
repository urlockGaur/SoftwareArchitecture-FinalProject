public class ShieldDefend implements DefendStrategy {
    @Override
    public int defend(int attack) {
        return attack / 2;
    }
}
