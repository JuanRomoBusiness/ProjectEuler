import java.math.BigInteger;

public class problem_048 {

    public static void main(String[] args) {
        BigInteger sum = BigInteger.ZERO;

        for (int i = 1; i <= 1000; i++) {
            BigInteger digit = BigInteger.valueOf(i);
            sum = sum.add(digit.pow(i));
        }

        String lastTenDigits = sum.toString().substring(sum.toString().length() - 10);
        System.out.println(lastTenDigits);
    }
}
