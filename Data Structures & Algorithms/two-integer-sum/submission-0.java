class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap();
        for (int i = 0; i < nums.length; i++){
            int difference = target - nums[i];
            if (hashMap.containsKey(difference)) return new int[]{hashMap.get(difference), i};
            hashMap.putIfAbsent(nums[i], i);
        }
        return new int[0];
    }
}
