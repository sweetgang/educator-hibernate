package com.bihuniak.educator.company;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Dpartment {
    @Id
    @GeneratedValue
    private long id;
}
