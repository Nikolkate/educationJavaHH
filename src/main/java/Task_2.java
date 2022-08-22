public class Task_2 {

  /**
   * Напишите программу, которая выводит на экран все трехзначные числа, для которых соблюдаются два условия:
   * • само число заканчивается на 0;
   * • сумма нечетных делителей этого числа тоже заканчивается на 0.
   * @param args
   */
  public static void main(String[] args) {
    for(int i=100; i <=999; i++){
      if(i%10 == 0) {
        if(i%1 == 0 & i%9 == 0){
          System.out.println(i);
        } else if (i%3 == 0 & i%7 == 0){
          System.out.println(i);
        }
      }
    }
  }
}
