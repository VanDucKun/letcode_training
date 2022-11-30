class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> arrResult = new ArrayList<>();
        if(nums.length < 3){
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2;i++){
            if (i>0 && nums[i-1] == nums[i]) continue;
            int j = i +1;
            int k = nums.length - 1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                    if(!arrResult.contains(temp))
                        arrResult.add(temp);
                    j++;
                    k--;
                }
                else if (sum > 0) k--;
                else j++;
            }
        }
        return arrResult;
    }
}