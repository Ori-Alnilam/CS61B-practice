package exercises.lists1;

import lists1.IntList;

public class Lists1Exercises {
    /** Returns an IntList identical to L, but with
     * each element incremented by x. L is not allowed
     * to change. */
    public static IntList incrListIterative(IntList L, int x) {
        /* Iterative */
        if (L == null) {
            return null;
        }

        IntList Q = new IntList(L.first + x, null);
        IntList p = L.rest;
        IntList ptr = Q;
        while (p != null) {
            ptr.rest = new IntList(p.first + x, null);
            ptr = ptr.rest;
            p = p.rest;
        }

        return Q;
    }

    /** Recursive */
    public static IntList incrListRecursive(IntList L, int x) {
        if (L == null) {
            return null;
        }
        return new IntList(L.first + x, incrListRecursive(L.rest, x));
    }

    /** Returns an IntList identical to L, but with
     * each element incremented by x. Not allowed to use
     * the 'new' keyword. */
    public static IntList dincrListIterative(IntList L, int x) {
        /* Iterative */
        IntList p = L;
        while (p != null) {
            p.first += x;
            p = p.rest;
        }
        return L;
    }

    /** Recursive */
    public static IntList dincrListRecursive(IntList L, int x) {
        if (L == null) {
            return null;
        }
        L.first += x;
        dincrListRecursive(L.rest, x);

        return L;
    }

    public static void printList(IntList L) {
        while (L != null) {
            System.out.print(L.first + " -> ");
            L = L.rest;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);

        System.out.println(L.size());
        System.out.println(L.iterativeSize());

        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.
        System.out.println(L.get(1));
        printList(L);
        printList(incrListIterative(L, 1));
        printList(incrListRecursive(L, 2));
        printList(dincrListRecursive(L, 3));
        printList(dincrListIterative(L, 1));
    }
}