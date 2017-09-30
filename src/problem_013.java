import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigInteger;

public class problem_013 {

    public static void main(String[] args) throws Exception {
        BigInteger sum = BigInteger.ZERO;
        BufferedReader bf = new BufferedReader(new FileReader("problem_013_file.txt"));
        String value = bf.readLine();
        while (value != null) {
            sum = sum.add(new BigInteger(value));
            value = bf.readLine();
        }
        System.out.println(sum.toString().substring(0, 10));
    }
}
