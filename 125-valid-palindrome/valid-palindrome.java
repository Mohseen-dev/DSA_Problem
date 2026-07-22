class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int last = s.length() - 1;

        while (start <= last) {
            char startCurr = s.charAt(start);
            char lastCurr = s.charAt(last);

            if (!((startCurr >= 97 && startCurr <= 122) || (startCurr >= 65 && startCurr <= 90)
                    || (startCurr >= 48 && startCurr <= 57))) {
                start++;
            } else if (!((lastCurr >= 97 && lastCurr <= 122) || (lastCurr >= 65 && lastCurr <= 90)
                    || (lastCurr >= 48 && lastCurr <= 57))) {
                last--;
            } else {
                if (Character.toLowerCase(startCurr) == Character.toLowerCase(lastCurr)) {
                    start++;
                    last--;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}