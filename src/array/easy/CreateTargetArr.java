package array.easy;

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArr {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }

        int[] array = new int[list.size()];
        for(int i=0;i<array.length;i++){
            array[i]=list.get(i);
        }

        return array;
    }
}
