class Solution {
    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "";

        List<Integer> wordsSizes = new ArrayList<>(strs.size());
        int encodedSize = 0;
        for (String s : strs) {
            int sLength = s.length();
            wordsSizes.add(sLength);
            encodedSize += sLength + ((sLength == 0) ? 1 : (int) Math.log10(Math.abs(sLength)) + 1);
        }

        StringBuilder encodedString = new StringBuilder(encodedSize + wordsSizes.size() + 1);
        
        for (int wordSize : wordsSizes) {
            encodedString.append(wordSize).append(",");
        }

        encodedString.append("#");

        for (String s : strs) {
            encodedString.append(s);
        }

        System.out.println("encodedString size: " + encodedString.length());
        System.out.println("CalculatedSize: " + encodedSize + wordsSizes.size() + 1);
        
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        if (str.isEmpty()) {
            return new ArrayList<>();
        }

        int first = 0;
        int hashIndex = str.indexOf('#');
        List<Integer> wordsSizes = new ArrayList<>();
        while (first < hashIndex) {
            int next = str.indexOf(',', first);
            if (next == -1) {
                break;
            }
            int wordSize = Integer.parseInt(str.substring(first, next));
            wordsSizes.add(wordSize);
            first = next + 1;
        }

        List<String> words =  new ArrayList<>(wordsSizes.size());
        int index = hashIndex + 1;
        for (int wordSize : wordsSizes) {
            words.add(str.substring(index, index + wordSize));
            index += wordSize;
        }
        return words;
    }
}
