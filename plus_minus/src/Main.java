import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
  public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int n = arr.size();
    int positives = 0;
    int zeros = 0;
    int negatives = 0;
    for (int i = 0; i < n; i++) {
      int num = arr.get(i);
      if (num > 0) {
        positives++;
      } else if (num == 0) {
        zeros++;
      } else {
        negatives++;
      }
    }
    System.out.println(Math.round((double) positives / n * 1000000) / 1000000.0);
    System.out.println(Math.round((double) negatives / n * 1000000) / 1000000.0);
    System.out.println(Math.round((double) zeros / n * 1000000) / 1000000.0);
  }

}

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    Result.plusMinus(arr);

    bufferedReader.close();
  }
}
