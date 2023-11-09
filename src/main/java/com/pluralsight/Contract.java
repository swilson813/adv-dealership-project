package com.pluralsight;

public abstract class Contract{
    private String date;
    private String name;
    private String customerEmail;
    private Vehicle vehicle;
    private double totalPrice;
    private double monthlyPayment;

    public Contract(String date, String name, String customerEmail, Vehicle vehicle) {
        this.date = date;
        this.name = name;
        this.customerEmail = customerEmail;
        this.vehicle = vehicle;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "date='" + date + '\'' +
                ", name='" + name + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", Vehicle vehicle='" + vehicle + '\'' +
                ", totalPrice=" + totalPrice +
                ", monthlyPayment=" + monthlyPayment +
                '}';
    }

    public abstract double getTotalPrice();

    public abstract double getMonthlyPayment();
}
