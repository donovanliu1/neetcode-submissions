class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap();
        for (int num : nums){
            if (!hashMap.containsKey(num)) hashMap.put(num, 0);
            hashMap.put(num, hashMap.get(num) + 1);
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue(hashMap.size(), (x, y) -> hashMap.get(y) - hashMap.get(x));
        // int[] priorityQueue = 
        // ArrayList<Integer> arrayList = new ArrayList();
        int[] distinctNums = hashMap.keySet().stream().mapToInt(Integer::intValue).toArray();
        for (int num : distinctNums){
            priorityQueue.add(num);
        }
        int[] topKNums = new int[k];
        for (int i = 0; i < k; i++){
            topKNums[i] = priorityQueue.poll();
        }
        return topKNums;
    }
}
