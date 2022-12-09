class Solution {
    public int[] searchRange(int[] nums, int target) {
        int index = binarySearch(nums, 0, nums.length-1, target);
        int[] result = {-1, -1};
        if (index != -1) {
            int left  = index;
            int right = index;
            while (left != -1){
                result[0] = left;
                left = binarySearch(nums, 0, left-1, target);
            }
            while (right != -1){
                result[1] = right;
                right = binarySearch(nums, right+1, nums.length-1, target);
            }
        }
        return result;
    }

    private int binarySearch(int[] nums, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] < target) low = mid + 1;
            else if (nums[mid] > target) high = mid - 1;
            else return mid;
        }
        return -1;
    }
}
