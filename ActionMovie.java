public class ActionMovie extends Movie {
    private String stuntCoordinator;
    private String actionType; // Superhero, Martial Arts, Military/Combat, Spy/Thriller, Disaster, Hard Boiled, Vehicle-Based, Sword & Sandal
    ActionMovie(String title, String director, int year, float rating, String stuntCoordinator, String actionType){
        super(title, director, year, rating);
        this.stuntCoordinator = stuntCoordinator;
        this.actionType = actionType;
    }
    public String getStuntCoordinator(){
        return this.stuntCoordinator;
    }
    public String getActionType(){
        return this.actionType;
    }
    public void setStuntCoordinator(String name){
        this.stuntCoordinator = name;
    }
    public void setActionType(String genre){
        this.actionType = genre;
    }
    @Override
    public void displayDetails(){
        System.out.println("ACTION MOVIE");
        System.out.println("\tTitle: " + getTitle());
        System.out.println("\tDirected by: " + getDirector());
        System.out.println("\tReleased: " + getYear());
        System.out.println("\tStunt Coordinator: " + getStuntCoordinator());
        System.out.println("\tAction Type: " + getActionType());
        System.out.printf("\tRating: %.1f", getRating());
    }
}
