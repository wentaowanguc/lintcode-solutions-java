package solutions.search.rotatedsortedarray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchRotatedSortedArrayTest {
    private  SearchRotatedSortedArray solution = new SearchRotatedSortedArray();

    @Test
    public void emptyList() {
        int target = 1;
        int expectedOutput = -1;
        int actualOutput = solution.searchInRotatedSorteArray(null, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void nonRotating() {
        int target = 1;
        int[] nums = new int[]{1, 2, 3, 4};
        int expectedOutput = 0;
        int actualOutput = solution.searchInRotatedSorteArray(nums, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void notFound() {
        int target = 0;
        int[] nums = new int[]{4, 5, 1, 2, 3};
        int expectedOutput = -1;
        int actualOutput = solution.searchInRotatedSorteArray(nums, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void leftSide() {
        int target = 5;
        int[] nums = new int[]{4, 5, 6, 1, 2, 3};
        int expectedOutput = 1;
        int actualOutput = solution.searchInRotatedSorteArray(nums, target);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void rightSide() {
        int target = 3;
        int[] nums = new int[]{4, 5, 1, 2, 3};
        int expectedOutput = 4;
        int actualOutput = solution.searchInRotatedSorteArray(nums, target);
        assertEquals(expectedOutput, actualOutput);
    }

}