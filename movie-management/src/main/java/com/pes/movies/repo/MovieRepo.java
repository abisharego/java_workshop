package com.pes.movies.repo;

import com.pes.movies.entity.movieEntity;

public interface MovieRepo {
    void saveMovie(movieEntity entity);
    void readMovies();
}
