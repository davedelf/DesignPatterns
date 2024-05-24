package PatronesEstructurales.bridge.fighter;

public class MagicianFighterImpl implements Fighter{
    @Override
    public void attack() {
        System.out.println("magician attack!!");
    }

    @Override
    public void protect() {
        System.out.println("magician protect!!");

    }
}
