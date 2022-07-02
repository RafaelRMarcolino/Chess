package boardGame;

public class Piece {

	protected Position position;

	private Board board;

	public Piece(Board board, Position position) {
		super();
		this.board = board;
		position = null;

	}

	protected Board getBoard() {
		return board;
	}

}
