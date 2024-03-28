package string.medium;

import java.math.BigInteger;

public class MultiplyString {
    public String multiply(String num1, String num2) {
        BigInteger b1=  new BigInteger(num1);
        BigInteger b2= new BigInteger(num2);
        return b1.multiply(b2).toString();
    }
}
