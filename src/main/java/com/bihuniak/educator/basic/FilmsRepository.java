package com.bihuniak.educator.basic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmsRepository extends CrudRepository<Movies, Long> {
}
