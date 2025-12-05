import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Movie> movies = new ArrayList<>();
        Utils movieDB = new Utils(movies);
        // pre-written examples
        movies.add(new ActionMovie("The Dark Knight", "Christopher Nolan", 2008, 9.0f,
        "Tom Struthers", "Superhero, Spy/Thriller, Vehicle-Based"));
        movies.add(new ActionMovie("Spider-Man", "Sam Raimi", 2002, 7.4f,
        "Jeff Habberstad", "Superhero, Martial Arts, Vehicle-Based"));
        movies.add(new ActionMovie("The Matrix", "The Wachowskis", 1999, 8.7f, 
        "Glenn Boswell", "Martial Arts, Spy/Thriller, Vehicle-Based"));
        movies.add(new ComedyMovie("3 Idiots", "Rajkumar Hirani", 2009, 8.4f,
        "Buddy Comedy, Satire, Dark Comedy", "Education System, Career Pressure, Friendship, Family Expectations, Social Norms"));
        movies.add(new ComedyMovie("Home Alone", "Chris Columbus", 1990, 7.7f,
        "Slapstick, Buddy Comedy", "Family Life, Childhood, Christmas, Responsibility, Independence"));
        movieDB.display();
        movieDB.update();
        movieDB.display();
    }
}
