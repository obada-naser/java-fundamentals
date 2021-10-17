package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private int stars;
    private String dollarSign;
    List<Review> reviews = new ArrayList<>();


    public Restaurant(String name, int stars) {
        this.name = name;
        this.stars = stars;

    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getDollarSign() {
        return dollarSign;
    }

    public void setDollarSign(String dollarSign) {
        this.dollarSign = dollarSign;
    }
    public void addReview(Review rev){

        this.reviews.add(rev);


    }

    public void rating(){
        double gettingReview=0;
        for(int i=0;i<getReviews().size();i++){
            gettingReview=gettingReview+getReviews().get(i).getStars();

        }
        gettingReview=Math.round(gettingReview/getReviews().size());
        this.stars=(int) gettingReview;




    }



    @Override
    public String toString(){
        String restString=" restaurant "+this.name+" got "+this.stars+" stars ";

        if(this.stars>=3){
            this.dollarSign="$$$";

        }
        else{
            this.dollarSign="$$";
        }

        restString=restString+" so it got this price "+this.dollarSign;

        return restString;

    }
}
