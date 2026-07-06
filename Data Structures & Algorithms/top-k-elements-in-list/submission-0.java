public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counterMap = new HashMap<>();

        for(int num : nums) {
            counterMap.put(num, counterMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> keysList = new ArrayList<>(counterMap.keySet());

        keysList.sort((a, b) -> counterMap.get(b) - counterMap.get(a));

        int[] result = new int[k];

        for(int i = 0; i < k; i++) {
            result[i] = keysList.get(i);
        }
        return result;
    }
}