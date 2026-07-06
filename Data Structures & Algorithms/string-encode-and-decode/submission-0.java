class Solution {
    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "";

        List<Integer> wordsSizes = new ArrayList<>(strs.size());
        int encodedSize = 0;
        for (String s : strs) {
            wordsSizes.add(s.length());
            encodedSize += s.length();
        }

        StringBuilder encodedString = new StringBuilder(encodedSize + (wordsSizes.size() * 2));

        for (int wordSize : wordsSizes) {
            encodedString.append(wordSize).append(",");
        }

        encodedString.append("#");

        for (String s : strs) {
            encodedString.append(s);
        }

        return encodedString.toString();
    }

    public List<String> decode(String str) {
        // 2,3#asant
        if (str.isEmpty()) {
            return new ArrayList<>();
        }

        int first = 0;
        int hashIndex = str.indexOf('#');
        int sizes = 0;
        List<Integer> wordsSizes = new ArrayList<>();
        while (first < hashIndex) {
            int next = str.indexOf(',', first);
            if (next == -1) {
                break;
            }
            int wordSize = Integer.parseInt(str.substring(first, next));
            sizes += wordSize;
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
