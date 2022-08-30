/**
 * Дано натуральное число N. Напишите метод выводящий все цифры числа по одной, в обычном порядке, разделяя их пробелами или новыми строками.
 * При решении этой задачи нельзя использовать строки, списки, массивы, циклы. Разрешена только рекурсия и целочисленная арифметика.
 */
public class NaturalNumber {
  public static void main(String[] args) {
   naturalNumber(764);
  }

  public static int naturalNumber(int number) {
    if (number >= 10) naturalNumber(number/10);
    System.out.println(number % 10 + " ");
    return number;
  }
}
