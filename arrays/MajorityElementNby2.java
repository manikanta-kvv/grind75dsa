package arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementNby2 {

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int majorityElement = 0;
        for(int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], hashMap.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() > (nums.length / 2)) {
                majorityElement = entry.getKey();
            }
        }
        return  majorityElement;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int result = majorityElement(nums);
        System.out.println(result);
    }
}
