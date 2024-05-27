package solutions.search.rotatedsortedarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindMinimumInRotatedSortedArrayTest {

    FindMinimumInRotatedSortedArray solution = new FindMinimumInRotatedSortedArray();

    @Test
    public void emptyArray() {
        Integer expectedOutput = null;
        Integer actualOutput = solution.findMin(null);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void sortedArray() {
        int[] rotatedSortedArray = new int[] {0,1,2,3,4,5,6};
        int expectedOutput = 0;
        int acutalOutput = solution.findMin(rotatedSortedArray);

        assertEquals(expectedOutput, acutalOutput);
    }

    @Test
    public void rotatedSortedArray() {
        int[] rotatedSortedArray = new int[] {4,5,6,7,0,1,2};
        int expectedOutput = 0;
        int acutalOutput = solution.findMin(rotatedSortedArray);

        assertEquals(expectedOutput, acutalOutput);
    }

    @Test
    public void rotatedLastOneSortedArray() {
        int[] rotatedSortedArray = new int[] {7,0,1,2,3,4,5,6};
        int expectedOutput = 0;
        int acutalOutput = solution.findMin(rotatedSortedArray);

        assertEquals(expectedOutput, acutalOutput);
    }

    @Test
    public void rotatedFirstOneSortedArray() {
        int[] rotatedSortedArray = new int[] {1,2,3,4,5,6,0};
        int expectedOutput = 0;
        int acutalOutput = solution.findMin(rotatedSortedArray);

        assertEquals(expectedOutput, acutalOutput);
    }

    @Test
    public void roatedShortSortedArray() {
        int[] rotatedSortedArray = new int[] {2,1};
        int expectedOutput = 1;
        int acutalOutput = solution.findMin(rotatedSortedArray);

        assertEquals(expectedOutput, acutalOutput);
    }

}