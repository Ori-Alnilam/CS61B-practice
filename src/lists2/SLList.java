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
    private int size;

    /** 构造函数 */
    public SLList(int x) {
        first = new IntNode(x, null);
        size = 1;
    }

    /** Add x to the front of the list. */
    public void addFirst(int x) {
        size++;

        first = new IntNode(x, first);
    }

    /** Add x to the end of the list. */
    public void addLast(int x) {
        size++;

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

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        SLList L = new SLList(10);
        L.addFirst(5);
        L.addLast(15);
        System.out.println(L.getFirst());
        System.out.println(L.size());

    }
}