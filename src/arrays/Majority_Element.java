package arrays;


public class Majority_Element {

    public int optimized(int[] nums) {
        
        int candidate = 0;
        int count = 0;
        
        for(int num : nums){
            if(count==0){
                candidate  = num;
                count++;
            } else if (num == candidate) {
                count++;
            }else {
                count--;
            }
        }
        
        return candidate;
    }

    public static void main(String[] args){
        System.out.println("Majority Element");

        Majority_Element majorityElement = new Majority_Element();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element in array is : "+majorityElement.optimized(nums));

        int[] nums1 = {3, 3, 4, 3, 2, 3, 3};
        System.out.println("Majority Element in array is : "+majorityElement.optimized(nums1));
    }
}
