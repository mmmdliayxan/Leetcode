package array.easy;

public class Pairs {
    public static int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array={4,4,5,7,6,5,4};
        System.out.println(numIdenticalPairs(array));
    }
}
