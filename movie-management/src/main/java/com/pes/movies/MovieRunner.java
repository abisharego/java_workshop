package com.pes.movies;

import com.pes.movies.entity.movieEntity;
import com.pes.movies.repo.MovieRepo;
import com.pes.movies.repo.MovieRepoImpl;

import java.time.LocalDate;

public class MovieRunner {
    public static void main(String[] args){
        movieEntity MovieEntity=new movieEntity();
//        MovieEntity.setMovie_id(1);
        MovieEntity.setMovie_name("Bajrangi Bhaijaan");
        MovieEntity.setMovie_hero("Salman");
        MovieEntity.setMovie_heroine("Harshali");
        MovieEntity.setLanguage("Hindi");
        MovieEntity.setRelease_date(LocalDate.of(2018, 02, 27));

        MovieRepo repo=new MovieRepoImpl();
        repo.saveMovie(MovieEntity);
        repo.readMovies();
        }
}
