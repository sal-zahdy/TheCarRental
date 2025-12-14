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

public class Van extends Vehicle {
    private int cargoCapacity;
    private int numberOfSeats;
    private boolean refrigerated;

    public Van(String model, String company, Date date, Date entryDate, String color,
               String status, char vehicleClass, int pricePerDay, int pricePerHour, int pricePerMonth,
               int cargoCapacity, int numberOfSeats, boolean refrigerated) {

        super(model, company, date, entryDate, color, status, vehicleClass, pricePerDay, pricePerHour, pricePerMonth);
        this.cargoCapacity = cargoCapacity;
        this.numberOfSeats = numberOfSeats;
        this.refrigerated = refrigerated;
    }

    @Override
    public String toString() {
        return "Van " + super.toString() + String.format(" Cargo:%dkg Seats:%d Refrigerated:%s",
                cargoCapacity, numberOfSeats, refrigerated ? "Yes" : "No");
    }
}
