import java.math.BigInteger;

public class problem_016 {

    public static void main(String[] args) {
        BigInteger digit = BigInteger.valueOf(2);
        BigInteger poweredDigit = digit.pow(1000);

        String poweredDigitStr = poweredDigit.toString();
        int sum = 0;
        for (int i = 0; i < poweredDigitStr.length(); i++) {
            int num = Character.getNumericValue(poweredDigitStr.charAt(i));
            sum += num;
        }

        System.out.println(sum);
    }
}
