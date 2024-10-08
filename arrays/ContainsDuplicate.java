package arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {


     public static boolean containsDuplicate(int[] nums) {
         Map<Integer, Integer> hashMap = new HashMap<>();
         for(int i = 0; i < nums.length; i++) {
             if(hashMap.containsKey(nums[i])) {
                 return  true;
             }
             hashMap.put(nums[i], 1);
         }
         return  false;
     }

    public static void main(String[] args) {
         int[] nums = {1,1,1,3,3,4,3,2,4,2};
         boolean result = containsDuplicate(nums);
        System.out.println(result);


    }
}
