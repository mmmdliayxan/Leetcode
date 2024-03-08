package data_type.easy;

import java.util.Arrays;

public class PowerOfFour {
    public boolean isPowerOfFour(int n) {
        double x = Math.log(n) / Math.log(4);
        if (x % 1 != 0) {
            return false;
        }
        return true;
    }
}
