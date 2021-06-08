package com.smk.redistrial.service;

import com.smk.redistrial.model.Movies;

import java.util.List;
import java.util.Optional;


public interface MoviesService {

    Optional<Movies> getMovieById(int id);

    List<Movies> getAllMovies();

    String deleteMovie(int id);

    Movies addMovie(Movies movies);

    Movies updateMovie(Movies movies);

}
