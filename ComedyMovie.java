public class ComedyMovie extends Movie {
    private String comedyStyle; // Rom-Com, Satire, Screwball, Slapstick, Dark Comedy, Parody/Spoof, Buddy Comedy, Cringe Comedy, Stand-Up Adaptation
    private String humorTarget; // Social Norms, Politics, Family Life, Romance, Work Culture, Its Own Genre
    ComedyMovie(String title, String director, int year, float rating, String comedyStyle, String humorTarget){
        super(title, director, year, rating);
        this.comedyStyle = comedyStyle;
        this.humorTarget = humorTarget;
    }
    public String getComedyStyle(){
        return this.comedyStyle;
    }
    public String getHumorTarget(){
        return this.humorTarget;
    }
    public void setComedyStyle(String name){
        this.comedyStyle = name;
    }
    public void setHumorTarget(String humor){
        this.humorTarget = humor;
    }
    @Override
    public void displayDetails(){
        System.out.println("COMEDY MOVIE");
        System.out.println("\tTitle: " + getTitle());
        System.out.println("\tDirected by: " + getDirector());
        System.out.println("\tReleased: " + getYear());
        System.out.println("\tComedy Style: " + getComedyStyle());
        System.out.println("\tHumor Target: " + getHumorTarget());
        System.out.printf("\tRating: %.1f", getRating());
    }
}
