class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hms = new HashMap<Character, Integer>();
         HashMap<Character, Integer> hmt = new HashMap<Character, Integer>();
        char[] ss=s.toCharArray();
        char[] tt=t.toCharArray();
        for(int i=0;i<ss.length;i++){
            if(hms.containsKey(ss[i])){
                char c=ss[i];
                hms.put(c,hms.get(c)+1);
            }
            else{
                hms.put(ss[i],1);
            }
        }
        for(int i=0;i<tt.length;i++){
            if(hmt.containsKey(tt[i])){
                char c=tt[i];
               
                hmt.put(c,hmt.get(c)+1);
            }
            else{
              
                hmt.put(tt[i],1);
            }
        }
        
        boolean f= false;
        if(hms.equals(hmt)){
           f=true;
        }
        
        return f;
    }
}
