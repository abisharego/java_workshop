package com.pes.movies.servlet;

import com.pes.movies.entity.movieEntity;
import com.pes.movies.repo.MovieRepo;
import com.pes.movies.repo.MovieRepoImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/save")
public class MovieServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        movieEntity entity=new movieEntity();
        entity.setMovie_name(req.getParameter("movie_name"));
        entity.setMovie_hero(req.getParameter("movie_hero"));
        entity.setMovie_heroine(req.getParameter("movie_heroine"));
        entity.setLanguage(req.getParameter("language"));
        entity.setRelease_date(LocalDate.parse(req.getParameter("release_date")));

        MovieRepo repo=new MovieRepoImpl();
        repo.saveMovie(entity);

        PrintWriter respWriter=resp.getWriter();
        respWriter.print(entity.getMovie_name()+": Movie saved..!");

    }
}