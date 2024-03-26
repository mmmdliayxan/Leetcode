package array.easy;

public class LeftRightDifference {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int t=0;
        int[] rightSum = new int[nums.length];
        int k=0;

        int[] leftRightDifference = new int[nums.length];
        int sum1,sum2;
        for(int i=0;i<nums.length;i++){
            sum1=0;
            for(int j=0;j<i;j++){
                sum1+=nums[j];
            }
            sum2=0;
            for(int j=i+1;j<nums.length;j++){
                sum2+=nums[j];
            }
            leftSum[t++]=sum1;
            rightSum[k++]=sum2;
        }
        for(int i=0;i<t;i++){
            leftRightDifference[i]=Math.abs(leftSum[i]-rightSum[i]);
        }
        return leftRightDifference;

    }
}
