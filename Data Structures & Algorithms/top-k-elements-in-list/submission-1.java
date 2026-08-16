class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue((x, y) -> hashMap.get(y) - hashMap.get(x));
        for (int num : nums){
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        int[] distinctNums = hashMap.keySet().stream().mapToInt(Integer::intValue).toArray();
        for (int num : distinctNums){
            priorityQueue.add(num);
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++){
            result[i] = priorityQueue.poll();
        }
        return result;

    }
}
