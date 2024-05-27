package week9.mylist;

public class MyArrayList extends MyAbstractList {
    int size;
    static final int DEFAULT_CAPACITY = 100;
    Object[] elements;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
    void enlarge() {
        Object[] temp = new Object[size * 2];
        System.arraycopy(elements, 0, temp, 0, elements.length);
        elements = temp;
    }

    @Override
    public void add(Object o) {
        if (size >= elements.length) {
            enlarge();
        }
        elements[size] = o;
        size++;
    }

    @Override
    public void add(Object o, int index) {
        checkBoundaries(index, size);
        if (size >= elements.length) {
            enlarge();
        }
        for (int i = size; i >= index; i--) {
            elements[i] = elements[i-1];
        }
        elements[index] = o;
        size++;
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index, size);
        for (int i = index; i < size; i++) {
            elements[i] = elements[i+1];
        }
        size--;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size);
        return elements[index];
    }

    @Override
    public int size() {
        return this.size;
    }
}

