public class problem_006 {

    public static void main(String[] args) {
        int sumOfSquares = 0;
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sumOfSquares += Math.pow(i, 2);
            sum += i;
        }

        int squaredSum = (int) Math.pow(sum, 2);

        int difference = squaredSum - sumOfSquares;
        System.out.println(difference);
    }
}
