
public class Car {

    //creating variables
    private String make;
    private String model;
    private int year;
    private String color;
    private int odometerMiles;
    private int carId = 0;


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


    @Override
    public String toString() {

        return "Car ID: " + carId + "\nMake: " + make + "\nModel: " + model + "\nYear: " + year + "\nColor: " + color + "\nMiles: " + odometerMiles + "\n\n";
    }
}
