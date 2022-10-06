import java.util.Map;

public class Student {
  String name;
  String group;
  int course;
  Map<String, Integer> grades;

  static class Builder {
    String name;
    String group;
    int course;
    Map<String, Integer> grades;
    private Student student;

    public void localStudent(Builder builder) {
      this.name = builder.name;
      this.group = builder.group;
      this.course = builder.course;
      this.grades = builder.grades;
    }

    public Builder() {
      student = new Student();
    }

    public Student.Builder withName(String name) {
      student.name = name;
      return this;
    }

    public Student.Builder withGroup(String group) {
      student.group = group;
      return this;
    }

    public Student.Builder withCourse(int course) {
      student.course = course;
      return this;
    }

    public Student build() {
      return student;
    }
  }

  public static void main(String[] args) {
    Student student = new Student.Builder()
        .withName("Miu")
        .withGroup("a")
        .withCourse(1)
        .build();
  }
}
