package hus.oop.lab8._4._4_2;

class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    // Used to sort movies by year
    public int compareTo(Movie movie) {
        if (this.year < movie.getYear()) {
            return -1;
        } else if (this.year > movie.getYear()) {
            return 1;
        } else {
            return 0;
        }
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

}
