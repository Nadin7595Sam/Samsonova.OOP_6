import java.util.ArrayList;
import java.util.List;
class UserIterator<T extends User> implements java.util.Iterator<T> {
    private List<T> userList;
    private int counter;

    public UserIterator(List<T> userList) {
        this.userList = new ArrayList<>(userList);
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < userList.size();
    }

    @Override
    public T next() {
        if (hasNext()) {
            return userList.get(counter++);
        }
        return null;
    }
}