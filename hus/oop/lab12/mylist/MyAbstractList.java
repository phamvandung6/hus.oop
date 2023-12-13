package hus.oop.lab12.mylist;

public abstract class MyAbstractList implements MyList {
    /**
     * Mô tả dữ liệu của list.
     * 
     * @return mô tả list theo định dạng [a1] [a2] [a3] ... [an]
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");

        for (int i = 0; i < size(); i++) {
            stringBuilder.append(get(i));

            if (i != size() - 1) {
                stringBuilder.append("] [");
            }
        }

        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
