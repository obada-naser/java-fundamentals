
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;
import java.util.*;



public class Main {
  public static void main(String[] args) {
   int dogCount = 1;
System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

int catCount = 2;
System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

int turtleCount = 0;
System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");




// flipNHeads(2);
// clock();
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

roll(4);
System.out.println(Arrays.toString(roll(4)));
System.out.println(containsDuplicates(arrBefore));
System.out.println(arrAverage(avgArr));
System.out.println(Arrays.toString(tempArr(weeklyMonthTemperatures)));
System.out.println(Arrays.toString(tempArr(weeklyMonthTemperatures)));

System.out.println(Arrays.toString(insertShiftArray(arrNum,num)));


  }
  public static String pluralize(String str, int num){
      

      if(num==1){
          str=str;
          

      }
      else{
          str=str+'s';
      }
      return str;
  }

//   public static void flipNHeads(double num1){
//       int flips=0;
//       int times=0;
     

//       while(num1!=flips){
    
//       if( Math.random()<0.5){
//           flips=0;
//           times=times+1;

//           System.out.println("tails");
          
          
//       }
//       else{
//           flips++;
//           times=times+1;
//           System.out.println("heads");
          
          
          
//       }
    
      
//       }
//       System.out.println("It took " +times+ " flips to flip "+num1  +" heads in a row.");

//   }
  

//   public static void clock (){
      
//       int time=0;

//        while(true ){
//            LocalDateTime now = LocalDateTime.now();
//      int hour = now.getHour();
//       int minute = now.getMinute();
//        int second = now.getSecond();
//        String timeZone = hour + ":"+minute + ":" + second;

//         if(second!=time){
//            time=second;
//            System.out.println(timeZone);
//         }
//        }

//   }
  public static int[] roll(int numOfRolls ){

      int [] newArr=new int[numOfRolls];
    
      Random randNum=new Random();
      int lowNum=1;
      int highNum=6;

      for(int i=0;i<newArr.length;i++){
          newArr[i]=randNum.nextInt(highNum-lowNum)+lowNum;
      }
    return newArr;
  }
public static boolean containsDuplicates(int[] arrOfNum){
  
   
    for(int i=0;i<arrOfNum.length;i++){
        // System.out.println(i);
        int num=arrOfNum[i];
        for(int j=i+1;j<arrOfNum.length;j++){
            if(num==arrOfNum[j]){
               return true;
            }
            



        }
    }
 
    return false;
}

public static double arrAverage(int[] integerNums){

    double totalAvg=0;
    double sum=0;

    for(int i=0;i<integerNums.length;i++){
        sum=sum+integerNums[i];


    }
    totalAvg=sum/integerNums.length;

    return totalAvg;
}

public static int[] tempArr(int[][] arrOfArr){
    double lowestNum=Double.MAX_VALUE;;
    double avgArr=0;
    double avg=0;
    int lowestAvg[]=arrOfArr[0];
    for(int i=0;i<arrOfArr.length;i++){
         avg=0;
        for(int j=0;j<arrOfArr[i].length;j++){
            avg=avg+arrOfArr[i][j];
        }
        avg=avg/arrOfArr[i].length;
        if(avg < lowestNum){
            lowestNum=avg;
            lowestAvg=arrOfArr[i];
        }

    }
    return lowestAvg;
}

public static int[] insertShiftArray(int [] arr, int index ){
    int [] newArr=new int[arr.length+1];
    int midNum=arr.length/2;
     

    if(midNum%2==0){
        midNum=midNum;
    }
    else{
        midNum=midNum+1;
    }
    newArr[midNum]=index;
   for (int i = 0; i < arr.length  + 1; i++){
            if(i > midNum){
                newArr[i] = arr[i -1];
            }
            if(i < midNum){
                newArr[i] = arr[i];
            }
        }

        return newArr;
    
}



 
}
