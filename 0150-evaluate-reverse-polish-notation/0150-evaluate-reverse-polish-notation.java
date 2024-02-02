class Solution {
    public int evalRPN(String[] tokens) {
        
        Set<String> operators = Set.of("*", "/", "+", "-");
        Stack<Integer> stack = new Stack();
        
        for (String token : tokens) {
            
            if (!operators.contains(token)) {
                stack.add(Integer.parseInt(token));
            }else {
                int num2 = stack.pop();
                int num1 = stack.pop();
                
                int result = applyExpression(num1, num2, token);
                
                stack.add(result);
            }
        }
        
        return stack.pop();
        
    }
    
    public int applyExpression(int num1, int num2, String operator) {
        
        switch (operator) {
                
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
        }
        
        return 0;
    }
}

/*


["10","6","9","3","+","-11","*","/","*","17","+","5","+"]

  ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]  

*/