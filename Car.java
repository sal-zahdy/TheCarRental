/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car_rental;

/**
 *
 * @author Alzah
 */
import java.util.Date;

public class Car extends Vehicle {
    private int numberOfSeats;
    private String fuelType;

    public Car(String model, String company, Date date, Date entryDate, String color,
               String status, char vehicleClass, int pricePerDay, int pricePerHour, int pricePerMonth,
               int numberOfSeats, String fuelType) {

        super(model, company, date, entryDate, color, status, vehicleClass, pricePerDay, pricePerHour, pricePerMonth);
        this.numberOfSeats = numberOfSeats;
        this.fuelType = fuelType;
    }

    public int getNumberOfSeats() { return numberOfSeats; }
    public String getFuelType() { return fuelType; }

    @Override
    public String toString() {
        return "Car " + super.toString() + String.format(" Seats:%d Fuel:%s", numberOfSeats, fuelType);
    }
}

