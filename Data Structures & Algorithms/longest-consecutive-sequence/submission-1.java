class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet();
        for (int num : nums) hashSet.add(num);
        int max = 0;
        for (int i = 0; !hashSet.isEmpty() && i < nums.length; i++){
            int count = 0;
            int currentNum = nums[i];
            while (hashSet.contains(currentNum)){
                hashSet.remove(currentNum--);
                count++;
            }
            currentNum = nums[i];
            while (hashSet.contains(currentNum+1)){
                hashSet.remove(++currentNum);
                count++;
            }
            if (count > max) max = count;
        }
        return max;
    }
}
