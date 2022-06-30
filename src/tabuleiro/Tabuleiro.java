package tabuleiro;

public class Tabuleiro {
	
	
	private int rows;
	private int columns;
	
	//matriz de pecas com o nome pecas_Pieces
	private Peca_Piece[][] pecas_Pieces;
	
	//construtor com argumentos
	public Tabuleiro(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		//matriz de pecas_Pieces será instanciada na quantidade de linhas e colunas informadas
		pecas_Pieces = new Peca_Piece[rows][columns]; 
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	

	
}
