package com.bihuniak.educator.basic;

import javax.persistence.*;

@Entity
public class Car {

    @Id
    @GeneratedValue
    private long id;


    @Access(value = AccessType.PROPERTY)
    @Basic(optional = false)
    private String model;

    private String brand;
    private int wheels;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model + "F16";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getEngineCapasity() {
        return engineCapasity;
    }

    public void setEngineCapasity(double engineCapasity) {
        this.engineCapasity = engineCapasity;
    }

    public boolean isUseed() {
        return useed;
    }

    public void setUseed(boolean useed) {
        this.useed = useed;
    }

    @Column(name = "Capasity", nullable = false)
    private double engineCapasity;
    private boolean useed;

    public Car(String model, String brand, int wheels, double engineCapasity, boolean useed) {
        this.model = model;
        this.brand = brand;
        this.wheels = wheels;
        this.engineCapasity = engineCapasity;
        this.useed = useed;
    }

    public Car() {
    }
    public Car(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", wheels=" + wheels +
                ", engineCapasity=" + engineCapasity +
                ", useed=" + useed +
                '}';
    }
}