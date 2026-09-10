package arrays.TwoPointer;

public class twoSum {

    public String optimized(int[] num,int target) {
        int left = 0;
        int right = num.length-1;
        for(int i=0;i<num.length;i++){
            int res = num[left] + num[right];
            if(res == target){
                System.out.println(num[left]+" + "+num[right]+" = "+target);
                return "Found";
            }else if(res < target){
                left++;
            }else {
                right--;
            }
        }
        return "NOT FOUND";
    }

    public static void main(String args []){
        twoSum obj = new twoSum();
        int[] nums = {1, 2, 3, 4, 6, 8};
        int target = 10;

        System.out.println(obj.optimized(nums,target));
    }
}
