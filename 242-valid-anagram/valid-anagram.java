class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false ;
        }

        char[] sr = s.toCharArray();
        char[] tr = t.toCharArray();
        Arrays.sort(sr);
        Arrays.sort(tr);

        String ss = new String(sr);
        String st = new String(tr);

        if(ss.equals(st)){
            return true;
        }else{
            return false;
        }

       
    }
}