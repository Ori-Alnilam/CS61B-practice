package lists3;

/** Using generics to support creating linked lists of different types. */
public class SLList<T> {
    /** 嵌套类 */
    public class StuffNode { // Delete "static"
        public T item;
        public StuffNode next;

        public StuffNode(T i, StuffNode n) {
            item = i;
            next = n;
        }
    }    /** The first item (if it exists) is at sentinel.next. */
    private final StuffNode sentinel;
    private int size;

    /** 构造函数1: 空列表 */
    public SLList() {
        // Empty List
        sentinel = new StuffNode(null, null);
        size = 0;
    }
    /** 构造函数2 */
    public SLList(T x) {
        sentinel = new StuffNode(null, null);
        sentinel.next = new StuffNode(x, null);
        size = 1;
    }

    /** Add x to the front of the list. */
    public void addFirst(T x) {
        size++;

        sentinel.next = new StuffNode(x, sentinel.next);
    }

    /** Add x to the end of the list. */
    public void addLast(T x) {
        size++;

        StuffNode p = sentinel;

        while (p.next != null) {
            p = p.next;
        }
        p.next = new StuffNode(x, null);
    }

    /** Return the first item in the list. */
    public T getFirst() {
        return sentinel.next.item;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        SLList<String> L2 = new SLList<>();
        L2.addLast("apple");
        L2.addFirst("orange");
        System.out.println(L2.getFirst());
        System.out.println(L2.size());

        SLList<Integer> emptyList = new SLList<>();
        emptyList.addLast(20);
        System.out.println(emptyList.getFirst());
        System.out.println(emptyList.size());

        SLList<Integer> L = new SLList<>(10);
        L.addFirst(5);
        L.addLast(15);
        System.out.println(L.getFirst());
        System.out.println(L.size());

    }
}