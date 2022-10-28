class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
            HashMap<Character,Integer> mag=new HashMap();
            HashMap<Character,Integer> ran=new HashMap();
            int count=1,rCount=1;
            for(int i=0;i<magazine.length();i++){
                if(!mag.containsKey(magazine.charAt(i))){
                    mag.put(magazine.charAt(i),count);
                }
                else
                    mag.put(magazine.charAt(i),mag.get(magazine.charAt(i))+1);
            }
            
            for(int i=0;i<ransomNote.length();i++){
                if(!ran.containsKey(ransomNote.charAt(i))){
                    ran.put(ransomNote.charAt(i),rCount);
                }
                else
                    ran.put(ransomNote.charAt(i),ran.get(ransomNote.charAt(i))+1);

            }
            
            for(int i=0;i<ransomNote.length();i++){
                if(ran.containsKey(ransomNote.charAt(i))==mag.containsKey(ransomNote.charAt(i))){
                    if(ran.get(ransomNote.charAt(i))>mag.get(ransomNote.charAt(i)))
                       return false;
                }
                else
                    return false;
                                         
    }     return true;           
    }
}
