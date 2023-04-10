package Homework14;

import java.util.Arrays;

public class Except {
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3, 4, 5, 6 };
        int[] nums1 = new int[] { 1, 1, 2, 3, 4};
        // test1();
        // test2();
        // System.out.println(Arrays.toString(test3(nums, nums1)));
        System.out.println(Arrays.toString(test4(nums, nums1)));
    }

    public static void test1() { // java.lang.ArithmeticException
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }

    public static void test2() { // java.lang.ArrayIndexOutOfBoundsException
        int[] nums = new int[] { 1, 2, 3, 4, 5, 6 };
        for (int i = 0; i < nums.length + 1; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int[] test3(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length];
        try {
            for (int i = 0; i < nums1.length; i++) {
                nums3[i] = nums1[i] - nums2[i];

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Массивы разной длины!");
        }
        return nums3;
    }

    public static double[] test4(int[] nums1, int[] nums2) {
        double[] nums3 = new double[nums1.length];
        try {
            for (int i = 0; i < nums1.length; i++) {
                nums3[i] = nums1[i] / nums2[i];

            }
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Массивы разной длины!");
        }
        return nums3;
    }
}
