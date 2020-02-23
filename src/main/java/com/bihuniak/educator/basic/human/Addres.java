package com.bihuniak.educator.basic.human;

import javax.persistence.Embeddable;

@Embeddable
public class Addres {
    private String street;
    private String city;
    private String coutry;
    private String postCode;

    public Addres(String street, String city, String coutry, String postCode) {
        this.street = street;
        this.city = city;
        this.coutry = coutry;
        this.postCode = postCode;
    }

    public Addres() {
    }
}
