package com.bihuniak.educator.basic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {

    @Id
    @GeneratedValue
    private long id;



    private String model;
    private String brand;
    private int wheels;
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
}