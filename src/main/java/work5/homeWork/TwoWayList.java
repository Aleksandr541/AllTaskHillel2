package work5.homeWork;

public class TwoWayList<T> implements TwoWayListIterator<T> {
    private TwoWayNode<T> head;
    private TwoWayNode<T> tail;
    private int size;

    @Override
    public void add(Object data) {
        TwoWayNode<T> temp = this.tail;
        TwoWayNode<T> newNode = new TwoWayNode(temp, data, null);
        this.tail = newNode;
        if (head == null) {
            this.head = newNode;
        } else {
            temp.next = newNode;
        }
        this.size++;
    }

    public Object get(int index) {
        if (!isLinkIndex(index)) {
            return null;
        }
        TwoWayNode<T> node = node(index);
        return node.data;
    }

    private TwoWayNode<T> node(int index) {
        if (index < (size >> 1)) {
            TwoWayNode<T> temp = this.head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }
        TwoWayNode<T> temp = this.tail;
        for (int i = size - 1; i > index; i--) {
            temp = temp.prev;
        }
        return temp;
    }

    private boolean isLinkIndex(int index) {
        return index >= 0 && index < size;
    }

    public int size() {
        return this.size;
    }

    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for (TwoWayNode<T> temp = head; temp != null; temp = temp.next) {
            result[i++] = temp.data;
        }
        return result;
    }

    public static <T> void printAvers(TwoWayList<T> list) {
        while (list.hasNext()) {
            System.out.printf(list.next() + ";\n");
        }
    }

    public static <T> void printReverse(TwoWayList<T> list) {
        while (list.hasPrevious()) {
            System.out.printf(list.previous() + ";\n");
        }
    }

    @Override
    public boolean hasNext() {
        return head != null;
    }

    @Override
    public T next() {
        T value = head.data;
        head = head.next;
        return value;
    }

    @Override
    public boolean hasPrevious() {
        return tail != null;
    }

    @Override
    public T previous() {
        T value = tail.data;
        tail = tail.prev;
        return value;
    }


    private static class TwoWayNode<T> {
        private final T data;
        private final TwoWayNode<T> prev;
        private TwoWayNode<T> next;

        public TwoWayNode(TwoWayNode<T> prev, T data, TwoWayNode<T> next) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }

        public static void main(String[] args) {
            TwoWayList<Integer> list = new TwoWayList<Integer>() {{
                add(1);
                add(2);
                add(3);
                add(4);
            }};

            printAvers(list);
            System.out.println();
            printReverse(list);
        }
    }
}