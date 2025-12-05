import java.util.ArrayList;
import java.util.Scanner;

public class Utils implements Database{
    ArrayList<Movie> movieList;
    Utils(ArrayList<Movie> movieList){
        this.movieList = movieList;
    }
    public static void clear(){
        try {
            if (System.getProperty("os.name").toLowerCase().contains("win")) {
                // Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Linux/Mac/Unix
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            // Fallback: print blank lines
            System.out.print("\033[H\033[2J");  // ANSI escape code
            System.out.flush();
        }
    }
    public static void pause(){
        System.out.print("\n\nPress 'Enter' key to continue........");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }
    public static void menu(){
        System.out.println("[1] Add Movie");
        System.out.println("[2] Display Movie");
        System.out.println("[3] Search Movie");
        System.out.println("[4] Update Movie Details");
        System.out.println("[0] Exit");
    }
    @Override
    public void add(){
        Scanner input = new Scanner(System.in);

        System.out.print("What type Movie is it?\n\t[1] Action\n\t[2] Comedy\n>> ");
        int choice = input.nextInt();
        input.nextLine(); // captures \n

        System.out.print("Enter Movie Name: ");
        String title = input.nextLine();
        System.out.print("Enter Director Name: ");
        String directorName = input.nextLine();
        System.out.print("Enter Released Year: ");
        int year = input.nextInt();
        input.nextLine(); // captures \n
        System.out.print("Enter Movie Rating: ");
        float rating = input.nextFloat();
        input.nextLine(); // captures \n
        if(choice == 1){
            System.out.print("Enter Stunt Director Name: ");
            String stuntCoordinator = input.nextLine();
            System.out.print("Enter Action Type: ");
            String actionType = input.nextLine();
            movieList.add(new ActionMovie(title, directorName, year, rating, stuntCoordinator, actionType));
        } else {
            System.out.print("Enter Comedy Style: ");
            String comedyStyle = input.nextLine();
            System.out.print("Enter Humor Target: ");
            String humorTarget = input.nextLine();
            movieList.add(new ComedyMovie(title, directorName, year, rating, comedyStyle, humorTarget));
        }
        input.close();
    }

    @Override
    public void search(){
        Scanner input = new Scanner(System.in);
        System.out.print("Search Movie: ");
        String searchKeyword = input.nextLine();
        input.close();
        for(Movie m:movieList){
            if(m.getTitle().toLowerCase().contains(searchKeyword.toLowerCase())){
                System.out.println();
                m.displayDetails();
                System.out.println();
            }
        }
    }

    @Override
    public void update(){
        Scanner input = new Scanner(System.in);
        System.out.print("\nWhat type Movie is it?\n\t[1] Action\n\t[2] Comedy\n>> ");
        int movieType = input.nextInt();
        input.nextLine(); // captures \n
        System.out.println("\nWhat do you want to update?");
        System.out.print("[1] Title \n[2] Director Name\n[3] Released Year \n[4] Rating");
        if(movieType == 1){
            System.out.print("\n[5] Stunt Director Name\n[6] Action Type\n>>");
        } else {
            System.out.print("\n[5] Comedy Style \n[6] Humor Target\n>>");
        }
        int updateChoice = input.nextInt();
        input.nextLine(); // captures \n
        display(movieType);
        System.out.print("Enter Movie Index: ");
        int index = input.nextInt();
        input.nextLine();
        getAttr(movieType, index, updateChoice);
        input.close();
    }
    @Override
    public void display(){
        for(Movie m : movieList){
            System.out.println();
            m.displayDetails();
            System.out.println();
        }
    }
    @Override
    public void display(int movieType){
        int count=0;
        for(Movie m : movieList){
            if(movieType==1){
                if(m instanceof ActionMovie){
                    System.out.println();
                    System.out.printf("[%d] %s", ++count, m.getTitle());
                }
            } else {
                if(m instanceof ComedyMovie){
                    System.out.println();
                    System.out.printf("[%d] %s", ++count, m.getTitle());
                }  
            }
        }
        System.out.println();
    }
    public void getAttr(int movieType, int index, int attr){
        int count=0;
        Scanner input = new Scanner(System.in);
        for(Movie m : movieList){
            if(movieType==1){
                if(m instanceof ActionMovie){
                    ++count;
                    if(index==count){
                        switch (attr) {
                            case 1:
                                System.out.print("Update Movie Title: ");
                                m.setTitle(input.nextLine());
                                break;
                            case 2:
                                System.out.print("Update Director Name: ");
                                m.setDirector(input.nextLine());
                                break;
                            case 3:
                                System.out.print("Update Release Year: ");
                                m.setYear(input.nextInt());
                                input.nextLine();
                                break;  
                            case 4:
                                System.out.print("Update Rating: ");
                                m.setRating(input.nextFloat());
                                break;
                            case 5:
                                System.out.print("Update Stunt Director Name: ");
                                ((ActionMovie) m).setStuntCoordinator(input.nextLine());
                                break;  
                            case 6:
                                System.out.print("Update Action Type: ");
                                ((ActionMovie) m).setActionType(input.nextLine());
                                break;  
                        }
                    }
                }
            } else {
                if(m instanceof ComedyMovie){
                    ++count;
                    if(index==count){
                        switch (attr) {
                            case 1:
                                System.out.print("Update Movie Title: ");
                                m.setTitle(input.nextLine());
                                break;
                            case 2:
                                System.out.print("Update Director Name: ");
                                m.setDirector(input.nextLine());
                                break;
                            case 3:
                                System.out.print("Update Release Year: ");
                                m.setYear(input.nextInt());
                                input.nextLine();
                                break;  
                            case 4:
                                System.out.print("Update Rating: ");
                                m.setRating(input.nextFloat());
                                break;
                            case 5:
                                System.out.print("Update Comedy Style: ");
                                ((ComedyMovie) m).setComedyStyle(input.nextLine());
                                break;  
                            case 6:
                                System.out.print("Update Humor Target: ");
                                ((ComedyMovie) m).setHumorTarget(input.nextLine());
                                break;  
                        }
                    }
                }  
            }
        }
        System.out.println();
    }
}
