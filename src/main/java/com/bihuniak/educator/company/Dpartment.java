package com.bihuniak.educator.company;

import javax.persistence.*;

@Entity
public class Dpartment {
    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String address;
    private int park;

    @OneToOne(cascade = CascadeType.ALL)
    private Employee employee;


    public Dpartment(String name, String address, int park) {
        this.name = name;
        this.address = address;
        this.park = park;
    }

    public Dpartment() {
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Dpartment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", park=" + park +

                '}';
    }
}
