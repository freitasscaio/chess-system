package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	/* protected porque ela é uma classe 
	 * que so pode ser usada no mesmo pacote, não podendo ser usada por outas classes*/
	protected Board getBoard() {
		return board;
	}

	
}
