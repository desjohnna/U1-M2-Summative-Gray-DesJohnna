import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarInventory {

    ArrayList<Car> carMasterList;
    private int carId = 1;

    public CarInventory() {
        this.carMasterList = new ArrayList<>();

        this.carInventory();
    }

    private void carInventory() {

        //List of cars to start with so user has something to search, delete and list.
        this.carMasterList.add(new Car(carId++, "Honda", "HRV", 2017, "Black", 25000));
        this.carMasterList.add(new Car(carId++, "Jeep", "Cherokee", 1998, "Brown", 210000));
        this.carMasterList.add(new Car(carId++, "Toyota", "Camry", 2010, "Silver", 90000));
        this.carMasterList.add(new Car(carId++, "Ford", "Fusion", 2019, "Red", 0));
        this.carMasterList.add(new Car(carId++, "Land Rover", "Range Rover", 2001, "Blue", 150000));


    }

    public void printInventory() {
        for (int i = 0; i < this.carMasterList.size(); i++) {
            System.out.println(this.carMasterList.get(i).toString());
        }
    }

    public List<Car> add() {

        //Incrementing the car id
        carId++;

        Car tempCar = new Car();


        //Getting inputs from the user and assigning them to the elements of the constructor
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter car Make");
        String make = scanner.nextLine();
        tempCar.setMake(make);


        System.out.println("Please enter car Model");
        String model = scanner.nextLine();
        tempCar.setModel(model);


        System.out.println("Please enter year of car");
        int year = scanner.nextInt();
        tempCar.setYear(year);

        //This scanner is stopping the next scanner from skipping the user input
        scanner.nextLine();


        System.out.println("Please enter color of car");
        String color = scanner.nextLine();
        tempCar.setColor(color);


        System.out.println("Please enter number of miles on car");
        int miles = scanner.nextInt();
        tempCar.setOdometerMiles(miles);


        System.out.println("Your car has been added, your Car ID number is " + carId + ".");


        carMasterList.add(tempCar);

        System.out.println(tempCar);
        return carMasterList;


    }

    public void delete(int carId) {

        for (int x = 0; x < this.carMasterList.size(); x++) {
            if (this.carMasterList.get(x).getCarId(x) == carId) {
                this.carMasterList.remove(x);
                System.out.println(carId + " has been deleted from inventory.");
                break;
            }
        }


    }

    public void search(int x) {


        Scanner scanner = new Scanner(System.in);
        switch (x) {
            case 1:
                System.out.println("Please enter the make of the car.");

                String make = scanner.nextLine();

                for (int i = 0; i < this.carMasterList.size(); i++) {

                    //get(i)= the index of the car in the array
                    if (this.carMasterList.get(i).getMake().equals(make)) {

                        //return the car at that index
                        System.out.println(carMasterList.get(i));
                    }
                }


                break;
            case 2:
                System.out.println("Please enter car model.");

                String model = scanner.nextLine();

                for (int i = 0; i < this.carMasterList.size(); i++) {

                    if (this.carMasterList.get(i).getModel().equals(model)) {
                        System.out.println(carMasterList.get(i));
                    }
                }

                break;
            case 3:
                System.out.println("Please enter oldest year.");

                int year = scanner.nextInt();

                for (int i = 0; i < this.carMasterList.size(); i++) {

                    if (this.carMasterList.get(i).getYear() >= year) {
                        System.out.println(carMasterList.get(i));
                    }
                }

                break;
            case 4:
                System.out.println("Please enter color.");

                String color = scanner.nextLine();

                for (int i = 0; i < this.carMasterList.size(); i++) {
                    if (this.carMasterList.get(i).getColor().equals(color)) {
                        System.out.println(carMasterList.get(i));
                    }
                }

                break;
            case 5:
                System.out.println("Please enter maximum mileage.");

                int miles = scanner.nextInt();

                for (int i = 0; i < this.carMasterList.size(); i++) {
                    if (this.carMasterList.get(i).getOdometerMiles() <= miles) {
                        System.out.println(carMasterList.get(i));
                    }
                }

                break;

            default:
                System.out.println("That is an invalid number, please enter a number between 1-5.");
        }

    }


}
