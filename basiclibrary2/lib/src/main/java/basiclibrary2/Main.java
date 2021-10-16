package basiclibrary2;
import java.util.Arrays;
import java.util.Random;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("hello");

        Library lib=new Library();


        int[] arrBefore={1, 2, 3, 4, 3, 6};

        int[] avgArr={2,4,7,8,9,5};

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = lib.tally(votes);


        int[] arrNum={2,3,5,6,6,7};
        int num=4;
        System.out.println(Arrays.toString(lib.roll(6)));
        System.out.println(lib.containsDuplicates(arrBefore));
        System.out.println(lib.arrAverage(avgArr));
        System.out.println(Arrays.toString(lib.tempArr(weeklyMonthTemperatures)));
        System.out.println(Arrays.toString(lib.insertShiftArray(arrNum,num)));
        lib.weeklyTemp(weeklyMonthTemperatures);



        System.out.println(winner + " received the most votes!");




    }
}
