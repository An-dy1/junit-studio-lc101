package test;

import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

  // happy paths
  // finds positive number that exists once in sorted list
  // finds negative number that exists once in sorted list
  // returns negative one if number is not in list

  // unhappy paths
  // pass a non-sorted list
  // pass a number that is present twice
  // pass a list that is too large (known possible bug with binary search) - didn't do this one
  // pass an empty array

  int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  int[] sortedArrayWithNegatives = {-30, -25, -15, -2, 0, 1, 4, 6, 9};
  int[] nonSortedArray = {3, 9, 1, 7, 6, 0, 4, -3, 13};
  int[] sortedArrayWithDuplicatesShort = {0, 1, 1, 2, 3, 5, 5, 10, 15};
  int[] sortedArrayWithDuplicatedMed = {0, 1, 1, 2, 3, 5, 5, 10, 15, 27, 30, 31};
  int[] sortedArrayWithDuplicatesLong = {0, 1, 1, 2, 3, 5, 5, 10, 15, 27, 30, 31, 32, 33, 34};
  int[] emptyArray = {};

  @Test
  public void findsNumberThatExistsInSortedList() {
    int numberToFind = 5;
    int actualIndex = BonusBinarySearch.binarySearch(sortedArray, numberToFind);

    assertEquals(4, actualIndex);
  }

  @Test
  public void expectedReturnWhenNumberDoesNotExist() {
    int numberToFind = 20;
    int actualIndex = BonusBinarySearch.binarySearch(sortedArray, numberToFind);

    assertEquals(-1, actualIndex);
  }

  @Test
  public void findsNumberThatExistsInListWithNegatives() {
    int numberToFind = -15;
    int actualIndex = BonusBinarySearch.binarySearch(sortedArrayWithNegatives, numberToFind);

    assertEquals(2, actualIndex);
  }

  @Test
  public void findsFirstIndexOfNumberPresentTwiceInSortedListInMiddle() {
    // show behavior with various lengths of lists
    int numberToFind = 5;
    int actualIndex = BonusBinarySearch.binarySearch(sortedArrayWithDuplicatesShort, numberToFind);

    assertEquals(5, actualIndex);
  }

  @Test
  public void findsIndexOfNumberPresentTwiceNotInMiddle() {
    // works with: sortedArrayWithDuplicatedMed
    // doesn't work with: sortedArrayWithDuplicatesLong

    int numberToFind = 1;
    int actualIndex = BonusBinarySearch.binarySearch(sortedArrayWithDuplicatedMed, numberToFind);

    assertEquals(2, actualIndex);
  }

  // generates an infinite loop - demonstrate with break points
  @Test
  public void doesNotFindNumberInNonSortedArray() {
//    int numberToFind = 13;
    int numberToFind = 4;
    int actualIndex = BonusBinarySearch.binarySearch(nonSortedArray, numberToFind);

    assertEquals(8, actualIndex);
  }

  @Test
  public void doesNotFindNumberInEmpty() {
    // maybe an improvement to throw an exception?

    int numberToFind = 4;
    int actualIndex = BonusBinarySearch.binarySearch(emptyArray, numberToFind);

    assertEquals(-1, actualIndex);
  }


}
