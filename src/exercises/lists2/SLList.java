package exercises.lists2;

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

    /** 构造函数3：接收整数数组，创建链表 */
    public SLList(int[] arr) {
        sentinel = new IntNode(63, null);
        IntNode p = sentinel;
        for (int i : arr) {
            p.next = new IntNode(i, null);
            p = p.next;
        }
        size = arr.length;
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

    /** Delete the first item in the list. */
    public void deleteFirst() {
        if (sentinel.next == null) {
            System.out.println("Empty list!");
            return;
        }
        System.out.println("Delete " + sentinel.next.item);
        sentinel.next = sentinel.next.next;
        size--;
    }

    public int size() {
        return size;
    }

    public void printList() {
        IntNode p = sentinel;
        while (p.next != null) {
            System.out.print(p.next.item + " -> ");
            p = p.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // 测试空链表
        SLList emptyList = new SLList();
        emptyList.deleteFirst();
        emptyList.addLast(20);
        System.out.println(emptyList.getFirst());
        System.out.println(emptyList.size());

        // 测试非空链表
        SLList L = new SLList(10);
        L.addFirst(5);
        L.addLast(15);
        L.deleteFirst();
        System.out.println(L.getFirst());
        System.out.println(L.size());

        // 测试整数数组创建链表
        SLList L2 = new SLList(new int[]{1, 2, 3});
        L2.printList();
        System.out.println(L2.size());
    }
}