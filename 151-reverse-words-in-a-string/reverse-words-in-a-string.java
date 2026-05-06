class Solution {
    public String reverseWords(String s) {
        StringBuilder ans= new StringBuilder();
        StringBuilder temp= new StringBuilder();
        for(int i=s.length()-1;i>=0;i--) {
            if(s.charAt(i)==' ') {
                if(temp.length()>0){
                    temp.reverse();
                    ans.append(temp+" ");
                    temp.setLength(0);
                }

            }
            else temp.append(s.charAt(i));
            
        }
        temp.reverse();
        ans.append(temp);
        return ans.toString().trim();

        
    }

}