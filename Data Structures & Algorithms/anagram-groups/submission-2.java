class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap();
        for (String str : strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            if (hashMap.containsKey(sortedString)) hashMap.get(sortedString).add(str);
            else hashMap.put(sortedString, new ArrayList<String>(Arrays.asList(str)));
        }
        return new ArrayList<>(hashMap.values());
    }
}
