package Project;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SCover extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SCover frame = new SCover();
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
	public SCover() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 153));
		panel.setBounds(0, 0, 659, 461);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Storage Rental");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 35));
		lblNewLabel.setBounds(206, 11, 283, 51);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Win 8\\git\\ProgAssg3\\ProgAssg3\\Icon\\StorageRental.PNG"));
		lblNewLabel_1.setBounds(143, 64, 383, 208);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Select User Type");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Rockwell", Font.BOLD, 30));
		lblNewLabel_2.setBounds(209, 283, 258, 51);
		panel.add(lblNewLabel_2);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SAdminLogin Admin = new SAdminLogin(); //calling another frame/window
				Admin.setModalExclusionType(null);
				Admin.setVisible(true);
				dispose();
				
			}
		});
		btnAdmin.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnAdmin.setBounds(91, 353, 178, 57);
		panel.add(btnAdmin);
		
		JButton btnCustomer = new JButton("Customer");
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SCustomerLogin customer = new SCustomerLogin(); //calling another frame/window
				customer.setModalExclusionType(null);
				customer.setVisible(true);
				dispose();
			}
		});
		btnCustomer.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnCustomer.setBounds(422, 353, 178, 57);
		panel.add(btnCustomer);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(10, 11, 77, 30);
		panel.add(btnBack);
	}
}
