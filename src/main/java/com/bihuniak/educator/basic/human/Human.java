package com.bihuniak.educator.basic.human;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Human {
    @Id
    @GeneratedValue
    private long id;


    private String firstName;
    private String lastName;
    @Enumerated( EnumType.STRING)
    private Sex sex;
    private LocalDate birthday;
    @Embedded
    private Addres addres;


    public Human(String firstName, String lastName, Sex sex,
                 LocalDate birthday,Addres addres) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.birthday = birthday;
        this.addres = addres;
    }

    public Human() {

    }



}
