package array.easy;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        int sum=0;
        int[] array =new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                sum=nums[i]+nums[j];
                if(sum==target){
                    array[0]=i;
                    array[1]=j;
                    break;
                }
            }
            if(sum==target){
                break;
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int[] nums= new int[]{3,3};
        int target=6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
