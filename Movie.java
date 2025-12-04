// https://en.wikipedia.org/wiki/Film_genre#Examples_of_genres_and_subgenres

abstract class Movie{
    String name;
    String directorName;
    int year;
    private float rating;
    // Constructor
    Movie(String name, String directorName, int year, float rating){
        this.name = name;
        this.directorName = directorName;
        this.year = year;
        this.rating = rating;
    }
    // Encapsulation
    void setRating(float x){
        rating = x;
    }
    void getRating(){
        System.out.print(rating);
    }
    abstract void display();
}