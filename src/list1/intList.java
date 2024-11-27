package list1;

public class intList {
    public int first;
    public intList rest;

    public intList(int f, intList r) {
        first = f;
        rest = r;
    }

    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    public int iterativeSize() {
        intList p = this;
        int size = 0;
        while (p != null) {
            size++;
            p = p.rest;
        }
        return size;
    }

    public int get(int i) {
        if (i == 0) {
            return first;
        }
        return rest.get(i - 1);
    }

    public static void main(String[] args) {
        intList L = new intList(15, null);
        L = new intList(10, L);
        L = new intList(5, L);

        System.out.println(L.size());
        System.out.println(L.iterativeSize());
        System.out.println(L.get(1));
    }
}