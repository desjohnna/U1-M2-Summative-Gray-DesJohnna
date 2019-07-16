import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //defining an object to call methods with
        CarInventory user = new CarInventory();
        boolean on = true;
//        Scanner sc = new Scanner(System.in);
//        int y = sc.nextInt();
//        user.search(y);

        while (on) {
            System.out.println("What would you like to do?\n1. Add a car to inventory?\n" +
                    "2. Delete a car from inventory?\n3. See a list of all cars?\n" +
                    "4. Search for a car?\n      Please enter a number:");
            Scanner scanner = new Scanner(System.in);
            int input = Integer.parseInt(scanner.nextLine());


            switch (input) {
                case 1:
                   user.add();
                   break;

                case 2:
                    System.out.println("Please enter the car ID you would like to delete.");
                    int carid = Integer.parseInt(scanner.nextLine());
                    user.delete(carid);
                    break;

                case 3:
                    user.printInventory();
                    break;

                case 4:
                    System.out.println("How would you like to search?\n1. By make\n2. By model\n3. By year\n4. By color\n5. By milage\n         Please enter a number:");
                    String x = scanner.nextLine();
                    user.search(x);



            }
            pause();

        }


    }

    public static void pause() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }


}
