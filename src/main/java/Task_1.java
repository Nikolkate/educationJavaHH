import java.util.Scanner;

/**
 * • для чисел, больших 500, - переставляет местами числа единиц и сотен (вместо 672 - 276);
 * • в остальных числах переставляются местами числа десятков и единиц (вместо 363 - 336).
 */
public class Task_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberInt = scanner.nextInt();
    int c = numberInt / 100;
    int b = numberInt / 10 % 10;
    int y = numberInt % 10;

    if(numberInt > 500 & numberInt < 1000) {
      System.out.print(y);
      System.out.print(b);
      System.out.println(c);
    } else if(numberInt <= 500){
      System.out.println(c*100+y*10+b);
    }
  }
}
