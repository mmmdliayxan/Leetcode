package array.easy;

import java.util.Arrays;
import java.util.Scanner;

public class SmallerNumbers {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] array = new int[nums.length];
        int t=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            array[t++]=count;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] nums =new int[length];
        for(int i=0;i<length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}
