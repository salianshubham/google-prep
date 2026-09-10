package arrays;

import arrays.slidingWindow.Maximum_Sum_Subarray_of_Size_K;

import java.util.HashSet;

public class Longest_Consecutive_Sequence {

    public int optimized(int[] nums) {

        HashSet<Integer>hashSet = new HashSet<>();
        for(int num : nums){
            hashSet.add(num);
        }

        int totalCount = 1;
        for(int i=0;i<nums.length;i++){
            if(!hashSet.contains(nums[i]-1)){
                int current = nums[i];
                int count = 0;

                while (hashSet.contains(current)){
                    current++;
                    count++;
                }
                totalCount = Math.max(count,totalCount);
            }

        }
        System.out.println(hashSet);

        return totalCount;
    }

    public static void main(String[] args) {
        System.out.println("Longest_Consecutive_Sequence");
        Longest_Consecutive_Sequence longestConsecutiveSequence = new Longest_Consecutive_Sequence();
        int[] nums = {1, 2, 3, 10, 11};

        System.out.println(longestConsecutiveSequence.optimized(nums));

    }
}
