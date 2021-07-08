public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		// WRITE YOUR LOGIC HERE...................................		
		int columnNumber = cellId%8;
		return columnNumber;	// just for the heck of it
	}
	
	private int getRow(int cellId) {
		// WRITE YOUR LOGIC HERE....................................
		int rowNumber= cellId/8;
		
		return rowNumber;	// just for the heck of it
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);
		
		//check for existing values
		for(int i=0;i<8;i++) {
			if(placedQueens[i][col]==true || placedQueens[row][i]==true) {
				isValid = false;
			}
		}
		//update placedQueens & increment numqueens
		if(isValid==true) {
			placedQueens[row][col]=true;
			numQueens++;
		}
		return isValid;
	}
}














