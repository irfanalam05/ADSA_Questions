class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char[] bucketA1 = {s1.charAt(0), s1.charAt(2)};
        char[] bucketA2 = {s2.charAt(0), s2.charAt(2)};
        
        char[] bucketB1 = {s1.charAt(1), s1.charAt(3)};
        char[] bucketB2 = {s2.charAt(1), s2.charAt(3)};
        
        java.util.Arrays.sort(bucketA1);
        java.util.Arrays.sort(bucketA2);
        java.util.Arrays.sort(bucketB1);
        java.util.Arrays.sort(bucketB2);
        
        return java.util.Arrays.equals(bucketA1, bucketA2) &&
               java.util.Arrays.equals(bucketB1, bucketB2);
    }
}
