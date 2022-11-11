class Solution {
    public String makeGood(String s) {
        Stack <Character> mg=new Stack<Character>(); 
        String result="";
        mg.push(s.charAt(0)); 
        for(int i=1;i<s.length();i++)
        {
            if(mg.empty()||(mg.peek()-s.charAt(i) != 32 && s.charAt(i)-mg.peek()!= 32))                                    mg.push(s.charAt(i)); 
            else mg.pop(); 
        }        
        while(!mg.empty()) 
        {
            result+=mg.peek();
            mg.pop();
        }
        StringBuilder sb=new StringBuilder(result);  
        sb.reverse();  
        return sb.toString();         
    }
}
