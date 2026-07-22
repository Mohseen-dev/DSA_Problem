class Solution {
    public boolean isPalindrome(String s) {
       if(s.equals(" ")){
        return true;
       }
       int first = 0;
       int last = s.length()-1;
       while(first <= last){
        char currfirst = s.charAt(first);
        char currlast = s.charAt(last);
        if(!Character.isLetterOrDigit(currfirst)){
            first++;
        }
        else if(!Character.isLetterOrDigit(currlast)){
            last--;
        }else {
            if(Character.toLowerCase(currfirst) != Character.toLowerCase(currlast)){
                return false;
            }
            first++;
            last--;
        }

       }
        return true;

    }
}