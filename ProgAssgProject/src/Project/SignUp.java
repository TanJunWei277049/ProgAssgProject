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
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUsername;
	private JTextField textFieldEmail;
	private JTextField textFieldPassword;
	private JTextField textFieldConfirmPass;
	private static JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 693, 485);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSignUp = new JLabel("Registration");
		lblSignUp.setForeground(Color.BLACK);
		lblSignUp.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblSignUp.setBounds(229, 0, 285, 60);
		contentPane.add(lblSignUp);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(33, 80, 160, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_1.setBounds(33, 155, 160, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Password");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_1_1.setBounds(33, 230, 160, 30);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Confirm Password");
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_1_1_1.setBounds(33, 300, 228, 30);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textFieldUsername.setColumns(10);
		textFieldUsername.setBounds(33, 112, 255, 31);
		contentPane.add(textFieldUsername);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(33, 183, 255, 31);
		contentPane.add(textFieldEmail);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textFieldPassword.setColumns(10);
		textFieldPassword.setBounds(33, 258, 255, 31);
		contentPane.add(textFieldPassword);
		
		textFieldConfirmPass = new JTextField();
		textFieldConfirmPass.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textFieldConfirmPass.setColumns(10);
		textFieldConfirmPass.setBounds(33, 331, 255, 31);
		contentPane.add(textFieldConfirmPass);
		
		JButton ResetButton = new JButton("Reset");
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldUsername.setText("");
				textFieldEmail.setText("");
				textFieldPassword.setText("");
				textFieldConfirmPass.setText("");
			}
		});
		ResetButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		ResetButton.setBackground(Color.WHITE);
		ResetButton.setBounds(10, 389, 136, 46);
		contentPane.add(ResetButton);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Uname = textFieldUsername.getText();
				String Email = textFieldEmail.getText();
				String Password = textFieldPassword.getText();
				String CPassword = textFieldConfirmPass.getText();
				
				if(Uname.equals(""))
					JOptionPane.showMessageDialog(null, "User name cannot be empty.\nRegistration unsuccessful!");
				
				else if(Email.equals(""))
					JOptionPane.showMessageDialog(null, "Please enter your email.\nRegistration unsuccessful!");
				
				else if(Password.equals(""))
					JOptionPane.showMessageDialog(null, "Please enter your password.\nRegistration unsuccessful!");
				
				else if(!CPassword.equals(Password))
					JOptionPane.showMessageDialog(null, "Password is not same.\nRegistration unsuccessful!");
				
				else {
					
					JOptionPane.showMessageDialog(null, "Registration Successful!");
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.addRow(new Object[]{
							textFieldUsername.getText(),
							textFieldEmail.getText(),
							textFieldPassword.getText(),
					});
					
					if(table.getSelectedRow() == -1) {
						if(table.getRowCount() == 0) {
							JOptionPane.showMessageDialog(null, "Register Information Update confirmed","Registration",
									JOptionPane.OK_OPTION);
						}
					}
					
				}
			}
		});
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRegister.setBackground(Color.WHITE);
		btnRegister.setBounds(212, 389, 136, 46);
		contentPane.add(btnRegister);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(336, 122, 331, 221);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Username", "Email", "Password"
			}
		));
		table.setFont(new Font("Tahoma", Font.BOLD, 9));
		scrollPane_1.setViewportView(table);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SCustomerLogin customer = new SCustomerLogin(); //calling another frame/window
				customer.setModalExclusionType(null);
				customer.setVisible(true);
				dispose();
			}
		});
		backButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		backButton.setBackground(Color.WHITE);
		backButton.setBounds(10, 11, 77, 30);
		contentPane.add(backButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Win 8\\git\\ProgAssg3\\ProgAssg3\\Icon\\register.png"));
		lblNewLabel.setBounds(581, 374, 66, 61);
		contentPane.add(lblNewLabel);
	}
	
	public static void AddRowToJtable(Object[] dataRow) {
		DefaultTableModel model = (DefaultTableModel)getTable().getModel();
		model.addRow(dataRow);
	}

	public static JTable getTable() {
		return table;
	}

	public static void setTable(JTable table) {
		SignUp.table = table;
	}
}
