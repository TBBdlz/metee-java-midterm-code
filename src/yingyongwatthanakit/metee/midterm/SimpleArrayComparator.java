/*
  SimpleArrayComparator is a program to
  compare if array is identical or not
  the program sorted 2 array
  and compare them
  Author: Metee Yingyongwatthanakit
  ID: 633040174-2
  Sec: 2
  Date: 18 February 2021
*/
package yingyongwatthanakit.metee.midterm;

import java.util.Arrays;

public class SimpleArrayComparator {
    static int[] array1;
    static int[] array2;

    public static void main(String[] args) {
        int numElement = Integer.parseInt(args[0]);
        array1 = new int[numElement];
        array2 = new int[numElement];
        for (int i = 0; i < numElement; i++) {
            int temp1 = Integer.parseInt(args[i + 1]);
            int temp2 = Integer.parseInt(args[i + 1 + numElement]);
            array1[i] = temp1;
            array2[i] = temp2;
        }
        System.out.print("Array 1 is ");
        printArray(numElement, array1);
        System.out.println();
        System.out.print("Array 2 is ");
        printArray(numElement, array2);
        System.out.println();

        Arrays.sort(array1, 0, numElement);
        Arrays.sort(array2,0,numElement);
        System.out.println("Sorted array1 is");
        printArray(numElement, array1);
        System.out.println();
        System.out.println("Sorted array2 is");
        printArray(numElement, array2);
        System.out.println("\n");

        if (Arrays.equals(array1, array2)) {
            printArray(numElement, array1);
            System.out.print(" is equal to ");
            printArray(numElement, array2);
        } else {
            printArray(numElement, array1);
            System.out.print(" is not equal to ");
            printArray(numElement, array2);
        }
    }

    public static void printArray(int numElement, int[] array1) {
        System.out.print("[");
        for (int j = 0; j < numElement; j++) {
            if (j == numElement - 1) {
                System.out.print(array1[j]);
            } else {
                System.out.print(array1[j] + " ");
            }
        }
        System.out.print("]");
    }
}