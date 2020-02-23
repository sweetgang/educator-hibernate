package com.bihuniak.educator.basic.human;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.*;

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

    //element colekcii tworzs nowa tabele v bazie
    @ElementCollection
    private List<String> numerTelefonuw = new ArrayList<String>();


    @ElementCollection
    private List<Addres> listaAdresuw= new ArrayList<Addres>();



    public Human(String firstName, String lastName, Sex sex,
                 LocalDate birthday,List<Addres> listaAdresuw,List<String> numerTelefonuw) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.birthday = birthday;
        this.listaAdresuw = listaAdresuw;
        this.numerTelefonuw = numerTelefonuw;
    }

    public Human() {

    }



}
