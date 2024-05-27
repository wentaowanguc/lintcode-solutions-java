package solutions.search.rotatedsortedarray;

public class FindMinimumInRotatedSortedArray {

    public Integer findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        int start = 0, end = nums.length - 1;

        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[end]) {
                start = mid;
            } else if (nums[mid] < nums[start]) {
                end = mid;
            } else {
                end = mid;
            }
        }

        return Math.min(nums[start], nums[end]);
    }
}
