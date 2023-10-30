import java.util.ArrayList;
import java.util.List;

class StudentImpl implements Student {
    private String firstName;
    private String lastName;
    private int age;

    public StudentImpl(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student: {" +
                "firstName= '" + firstName + '\'' +
                ", lastName= '" + lastName + '\'' +
                ", age= " + age +
                '}';
    }
}