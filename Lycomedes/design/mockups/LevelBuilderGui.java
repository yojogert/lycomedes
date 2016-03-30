package mockups;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTabbedPane;

public class LevelBuilderGui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LevelBuilderGui frame = new LevelBuilderGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LevelBuilderGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnNewButton_2 = new JButton("Undo");
		btnNewButton_2.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		
		JLabel lblNewLabel = new JLabel("Kabasuji Level Builder");
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Kristen ITC", Font.BOLD, 32));
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\John\\Documents\\CS 3431 - Databases\\Window_Builder_Sandbox\\12x12gridedit.jpg"));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\John\\Documents\\CS 3431 - Databases\\Window_Builder_Sandbox\\hexominoesblank.jpg"));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(12, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_2)
								.addComponent(btnNewButton_1))
							.addGap(87)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 478, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(79)
									.addComponent(label, GroupLayout.PREFERRED_SIZE, 518, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 374, GroupLayout.PREFERRED_SIZE)
									.addGap(99)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 283, GroupLayout.PREFERRED_SIZE)))
					.addGap(18))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnNewButton_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_2))
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(58)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 410, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(48)
							.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 484, GroupLayout.PREFERRED_SIZE)))
					.addGap(57))
		);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Puzzle Level", null, panel_1, null);
		
		JLabel lblNewLabel_1 = new JLabel("Total Number of Moves:");
		lblNewLabel_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblPuzzleLevelBuilder = new JLabel("Puzzle Level Builder");
		lblPuzzleLevelBuilder.setForeground(new Color(30, 144, 255));
		lblPuzzleLevelBuilder.setHorizontalAlignment(SwingConstants.CENTER);
		lblPuzzleLevelBuilder.setFont(new Font("Kristen ITC", Font.BOLD, 18));
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		
		JLabel lblNewLabel_2 = new JLabel("New Level Name: ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Segoe UI Semilight", Font.BOLD, 14));
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		
		JButton btnNewButton = new JButton("Save Level");
		btnNewButton.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(27)
					.addComponent(lblPuzzleLevelBuilder, GroupLayout.PREFERRED_SIZE, 229, Short.MAX_VALUE)
					.addGap(34))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(73)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(83, Short.MAX_VALUE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(54)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(48, Short.MAX_VALUE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(104, Short.MAX_VALUE)
					.addComponent(formattedTextField_1, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addGap(102))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(88, Short.MAX_VALUE)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
					.addGap(75))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblPuzzleLevelBuilder, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(formattedTextField, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(formattedTextField_1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(53))
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Lightning Level", null, panel_2, null);
		
		JLabel lblLightningLevelBuilder = new JLabel("Lightning Level Builder");
		lblLightningLevelBuilder.setHorizontalAlignment(SwingConstants.CENTER);
		lblLightningLevelBuilder.setForeground(new Color(255, 215, 0));
		lblLightningLevelBuilder.setFont(new Font("Kristen ITC", Font.BOLD, 18));
		
		JLabel label_1 = new JLabel("New Level Name: ");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 14));
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		
		JLabel lblNewLabel_3 = new JLabel("Total Time Allowed (in seconds):");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Segoe UI Semilight", Font.BOLD, 14));
		
		JFormattedTextField formattedTextField_3 = new JFormattedTextField();
		
		JButton button = new JButton("Save Level");
		button.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(76)
					.addComponent(label_1)
					.addContainerGap(77, Short.MAX_VALUE))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(59, Short.MAX_VALUE)
					.addComponent(formattedTextField_2, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
					.addGap(48))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(32, Short.MAX_VALUE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblLightningLevelBuilder)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
					.addContainerGap(84, Short.MAX_VALUE)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
						.addComponent(formattedTextField_3, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
					.addGap(66))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(5)
					.addComponent(lblLightningLevelBuilder)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(label_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(formattedTextField_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(53)
					.addComponent(lblNewLabel_3)
					.addGap(18)
					.addComponent(formattedTextField_3, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(126)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(61))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Release Level", null, panel_3, null);
		
		JLabel lblReleaseLevelBuilder = new JLabel("Release Level Builder");
		lblReleaseLevelBuilder.setHorizontalAlignment(SwingConstants.CENTER);
		lblReleaseLevelBuilder.setForeground(new Color(50, 205, 50));
		lblReleaseLevelBuilder.setFont(new Font("Kristen ITC", Font.BOLD, 18));
		
		JLabel label_2 = new JLabel("New Level Name: ");
		label_2.setFont(new Font("Segoe UI Semilight", Font.BOLD, 14));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JFormattedTextField formattedTextField_4 = new JFormattedTextField();
		
		JLabel lblNewLabel_4 = new JLabel("Total Allowed Moves:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Segoe UI Semilight", Font.BOLD, 14));
		
		JFormattedTextField formattedTextField_5 = new JFormattedTextField();
		
		JLabel lblNewLabel_5 = new JLabel("Pieces To Place");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Segoe UI Semilight", Font.BOLD, 14));
		
		JLabel lblNewLabel_6 = new JLabel("1");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setForeground(new Color(255, 0, 0));
		
		JLabel label_3 = new JLabel("1");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(new Color(0, 128, 0));
		label_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel label_4 = new JLabel("1");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(new Color(255, 215, 0));
		label_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel label_5 = new JLabel("6");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(new Color(0, 128, 0));
		label_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel label_6 = new JLabel("6");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(new Color(255, 215, 0));
		label_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel label_7 = new JLabel("2");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setForeground(Color.RED);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel label_8 = new JLabel("2");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setForeground(new Color(0, 128, 0));
		label_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel label_9 = new JLabel("2");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(new Color(255, 215, 0));
		label_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel label_10 = new JLabel("5");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setForeground(new Color(0, 128, 0));
		label_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel label_11 = new JLabel("5");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setForeground(new Color(255, 215, 0));
		label_11.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel label_12 = new JLabel("3");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setForeground(Color.RED);
		label_12.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel label_13 = new JLabel("3");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setForeground(new Color(0, 128, 0));
		label_13.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel label_14 = new JLabel("3");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setForeground(new Color(255, 215, 0));
		label_14.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel label_15 = new JLabel("5");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setForeground(Color.RED);
		label_15.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel label_16 = new JLabel("6");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setForeground(Color.RED);
		label_16.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel label_17 = new JLabel("4");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setForeground(Color.RED);
		label_17.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel label_18 = new JLabel("4");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setForeground(new Color(0, 128, 0));
		label_18.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel label_19 = new JLabel("4");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setForeground(new Color(255, 215, 0));
		label_19.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JButton button_1 = new JButton("Save Level");
		button_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 13));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(99)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_3.createSequentialGroup()
									.addGap(45)
									.addComponent(label_17, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label_15, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_16, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_3.createSequentialGroup()
									.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_3.createSequentialGroup()
											.addGap(45)
											.addComponent(label_18, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
											.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
											.addGroup(gl_panel_3.createSequentialGroup()
												.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(label_19, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
												.addGap(12)
												.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
										.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(64)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_3.createSequentialGroup()
									.addGap(10)
									.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
										.addComponent(formattedTextField_5, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(42)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_3.createSequentialGroup()
									.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
									.addGap(13)
									.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_3.createSequentialGroup()
									.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_3.createSequentialGroup()
									.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(34, Short.MAX_VALUE))
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap(73, Short.MAX_VALUE)
					.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
					.addGap(64))
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap(38, Short.MAX_VALUE)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addComponent(formattedTextField_4, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblReleaseLevelBuilder))
					.addGap(30))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblReleaseLevelBuilder)
					.addGap(18)
					.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(formattedTextField_4, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_4)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(formattedTextField_5, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_5)
					.addGap(13)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_17, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_15, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_16, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_18, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_19, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(34))
		);
		panel_3.setLayout(gl_panel_3);
		contentPane.setLayout(gl_contentPane);
	}
}
