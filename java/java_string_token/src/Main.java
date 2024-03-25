import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    // Write your code here.
    String[] words = Arrays.stream(s.split("[ !,?._'@]"))
        .filter(word -> !word.isEmpty()).toArray(String[]::new);
    System.out.println(words.length);
    for (String word : words) {
      System.out.println(word);
    }
    scan.close();
  }
}