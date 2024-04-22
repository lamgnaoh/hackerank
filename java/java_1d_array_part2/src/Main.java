import java.util.*;

public class Main {

  public static boolean canWin(int leap, int[] game) {
    // Return true if you can win the game; otherwise, return false.
    return canWinWithPosition(0,leap,game);

  }

  private static boolean canWinWithPosition(int position, int leap, int[] game) {
    if (position < 0 || game[position] == 1){ // if game[position] == 1 and all 4 case is false so cannot move -> false
      return false;
    }
    if (position == game.length - 1 || position + leap >= game.length) {
      return true;
    }
    game[position] = 1; // mark as resolve
    return canWinWithPosition(position+1 , leap,game) || canWinWithPosition(position -1 ,leap,game)
        || canWinWithPosition(position + leap ,leap,game);
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int q = scan.nextInt();
    while (q-- > 0) {
      int n = scan.nextInt();
      int leap = scan.nextInt();

      int[] game = new int[n];
      for (int i = 0; i < n; i++) {
        game[i] = scan.nextInt();
      }

      System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
    }
    scan.close();
  }
}