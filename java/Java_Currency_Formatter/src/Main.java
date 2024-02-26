import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();

    NumberFormat usNf = NumberFormat.getCurrencyInstance(Locale.US);
    NumberFormat indiaNf = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
    NumberFormat chinaNf = NumberFormat.getCurrencyInstance(Locale.CHINA);
    NumberFormat franceNf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
    String us = usNf.format(payment);
    String india = indiaNf.format(payment);
    String china = chinaNf.format(payment);
    String france = franceNf.format(payment);

    // Write your code here.

    System.out.println("US: " + us);
    System.out.println("India: " + india);
    System.out.println("China: " + china);
    System.out.println("France: " + france);
  }
}