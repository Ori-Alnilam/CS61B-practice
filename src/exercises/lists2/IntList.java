package exercises.lists2;

public class IntList {
    public int first;
    public IntList rest;

    public IntList (int f, IntList r) {
        first = f;
        rest = r;
    }
    /** if 2 numbers in a row are the same, we add them together
     *  and make one large node. For example:
     *  1 → 1 → 2 → 3 becomes 2 → 2 → 3 which becomes 4 → 3 */
    public void addAdjacent() {
        IntList p = this;
        while (p.rest != null) {
            if (p.first == p.rest.first) {
                p.first = p.first * 2;
                p.rest = p.rest.rest;
            } else {
                p = p.rest;
            }
        }
    }

    public void printList() {
        IntList p = this;
        while (p != null) {
            System.out.print(p.first + " -> ");
            p = p.rest;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        IntList L = new IntList(3, null);
        L = new IntList(2, L);
        L = new IntList(1, L);
        L = new IntList(1, L);

        L.addAdjacent();
        L.printList();
    }
}