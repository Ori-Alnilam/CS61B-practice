package lists2;

public class SLList {
    /** 嵌套类 */
    public static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }
    /** The first item (if it exists) is at sentinel.next. */
    private final IntNode sentinel;
    private int size;

    /** 构造函数1: 空列表 */
    public SLList() {
        // Empty List
        sentinel = new IntNode(63, null);
        size = 0;
    }
    /** 构造函数2 */
    public SLList(int x) {
        sentinel = new IntNode(63, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    /** Add x to the front of the list. */
    public void addFirst(int x) {
        size++;

        sentinel.next = new IntNode(x, sentinel.next);
    }

    /** Add x to the end of the list. */
    public void addLast(int x) {
        size++;

        IntNode p = sentinel;

        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    /** Return the first item in the list. */
    public int getFirst() {
        return sentinel.next.item;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        SLList emptyList = new SLList();
        emptyList.addLast(20);
        System.out.println(emptyList.getFirst());
        System.out.println(emptyList.size());

        SLList L = new SLList(10);
        L.addFirst(5);
        L.addLast(15);
        System.out.println(L.getFirst());
        System.out.println(L.size());
    }
}