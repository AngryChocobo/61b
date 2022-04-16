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
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(10, null);
        L.rest.rest = new IntList(15, null);
        L.rest.rest.rest = new IntList(44, null);
        System.out.println(L.size());
        System.out.println(L.iterativeSize());
    }
}
