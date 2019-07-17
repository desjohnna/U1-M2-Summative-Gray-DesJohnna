public class Characters {


    protected String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;
    private int lives = 3;


    private boolean running = false;

    public Characters() {
    }

    public Characters(int lives, int strength, int health, int stamina, int speed, int attackPower) {
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
        this.lives = lives;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return this.stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAttackPower() {
        return this.attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }


    //action method that all players can perform

    public boolean run() {
        System.out.println(getName() + ", you are now running at " + this.speed + " miles per hour.");

        return this.running = true;

    }

    public int attack() {
        decreaseHealth();
        System.out.println(getName() + ", your health is fading...");
        System.out.println("Health: " + this.health);
        return this.health;
    }

    public int decreaseStamina() {
        if (this.stamina <= 25) {
            System.out.println(getName() + ", you are too weak to continue");
            lives--;
            System.out.println("Lives:  " + this.lives);
            return lives;

        } else {
            this.stamina -= 25;
            System.out.println(getName() + ", your stamina has decreased by 25 points");
            System.out.println("Stamina: " + this.stamina);
        }
        return this.stamina;
    }

    public int increaseStamina() {

        this.stamina += 25;
        System.out.println(getName() + ", your stamina has increased by 25.");
        System.out.println("Stamina: " + this.stamina);
        return this.stamina;
    }

    //method decreases health by attack power
    public int decreaseHealth() {
        this.health -= attackPower;
        if (health <= 0) {
            lives--;
            System.out.println(getName() + ", your health is too low to go on, you have lost a life.");
        }
        System.out.println(getName() + ", your health has gone down " + this.attackPower + " points.");
        System.out.println("Health: " + this.health);
        return this.health;
    }

    public int heal() {
        //setting up a if/else so health cannot be healed over 100
        if (this.health <= 75) {
            this.health += 25;
            System.out.println(getName() + ", your health has increased by 25.");
            System.out.println("Health: " + this.health);
            return this.health;
        } else {
            this.health = 100;
            System.out.println(getName() + ", your health is full.");
            return this.health;
        }

    }

}
