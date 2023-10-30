import java.util.ArrayList;
import java.util.List;
class NameLengthComparator<T extends User> implements java.util.Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getFirstName().length() - o2.getFirstName().length();
    }
}