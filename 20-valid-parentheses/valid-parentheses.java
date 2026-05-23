class Solution {
    public boolean isValid(String s) {
        Stack<Character> temp = new Stack<>();
        if(s.length()%2!=0) return false;

        for(int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if(c=='[' || c=='(' || c=='{') temp.push(c);
            else {
                if(temp.size()==0) return false;
                char top=temp.peek();
                if (counterPart(top,s.charAt(i))) {
                    temp.pop();

                }
                else return false;
            }
        }
        return (temp.size()==0);

    }

    boolean counterPart(char top,char c) {
        if(top=='(' && c==')') return true;
        else if(top=='[' && c==']') return true;
        else if(top=='{' && c=='}') return true;
        return false;

    }
}