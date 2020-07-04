package chess;

import boardgame.Board;
import boardgame.Position;
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
	
	//Inicia a partida, coloca as peças no tabuleiro
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(7,0));
		board.placePiece(new Rook(board, Color.WHITE), new Position(7,7));
		board.placePiece(new King(board, Color.WHITE), new Position(7,4));
		board.placePiece(new King(board, Color.BLACK), new Position(0,4));
		board.placePiece(new Rook(board, Color.BLACK), new Position(0,7));
		board.placePiece(new Rook(board, Color.BLACK), new Position(0,0));
		
	}
	
	
}
