import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {

//    O(n2)
//    Scanner in = new Scanner(System.in);
//    Deque deque = new ArrayDeque<>();
//    int n = in.nextInt();
//    int m = in.nextInt();
//    int maxUnique = Integer.MIN_VALUE;
//    for (int i = 0; i < n; i++) {
//      int num = in.nextInt();
//      if (deque.size() < m){
//        deque.add(num);
//      } else {
//        deque.pollFirst();
//        deque.add(num);
//      }
//      int unique =(int) deque.stream().distinct().count();
//      if (maxUnique < unique){
//        maxUnique = unique;
//      }
//    }
//    System.out.println(maxUnique);

    Scanner in = new Scanner(System.in);
    Deque<Integer> deque = new ArrayDeque<>();
    int n = in.nextInt();
    int m = in.nextInt();
    Set<Integer> set = new HashSet<>(); // set contain unique number of deque
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      int num = in.nextInt();
      deque.add(num);
      set.add(num);
      if (deque.size() == m){
        if (set.size() > max){
          max = set.size();
        }
        int remove = deque.remove();
        if (!deque.contains(remove)){
          set.remove(remove);
        }
      }
    }
    System.out.println(max);

  }

}