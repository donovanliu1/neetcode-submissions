class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashMap = new HashMap();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (hashMap.containsKey(c)) hashMap.replace(c, hashMap.get(c)+1);
            else hashMap.put(c, 1);
        }
        for (int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if (hashMap.isEmpty() || !hashMap.containsKey(c)) return false;
            if (hashMap.get(c) == 1) hashMap.remove(c);
            else hashMap.replace(c, hashMap.get(c)-1);
        }
        return hashMap.isEmpty();
    }
}
