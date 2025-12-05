public class ComedyMovie extends Movie {
    private String comedyStyle;
    ComedyMovie(String title, String director, int year, float rating, String comedyStyle){
        super(title, director, year, rating);
        this.comedyStyle = comedyStyle;
    }
    @Override
    void displayDetails(){
        
    }
}
