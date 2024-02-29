package array.easy;

public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int[] array = new int[nums.length];
        for(int i=0;i<nums.length-n;i++){
            array[2*i]=nums[i];
            array[2*i+1]=nums[i+n];
        }

        return array;
    }
}
