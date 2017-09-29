import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class problem_013 {

    public static void main(String[] args) {
        BigInteger sum = BigInteger.ZERO;
        try (BufferedReader bf = new BufferedReader(new FileReader("src/problem_013_file.txt"))) {
            String stringValue = bf.readLine();
            while (stringValue != null) {
                BigInteger value = new BigInteger(stringValue);
                sum = sum.add(value);
                stringValue = bf.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error opening file.");
        } catch (IOException e) {
            System.out.println("Error closing file.");
        }

        System.out.println(sum.toString().substring(0, 10));
    }
}
