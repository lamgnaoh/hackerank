import java.util.Arrays;

public class Main {
  public static int removeDuplicates(int[] arr) {
    //   TODO
   if(arr.length == 0){
     return 0;
   }
   int i = 0;
   for (int j =1 ; j < arr.length ; j++){
     if (arr[j] != arr[i]){
       i ++;
       arr[i] = arr[j];
     }

   }
   return i +1;
  }


  public static void main(String[] args) {
    System.out.println(removeDuplicates(new int[]{1, 1, 2, 2, 3, 4, 5}));
  }
}