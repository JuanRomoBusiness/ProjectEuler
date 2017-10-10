import java.util.HashMap;
import java.util.Map;

public class problem_002 {

    private static Map<Integer, Integer> computedFibo = new HashMap<>();

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; ; i++) {
            int fibo = fibonacci(i);
            if (fibo > 4_000_000) {
                break;
            }
            if (fibo % 2 == 0) {
                sum += fibo;
            }
        }
        System.out.println(sum);
    }

    private static int fibonacci(int n) {
        if (n <= 2) {
            return n;
        } else if (computedFibo.containsKey(n)) {
            return computedFibo.get(n);
        }
        int fibo = fibonacci(n - 1) + fibonacci(n - 2);
        computedFibo.put(n, fibo);
        return fibo;
    }
}
