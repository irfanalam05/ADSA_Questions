import java.util.*;

class Solution {
    public boolean checkStrings(String s1, String s2) {
        Map<Character, Integer> evenCount1 = new HashMap<>();
        Map<Character, Integer> oddCount1 = new HashMap<>();
        Map<Character, Integer> evenCount2 = new HashMap<>();
        Map<Character, Integer> oddCount2 = new HashMap<>();
        
        int n = s1.length();
        
        for (int i = 0; i < n; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            
            if (i % 2 == 0) {
                evenCount1.put(c1, evenCount1.getOrDefault(c1, 0) + 1);
                evenCount2.put(c2, evenCount2.getOrDefault(c2, 0) + 1);
            } else {
                oddCount1.put(c1, oddCount1.getOrDefault(c1, 0) + 1);
                oddCount2.put(c2, oddCount2.getOrDefault(c2, 0) + 1);
            }
        }
        return evenCount1.equals(evenCount2) && oddCount1.equals(oddCount2);
    }
}
