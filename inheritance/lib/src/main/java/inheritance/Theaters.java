package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theaters implements mallInterface{

    private String theaterName;

    private ArrayList<String> MovieList = new ArrayList<>();
    private ArrayList<Review> reviews=new ArrayList<>();

    @Override
    public String getName() {
        return null;
    }

    public Theaters(String theaterName) {
        this.theaterName=theaterName;

    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public ArrayList<String> getMovieList() {
        return MovieList;
    }

    public void setMovieList(ArrayList<String> movieList) {
        MovieList = movieList;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public void addMovie(String movieName){

         MovieList.add(movieName);

    }
    public void removeMovie(String movieName){

        MovieList.remove(movieName);

    }

    @Override
    public void addReview(Review rev) {
       this.reviews.add(rev);
    }

    public void moviesAddReview (Review review,String movieName){
        if(MovieList.contains(movieName)){
            this.reviews.add(review);
            System.out.println("thank you for reviewing our movies !");

        }
        else{
            System.out.println("sorry, we can't rate your movie");
        }
    }

    @Override
    public int getStars() {
        return 0;
    }

    @Override
    public void rating() {
        return;
    }

    @Override
    public String toString() {
        return "Theaters{" +
                "theaterName='" + theaterName + '\'' +
                ", MovieList=" + MovieList +
                ", reviews=" + reviews +
                '}';
    }
}
