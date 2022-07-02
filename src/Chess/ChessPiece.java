package Chess;

import boardGame.Board;
import boardGame.Piece;
import boardGame.Position;

public class ChessPiece extends Piece {
	
	private Color color;
	
	public ChessPiece(Board board, Position position, Color color) {
		super(board, position);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

}
