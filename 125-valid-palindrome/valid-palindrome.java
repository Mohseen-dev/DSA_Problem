class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^aA-Za-z0-9]","").replaceAll("\\s+","").toLowerCase();
        // char[] str = s.toCharArray();
        // String reversed = new StringBuilder(s).reverse().toString();
        // if(reversed.equals(s)){
        //     return true;
        // }else{
        //     return false;
        // }
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;

    }
}