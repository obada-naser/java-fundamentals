/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
        Restaurant restaurant1=new Restaurant("reem",2);
        Restaurant restaurant2=new Restaurant("mcdonalds",3);
        Restaurant restaurant3=new Restaurant("kfc",5);
        restaurant1.toString();
        System.out.println(restaurant1);

        Review rev=new Review("very good","obada",4);
        Review rev2=new Review(" good","ali",3);
        Review rev3=new Review("bad","mohammed",1);
        rev.toString();
        System.out.println(rev);

        restaurant1.addReview(rev);
        restaurant1.addReview(rev2);
        restaurant3.addReview(rev3);

        Theaters theater1=new Theaters("grand theaters");
        theater1.addMovie("bleach");

        theater1.addMovie("titanic");

        theater1.moviesAddReview(rev,"bleach");


        System.out.println("*************");
        System.out.println( theater1.toString());


        restaurant1.toString();
        theater1.removeMovie("bleach");
        theater1.moviesAddReview(rev,"bleach");
        System.out.println( theater1.toString());

        System.out.println(restaurant1);

        System.out.println(restaurant1.getReviews());
        Shops shop=new Shops("city mall","very good shop");

        System.out.println(shop.toString());

    }
}
