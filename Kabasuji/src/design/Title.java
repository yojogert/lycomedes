package design;

import javax.swing.JApplet;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPanel;

public class Title extends JApplet {

	/**
	 * Create the applet.
	 */
	public Title() {
		getContentPane().setForeground(Color.BLACK);
		getContentPane().setBackground(Color.BLACK);
		getContentPane().setLayout(null);
		
		JLabel lblKabasuji = new JLabel("KABASUJI");
		lblKabasuji.setBackground(Color.WHITE);
		lblKabasuji.setForeground(Color.WHITE);
		lblKabasuji.setHorizontalAlignment(SwingConstants.CENTER);
		lblKabasuji.setFont(new Font("Times New Roman", Font.BOLD, 72));
		lblKabasuji.setBounds(0, 0, 450, 130);
		getContentPane().add(lblKabasuji);
		
		JButton btnPlay = new JButton("Play");
		btnPlay.setForeground(Color.BLACK);
		btnPlay.setBackground(Color.WHITE);
		btnPlay.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPlay.setBounds(180, 114, 92, 39);
		getContentPane().add(btnPlay);
		
		JButton btnBuild = new JButton("Build");
		btnBuild.setForeground(Color.BLACK);
		btnBuild.setBackground(Color.WHITE);
		btnBuild.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBuild.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnBuild.setBounds(180, 166, 92, 39);
		getContentPane().add(btnBuild);
		
		JButton btnRules = new JButton("Rules");
		btnRules.setForeground(Color.BLACK);
		btnRules.setBackground(Color.WHITE);
		btnRules.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnRules.setBounds(180, 218, 92, 39);
		getContentPane().add(btnRules);

	}
}
