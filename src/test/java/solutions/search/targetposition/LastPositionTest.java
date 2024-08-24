package solutions.search.targetposition;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LastPositionTest {

    LastPosition solution = new LastPosition();
    static int[] nums;

    @BeforeAll
    public static void init() {
        nums = new int[]{1,2,2,4,5};
    }

    @Test
    public void emptyInput() {
        int actualOutput = solution.lastPostion(null, 0);
        int expectedOutput = -1;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void notFound() {
        int actualOutput = solution.lastPostion(nums, 6);
        int expectedOutput = -1;
        assertEquals(expectedOutput, actualOutput);
        actualOutput = solution.lastPostion(nums, 3);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void duplicatedNumbers() {
        int actualOutput = solution.lastPostion(nums, 2);
        int expectedOutput = 2;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test void found() {
        int actualOutput = solution.lastPostion(nums, 1);
        int expectedOutput = 0;
        assertEquals(expectedOutput, actualOutput);
    }

}