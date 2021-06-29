package Project;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;

public class SAdvertisement extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SAdvertisement frame = new SAdvertisement();
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
	public SAdvertisement() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 479);
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
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SCompanyBackground cb = new SCompanyBackground(); //calling another frame/window
				cb.setModalExclusionType(null);
				cb.setVisible(true);
				dispose();
			}
		});
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 45, 85, 24);
		panel.add(lblNewLabel);
		
		JLabel lblAdvertisement = new JLabel("Advertisement");
		lblAdvertisement.setForeground(new Color(255, 255, 255));
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
		lblBuyNow.setBounds(10, 287, 208, 24);
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
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Win 8\\git\\ProgAssg3\\ProgAssg3\\Icon\\ads.PNG"));
		lblNewLabel_1.setBounds(249, 156, 415, 273);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblAdvertisement_1 = new JLabel("Advertisement");
		lblAdvertisement_1.setForeground(Color.BLACK);
		lblAdvertisement_1.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblAdvertisement_1.setBounds(298, 0, 335, 60);
		contentPane.add(lblAdvertisement_1);
		
		JTextArea txtrGetToRent = new JTextArea();
		txtrGetToRent.setEditable(false);
		String d = SManageAdvertisement.getDisc();
		txtrGetToRent.setFont(new Font("Trebuchet MS", Font.PLAIN, 28));
		txtrGetToRent.setText("Get To Rent A Storage With A\r\nDiscount Up to " + d + "%");
		txtrGetToRent.setBounds(249, 75, 426, 83);
		contentPane.add(txtrGetToRent);
	}
}
