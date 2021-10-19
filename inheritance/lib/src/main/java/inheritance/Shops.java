package inheritance;

public class Shops extends Restaurant implements mallInterface{


    private String description;


    public Shops(String name, String description) {
       super(name,3);
       this.description=description;

    }

    public String getName() {
        return super.getName();
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



    public void addReview(Review rev){

        this.reviews.add(rev);  

        rating();
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
        String shopString = "shop name: "+this.name+"\n"+"description: "+this.description+"\n"+"price: "
                +this.dollarSign;

        return shopString;


    }
}