import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    /* Enter your code here. Print output to STDOUT. */
    String reverse = new StringBuilder(A).reverse().toString();
    System.out.println(A.compareTo(reverse) == 0 ? "YES" : "NO");
  }
}