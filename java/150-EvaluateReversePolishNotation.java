class Solution {
    public int evalRPN(String[] tokens) {
        int ans = 0;
        String operator = "+-*/";
        Stack<String> stack = new Stack<>();
        for (String t:tokens){
            if (!operator.contains(t)){
                stack.push(t);
            } else {
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                switch (operator.indexOf(t)){
                    case 0:
                        stack.push(String.valueOf(a+b));
                        break;
                    case 1:
                        stack.push(String.valueOf(b-a));
                        break;
                    case 2:
                        stack.push(String.valueOf(b*a));
                        break;
                    case 3:
                        stack.push(String.valueOf(b/a));
                        break;
                }
            }
            
            
        }
        ans = Integer.valueOf(stack.pop());
        return ans;
    }
}
