class Solution {
    public boolean isValid(String s) {
     Stack<Character> parenthesis=new Stack<>();
     for(int i=0;i<s.length();i++){
         if(parenthesis.empty() && (s.charAt(i)==')'||s.charAt(i)==']'||s.charAt(i)=='}'))
            return false;
          if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
                parenthesis.push(s.charAt(i));
          else{
                if ((int)s.charAt(i)-(int)parenthesis.peek()==2 ||parenthesis.peek()=='('&& s.charAt(i)==')')
                    parenthesis.pop();
              else return false;
              }
        }
         if(!parenthesis.empty())
            return false;     
        return true;
     }
       
 }
