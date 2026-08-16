class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, HashSet<Integer>> rows = new HashMap();
        for (int i = 0; i < 9; i++) rows.put(i, new HashSet<Integer>());

        HashMap<Integer, HashSet<Integer>> cols = new HashMap();
        for (int i = 0; i < 9; i++) cols.put(i, new HashSet<Integer>());

        HashMap<Integer, HashSet<Integer>> squares = new HashMap();
        for (int i = 0; i < 9; i++) squares.put(i, new HashSet<Integer>());

        for (int r = 0; r < 9; r++){
            for (int c = 0; c < 9; c++){
                if (board[r][c] == '.') continue;
                if (rows.get(r).contains(Character.getNumericValue(board[r][c])) || 
                cols.get(c).contains(Character.getNumericValue(board[r][c])) ||
                squares.get(r/3 + c/3 * 3).contains(Character.getNumericValue(board[r][c]))){
                    return false;
                }
                rows.get(r).add(Character.getNumericValue(board[r][c]));
                cols.get(c).add(Character.getNumericValue(board[r][c]));
                squares.get(r/3 + c/3 * 3).add(Character.getNumericValue(board[r][c]));
            }
        }

        return true;
    }
}
