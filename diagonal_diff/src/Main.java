import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

  /*
   * Complete the 'diagonalDifference' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts 2D_INTEGER_ARRAY arr as parameter.
   */

  public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int n = arr.size();
    int firstDiagonal = 0;
    int secondDiagonal = 0;
    for (int i = 0; i < n; i++) {
      firstDiagonal += arr.get(i).get(i);
    }
    for (int i = 0; i < n; i++) {
      secondDiagonal += arr.get(i).get(n - i - 1);
    }
    return Math.abs(firstDiagonal - secondDiagonal);

  }

}

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<List<Integer>> arr = new ArrayList<>();

    IntStream.range(0, n).forEach(i -> {
      try {
        arr.add(
            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList())
        );
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });

    int result = Result.diagonalDifference(arr);

    System.out.println(result);

    bufferedReader.close();
  }
}
