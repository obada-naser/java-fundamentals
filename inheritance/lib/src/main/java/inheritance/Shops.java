package inheritance;

import java.util.List;

public class Shops extends Restaurant implements mallInterface{


    private String description;


    public Shops(String name, String description) {
       super(name,3);
       this.description=description;

    }

    public String getName() {
        return super.getName();
    }

    public List<Review> getReviews() {

        return super.getReviews();
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDollarSign() {
        return super.getDollarSign();
    }

    @Override
    public int getStars(){
        return super.getStars();

    }

    public void addReview(Review rev){

        super.getReviews().add(rev);

        super.rating();
    }


    @Override
    public String toString(){
        String shopString = "shop name: "+getName()+"\n"+"description: "+this.description+"\n"+"price: "+
                getDollarSign()+" \n"+" Raring: "+getStars();

        return shopString;


    }
}