class Solution {
    public String convertToTitle(int columnNumber) {
       String result="";
        int temp=0;
       while(columnNumber > 0) {
           columnNumber--;
           temp=columnNumber%26;
           result = (char)('A' + temp) + result;
           columnNumber/=26;
       }
       return result;
    }
}
