package hus.homework.week8._1;

public class MyArrayList extends MyAbstractList {
    private static final int INITIAL_SIZE = 16;
    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public void add(Object o) {
        if (size >= elements.length - 1) {
            enlarge();
        }
        elements[size++] = o;
    }

    @Override
    public void add(Object o, int index) {
        checkBoundaries(index, size);
        if (size >= elements.length - 1) {
            enlarge();
        }
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = o;
        size++;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size);
        return elements[index];
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index, size);
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    void enlarge() {
        Object[] tmp = new Object[elements.length * 2];
        System.arraycopy(elements, 0, tmp, 0, elements.length);
        elements = tmp;
    }

}
