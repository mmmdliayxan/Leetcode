package array.easy;

public class FindMaxAverage {
    public double findMaxAverage(int[] nums, int k) {
        double max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-k+1;i++){
            double sum=0;
            for(int j=i;j<i+k;j++){
                sum+=nums[j];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max/k;
    }
}
