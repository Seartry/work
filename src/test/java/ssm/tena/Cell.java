package ssm.tena;

public class Cell {

	private int col;
	private int row;
	
	public void setCol(int col) {
		this.col = col;
	}
	public int getCol() {
		return this.col;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getRow() {
		return this.row;
	}
	
	public boolean equals(Cell cell) {
		if(cell == null) {
			return false;
		}
		if(!(cell instanceof Cell)) {
			return false;
		}
		if(this.row == cell.row && this.col == cell.col) {
			return true;
		}else {
			return false;
		}
	}
	public String toString() {
		return "row:"+this.row+",col:"+this.col;
	}
}
