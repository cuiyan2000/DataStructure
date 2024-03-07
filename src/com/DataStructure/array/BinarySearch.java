package com.DataStructure.array;

import java.net.ServerSocket;

/**
 * @author cuiyan
 * @version 1.0
 */

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int result = binarySearchMethod(target, nums);
        if (result != -1) {
            System.out.println("目标值在数组中的索引为: " + result);
        } else {
            System.out.println("目标值不在数组中");
        }
    }

    public static int binarySearchMethod(int target, int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2; // 使用更精确的中间值计算方法

            if (target == nums[middle]) {
                return middle;
            }

            if (target < nums[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return -1; // 目标值不在数组中
    }
}