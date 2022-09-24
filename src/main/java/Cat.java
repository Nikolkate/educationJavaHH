public class Cat extends Animal{
  public Cat() {
    petOrWild = "дикая";
    type = "кошачьих";
    size = "больших";
  }

  public static void main(String[] args) {
    String type = "псовых";

    if(type == "кошачьих") {
      Cat cat = new Cat();
      cat.sayMyParametre();
    } else {
      System.out.println("Кошка не из кошачьего рода");
    }
  }
}
