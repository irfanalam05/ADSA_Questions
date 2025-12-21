class Solution {
    public String sortVowels(String s) {
        Set<Character> vowelsSet = new HashSet<>(Arrays.asList(
            'a','e','i','o','u','A','E','I','O','U'
        ));

        List<Character> vowels = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (vowelsSet.contains(c)) {
                vowels.add(c);
            }
        }

        Collections.sort(vowels);

        StringBuilder result = new StringBuilder();
        int vowelIndex = 0;

        for (char c : s.toCharArray()) {
            if (vowelsSet.contains(c)) {
                result.append(vowels.get(vowelIndex++));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
