package inheritance;

public class Review implements{

    private String body;
    private String autherName;
    private int stars;

    public Review(String body, String autherName, int stars) {
        this.body = body;
        this.autherName = autherName;
        this.stars = stars;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAutherName() {
        return autherName;
    }

    public void setAutherName(String autherName) {
        this.autherName = autherName;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String toString(){



        String revString="The review of this restaurant is "+this.body+" by "+this.autherName+" with " +
                " a rating equal "+this.stars +" stars.";



//        if(this.stars>=3){
//            this.dollarSign="$$$";
//
//        }
//        else{
//            this.dollarSign="$$";
//        }

//        restString=restString+" so it got this price "+this.dollarSign;

        return revString;

    }
}
