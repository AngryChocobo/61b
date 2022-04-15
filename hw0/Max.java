public class Max {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        // because every number must bigger than zero
        int max = 0;
        int i = 0;
        while(i < m.length) {
            if (m[i] > max) {
                max = m[i];
            }
            i++;
        }
        
        return max;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};   
       int maxNumber = max(numbers);
       System.out.println(maxNumber);   
    }
}
