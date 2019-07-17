import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Farmer farmer1 = new Farmer();
        Warrior warrior1 = new Warrior();
        Constable constable1 = new Constable();


        //Start of game, player 1 pick your character.
        System.out.println("Player 1 please select your character:\n1. Farmer\n2. Warrior\n3. Constable\n" +
                "     Please enter 1, 2 or 3:");
        Scanner scanner = new Scanner(System.in);
        int characterNum = scanner.nextInt();

        //This scanner is stopping the next scanner from skipping the user input
        scanner.nextLine();

        //Asking for name
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();

        //character assignment
        if (characterNum == 1) {

            farmer1.setName(name);
            System.out.println("Hello " + farmer1.getName() + ".");

        } else if (characterNum == 2) {


            warrior1.setName(name);
            System.out.println("Hello " + warrior1.getName() + ".");

        } else {


            constable1.setName(name);
            System.out.println("Hello " + constable1.getName() + ".");

        }
        //Pausing before asking for player 2 info
        pause();


        //Set player 2
        Farmer farmer2 = new Farmer();
        Warrior warrior2 = new Warrior();
        Constable constable2 = new Constable();


        //Start of game, player 1 pick your character.
        System.out.println("Player 2 please select your character:\n1. Farmer\n2. Warrior\n3. Constable\n" +
                "     Please enter 1, 2 or 3:");

        int characterNum2 = scanner.nextInt();

        //This scanner is stopping the next scanner from skipping the user input
        scanner.nextLine();


        //Asking for name
        System.out.println("Please enter your name:");
        String name2 = scanner.nextLine();

        //character assignment
        if (characterNum == 1) {

            farmer2.setName(name2);
            System.out.println("Hello " + farmer2.getName() + ".");

        } else if (characterNum == 2) {


            warrior2.setName(name2);
            System.out.println("Hello " + warrior2.getName() + ".");

        } else {


            constable2.setName(name2);
            System.out.println("Hello " + constable2.getName() + ".");

        }
        pause();

        if (farmer1.getLives() >= 1 || warrior1.getLives() >= 1 || constable1.getLives() >= 1) {

            //Actual gaming code would go here, with user input calling methods against each other
            // I've hard coded some examples of code being run
            //I put in pauses to make reading easier and simulate back and forth game play

            farmer1.run();
            pause();


            warrior1.attack();
            pause();


            farmer1.decreaseHealth();
            pause();

            constable1.attack();
            pause();

            warrior2.decreaseShieldStrength();
            pause();

            farmer2.harvest();
            pause();

            farmer2.plow();
            pause();

            constable2.arrest();
            pause();

            constable2.jurisdiction();
            pause();

            warrior2.run();
            pause();

            constable1.heal();
            pause();

            farmer1.setLives(0);
            warrior1.setLives(0);
            constable1.setLives(0);

        }
        System.out.println("Game Over");

    }

    public static void pause() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}