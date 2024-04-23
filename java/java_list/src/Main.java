import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    List<Integer> list =  new ArrayList<>();
    for (int  i = 0 ; i < size ; i++){
      list.add(sc.nextInt());
    }
    int queries = sc.nextInt();
    sc.nextLine();
    for (int i = 0 ; i < queries ; i++){
      String query = sc.next();
      if (query.equals("Insert")){
        list.add(sc.nextInt(),sc.nextInt());
      }else if (query.equals("Delete")){
        list.remove(sc.nextInt());
      }
    }
    for(int element : list){
      System.out.print(element + " ");
    }
  }
}