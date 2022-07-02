package aplication;

import Chess.ChessMatch;

public class Program {

	public static void main(String[] args) {

		ChessMatch chessmatch = new ChessMatch();
		UI.printBoard(chessmatch.getPieces());
	}

}
