// User function Template for Java

class Sol {
    long equalPairs(String s) {
        long pairs=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
           
 
        }
        for(char ch:map.keySet()) {
            int freq=map.get(ch);
            pairs+=freq*freq;
        }
        return pairs;
        
        
        
        
        
        
    }
}