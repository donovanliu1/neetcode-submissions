class Solution {
    public boolean isPalindrome(String s) {
        String s2 = s.replaceAll("[^0-9a-zA-z]", "").toLowerCase();
        int leftIndex = 0;
        int rightIndex = s2.length() - 1;
        while (leftIndex <= rightIndex){
            if (s2.charAt(leftIndex) != s2.charAt(rightIndex)) return false;
            leftIndex++;
            rightIndex--;
        }
        return true;
    }
}
