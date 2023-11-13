import java.math.BigInteger;

public class Euler25 {
    public static void main(String[] args) {
       BigInteger curr = BigInteger.ONE;
       BigInteger prev = BigInteger.ONE;
       BigInteger temp;

       int index = 2;
       while (curr.toString().length() < 1000){
           temp = curr;
           curr = curr.add(prev);
           prev = temp;

           index++;
       }
        System.out.println("The first index of the first Fibonacci sequence to contain 1000 digits is: " + index);
    }
}
