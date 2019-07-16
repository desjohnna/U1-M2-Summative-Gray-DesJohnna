import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Car {

    //creating variables
    private String make;
    private String model;
    private int year;
    private String color;
    private int odometerMiles;
    private int carId = 0;
    public List<Car> carMasterList;



    //Default constructor
    Car() {
    }

    //creating a constructor for all variables
    public Car(int carId, String make, String model, int year, String color, int odometerMiles) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.odometerMiles = odometerMiles;
        this.carId = carId;

    }

    //getters and setters for all variables
    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerMiles() {
        return this.odometerMiles;
    }

    public void setOdometerMiles(int odometerMiles) {
        this.odometerMiles = odometerMiles;
    }

    public int getCarId(int carId) {
        return this.carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }





    public void list() {


//            for(int x = 0; x< carMasterList.size(); x++) {
//                System.out.println("Car ID: " + carMasterList.get(x).getCarId(x));
//                System.out.println("Make: " + carMasterList.get(x).getMake());
//            }

        for (int i = 0; i < this.carMasterList.size(); i++) {

            //get(i)= the index of the student in the array, .getId()=
            if (this.carMasterList.get(i).getMake().equals(make)) {
                System.out.println(carMasterList.get(i).getMake());
                //return the puppy at that index
                // return this.carMasterList.get(i);
            }

        }
        // return null;


    }


    @Override
  public String toString() {

        return "Car ID: " + carId + ", " + make + ", " + model + ", " + year + ", " + getColor() + ", " + odometerMiles + ".";
    }
}
