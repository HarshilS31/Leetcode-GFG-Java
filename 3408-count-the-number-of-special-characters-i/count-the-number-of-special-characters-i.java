class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> upperCase=new HashSet<>();
        HashSet<Character> lowerCase=new HashSet<>();
        int count=0;
        for(int i=0;i<word.length();i++) {
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch)) upperCase.add(ch);
            else lowerCase.add(ch);

        }
        for(char ch:lowerCase) {
            if(upperCase.contains(Character.toUpperCase(ch))) count++;
        }
        return count;



        
    }
}