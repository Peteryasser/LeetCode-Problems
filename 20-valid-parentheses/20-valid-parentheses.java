class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0)return false;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            Character x=s.charAt(i);
            if(x=='('||x=='{'||x=='[')stack.push(x);
            else{
                if(stack.empty())return false;
                Character st=stack.pop();
                if((st=='('&&x!=')')||(st=='{'&&x!='}')||(st=='['&&x!=']'))return false;
            }
        }
        if (!stack.empty())return false;
        return true;
    }
}