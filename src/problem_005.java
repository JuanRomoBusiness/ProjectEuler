public class problem_005 {

    // TODO Optimize using least common multiple for a set of numbers
    public static void main(String[] args) {
        int[] divisors = {11, 12, 13, 14, 15, 16, 17, 18, 19}; // Divisors 1...10 are covered
        int dividend;

        outerLoop:
        for (int i = 20; ; i += 20) { // Iterate by largest divisor
            for (int j = 0; j < divisors.length; j++) { // Check if dividend is divisible by all required divisors
                if (i % divisors[j] != 0) {
                    break;
                }
                if (j == divisors.length - 1) { // Dividend is divisible by all required divisors
                    dividend = i;
                    break outerLoop; // Break the nested for loop
                }
            }
        }

        System.out.println(dividend);
    }
}
