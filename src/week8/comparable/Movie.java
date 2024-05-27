package week8.comparable;

public class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Movie o) {
        return Integer.compare(this.year, o.year);
    }

    @Override
    public String toString() {
        return "Movie[" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", year=" + year +
                ']';
    }
}
