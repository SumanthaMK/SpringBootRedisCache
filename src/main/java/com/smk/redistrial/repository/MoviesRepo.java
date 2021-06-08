package com.smk.redistrial.repository;

import com.smk.redistrial.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepo extends JpaRepository<Movies, Integer> {

}
