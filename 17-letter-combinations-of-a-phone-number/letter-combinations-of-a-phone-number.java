class Solution {
    public HashMap<Character,String> map= new HashMap<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return new ArrayList<>();  
        List<String> ans = new ArrayList<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        StringBuilder temp= new StringBuilder();
        storeCombos(digits,ans,0,temp);
        return ans;
    }
    void storeCombos(String digits,List<String> ans ,int idx,StringBuilder temp) {
        if(digits.length()==idx) {
            ans.add(temp.toString());
            return;
        }
        char c=digits.charAt(idx);
        String str= map.get(c);

        for(int i=0;i<str.length();i++) {
            temp.append(str.charAt(i));
            storeCombos(digits,ans,idx+1,temp);
            temp.deleteCharAt(temp.length()-1);
 
        }

    }

}