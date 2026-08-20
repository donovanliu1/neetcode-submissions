class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> operands = new Stack();
        for (int i = 0; i < tokens.length; i++){
            String token = tokens[i];
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int second = operands.pop();
                int first = operands.pop();
                switch (token){
                    case "+": 
                        operands.push(first + second);
                        break;
                    case "-":
                        operands.push(first - second);
                        break;
                    case "*":
                        operands.push(first * second);
                        break;
                    case "/":
                        operands.push(first / second);
                        break;
                }
            }
            else operands.push(Integer.parseInt(token));
        }
        return operands.pop();
    }
}
