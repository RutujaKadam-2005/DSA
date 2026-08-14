class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }else{
            String str=s+s;
            if (str.contains(goal)){
                return true;
            }
        }
    return false;   
    }
}