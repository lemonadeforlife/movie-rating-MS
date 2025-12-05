public class ActionMovie extends Movie {
    private String stuntCoordinator;
    ActionMovie(String title, String director, int year, float rating, String stuntCoordinator){
        super(title, director, year, rating);
        this.stuntCoordinator = stuntCoordinator;
    }
    
    @Override
    void displayDetails(){

    }
}
