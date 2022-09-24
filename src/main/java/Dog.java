public class Dog extends Animal{
  public Dog() {
    petOrWild = "домашняя";
    type = "псовых";
    size = "маленьких";
  }

  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.sayMyParametre();
  }
}
