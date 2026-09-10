package arrays.TwoPointer;

import java.util.Arrays;

public class ThreeSum {

    public void optimized(int[] num) {
        Arrays.sort(num);

        for (int A = 0; A < num.length - 2; A++) {

            if (A > 0 && num[A] == num[A - 1]) {
                continue;
            }

            int left = A + 1;
            int right = num.length - 1;
            while (left < right){
                int res = num[left] + num[right];
                if(res == -num[A]){
                    System.out.println("[ "+num[A]+" ,"+num[left]+" ,"+num[right]+" ]");
                    left++;
                    right--;
                }else if(res < -num[A]){
                    left++;
                }else {
                    right--;
                }
            }
        }

    }


    public static void main(String args[]){
        System.out.println("3 Sum");
        ThreeSum threeSum = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        threeSum.optimized(nums);


    }
}
