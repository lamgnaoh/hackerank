import java.util.Scanner;
import java.util.Stack;

public class Main {

  public static void main(String[] argh) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNext()) {
      String input = sc.next();
      //Complete the code
      if (input.isEmpty()) {
        System.out.println("true");
      }
      char[] charArrays = input.toCharArray();
      Stack<Character> stack = new Stack<>();
      for (char c : charArrays) {

        if (!stack.empty() && ((stack.peek() == '{' && c == '}') ||
              (stack.peek() == '(' && c == ')') ||
              (stack.peek() == '[' && c == ']'))) {
            stack.pop();
        } else {
          stack.push(c);
        }
      }
      if (stack.empty()) {
        System.out.println("true");
      } else {
        System.out.println("false");
      }
    }

  }
}