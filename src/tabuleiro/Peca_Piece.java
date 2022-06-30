package tabuleiro;

public class Peca_Piece {
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	public Peca_Piece(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posicao = null;
		
	}

	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
	
	

}
