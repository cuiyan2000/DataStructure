package com.DataStructure.array;

/**
 * @author cuiyan
 * @version 1.0
 * slowIndex and fastIndex
 */
public class RemoveElement {
    public static void main(String arg[]){
        int target = 4;
        int nums[] = {1, 4 , 5, -2, 6, -3, 0};
        removeElementMethod(target, nums);
        for (int i: nums) {
            System.out.print(i + ", ");
        }
    }
    public static void removeElementMethod(int target, int[] nums){
        int slowIndex = 0;
        for(int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != target) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }

    }
}
