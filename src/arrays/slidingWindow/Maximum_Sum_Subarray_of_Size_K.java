package arrays.slidingWindow;

public class Maximum_Sum_Subarray_of_Size_K {
    // Optimized
    public int optimized(int[] nums,int k) {

        int sum = 0;

        for(int i=0;i<k;i++){
            sum += nums[i];
        }

        int left = 0;
        int right = k;
        int maxSum = sum;
        for(int i = k;i<nums.length;i++){
            sum = sum - nums[left] + nums[right];
            left++;
            right++;
            if(sum > maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args){
        System.out.println("Maximum_Sum_Subarray_of_Size_K");
        Maximum_Sum_Subarray_of_Size_K maximumSumSubarrayOfSizeK = new Maximum_Sum_Subarray_of_Size_K();
        int [] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Maximum Sum Subarray of Size K :"+maximumSumSubarrayOfSizeK.optimized(nums,k));
    }
}
