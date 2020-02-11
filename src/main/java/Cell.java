
public class Cell {
	
	private boolean isAlive = false;
	
	public boolean askIsAlive(int livingCells) {
		if(livingCells==2||livingCells==3) {
			return true;
		} else {
			return false;
		}
	}
	
	public void changeAlive(boolean isAliveOrIsDead) {
		
		boolean changeStatus = false;
		
		if(isAliveOrIsDead==true) {
			changeStatus = false;
		} else if (isAliveOrIsDead==false) {
			changeStatus = true;
		}
		
		this.isAlive = changeStatus;
	}

	public boolean isAlive() {
		return isAlive;
	}

}
