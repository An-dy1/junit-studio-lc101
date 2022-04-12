package test;

import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

  int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  int[] sortedArrayWithNegatives = {-30, -25, -15, -2, 0, 1, 4, 6, 9};
  int[] nonSortedArray = {3, 9, 1, 7, 6, 0, 4, -3, 13};
  int[] sortedArrayWithDuplicates = {0, 1, 1, 2, 3, 5, 5, 10, 15, 27, 30};

  @Test
  public void findsNumberThatExistsInSortedList() {
    int numberToFind = 5;
    int actualIndex = BonusBinarySearch.binarySearch(sortedArray, numberToFind);

    assertEquals(4, actualIndex);
  }

  @Test
  public void findsFirstIndexOfNumberPresentTwiceInSortedList() {
    int numberToFind = 5;
    int actualIndex = BonusBinarySearch.binarySearch(sortedArrayWithDuplicates, numberToFind);

    assertEquals(5, actualIndex);
  }

}
