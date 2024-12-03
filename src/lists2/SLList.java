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
    /** 实例变量 */
    private IntNode first;

    /** 构造函数 */
    public SLList(int x) {
        first = new IntNode(x, null);
    }

    /** Add x to the front of the list. */
    public void addFirst(int x) {
        first = new IntNode(x, first);
    }

    /** Add x to the end of the list. */
    public void addLast(int x) {
        IntNode p = first;

        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    /** Return the first item in the list. */
    public int getFirst() {
        return first.item;
    }

    public int iterativeSize() {
        int size = 0;
        IntNode p = first;
        while (p != null) {
            size++;
            p = p.next;
        }
        return size;
    }

    /** Return the size of the list that starts at IntNode p. */
    public static int size(IntNode p) {
        if (p.next == null) {
            return 1;
        }
        return 1 + size(p.next);
    }

    public int size() {
        return size(first);
    }

    public static void main(String[] args) {
        SLList L = new SLList(15);
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);
        System.out.println(L.getFirst());
        System.out.println(L.size());

    }
}