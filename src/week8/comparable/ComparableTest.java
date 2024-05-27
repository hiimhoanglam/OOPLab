package week8.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    public static void main(String[] args) {
        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Queen of Tears", 9.5, 2024));
        movieList.add(new Movie("Mai", 7.0, 2023));
        movieList.add(new Movie("Inception", 9.6,2015));
        movieList.add(new Movie("Avengers", 9.0, 2020));
        Collections.sort(movieList);
        System.out.println("Movies after sorting");
        System.out.println(movieList);
    }
}
