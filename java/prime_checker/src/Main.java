import java.util.List;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}

class Prime {

  private List<Integer> primeList;

  public void checkPrime(int n) {
    for (int i = 2; i < Math.sqrt(n); i++) {
      if (n % i == 0) {
        return;
      }
    }
    primeList.add(n);
    for (int i = 0; i < primeList.size(); i++) {
      if (i != primeList.size() - 1) {
        System.out.print(primeList.get(i) + " ");
      } else {
        System.out.println(primeList.get(i));
      }
    }
  }

}