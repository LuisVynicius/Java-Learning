package Data_Structure.LinkedList;

import java.util.Objects;

public class LinkedListFalha<T> {
    private T value;
    private LinkedListFalha<T> nextItem;
    private int length;

    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public LinkedListFalha<T> getNextItem() {
        return nextItem;
    }
    public void setNextItem(LinkedListFalha<T> nextItem) {
        this.nextItem = nextItem;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void add(T value) {
        LinkedListFalha<T> current = this;
        while (true) {
            if (Objects.isNull(current.getValue())) {
                current.setValue(value);
                break;
            } else {
                if (Objects.nonNull(current.getNextItem())) {
                    current = current.getNextItem();
                } else {
                    LinkedListFalha<T> newList = new LinkedListFalha<>();
                    newList.setValue(value);
                    current.setNextItem(newList);
                    break;
                }
            }
        }
    }

    public void remove(T value) {

    }

    public T get(T value) {
        return null;
    }

}
