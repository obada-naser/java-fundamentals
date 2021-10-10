
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;



public class Main {
  public static void main(String[] args) {
   int dogCount = 1;
System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

int catCount = 2;
System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

int turtleCount = 0;
System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");




flipNHeads(2);
// clock();
int[] arrBefore={1, 2, 3, 4, 5, 6};
System.out.println(Arrays.toString(reverseArray(arrBefore)));


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

  public static void flipNHeads(double num1){
      int flips=0;
      int times=0;
     

      while(num1!=flips){
    
      if( Math.random()<0.5){
          flips=0;
          times=times+1;

          System.out.println("tails");
          
          
      }
      else{
          flips++;
          times=times+1;
          System.out.println("heads");
          
          
          
      }
    
      
      }
      System.out.println("It took " +times+ " flips to flip "+num1  +" heads in a row.");

  }
  

//   public static void clock (){
      
      

//        while(true ){
//            LocalDateTime now = LocalDateTime.now();
//      int hour = now.getHour();
//       int minute = now.getMinute();
//        int second = now.getSecond();

//            System.out.println(hour+":"+minute+":"+second);
//        }

//   }
 public static int[] reverseArray(int[] arr){
    int[] newArr=new int[arr.length];
    int counter=0;

    for (int i=arr.length-1;i>=0;i--){
      newArr[counter]=arr[i];
      counter++;
      
    }
    return newArr;

  }
}
