package Project;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SAdminMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SAdminMenu frame = new SAdminMenu();
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
	public SAdminMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 706, 510);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(153, 204, 255));
		contentPane_1.setBounds(10, 11, 670, 102);
		contentPane.add(contentPane_1);
		
		JLabel lblNewLabel = new JLabel("Welcome To Admin Portal");
		lblNewLabel.setForeground(new Color(0, 51, 153));
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 45));
		lblNewLabel.setBounds(41, 11, 602, 80);
		contentPane_1.add(lblNewLabel);
		
		JPanel contentPane_1_1 = new JPanel();
		contentPane_1_1.setLayout(null);
		contentPane_1_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1_1.setBackground(new Color(153, 204, 255));
		contentPane_1_1.setBounds(10, 130, 670, 330);
		contentPane.add(contentPane_1_1);
		
		JButton btnAdvertisement = new JButton("Manage Advertisement");
		btnAdvertisement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SManageAdvertisement ma = new SManageAdvertisement(); //calling another frame/window
				ma.setModalExclusionType(null);
				ma.setVisible(true);
				dispose();
			}
		});
		btnAdvertisement.setFont(new Font("Rockwell", Font.BOLD, 17));
		btnAdvertisement.setBounds(374, 38, 240, 60);
		contentPane_1_1.add(btnAdvertisement);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SAdminLogin ad = new SAdminLogin(); //calling another frame/window
				ad.setModalExclusionType(null);
				ad.setVisible(true);
				dispose();
			}
		});
		btnLogOut.setFont(new Font("Rockwell", Font.BOLD, 17));
		btnLogOut.setBounds(374, 219, 240, 60);
		contentPane_1_1.add(btnLogOut);
		
		JButton btnEmployee = new JButton("Employee");
		btnEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SEmployee employee = new SEmployee(); //calling another frame/window
				employee.setModalExclusionType(null);
				employee.setVisible(true);
				dispose();
			}
		});
		btnEmployee.setFont(new Font("Rockwell", Font.BOLD, 17));
		btnEmployee.setBounds(60, 219, 240, 60);
		contentPane_1_1.add(btnEmployee);
		
		JButton btnFinance = new JButton("Finance");
		btnFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SFinance finance = new SFinance(); //calling another frame/window
				finance.setModalExclusionType(null);
				finance.setVisible(true);
				dispose();
			}
		});
		btnFinance.setFont(new Font("Rockwell", Font.BOLD, 17));
		btnFinance.setBounds(374, 130, 240, 60);
		contentPane_1_1.add(btnFinance);
		
		JButton btnManageStorage = new JButton("Manage Storage");
		btnManageStorage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SManageStorageType manageStorage = new SManageStorageType(); //calling another frame/window
				manageStorage.setModalExclusionType(null);
				manageStorage.setVisible(true);
				dispose();
			}
		});
		btnManageStorage.setFont(new Font("Rockwell", Font.BOLD, 17));
		btnManageStorage.setBounds(60, 38, 240, 60);
		contentPane_1_1.add(btnManageStorage);
		
		JButton btnManageCompany = new JButton("Edit Information");
		btnManageCompany.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SEditCompanyBackground editcb = new SEditCompanyBackground(); //calling another frame/window
				editcb.setModalExclusionType(null);
				editcb.setVisible(true);
				dispose();
			}
		});
		btnManageCompany.setFont(new Font("Rockwell", Font.BOLD, 17));
		btnManageCompany.setBounds(60, 130, 240, 60);
		contentPane_1_1.add(btnManageCompany);
	}
}
