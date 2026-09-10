package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge_Intervals {

    public ArrayList<int[]> optimized(int[][] nums) {
        for(int[] num:nums){
            System.out.print("["+num[0]+" "+num[1]+"]");
        }
        System.out.println();
        Arrays.sort(nums,(a,b)->Integer.compare(a[0],b[0]));
        System.out.println("After Sort");
        for(int[] num:nums){
            System.out.print("["+num[0]+" "+num[1]+"]");
        }
        ArrayList<int[]>result = new ArrayList<>();

        for(int i= 0;i<nums.length;i++){
            if(result.isEmpty()){
                result.add(nums[i]);

            } else if (result.get(result.size()-1)[1] >= nums[i][0]) {
                int[] split = new int[2];
                split[0] = result.get(result.size()-1)[0];
                split[1] = Math.max(result.get(result.size()-1)[1], nums[i][1]);
                result.set(result.size()-1,split);
            }else {
                result.add(nums[i]);
            }

        }
        return result;
    }

    public static void main(String[] args){
        System.out.println("Merge Intervals");
        Merge_Intervals mergeIntervals = new Merge_Intervals();
        int[][] intervals = {
                {5, 7},
                {1, 3},
                {2, 6},
                {8, 10}
        };
        ArrayList<int[]> result = mergeIntervals.optimized(intervals);
        System.out.println("Merge Intervals : ");
        for(int[] num : result){
            System.out.print("["+num[0]+" "+num[1]+"]");
        }
    }
}
