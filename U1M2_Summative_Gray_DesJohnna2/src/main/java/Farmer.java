public class Farmer extends Characters {

    private int harvest = 0;
    private int plow = 10;


    public Farmer() {
        super(3, 75, 100, 75, 10, 1);
    }

    //Farmer only methods

    //decrements plow and increments harvest
    public void plow() {
        if (plow >= 1) {
            plow--;
            harvest++;
            System.out.println(getName() + ", you must be tired from working all day. You earned a harvest!");
        } else {
            System.out.println("Sorry " + getName() + ", your plows are all broken down.");
        }

    }

    //decrements the harvest and fills health to 100
    public int harvest() {

        if (harvest >= 1) {
            harvest--;
            System.out.println(getName() + ", you have used a harvest, you strength is now full.");
            System.out.println("Harvests: " + this.harvest);
            this.setStrength(100);
            System.out.println("Strength: " + this.getStrength());
            return this.harvest;
        } else {
            System.out.println("Sorry " + getName() + "you do not have any crops to harvest, you'll need to plow the fields first.");
        }
        return this.harvest;
    }


}
