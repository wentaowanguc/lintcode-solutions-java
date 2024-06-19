package solutions.search.findpeakelement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.Assertions.assertThat;

class FindPeakElementTest {

    FindPeakElement solution = new FindPeakElement();

    @Test
    public void emptyInput() {
        int expectedOutput = -1;
        int actualOutput = solution.findPeakElement(null);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void singleElement() {
        int[] input = new int[]{0};
        int expectedOutput = 0;
        int actualOutput = solution.findPeakElement(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void SinglePeak() {
        int[] input = new int[]{1,2,3,4,1};
        int expectedOutput = 3;
        int actualOutput = solution.findPeakElement(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void multiplePeaks() {
        int[] input = new int[]{1, 2, 1, 3, 4, 5, 7, 6};
        int actualOutput = solution.findPeakElement(input);
        assertThat(actualOutput).isIn(1,6);
    }
}