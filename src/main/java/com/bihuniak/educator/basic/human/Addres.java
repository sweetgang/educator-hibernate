package com.bihuniak.educator.basic.human;

import javax.persistence.Embeddable;

@Embeddable
public class Addres {
    private String street;
    private String city;
    private String coutry;
   // private PostCode postCode;

    public Addres(String street, String city, String coutry) {
        this.street = street;
        this.city = city;
        this.coutry = coutry;

    }

    public Addres() {
    }
}
