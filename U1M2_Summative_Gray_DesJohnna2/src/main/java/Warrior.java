public class Warrior extends Characters {

    protected int shieldStrength = 100;

    public Warrior() {
        super(3, 75, 100, 100, 50, 10);
    }


    //Warrior only method

    //decreases shield strength
    public void decreaseShieldStrength() {
        shieldStrength -= this.getAttackPower();
        System.out.println("Your Shield Strength has been decreased " + this.getAttackPower() + " points.");
        System.out.println("Shield Strength: " + this.shieldStrength);
    }


}