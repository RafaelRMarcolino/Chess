package aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

import Chess.ChessPiece;
import Chess.ChessPosition;

public class UI {

	public static ChessPosition readChessPosition(Scanner sc) {
		try {
			String s = sc.nextLine();
			char column = s.charAt(0);
			int row = Integer.parseInt(s.substring(1));
			return new ChessPosition(column, row);
		} catch (RuntimeException e) {
			throw new InputMismatchException("Error reding Chesspoint valid values are from a1 a h8");
		}
	}

	public static void printBoard(ChessPiece[][] pieces) {

		for (int i = 0; i < pieces.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j = 0; j < pieces.length; j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}

		System.out.print("  a b c d e f g h ");
	}


	public static void printBoard(ChessPiece[][] pieces, boolean[][] possibleMoves ) {

		for (int i = 0; i < pieces.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j = 0; j < pieces.length; j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}

		System.out.print("  a b c d e f g h ");
	}

	
	private static void printPiece(ChessPiece piece) {

		if (piece == null) {
			System.out.print("-");
		} else {
			System.out.print(piece);
		}
		System.out.print(" ");

	}

}
