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


        int[] arrNum={2,3,5,6,6,7};
        int num=4;
        System.out.println(Arrays.toString(lib.roll(6)));
        System.out.println(lib.containsDuplicates(arrBefore));
        System.out.println(lib.arrAverage(avgArr));
        System.out.println(Arrays.toString(lib.tempArr(weeklyMonthTemperatures)));
        System.out.println(Arrays.toString(lib.insertShiftArray(arrNum,num)));



    }
}
