// https://en.wikipedia.org/wiki/Film_genre#Examples_of_genres_and_subgenres

public abstract class Movie{
    private String title;
    private String director;
    private int year;
    private float rating;
    // Constructor
    Movie(String title, String director, int year, float rating){
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
    // Encapsulation
    // getters
    public String getTitle(){
        return this.title;
    }
    public String getDirector(){
        return this.director;
    }
    public int getYear(){
        return this.year;
    }
    public float getRating(){
        return rating;
    }
    // setters
    public void setTitle(String title){
        this.title = title;
    }
    public void setDirector(String directorName){
        this.director = directorName;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setRating(float rating){
        this.rating = rating;
    }
    // abstract method
    public abstract void displayDetails();
}