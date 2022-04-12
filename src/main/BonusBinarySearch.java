package main;

public class BonusBinarySearch {

    /**
     * A binary search implementation for integer arrays.
     *
     * Info about binary search: https://www.geeksforgeeks.org/binary-search/
     *
     * @param sortedNumbers - must be sorted from least to greatest
     * @param n - number to search for
     * @return index of search item if it's found, -1 if not found
     */
    public static int binarySearch(int[] sortedNumbers, int n) {
        int rightBoundary = sortedNumbers.length - 1;
        int leftBoundary = 0;
        while (rightBoundary >= leftBoundary) {
            int midPoint = leftBoundary + ((rightBoundary - leftBoundary) / 2);
            if (sortedNumbers[midPoint] > n) {
                rightBoundary = midPoint;
            } else if (sortedNumbers[midPoint] < n) {
                leftBoundary = midPoint;
            } else {
                return midPoint;
            }
        }
        return -1;
    }

}
