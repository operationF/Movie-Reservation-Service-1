package com.moviereservation.domain;

import com.moviereservation.domain.movie.domain.Movie;
import com.moviereservation.domain.movie.dto.MovieRegisterDto;
import java.util.List;

public interface MovieRepository {
    public long save(MovieRegisterDto data);
    Movie findById(long id);
    List<Movie> getAllMovies();
}
