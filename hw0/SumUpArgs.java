public class SumUpArgs {
    public static void main(String[] args) {
        int total = 0;
        for (String i : args) {
            total += Integer.parseInt(i);
        }
        System.out.println(total);
    }
}
