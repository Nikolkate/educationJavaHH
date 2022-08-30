import java.util.Scanner;

public class Circus {
  public static void main(String[] args) {
    circusItems();
  }

  public static void circusItems() {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int coordinateOne = scanner.nextInt();
    int coordinateTwo = scanner.nextInt();
    int radius = scanner.nextInt();

    if (((x - coordinateOne) * (x - coordinateOne) + (y - coordinateTwo) * (y - coordinateTwo)) <= radius * radius) {
      System.out.println("Точка лежит на окружности или внутри");
    } else {
      System.out.println("Точка вне окружности");
    }
  }
}
