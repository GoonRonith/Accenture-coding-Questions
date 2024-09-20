#include <stdio.h>
#include <limits.h>

#define MAX_SIZE 100000  // Assuming a maximum possible range for prefix sums
#define OFFSET 50000     // Offset to handle negative prefix sums (must be >= max negative prefix sum)

int solution1(int a[], int n, int k) {
    int len = 0;
    int preSum = 0;

    // Create an array to act as a "hashmap" initialized to -1 (indicating unused indices)
    int prefixSumIndex[MAX_SIZE];
    for (int i = 0; i < MAX_SIZE; i++) {
        prefixSumIndex[i] = -1;
    }

    // Set the prefix sum of 0 at index -1 in the array (to handle the case where preSum equals k early on)
    prefixSumIndex[OFFSET] = 0;

    for (int i = 0; i < n; i++) {
        preSum += a[i];

        // Check if the current prefix sum is equal to the target sum k
        if (preSum == k) {
            len = i + 1;
        }

        // Check if (preSum - k) exists in the prefixSumIndex array
        int sub = preSum - k;
        if (sub + OFFSET >= 0 && sub + OFFSET < MAX_SIZE && prefixSumIndex[sub + OFFSET] != -1) {
            len = (i - prefixSumIndex[sub + OFFSET] + 1 > len) ? i - prefixSumIndex[sub + OFFSET] + 1 : len;
        }

        // Store the first occurrence of the current prefix sum
        if (preSum + OFFSET >= 0 && preSum + OFFSET < MAX_SIZE && prefixSumIndex[preSum + OFFSET] == -1) {
            prefixSumIndex[preSum + OFFSET] = i + 1;
        }
    }

    return len;
}

int main() {
    int a[] = {10, 5, 2, 7, 1, 9};
    int n = sizeof(a) / sizeof(a[0]);
    int k = 15;

    printf("Length of longest subarray with sum %d: %d\n", k, solution1(a, n, k));
    return 0;
}
