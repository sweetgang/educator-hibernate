package com.bihuniak.educator.company;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private long id;

    String surname;
    String position;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Dpartment dpartment;

    public Employee(String surname, String position, Dpartment dpartment) {
        this.surname = surname;
        this.position = position;
        this.dpartment = dpartment;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                ", dpartment=" + dpartment +
                '}';
    }
}
