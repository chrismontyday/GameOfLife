import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;

public class GameOfLife {
	
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
		
		JButton cell = new JButton();
		
	}
}
