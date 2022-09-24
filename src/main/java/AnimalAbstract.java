public abstract class AnimalAbstract {

  private String type;
  private String color;

  public abstract void play();

  public abstract void hunt();

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
