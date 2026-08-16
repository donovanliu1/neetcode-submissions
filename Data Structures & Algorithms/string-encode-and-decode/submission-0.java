class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String str : strs){
            encodedString.append(String.format("%03d%s", str.length(), str));
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedString = new ArrayList();
        int charIndex = 0;
        while (charIndex < str.length()){
            int wordLength = Integer.parseInt(str.substring(charIndex, charIndex+3));
            charIndex += 3;
            if (wordLength == 0) decodedString.add("");
            else if (charIndex >= str.length()) break;
            else{
                decodedString.add(str.substring(charIndex, charIndex+wordLength));
            }
            charIndex += wordLength;
        }
        return decodedString;
    }
}
