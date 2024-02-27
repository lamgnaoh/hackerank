import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static String getSmallestAndLargest(String s, int k) {
    String largest = "";
    for (int i = 0; i <= s.length() - k; i++) {
      int end = i + k;
      String substr = s.substring(i, end);
      if (largest.compareTo(substr) < 0) {
        largest = substr;
      }
    }
    String smallest = largest;
    for (int i = 0; i <= s.length() - k; i++) {
      int end = i + k;
      String substr = s.substring(i, end);
      if (smallest.compareTo(substr) > 0) {
        smallest = substr;
      }
    }
    return smallest + "\n" + largest;
  }


  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println(getSmallestAndLargest("welcometojava", 3));
  }
}