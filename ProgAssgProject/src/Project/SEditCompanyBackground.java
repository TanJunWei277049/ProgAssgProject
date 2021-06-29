package Project;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class SEditCompanyBackground extends JFrame {

	private JPanel contentPane;
	private static JTextArea txtrObjective;
	private static JTextArea txtrCompany;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SEditCompanyBackground frame = new SEditCompanyBackground();
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
	public SEditCompanyBackground() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 488);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEditCompanyBackground = new JLabel("Edit Company Background");
		lblEditCompanyBackground.setForeground(new Color(0, 51, 153));
		lblEditCompanyBackground.setFont(new Font("Dialog", Font.BOLD, 35));
		lblEditCompanyBackground.setBounds(144, 11, 459, 44);
		contentPane.add(lblEditCompanyBackground);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SAdminMenu menu = new SAdminMenu(); //calling another frame/window
				menu.setModalExclusionType(null);
				menu.setVisible(true);
				dispose();
			}
		});
		backButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		backButton.setBackground(Color.WHITE);
		backButton.setBounds(10, 11, 77, 30);
		contentPane.add(backButton);
		
		txtrCompany = new JTextArea();
		txtrCompany.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtrCompany.setText("Lot 1, Jalan Berjaya, 42200 Kapar, Selangor");
		txtrCompany.setBounds(243, 80, 421, 83);
		contentPane.add(txtrCompany);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Information Updated Successful");
			}
		});
		btnUpdate.setFont(new Font("Rockwell", Font.BOLD, 25));
		btnUpdate.setBounds(285, 398, 161, 40);
		contentPane.add(btnUpdate);
		
		JLabel lblNewLabel = new JLabel("Objective : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(22, 219, 128, 44);
		contentPane.add(lblNewLabel);
		
		txtrObjective = new JTextArea();
		txtrObjective.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtrObjective.setText("Cube Self-Storage is UK\u2019s leading provider of storage space \r\nsolutions with an international presence throughout \r\nSoutheast Asia.\r\n\r\nWe specialize in climate-controlled storage units with 24/7 \r\nsecure access. Save money on rental and moving costs now \r\nwith our affordable storage space options.");
		txtrObjective.setBounds(144, 233, 520, 144);
		contentPane.add(txtrObjective);
		
		JLabel lblCompanyAddress = new JLabel("Company Address : ");
		lblCompanyAddress.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCompanyAddress.setBounds(19, 66, 214, 44);
		contentPane.add(lblCompanyAddress);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Win 8\\git\\ProgAssg3\\ProgAssg3\\Icon\\Pen-5-icon.png"));
		lblNewLabel_1.setBounds(604, 0, 60, 58);
		contentPane.add(lblNewLabel_1);
	}
	
	public static JTextArea getObjective() {
		return txtrObjective;
	}
	
	public static JTextArea getCompany() {
		return txtrCompany;
	}

}
