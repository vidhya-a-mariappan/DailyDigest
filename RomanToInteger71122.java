class Solution {
    public int romanToInt(String s) {
        int n= s.length();
    
    HashMap<Character,Integer> map= new HashMap<>();
    map.put('I',1);
    map.put('V',5);
    map.put('X',10);
    map.put('L',50);
    map.put('C',100);
    map.put('D',500);
    map.put('M',1000);
    
    int previous=0;
    int ans=0;
    for(int i=n-1; i>=0; i--)
    {
        char ch= s.charAt(i);
        int value= map.get(ch);
        if(value<previous)
            ans= ans-value;
        else
            ans=ans+value;
        previous= value;
    }
    return ans;
}  }
        
