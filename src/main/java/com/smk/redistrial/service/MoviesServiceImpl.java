package com.smk.redistrial.service;

import com.smk.redistrial.model.Movies;
import com.smk.redistrial.repository.MoviesRepo;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class MoviesServiceImpl implements MoviesService {

    @Autowired
    private MoviesRepo moviesRepo;

    @SneakyThrows
    @Override
    @Cacheable(value = "Movies", key = "#id")
    public Optional<Movies> getMovieById(int id) {

        Optional<Movies> movies = moviesRepo.findById(id);
        if (movies.isPresent()) {
            log.info("Getting From dB");
            return movies;
        } else {
            log.info("Getting From dB");
            return Optional.empty();
        }
    }

    @Override
    public List<Movies> getAllMovies() {

        return moviesRepo.findAll();
    }

    @Override
    @CacheEvict(value = "Movies", key = "#id")
    public String deleteMovie(int id) {

        if (moviesRepo.findById(id).isPresent()) {
            moviesRepo.deleteById(id);
            return "Deleted";
        } else {
            return id + "Not Found";
        }
    }

    @Override
    @CachePut(value = "Movies", key = "#movies.id")
    public Movies addMovie(Movies movies) {

        return moviesRepo.save(movies);
    }

    @Override
    @CachePut(value = "Movies", key = "#movies.id")
    public Movies updateMovie(Movies movies) {

        return moviesRepo.save(movies);
    }

}
