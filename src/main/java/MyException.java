import java.io.IOException;
import java.util.Scanner;

/**
 * Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
 * Login должен содержать только латинские буквы, цифры и знак подчеркивания.
 * Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
 * Password должен содержать только латинские буквы, цифры и знак подчеркивания. Длина password должна быть меньше 20 символов.
 * Также password и confirmPassword должны быть равны. Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
 * WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию,
 * второй принимает сообщение исключения и передает его в конструктор класса Exception.
 * Обработка исключений проводится внутри метода.
 * Используем multi-catch block.
 * Метод возвращает true, если значения верны или false в другом случае.
 */
public class MyException {
  public static void main(String[] args) throws WrongLoginException {
    Scanner scanner = new Scanner(System.in);
    String login = scanner.nextLine();
    String password = "123_d";
    String confirmPassword = "123";
    int loginInt = login.length();

    if (loginInt > 20) {
      throw new WrongLoginException("Логин должен содержать меньше 20-ти символов");
    }

    if (password != confirmPassword) {
      try {
        throw new WrongPasswordException();
      } catch (WrongPasswordException e) {
        e.printStackTrace();
      }
    }

      try {
        if (login.contains(".")) {
          throw new WrongLoginException("Содержит недопустимый символ в логине");
        }
      } catch (IllegalArgumentException e) {
        e.printStackTrace();
      } catch (SecurityException e) {
        e.printStackTrace();
      }
    }
}
