package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;
//Terá as regras do jogo de xadrez
public class ChessMatch {
	
	private Board board;

	public ChessMatch() {
		board = new Board(8,8);
		initialSetup();
	}
	
	//Retorna uma matriz de peças de xadrez correspondentes a partida
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i=0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece)board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	//Inicia a partida, coloca as peças no tabuleiro
	private void initialSetup() {
		placeNewPiece('a', 1, new Rook(board, Color.WHITE));
		placeNewPiece('e', 1, new King(board, Color.WHITE));
		placeNewPiece('e', 8, new King(board, Color.BLACK));
		

	}
	
	
}
