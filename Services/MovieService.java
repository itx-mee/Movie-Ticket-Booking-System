package Services;

import CoreClasses.Movie;

import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class MovieService {
    private final Map<Integer, Movie> movies;
    private final AtomicInteger movieCounter; // Private counter for generating movie IDs

    public MovieService() {
        this.movies = new HashMap<>();
        this.movieCounter = new AtomicInteger(0); // Initialize the counter to 0
    }

    
    
}