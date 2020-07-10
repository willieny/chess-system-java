package chess;

import boardgame.Board;
import boardgame.Piece;
//Classe é abstrata para não implementar os métodos de movimento da super classe Piece
public abstract class ChessPiece extends Piece{
	
	private Color color;
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	

}
