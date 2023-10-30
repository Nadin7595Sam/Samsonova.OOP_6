/*Применяются следующие принципы SOLID:

Принцип открытости/закрытости (OCP):
Мы создаем классы-компараторы для сравнения объектов Userи Student.
Теперь можно легко ввести новые методы сравнения, не изменяя существующий код.

Принцип интерфейсов (ISP):
мы разделяли интерфейсы на более мелкие и примечательные,
чтобы избежать пустых методов.

Принцип Единой Ответственности (SRP):
Отображение объектов студента вынесено в метод toString,
который делает классы более сфокусированными на одной задаче.

Принцип замены Лискова (LSP):
Studentреализован интерфейс User, и оба могут использоваться в компараторах,
что соответствует принципу LSP.*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new StudentImpl("Ivan", "Ivanov", 20);
        Student student2 = new StudentImpl("Vladimir", "Petrov", 22);
        Student student3 = new StudentImpl("Kitty", "Monson", 21);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println();
        students.sort(new NameLengthComparator<>());
        System.out.println("Students sorted by name length:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println();
        students.sort(new AgeComparator());
        System.out.println("Students sorted by age:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
