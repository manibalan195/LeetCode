class Solution {
    public boolean rowValidate(int r , char[][] board) {
        int[] v = new int[10];

        for(int i=0;i<9;i++) {
            if(board[r][i] == '.') continue;
            int num = board[r][i] - '0';
            if(v[num] == 1) return false;
            v[num] = 1;
        }
        return true;
    }
    public boolean colValidate(int c , char[][] board) {
        int[] v = new int[10];

        for(int i=0;i<9;i++) {
            if(board[i][c] == '.') continue;

            int num = board[i][c] - '0' ;
            if(v[num] == 1) return false;
            v[num] = 1;
        }
        return true;
    }
    public boolean matValidate(int r , int c, char[][] board) {
        int[] v = new int[10];
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                if(board[j+r][i+c] == '.') continue;
                int num = board[j+r][i+c] - '0';
                if(v[num] == 1) return false;
                v[num] = 1;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0 ; i < 9 ; i+=3 ) {
            for( int j  = 0 ; j < 9 ; j+=3) {
                if(!matValidate(i,j,board))
                    return false;
            }
        }
        for(int i = 0;i<9;i++) {
            if(!rowValidate(i,board) || !colValidate(i,board))
                return false;
        }
        return true;
    }
}