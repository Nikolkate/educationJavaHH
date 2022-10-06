import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class Student {

  String name;
  String group;
  int course;
  Map<String, Integer> grades;

  public Student(String name, String group, int course, HashMap<String, Integer> grades) {
    this.name = name;
    this.group = group;
    this.course = course;
    this.grades = grades;
  }

  public String getName() {
    return name;
  }

  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public int getCourse() {
    return course;
  }

  public void setCourse(int course) {
    this.course = course;
  }

  public Map<String, Integer> getGrades() {
    return grades;
  }

  public static void main(String[] args) {
    Student student1 = new Student("Miu", "1", 1, new HashMap<>(
        Map.of("Math", 3, "Franch", 3, "Sport", 2, "Music", 2))
    );

    Student student2 = new Student("Mour", "2", 4, new HashMap<>(
        Map.of("Math", 3, "Franch", 3, "Sport", 3, "Music", 3))
    );

    Student student3 = new Student("Danna", "A1", 1, new HashMap<>(
        Map.of("Math", 5, "Franch", 3, "Sport", 5, "Music", 3))
    );

    List<Student> studentsBefore = new ArrayList<>();

    studentsBefore.add(student1);
    studentsBefore.add(student2);
    studentsBefore.add(student3);
    printStudents(studentsBefore, 4);
  }

  public static void printStudents(List<Student> students, int course) {
    ListIterator<Student> iterator = students.listIterator();
    while (iterator.hasNext()) {
      Student student = iterator.next();
      if (course == student.getCourse()) {
        System.out.println("Студент + " + course + " курса - " + student.getName());
      }
    }
  }
}
