class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap();
        ArrayList<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (int i = 0; i < buckets.length; i++) buckets[i] = new ArrayList();
        for (int num : nums) hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            buckets[entry.getValue()].add(entry.getKey());
        }
        int[] result = new int[k];
        int count = 0;
        for (int i = buckets.length - 1; i >= 0; i--){
            for (int num : buckets[i]){
                if (count == k) return result;
                result[count] = num;
                count++;
            }
        }
        return result;
    }
}
