import java.util.ArrayList;

/***
 * Реализуйте классовую модель автомобиля или любой другой близкой вам предметной области. Модель должна включать:
 * Иерархия классов (родитель и не менее 2 потомков) .
 * Не менее двух интерфейсов, каждый из которых реализован как минимум в одном из классов.
 * Как минимум один абстрактный класс
 * Каждый класс должен содержать не менее 2 полей
 * Должна быть реализация хотя бы одного параметризованного конструктора
 * Реализация инкапсуляции включая разграничение с модификаторами доступа
 * Наличие статических полей и методов
 * Наличие методов в каждом классе
 * Методы должны реализовать какую либо усложненную логику (ветвления, циклы)
 */

public class Animal {
  String size = "small";
  String petOrWild;
  String type;
  public static String location = "Казахстан";

  public void sayMyParametre(){
    System.out.println("Я из семейства " + type + ", я " + petOrWild + " и я " + size + " размеров, место рождения - " + Animal.location);
  }

  public static void main(String[] args) {
    ArrayList<String> animals = new ArrayList<String>();
    animals.add("Псовые");
    animals.add("Кошачьи");
    animals.add("Гиеновые");
    animals.add("Медвежьи");
    animals.forEach( (n) -> { System.out.println(n); } );
  }
}