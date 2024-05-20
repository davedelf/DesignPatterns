package PatronesCreacionales.prototype;

public class Magician extends Enemy{
    private int magic;

    public int getMagic() {
        return magic;
    }

    public Magician setMagic(int magic) {
        this.magic = magic;
        return this;
    }

    public Magician(Magician magician) {
        super(magician);
        if(magician!=null){
            setMagic(magician.getMagic());
        }
    }

    @Override
    public Enemy clone() {
        return new Magician(this);
    }

    public Magician(int health, int damage, int magic) {
        super(health, damage);
        this.magic = magic;
    }

    @Override
    public String toString() {
        return "Magician{" +
                "magic=" + magic +
                ", health=" + health +
                ", damage=" + damage +
                '}';
    }
}
