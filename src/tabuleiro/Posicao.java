package tabuleiro;

public class Posicao {
	
	//encapsulamento dos campos

	private int row;
	private int column;
	
	//construtor com argumentos
	public Posicao(int row, int column) {
		this.row = row;
		this.column = column;
	}
	

	//get e set

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	
	//to string para impress�o da posi��o na tela
	@Override
	public String toString() {
		//impre��o da linha(row) e coluna(column)
		return row + ", " + column;
		
		
	}
	
	 
}
