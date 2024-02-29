package array.easy;

import java.util.Arrays;
import java.util.Scanner;

public class GetConcatenation {
    public static int[] getConcatenation(int[] nums) {
        int[] array = new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            array[i]=nums[i];
            array[i+nums.length]=nums[i];
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length=sc.nextInt();
        int[] array = new int[length];
        for(int i=0;i<length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(getConcatenation(array)));
    }

}
