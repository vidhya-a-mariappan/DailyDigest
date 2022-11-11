class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen=new HashSet();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char value=board[i][j];
                if(value !='.'){
                    if((!seen.add(value+"row"+i))||
                        (!seen.add(value+"col"+j))||
                        (!seen.add(value+"3x3"+i/3+-+j/3)))return false;
                }
            }
        }
        return true;
    }
}
