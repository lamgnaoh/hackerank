import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0 ; i < n; i++){
      arr[i] = scanner.nextInt();
    }
    int count = 0;
    for (int i = 0; i < n; i++){
      for (int j = i; j<n;j++){ // arr[i...j] is sub array
        int sum = 0;
        for (int k = i ; k <=j; k++){
          sum += arr[k];
        }
        if (sum < 0){
          count ++;
        }
      }
    }
    System.out.println(count);
  }
}