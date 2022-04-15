public class BreakContinue {
  public static void windowPosSum(int[] a, int n) {
    /** your code here */ 
    // int arrIndex = 0;
    for(int index = 0; index< a.length; index++) {
        int total = a[index];
        if (total < 0) {
            continue;
        }
        for(int j = index + 1; j <= index + n && j < a.length; j++) {
            total = total + a[j];
        }
        a[index] = total;
    }
  }

  public static void main(String[] args) {
    int[] a = {1, 2, -3, 4, 5, 4};
    int n = 3;
    windowPosSum(a, n);

    // Should print 4, 8, -3, 13, 9, 4
    System.out.println(java.util.Arrays.toString(a));
  }
}