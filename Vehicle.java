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

public class Vehicle implements Comparable<Vehicle> {
    private String model;
    private String company;
    private Date date;
    private Date entryDate;
    private String color;
    private String status;
    private boolean available = true;
    private char vehicleClass;
    private int pricePerDay;
    private int pricePerHour;
    private int pricePerMonth;

    public Vehicle() {}

    public Vehicle(String model, String company, Date date, Date entryDate, String color,
                   String status, char vehicleClass, int pricePerDay, int pricePerHour, int pricePerMonth) {
        this.model = model;
        this.company = company;
        this.date = date;
        this.entryDate = entryDate;
        this.color = color;
        this.status = status;
        this.vehicleClass = vehicleClass;
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.pricePerMonth = pricePerMonth;
    }

    // getters & setters
    public String getModel() { return model; }
    public String getCompany() { return company; }
    public Date getDate() { return date; }
    public Date getEntryDate() { return entryDate; }
    public String getColor() { return color; }
    public String getStatus() { return status; }
    public boolean isAvailable() { return available; }
    public char getVehicleClass() { return vehicleClass; }
    public int getPricePerDay() { return pricePerDay; }
    public int getPricePerHour() { return pricePerHour; }
    public int getPricePerMonth() { return pricePerMonth; }

    public void setStatus(String status) { this.status = status; }
    public void setAvailable(boolean available) { this.available = available; }
    public void setPricePerDay(int pricePerDay) { this.pricePerDay = pricePerDay; }
    public void setPricePerHour(int pricePerHour) { this.pricePerHour = pricePerHour; }
    public void setPricePerMonth(int pricePerMonth) { this.pricePerMonth = pricePerMonth; }
    public void setColor(String color) { this.color = color; }

    // default price calc
    public int calculatePrice(int days, int hours) {
        return days * pricePerDay + hours * pricePerHour;
    }

    // Comparable default: by model (A -> Z)
    @Override
    public int compareTo(Vehicle other) {
        if (this.model == null && other.model == null) return 0;
        if (this.model == null) return -1;
        if (other.model == null) return 1;
        return this.model.compareToIgnoreCase(other.model);
    }

    @Override
    public String toString() {
        return String.format("[%s | %s] Color:%s Status:%s Avail:%s Class:%c Price/day:%d Price/hr:%d",
                model, company, color, status, available ? "Yes" : "No", vehicleClass, pricePerDay, pricePerHour);
    }
}
