class Solution {
    public String findDifferentBinaryString(String[] nums) {
        String result="";
        for(int i=0; i<nums.length; i++){
            char ch= nums [i].charAt(i);
            if(ch=='1'){
                result+="0";
            }
            else{
                result+="1";
            }
        }
        return result;
    }
}