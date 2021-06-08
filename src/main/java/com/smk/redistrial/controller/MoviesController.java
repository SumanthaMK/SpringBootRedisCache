package com.smk.redistrial.controller;

import com.smk.redistrial.model.Movies;
import com.smk.redistrial.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@RestController
public class MoviesController {

    @Autowired
    private MoviesService moviesService;

    @GetMapping("/getMovie/{id}")
    Optional<Movies> getMovieById(@PathVariable int id) {

        return moviesService.getMovieById(id);
    }

    @GetMapping("/getAllMovies")
    List<Movies> getAllMovies() {

        return moviesService.getAllMovies();
    }

    @DeleteMapping("/deleteMovie/{id}")
    String deleteMovie(@PathVariable int id) {

        return moviesService.deleteMovie(id);
    }

    @PostMapping("/addMovie")
    Movies addMovie(@RequestBody Movies movies) {

        return moviesService.addMovie(movies);
    }

    @PutMapping("/addMovie")
    Movies updateMovie(@RequestBody Movies movies) {

        return moviesService.updateMovie(movies);
    }

}
