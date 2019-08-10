class Solution {
    public boolean isValid(String s) {
        if(s == null){
            return true;
        }
        char[] array = s.toCharArray();
        Stack<Character> stack = new Stack();
        for(int i = 0;i < array.length;i++){
            if(array[i] == '(' || array[i] == '{' || array[i] == '['){
                stack.push(array[i]);
            }
            if(array[i] == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.peek() == '('){
                    stack.pop();
                }else{
                    return false;
                }
            }
            if(array[i] == '}'){
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.peek() == '{'){
                    stack.pop();
                }else{
                    return false;
                }
            }
            if(array[i] == ']'){
                if(stack.isEmpty()){
                    return false;
                }
                if(stack.peek() == '['){
                    stack.pop();
                }else{
                    return false;
                }
            }    
    }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
}
}
