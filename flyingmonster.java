public class FlyingMonster extends Monster {
    private int wingSpan;

    public FlyingMonster(String name, String color, int strength, int speed, int wingSpan) {
        super(name, color, strength, speed);
        this.wingSpan = wingSpan;
    }

    @Override
    public void performSpecialAbility() {
        System.out.println(name + " is flying with a wingspan of " + wingSpan + " meters!");
    }

    @Override
    public String toString() {
        return super.toString() + "," + wingSpan;
    }
}
