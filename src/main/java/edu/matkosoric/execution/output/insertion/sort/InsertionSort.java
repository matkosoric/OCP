package edu.matkosoric.execution.output.insertion.sort;

/*
 * Code examples for Oracle Certified Professional (OCP) Exam 1Z0-819
 * Java 11 SE, 2022.
 * Created by © Matko Soric.
 */

import java.util.Arrays;

public class InsertionSort {

    // insert following line to verify that array is partially sorted
    // assert i < 0 || values[i] <= values[i + 1];
    // after line 6

    public static void main(String[] args) {

        int[] values = new int[]{4, 7, 9, 2, 1};

        insertionSort(values);

    }

    public static void insertionSort(int values[]) {
        int n = values.length;

        for (int j = 1; j < n; j++) {
            int tmp = values[j];
            int i = j - 1;
            while ((i > -1) && (values[i] > tmp)) {
                assert i < 0 || values[i] <= values[i + 1];     // after line 6
                values[i + 1] = values[i];
                i--;
            }
            values[i + 1] = tmp;
        }
        System.out.println(Arrays.toString(values));
    }

}
