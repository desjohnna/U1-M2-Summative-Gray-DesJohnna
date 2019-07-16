public class Warrior extends Characters {

    protected int shieldStrength = 100;

    public Warrior() {
        super(3,75, 100, 100, 50, 10);
    }


    public void decreaseShieldStrength() {
        shieldStrength -= this.attack();
    }


}