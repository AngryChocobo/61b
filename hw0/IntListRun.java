public class IntListRun {
    public static class IntList {
        public int first;
        public IntList rest;

        public IntList(int f, IntList r) {
            first = f;
            rest = r;
        }

        public int size() {
            if (rest == null) {
                return 1;
            }
            return 1 + rest.size();
        }

        public int iterativeSize() {
            int count = 0;
            IntList current = this;
            while (current != null) {
                count++;
                current = current.rest;
            }
            return count;
        }

        public int get(int i) {
            if (i > size()) {
                throw new Error("越界");
            }
            int index = 1;
            IntList p = this;
            while (index < i) {
                p = p.rest;
                index++;
            }
            return p.first;
        }
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(10, null);
        L.rest.rest = new IntList(15, null);
        L.rest.rest.rest = new IntList(44, null);
        System.out.println(L.size());
        System.out.println(L.iterativeSize());
        System.out.println(L.get(2));
    }
}
