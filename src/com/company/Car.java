package com.company;

public class Car {
    private String model;
    private long maxSpeed;
    private String carNumber;

    public Car(String model, long maxSpeed, String carNumber) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.carNumber = carNumber;
    }

    public String getModel() {
        return model;
    }

    public long getMaxSpeed() {
        return maxSpeed;
    }

    public String getCarNumber() {
        return carNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", carNumber='" + carNumber + '\'' +
                '}';
    }
}
