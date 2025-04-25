package com.pes.movies.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class movieEntity {
    private int movie_id;
    private String movie_name;
    private String movie_hero;
    private String movie_heroine;
    private String language;
    private LocalDate release_date;
}
