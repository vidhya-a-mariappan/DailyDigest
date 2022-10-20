class Solution {
    public boolean isPalindrome(String s) {
        String str="";
            for(int i=0;i<s.length();i++){
                if((s.charAt(i)>=48 && s.charAt(i)<=57) ||( s.charAt(i)>=65 && s.charAt(i)<=90) ||( s.charAt(i)>=97 && s.charAt(i)<=122)){
                  str=str+s.charAt(i);
                }
            }
            StringBuilder sb = new StringBuilder(str);
            String strRev=sb.reverse().toString();
            boolean result=false;
            if(str.equalsIgnoreCase(strRev))
                result= true;
            else result= false;
            return result;
    }
}
