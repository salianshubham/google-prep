package arrays.TwoPointer;


import java.util.Arrays;

public class Container_With_Most_Water {

    public void optimized(int[] num) {
        int left = 0;
        int right = num.length-1;
        int totalWater = 0;
        while (left < right){
            int width = right - left ;
            int height = Math.min(num[left],num[right]);
            int area = width * height;

            if(num[left] < num[right]){
                left++;
            }else {
                right--;
            }
            if(totalWater<area){
                totalWater = area;
            }
        }
        System.out.println("Max Water Can Be Stored is "+totalWater);

    }

    public static void main(String[] args){
        System.out.println("Container_With_Most_Water");
        Container_With_Most_Water containerWithMostWater = new Container_With_Most_Water();
        int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        containerWithMostWater.optimized(nums);
    }
}
