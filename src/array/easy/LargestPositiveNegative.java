package array.easy;

public class LargestPositiveNegative {
    public static int findMaxK(int[] nums) {
        int[] array = new int[nums.length];
        int t=0;
        int count;
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]*(-1)){
                    count=1;
                    break;
                }
            }
            if(count!=0&&nums[i]>0){
                array[t++]=nums[i];
            }

        }
        if(array==null){
            return -1;
        }

        int max=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max ;
    }

    public static void main(String[] args) {
        int[] nums={-10,8,6,7,-2,-3};
        System.out.println(findMaxK(nums));
    }
}
