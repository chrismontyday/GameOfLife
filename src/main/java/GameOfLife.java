import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;

public class GameOfLife {
	
	static int[][] gameBoard;
	static int numberOfCells = 4000;
	static int numberOfRows = 51;
	static int numberOfColumns = 81;
	
	 public static void main(String[] args) {
		new GameOfLife(); 
	}
	
	public GameOfLife() {
		createUi();
	}

	public void createUi() {
		JFrame window = new JFrame();
		window.setSize(865, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.DARK_GRAY);
		window.setLayout(null);
		window.setVisible(true);
		
		JPanel board = new JPanel();
		board.setBounds(25, 50, 800, 500);
		board.setBackground(Color.BLACK);
		board.setLayout(new GridLayout(50,80));
		window.add(board);
		
		JButton cell1 = new JButton();
		cell1.setBackground(Color.WHITE);
		
		
	}
	
	public static void setBoard(boolean isAlive) { 
		
		Cell cell = new Cell();
		
		for(int i = 1; i < numberOfRows; i++) {
			for(int j = 1; j < numberOfColumns; j++) {
				
				int liveCells = gameBoard[i-1][j-1] + gameBoard[i-1][j] + gameBoard[i-1][j+1] + gameBoard[i][j-1] + gameBoard[i][j+1] + gameBoard[i+1][j-1] + gameBoard[i+1][j] + gameBoard[i+1][j+1];
				
				if(cell.askIsAlive(liveCells)) {					
					gameBoard[i][j] = 1;
				} else {
					gameBoard[i][j] = 0;
				}
				
				
			}
		}
		
	}
}
