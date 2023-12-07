package hus.oop.lab10.iterator_pattern.bai_3;

import java.util.ArrayList;
import java.util.List;

// Define an aggregate interface that provides a way to create an iterator
interface Aggregate {
    Iterator<String> createIterator();
}

// Implement the aggregate interface with a concrete collection class
class ConcreteAggregate implements Aggregate {
    private List<String> items;

    public ConcreteAggregate() {
        items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public Iterator<String> createIterator() {
        return new ConcreteIterator(items);
    }
}

// Define an iterator interface
interface Iterator<T> {
    boolean hasNext();

    T next();
}

// Implement the iterator interface with a concrete iterator class
class ConcreteIterator implements Iterator<String> {
    private List<String> items;
    private int position;

    public ConcreteIterator(List<String> items) {
        this.items = items;
        this.position = 0;
    }

    public boolean hasNext() {
        return position < items.size();
    }

    public String next() {
        if (hasNext()) {
            String item = items.get(position);
            position++;
            return item;
        }
        throw new IndexOutOfBoundsException();
    }
}

// Client code that uses the iterator to iterate over the collection
class Client {
    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.addItem("Item 1");
        aggregate.addItem("Item 2");
        aggregate.addItem("Item 3");

        Iterator<String> iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }

        /*
         * output:
         * Item 1
         * Item 2
         * Item 3
         */
    }
}