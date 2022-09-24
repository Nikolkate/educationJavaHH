public class Chihuahua extends Dog implements AnimalInterface{

  @Override
  public String run(){
    return "Чихуахуа бегает";
  }

  @Override
  public String play(){
    return "Чихуахуа играет";
  }
}
