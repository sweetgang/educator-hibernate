package com.bihuniak.educator.basic;

import javax.persistence.*;

@Entity
public class Movies {

    @Id
    @GeneratedValue
    private long id;

    private String nameOfFilm;
    private String director;
    @Basic(optional = false)
    private int releaseYear;
    @Column(nullable = false)
    private int budget;


    public Movies() {
    }


    public Movies( String nameOfFilm, String director, int releaseYear, int budget) {

        this.nameOfFilm = nameOfFilm;
        this.director = director;
        this.releaseYear = releaseYear;
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "id=" + id +
                ", nameOfFilm='" + nameOfFilm + '\'' +
                ", director='" + director + '\'' +
                ", releaseYear=" + releaseYear +
                ", budget=" + budget +
                '}';
    }
}
