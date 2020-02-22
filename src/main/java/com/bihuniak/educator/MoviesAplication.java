package com.bihuniak.educator;

import com.bihuniak.educator.basic.Car;
import com.bihuniak.educator.basic.FilmsRepository;
import com.bihuniak.educator.basic.Movies;
import com.bihuniak.educator.basic.MyFirstRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@SpringBootApplication
public class MoviesAplication {
    @Autowired
    private FilmsRepository filmsRepository;

    public static void main(String[] args) {
        SpringApplication.run(MoviesAplication.class, args);
    }

    @PostConstruct
    public void init() {
        Movies movies = new Movies("The Shawshank Redemption","Frank Darabont",
                1994,25_000_000);
        Movies movies2 = new Movies("The Green Mile","Frank Darabont",
                1999,60_000_000);
        Movies movies3 = new Movies("Forrest Gump","Robert Zemeckis",
                1994,55_000_000);
        filmsRepository.saveAll(Arrays.asList(movies,movies3,movies3));

        //Car car = myFirstRepository.findById(8L).get();
        //System.out.println(movies);
    }
}

}
