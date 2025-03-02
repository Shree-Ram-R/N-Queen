package ackTracking;




public class NQueen {
	static int ways=0;
	public static boolean isSafe(char[][] board,int row,int col){

        // top

        for(int i=row-1;i>=0;i--)
        {
            if(board[i][col]=='Q') return false;
        }

        //Left-Top

        for(int i=row-1,j=col-1;i>=0&& j>=0;i--,j--)
        {
            if(board[i][j]=='Q') return false;
        }

         //Right-Top

        for(int i=row-1,j=col+1;i>=0&& j<board.length;i--,j++)
        {
            if(board[i][j]=='Q') return false;
        }
        return true;

    }
	// Constructing the Valid chess
    public static void construct(char[][] board){
    	for(int i=0;i<board.length;i++) {
        	for(int j=0;j<board.length;j++) {
        		System.out.print(board[i][j]+"  ");
        	}
        	System.out.println();
        }
System.out.println("\n-------------\n");
    }
    public static void queen(char[][] board,int row){
        if(row==board.length){
           construct(board);
           ways++;
        }
        for(int col=0;col<board.length;col++){
           if( isSafe(board,row,col)){
            board[row][col]='Q';
            queen(board, row+1);
            board[row][col]='-';
           }
        }
    }

	public static void main(String[] args) {
		 
		 int n=4;
	        char[][] board=new char[n][n];
	        for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                board[i][j]='-';
	            }
	        }
	        queen(board,0);
	        
	        System.out.println("Number of ways Possible are: "+ways);
	        

	}

}
