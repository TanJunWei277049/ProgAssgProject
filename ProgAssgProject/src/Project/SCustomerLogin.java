package Project;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class SCustomerLogin extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textFieldUsername;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SCustomerLogin frame = new SCustomerLogin();
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
	public SCustomerLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 691, 493);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SCover cover = new SCover(); //calling another frame/window
				cover.setModalExclusionType(null);
				cover.setVisible(true);
				dispose();
			}
		});
		backButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		backButton.setBackground(Color.WHITE);
		backButton.setBounds(10, 11, 77, 30);
		contentPane.add(backButton);
		
		JLabel lblCustomerLogin = new JLabel("Customer Login");
		lblCustomerLogin.setForeground(new Color(0, 0, 0));
		lblCustomerLogin.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblCustomerLogin.setBounds(175, 11, 381, 60);
		contentPane.add(lblCustomerLogin);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(143, 122, 160, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(143, 206, 160, 30);
		contentPane.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(301, 206, 255, 30);
		contentPane.add(passwordField);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textFieldUsername.setColumns(10);
		textFieldUsername.setBounds(301, 121, 255, 31);
		contentPane.add(textFieldUsername);
		
		JButton ResetButton = new JButton("Reset");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldUsername.setText("");
				passwordField.setText("");
			}
		});
		ResetButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		ResetButton.setBackground(Color.WHITE);
		ResetButton.setBounds(163, 269, 123, 46);
		contentPane.add(ResetButton);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTable t = SignUp.getTable();
				String un;
				String pw;
				boolean login = false;
				
				try {
					for(int i = 0; i<t.getRowCount(); i++) {
						un = String.valueOf(t.getValueAt(i, 0));
						pw = String.valueOf(t.getValueAt(i, 2));
						
						if(textFieldUsername.getText().equals(un) && passwordField.getText().equals(pw)) {
							login = true;
						}
					}
					
					if(login == true) {
						JOptionPane.showMessageDialog(null, "Login successful!");
						
						SCompanyBackground cb = new SCompanyBackground(); //calling another frame/window
						cb.setModalExclusionType(null);
						cb.setVisible(true);
						dispose();
					}
					else 
						JOptionPane.showMessageDialog(null, "Login unsuccessful!", "Error", JOptionPane.ERROR_MESSAGE);
						
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right USER NAME and PASSWORD!", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setBounds(436, 269, 123, 46);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("New User ? Sign Up now !");
		lblNewLabel.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblNewLabel.setBounds(219, 361, 262, 37);
		contentPane.add(lblNewLabel);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp register = new SignUp(); //calling another frame/window
				register.setModalExclusionType(null);
				register.setVisible(true);
				dispose();
			}
		});
		btnSignUp.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSignUp.setBackground(Color.WHITE);
		btnSignUp.setBounds(288, 397, 123, 46);
		contentPane.add(btnSignUp);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Win 8\\git\\ProgAssg3\\ProgAssg3\\Icon\\User.png"));
		lblNewLabel_3.setBounds(86, 111, 47, 53);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon("C:\\Users\\Win 8\\git\\ProgAssg3\\ProgAssg3\\Icon\\password.png"));
		lblNewLabel_3_1.setBounds(86, 194, 40, 53);
		contentPane.add(lblNewLabel_3_1);
	}
}
