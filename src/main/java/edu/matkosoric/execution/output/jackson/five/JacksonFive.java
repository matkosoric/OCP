package edu.matkosoric.execution.output.jackson.five;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

public class JacksonFive {

    // how to print numbers one to five in console with given print() method
    // use method method 2, 4 and 5

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};

//        print1(nums);   // does not compile
        print2(nums);
//        print3(nums);   // runtime error: java.lang.ArrayIndexOutOfBoundsException
        print4(nums);
//        print5(nums);   // var not allowed in compound declaration
    }

    private static void print1(int[] nums) {

        // does not compile
//        for (int i = 0; ++i && i < nums.length; ) {
//            System.out.println(nums[i]);
//        }

    }

    private static void print2(int[] nums) {
        for (var i = 0; i < nums.length; ++i) {
            System.out.println(nums[i]);
        }
    }

    private static void print3(int[] nums) {
        for (var i = nums.length; i > 0; i--) {
            System.out.println(nums[i]);
        }
    }


    private static void print4(int[] nums) {
        for (int j = 0, i = j; i <= nums.length - 1; i++) {
            System.out.println(nums[i]);
        }
    }

    // does not compile
//    private static void print5(int[] nums) {
//        for (var j = 0, i = j; i <= nums.length - 1; ++i) {
//            System.out.println(nums[i]);
//        }
//    }

}
