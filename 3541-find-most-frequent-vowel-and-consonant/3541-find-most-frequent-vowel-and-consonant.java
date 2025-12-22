class Solution {
    public int maxFreqSum(String s) {
        Set<Character> vowels= Set.of('a','e','i','o','u');
        Map<Character, Integer> freq = new HashMap<>();

        for (char ch : s.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        }

        int maxVowel =0, maxConsonant=0;

        for (Map.Entry<Character,Integer> entry: freq.entrySet()){
            char ch = entry.getKey();
            int count = entry.getValue();
            if (vowels.contains(ch)) {
                maxVowel = Math.max(maxVowel, count);
            } else {
                maxConsonant = Math.max(maxConsonant, count);
            }
        }
        return maxVowel + maxConsonant;
    }
}