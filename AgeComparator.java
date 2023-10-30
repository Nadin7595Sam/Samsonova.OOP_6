import java.util.ArrayList;
import java.util.List;

class AgeComparator implements java.util.Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getAge() - s2.getAge();
    }
}