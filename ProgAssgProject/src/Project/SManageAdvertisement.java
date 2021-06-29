package Project;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class SManageAdvertisement extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textFieldDisc;
	private static String discount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SManageAdvertisement frame = new SManageAdvertisement();
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
	public SManageAdvertisement() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 501);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		JTextArea txtrGetToRent_1 = new JTextArea();
		txtrGetToRent_1.setForeground(new Color(0, 0, 0));
		txtrGetToRent_1.setText("Get To Rent A Storage With A\r\nDiscount Up to\t       %");
		txtrGetToRent_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 40));
		txtrGetToRent_1.setBounds(33, 245, 618, 114);
		contentPane.add(txtrGetToRent_1);
		
		JLabel lblNewLabel = new JLabel("Set Discount :");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblNewLabel.setBounds(195, 109, 144, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblAdvertisement_1 = new JLabel("Manage Advertisement");
		lblAdvertisement_1.setForeground(Color.BLACK);
		lblAdvertisement_1.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblAdvertisement_1.setBounds(121, 11, 509, 60);
		contentPane.add(lblAdvertisement_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textField.setBounds(349, 115, 117, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textFieldDisc = new JTextField();
		textFieldDisc.setBackground(new Color(255, 255, 255));
		textFieldDisc.setForeground(new Color(0, 0, 0));
		textFieldDisc.setFont(new Font("Trebuchet MS", Font.PLAIN, 40));
		textFieldDisc.setBounds(312, 293, 61, 53);
		contentPane.add(textFieldDisc);
		textFieldDisc.setColumns(10);
		
		JButton btnSet = new JButton("SET");
		btnSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldDisc.setText(textField.getText());
				discount = textField.getText();
			}
		});
		btnSet.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSet.setBounds(289, 184, 143, 38);
		contentPane.add(btnSet);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Win 8\\git\\ProgAssg3\\ProgAssg3\\Icon\\Pen-5-icon.png"));
		lblNewLabel_1.setBounds(486, 90, 61, 53);
		contentPane.add(lblNewLabel_1);
	}
	
	public static String getDisc() {
		return discount;
	}
}
