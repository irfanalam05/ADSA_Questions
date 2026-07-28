class Solution {
    public String smallestPalindrome(String s) {
        int [] freq = new int [26];
        for( char c: s.toCharArray()){
            freq[c - 'a']++;
        }
        StringBuilder left = new StringBuilder();
        char mid=0;

        for (int i=0;i<26;i++){
            int count= freq[i];
            if(count % 2==1 && mid==0){
                mid=(char)(i+'a');
            }
            for(int j=0;j< count/2;j++){
                left.append((char)(i+'a'));
            }
        }
        StringBuilder res= new StringBuilder();
        res.append(left);
        if(mid !=0){
            res.append(mid);
        }
        res.append(left.reverse());

        return res.toString();
    }
}