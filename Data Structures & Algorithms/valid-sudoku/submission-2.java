class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, Integer> rows = new HashMap();
        HashMap<Integer, Integer> cols = new HashMap();
        HashMap<Integer, Integer> squares = new HashMap();
        for (int i = 0; i < 9; i++){
            rows.put(i, 0);
            cols.put(i, 0);
            squares.put(i, 0);
        }
        for (int r = 0; r < 9; r++){
            for (int c = 0; c < 9; c++){
                if (board[r][c] == '.') continue;
                int currentTile = Character.getNumericValue(board[r][c]);
                int mask = 1 << currentTile;
                if ((rows.get(r) & mask) >> currentTile == 1 ||
                    (cols.get(c) & mask) >> currentTile == 1 ||
                    (squares.get(r/3 + c/3 * 3) & mask) >> currentTile == 1){
                        return false;
                    }
                rows.put(r, rows.get(r) | mask);
                cols.put(c, cols.get(c) | mask);
                squares.put(r/3 + c/3 * 3, squares.get(r/3 + c/3 * 3) | mask);
            }
        }
        return true;
    }
}
