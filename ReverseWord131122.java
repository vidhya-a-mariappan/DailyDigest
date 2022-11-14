class Solution {
    public String reverseWords(String s) {
        String str = s.trim().replaceAll(" +", " ");
        String[] splited=str.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i=splited.length-1;i>0;i--)
            sb.append(splited[i]+" ");
        sb.append(splited[0]);
        String result=sb.toString();        
        return result;        
    }
}
