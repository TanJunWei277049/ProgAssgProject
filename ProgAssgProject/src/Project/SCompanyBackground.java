package Project;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;

public class SCompanyBackground extends JFrame {

	private JPanel contentPane;
	private JTextArea CompanyAddress;
	private JTextArea Objective;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SCompanyBackground frame = new SCompanyBackground();
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
	public SCompanyBackground() {
		setBounds(100, 100, 736, 487);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(102, 153, 255));
		panel.setBounds(0, 0, 218, 448);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Home");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 45, 85, 24);
		panel.add(lblNewLabel);
		
		JLabel lblAdvertisement = new JLabel("Advertisement");
		lblAdvertisement.setForeground(Color.BLACK);
		lblAdvertisement.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SAdvertisement ads = new SAdvertisement(); //calling another frame/window
				ads.setModalExclusionType(null);
				ads.setVisible(true);
				dispose();
			}
		});
		lblAdvertisement.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblAdvertisement.setBounds(10, 125, 171, 24);
		panel.add(lblAdvertisement);
		
		JLabel lblStorageDescription_1 = new JLabel("Storage Description");
		lblStorageDescription_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SStorageDescription storage = new SStorageDescription(); //calling another frame/window
				storage.setModalExclusionType(null);
				storage.setVisible(true);
				dispose();
			}
		});
		lblStorageDescription_1.setForeground(Color.BLACK);
		lblStorageDescription_1.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblStorageDescription_1.setBounds(10, 207, 198, 24);
		panel.add(lblStorageDescription_1);
		
		JLabel lblBuyNow = new JLabel("Customer");
		lblBuyNow.setForeground(Color.BLACK);
		lblBuyNow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SCustomer customer = new SCustomer(); //calling another frame/window
				customer.setModalExclusionType(null);
				customer.setVisible(true);
				dispose();
			}
		});
		lblBuyNow.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblBuyNow.setBounds(10, 287, 171, 24);
		panel.add(lblBuyNow);
		
		JLabel lblLogOut = new JLabel("Log Out");
		lblLogOut.setForeground(Color.BLACK);
		lblLogOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SCustomerLogin login = new SCustomerLogin(); //calling another frame/window
				login.setModalExclusionType(null);
				login.setVisible(true);
				dispose();
			}
		});
		lblLogOut.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblLogOut.setBounds(10, 373, 171, 24);
		panel.add(lblLogOut);
		
		JLabel lblCompanyBackground = new JLabel("Company background");
		lblCompanyBackground.setForeground(Color.BLACK);
		lblCompanyBackground.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblCompanyBackground.setBounds(228, 11, 482, 60);
		contentPane.add(lblCompanyBackground);
		
		JLabel lblCompanyAddress = new JLabel("Company Address : ");
		lblCompanyAddress.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCompanyAddress.setBounds(228, 96, 214, 44);
		contentPane.add(lblCompanyAddress);
		
		CompanyAddress = new JTextArea();
		CompanyAddress.setEditable(false);
		JTextArea ca = SEditCompanyBackground.getCompany();
		if(ca != null) {
			CompanyAddress = ca;
		}
		CompanyAddress.setBounds(228, 151, 421, 83);
		contentPane.add(CompanyAddress);
		
		JLabel lblNewLabel_1 = new JLabel("Objective : ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(228, 254, 128, 44);
		contentPane.add(lblNewLabel_1);
		
		Objective = new JTextArea();
		Objective.setEditable(false);
		JTextArea obj = SEditCompanyBackground.getObjective();
		if(obj != null) {
			Objective = obj;
		}
		Objective.setBounds(224, 293, 496, 144);
		contentPane.add(Objective);
	}
}
