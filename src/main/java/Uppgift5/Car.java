package Uppgift5;
/** Represent a car
 */

public class Car {
    private String color;
    private String brand;
    private static String numberOfCars;

    public Car(String color, String brand, String numberOfCars){
        this.color=color;
        this.brand=brand;
        this.numberOfCars=numberOfCars;
    }
    public Car(){

    }
    /** Get the cars color
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    /** Get the cars brand
     */
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    /** Get the number of the car
     */
    public static String getNumberOfCars() {
        return numberOfCars;
    }

    public static void setNumberOfCars(String numberOfCars) {
        Car.numberOfCars = numberOfCars;
    }
}
