class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> operands = new Stack();
        int result = Integer.parseInt(tokens[0]);
        for (int i = 0; i < tokens.length; i++){
            String token = tokens[i];
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int second = operands.pop();
                int first = operands.pop();
                switch (token){
                    case "+": 
                        result = first + second;
                        break;
                    case "-":
                        result = first - second;
                        break;
                    case "*":
                        result = first * second;
                        break;
                    case "/":
                        result = first / second;
                        break;
                }
                operands.push(result);
            }
            else operands.push(Integer.parseInt(token));
        }
        return result;
    }
}
