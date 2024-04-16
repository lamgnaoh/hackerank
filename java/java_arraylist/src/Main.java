import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    List<List<Integer>> lists = new ArrayList<>();
    for (int i=0;i<n;i++){
      int d = scanner.nextInt();
      lists.add(new ArrayList<>());
      for (int j = 0; j<d ; j++){
        lists.get(i).add(scanner.nextInt());
      }
    }
    int q = scanner.nextInt();
    int[][] queries = new int[q][2];
    for (int i = 0; i < q ; i++){
      for (int j = 0; j < 2; j++){
        queries[i][j] = scanner.nextInt();
      }
    }
    for (int[] a: queries){
      try{
        Integer i = lists.get(a[0] - 1).get(a[1] - 1);
        System.out.println(i);
      }catch (Exception e){
        System.out.println("ERROR!");
      }
    }

  }
}