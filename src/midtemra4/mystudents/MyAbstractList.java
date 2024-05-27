package midtemra4.mystudents;

public abstract class MyAbstractList implements MyList {
    /**
     * Mô tả dữ liệu của list.
     * @return mô tả list theo định dạng [a1] [a2] [a3] ... [an]
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder s = new StringBuilder();
        if (size() != 0) {
            for (int i = 0; i < size(); i++) {
                s.append(String.format("[%s] ",this.get(i)));
            }
            s.delete(s.length()-1,s.length());
        }
        return s.toString();
    }

    public static void checkBoundaries(int index, int limit) {
        if (index < 0 || index >= limit) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void checkEmpty(int size) {
        if (size == 0) {
            throw new IllegalArgumentException("Empty List");
        }
    }
}
