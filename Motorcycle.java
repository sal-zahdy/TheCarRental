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

public class Motorcycle extends Vehicle {
    private String fuelType;
    private String transmissionType;

    public Motorcycle(String model, String company, Date date, Date entryDate, String color,
                      String status, char vehicleClass, int pricePerDay, int pricePerHour, int pricePerMonth,
                      String fuelType, String transmissionType) {

        super(model, company, date, entryDate, color, status, vehicleClass, pricePerDay, pricePerHour, pricePerMonth);
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
    }

    @Override
    public String toString() {
        return "Motorcycle " + super.toString() + String.format(" Fuel:%s Transmission:%s", fuelType, transmissionType);
    }
}
