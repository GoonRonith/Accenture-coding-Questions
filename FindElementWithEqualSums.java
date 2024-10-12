/*
 * You are given an array of integers. The task is to find an element in the array such that the sum of all elements to its left is equal to the sum of all elements to its right. If such an element exists, print its index and value. If no such element exists, output "Not found."

Input:
An array l of integers, where the length of l is at least 1 and at most 1000.
Output:
The index (1-based) and value of the element where the sum of the elements to the left equals the sum of the elements to the right.
If no such element exists, output "Not found."
 */

public class FindElementWithEqualSums {
    public static void main(String[] args) {
        int[] l = {-7,2,4,9,-8,1,6};
        int totalSum = 0;
        for (int i : l) {
            totalSum += i;
            System.out.println(totalSum+"ts");
        }

        int sumLeft = 0;
        boolean found = false;
        for (int i = 0; i < l.length; i++) {
            int sumRight = totalSum - sumLeft - l[i];

            if (sumLeft == sumRight) {
                System.out.println("Found at index " + (i + 1) + ", element -> " + l[i]);
                found = true;
                break;
            }

            sumLeft += l[i];
        }

        if (!found) {
            System.out.println("Not found");
        }
    }
}

