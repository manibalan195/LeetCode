class Solution {
    List<List<String>> result = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                board[i][j] = '.';
            }
        }
        solve(board,0);
        return result;
    }
    public void solve(char[][] board,int r) {
        int n = board.length;
        if(r == n) {
            List<String> sol = new ArrayList<>();
            for(int i=0;i<n;i++) {
                sol.add(new String(board[i]));
            }
            result.add(sol);
            return;
        }
        for(int c=0;c<n;c++) {
            if(isSafe(board,r,c)){
                board[r][c] = 'Q';
                solve(board,r+1);
                board[r][c] = '.';
            }
        }
    }
    public boolean isSafe(char[][] board,int r , int c) {
        for(int i=r;i>=0;i--){
            if(board[i][c] == 'Q')
                return false;
        }
        int i = r, j = c;
        while(i>=0 && j >=0) {
            if(board[i][j] == 'Q')
                return false;
            i--;
            j--;
        }
        i = r ;
        j = c;
        while(i>=0 && j<board.length) {
            if(board[i][j] == 'Q')
                return false;
            i--;
            j++;
        }
        return true;
    }
}