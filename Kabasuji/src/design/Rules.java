package design;

import javax.swing.JApplet;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.JTabbedPane;

public class Rules extends JApplet {

	/**
	 * Create the applet.
	 */
	public Rules() {
		getContentPane().setBackground(Color.BLACK);
		getContentPane().setLayout(null);
		
		JLabel lblRules = new JLabel("Rules");
		lblRules.setBackground(Color.WHITE);
		lblRules.setForeground(Color.WHITE);
		lblRules.setHorizontalAlignment(SwingConstants.LEFT);
		lblRules.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblRules.setBounds(12, 13, 57, 38);
		getContentPane().add(lblRules);
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnBack.setBounds(12, 264, 57, 23);
		getContentPane().add(btnBack);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 50, 426, 189);
		getContentPane().add(tabbedPane);
		
		JTextPane txtpnPuzzleInThis = new JTextPane();
		txtpnPuzzleInThis.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtpnPuzzleInThis.setText("In this mode, the objective is to form the board shape using the pieces given in the bullpen. Pieces may be rotated or flipped before placement. Pieces once placed can be relocated. \r\n\r\nThe player is limited to the given number of moves. Moves must be valid; pieces must be placed within the boundaries of the board. ");
		tabbedPane.addTab("Puzzle", null, txtpnPuzzleInThis, null);
	}
}
