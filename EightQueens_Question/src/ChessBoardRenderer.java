public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		// WRITE YOUR LOGIC HERE...
		boolean result=false;
		int rowNum = square/8;
		if(rowNum%2==0) {
			if(square%2==1) {
				result=true;
			}
		}
		if(rowNum%2==1) {
			if(square%2==0) {
				result=true;
			}
		}
		return result;
	}
}
