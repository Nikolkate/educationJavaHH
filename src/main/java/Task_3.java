import java.util.Scanner;

public class Task_3 {
  /***
   * В инструкции по пользованию лифтом в торговом центре написано: «Не более 6 человек или не более 450 кг».
   * Перед входом в лифт установлен прибор, который подсчитывает входящих в лифт и определяет вес до входа в лифт.
   * Прибор автоматически прекращает доступ к лифту, если вход очередного человека может нарушить инструкцию.
   * Напишите программу, которая принимает с клавиатуры значения, каждое из которых - вес очередного человека, входящего в лифт.
   * Ввод данных продолжается до тех пор, пока соблюдается требование, указанное в инструкции.
   * Программа должна выводить на экран следующую итоговую информацию:
   * • количество людей, вошедших в лифт;
   * • общий их вес;
   * • причина, по которой прекращен вход людей в лифт.
   * @param args
   */
  public static void main(String[] args) {
    int totalPeople = 0;
    int totalWeight = 0;

    while(totalPeople <= 6 | totalWeight <= 450){
      Scanner scanner = new Scanner(System.in);
      int weight = scanner.nextInt();
      totalPeople++;
      totalWeight = weight + totalWeight;
      if(totalPeople > 6){
        System.out.println("Причина, по которой прекращен вход людей в лифт: достигнуто максимальное количество человек");
        break;
      }
      if(totalWeight > 450){
        System.out.println("Причина, по которой прекращен вход людей в лифт: достигнут максимальный размер веса пассажиров");
        break;
      }
      System.out.println("Количество людей, вошедших в лифт: " + totalPeople);
      System.out.println("Общий их вес: " + totalWeight);
    }
  }
}