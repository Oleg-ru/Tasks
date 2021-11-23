package leetcode.solutions;

import java.util.HashMap;
import java.util.Map;

/*
    1. Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
 */
public class L1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] resultArr = new int[2];
        Map<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                resultArr[1] = i;
                resultArr[0] = hashMap.get(target - nums[i]);
                return resultArr;
            }
            hashMap.put(nums[i], i);
        }
        return resultArr;
    }

    public static void main(String[] args) {
        int[] iz = {2,7,11,15,16,40,67};
        int[] re = twoSum(iz, 56);
        System.out.println(re[0] + " " + re[1]);
    }
}
