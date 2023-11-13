import java.math.BigInteger;

public class Euler20 {
    public static void main(String[] args) {
        int n = 100;
        BigInteger fact = BigInteger.ONE;;
        for (int i = 2; i <= n; i++){
            fact = fact.multiply(BigInteger.valueOf(i)) ;
        }
        int sum = 0;
        while (fact.compareTo(BigInteger.ZERO) > 0) {
            sum += fact.mod(BigInteger.TEN).longValue();
            fact = fact.divide(BigInteger.TEN);
        }
        System.out.println(sum);
    }
}

