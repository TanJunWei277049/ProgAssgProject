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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class SCustomer extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField age;
	private JTextField contact;
	private static JTable table;
	private double price = 0;
	private static JComboBox comboBoxStorageType;
	private JTextField textFieldDay;
	private double discount;
	private double totalPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SCustomer frame = new SCustomer();
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
	public SCustomer() {
		
		JTable t = SManageStorageType.getTable();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 857, 569);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(102, 153, 255));
		panel.setBounds(0, 0, 218, 541);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Home");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SCompanyBackground cb = new SCompanyBackground(); //calling another frame/window
				cb.setModalExclusionType(null);
				cb.setVisible(true);
				dispose();
			}
		});
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 62, 85, 24);
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
		lblAdvertisement.setBounds(10, 150, 171, 24);
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
		lblStorageDescription_1.setBounds(10, 248, 198, 24);
		panel.add(lblStorageDescription_1);
		
		JLabel lblBuyNow = new JLabel("Customer");
		lblBuyNow.setForeground(Color.WHITE);
		lblBuyNow.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblBuyNow.setBounds(10, 346, 171, 24);
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
		lblLogOut.setBounds(10, 435, 171, 24);
		panel.add(lblLogOut);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name :");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(243, 93, 66, 27);
		contentPane.add(lblNewLabel_1_1);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.PLAIN, 20));
		name.setColumns(10);
		name.setBounds(315, 89, 196, 31);
		contentPane.add(name);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Age :");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(553, 97, 66, 27);
		contentPane.add(lblNewLabel_1_1_1);
		
		age = new JTextField();
		age.setFont(new Font("Tahoma", Font.PLAIN, 20));
		age.setColumns(10);
		age.setBounds(613, 93, 196, 31);
		contentPane.add(age);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Gender :");
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_1_1.setBounds(228, 155, 76, 27);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JComboBox comboBoxGender = new JComboBox();
		comboBoxGender.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female"}));
		comboBoxGender.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		comboBoxGender.setBounds(315, 153, 161, 31);
		contentPane.add(comboBoxGender);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Contact :");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_1_1_1.setBounds(521, 155, 91, 27);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		contact = new JTextField();
		contact.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contact.setColumns(10);
		contact.setBounds(613, 151, 196, 31);
		contentPane.add(contact);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Storage Type :");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_1_1_2.setBounds(228, 213, 132, 27);
		contentPane.add(lblNewLabel_1_1_1_1_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(228, 271, 603, 149);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Age", "Gender", "Contact", "Storage Type", "Day", "Discount", "Price"
			}
		));
		table.setFont(new Font("Tahoma", Font.BOLD, 9));
		scrollPane_1.setViewportView(table);
		
		JButton btnNewButton = new JButton("ADD RECORD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				int day;
				double rentPrice;
				double totalPrice = 0;
				double discount = 0;
				String selection = (String)comboBoxStorageType.getSelectedItem();
				day = Integer.parseInt(textFieldDay.getText());
				
				if(comboBoxStorageType.getSelectedItem().equals(String.valueOf( t.getValueAt(0, 0)))) {
					if (day<7) {
					SPayment type1 = new STotalPrice();
					rentPrice  = type1.rentPrice(selection, day);
					totalPrice = type1.getPayment(selection, day);
				    }
					
					else if (day>=7 && day<30) {
					SPayment type1 = new STotalPrice();
					rentPrice  = type1.rentPrice(selection, day);
					totalPrice = type1.getPayment(selection, day);
					}
					
					else {
					SPayment type1 = new STotalPrice();
					discount   = type1.disc();
					rentPrice  = type1.rentPrice(selection, day);
					
					totalPrice = type1.getPayment(selection, day, discount);
					
					}
				}
				
				 if(comboBoxStorageType.getSelectedItem().equals(String.valueOf( t.getValueAt(1, 0)))) {
					if (day<7) {
					SPayment type2 = new STotalPrice();
					rentPrice  = type2.rentPrice(selection, day);
					
					totalPrice = type2.getPayment(selection, day);
					
				    }
					
					else if (day>=7 && day<30) {
					SPayment type2 = new STotalPrice();
					rentPrice  = type2.rentPrice(selection, day);
					
					totalPrice = type2.getPayment(selection, day);
					
					}
					
					else {
					SPayment type2 = new STotalPrice();
					discount   = type2.disc();
					rentPrice  = type2.rentPrice(selection, day);
					
					totalPrice = type2.getPayment(selection, day, discount);
					
					}
				 }
					
				 if(comboBoxStorageType.getSelectedItem().equals(String.valueOf( t.getValueAt(2, 0)))) {
					if (day<7) {
					SPayment type3 = new STotalPrice();
					rentPrice  = type3.rentPrice(selection, day);
					
					totalPrice = type3.getPayment(selection, day);
					
				    }
					
					else if (day>=7 && day<30) {
					SPayment type3 = new STotalPrice();
					rentPrice  = type3.rentPrice(selection, day);
					
					totalPrice = type3.getPayment(selection, day);
					
					}
					
					else {
					SPayment type3 = new STotalPrice();
					discount   = type3.disc();
					rentPrice  = type3.rentPrice(selection, day);
					
					totalPrice = type3.getPayment(selection, day, discount);
					
					}
				}
				
				model.addRow(new Object[]{
						name.getText(),
						age.getText(),
						comboBoxGender.getSelectedItem(),
						contact.getText(),
						comboBoxStorageType.getSelectedItem(),
						textFieldDay.getText(),
						discount*100,
						totalPrice,
						
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Membership Update confirmed", "Membership Management System",
								JOptionPane.OK_OPTION);
					}
				}
				}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(260, 431, 143, 38);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.setText("");
				age.setText("");
				comboBoxGender.setSelectedItem("Select Gender");
				contact.setText("");
				comboBoxStorageType.setSelectedItem("Select position");
				textFieldDay.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(450, 431, 146, 38);
		contentPane.add(btnReset);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				if(table.getSelectedRow()==-1) {
					if(table.getRowCount()==0) {
						JOptionPane.showMessageDialog(null,"No data to delete",
								"Membership Management System", JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null,"Select a row to delete",
								"Membership Management System", JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDelete.setBounds(648, 431, 146, 38);
		contentPane.add(btnDelete);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				
				int day;
				double rentPrice;
				double totalPrice = 0;
				double discount = 0;
				String selection = (String)comboBoxStorageType.getSelectedItem();
				day = Integer.parseInt(textFieldDay.getText());
				
				if(comboBoxStorageType.getSelectedItem().equals(String.valueOf( t.getValueAt(0, 0)))) {
					if (day<7) {
					SPayment type1 = new STotalPrice();
					rentPrice  = type1.rentPrice(selection, day);
					totalPrice = type1.getPayment(selection, day);
				    }
					
					else if (day>=7 && day<30) {
					SPayment type1 = new STotalPrice();
					rentPrice  = type1.rentPrice(selection, day);
					totalPrice = type1.getPayment(selection, day);
					}
					
					else {
					SPayment type1 = new STotalPrice();
					discount   = type1.disc();
					rentPrice  = type1.rentPrice(selection, day);
					totalPrice = type1.getPayment(selection, day, discount);
					}
				}
				
				 if(comboBoxStorageType.getSelectedItem().equals(String.valueOf( t.getValueAt(1, 0)))) {
					if (day<7) {
					SPayment type2 = new STotalPrice();
					rentPrice  = type2.rentPrice(selection, day);
					totalPrice = type2.getPayment(selection, day);
				    }
					
					else if (day>=7 && day<30) {
					SPayment type2 = new STotalPrice();
					rentPrice  = type2.rentPrice(selection, day);
					totalPrice = type2.getPayment(selection, day);
					}
					
					else {
					SPayment type2 = new STotalPrice();
					discount   = type2.disc();
					rentPrice  = type2.rentPrice(selection, day);
					totalPrice = type2.getPayment(selection, day, discount);
					}
				 }
					
				 if(comboBoxStorageType.getSelectedItem().equals(String.valueOf( t.getValueAt(2, 0)))) {
					if (day<7) {
					SPayment type3 = new STotalPrice();
					rentPrice  = type3.rentPrice(selection, day);
					totalPrice = type3.getPayment(selection, day);
				    }
					
					else if (day>=7 && day<30) {
					SPayment type3 = new STotalPrice();
					rentPrice  = type3.rentPrice(selection, day);
					totalPrice = type3.getPayment(selection, day);
					}
					
					else {
					SPayment type3 = new STotalPrice();
					discount   = type3.disc();
					rentPrice  = type3.rentPrice(selection, day);
					totalPrice = type3.getPayment(selection, day, discount);
					}
				}
				
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(name.getText(),i,0);
			    	model.setValueAt(age.getText(),i,1);
			    	model.setValueAt(comboBoxGender.getSelectedItem(),i,2);
			    	model.setValueAt(contact.getText(),i,3);
			    	model.setValueAt(comboBoxStorageType.getSelectedItem(),i,4);
			    	model.setValueAt(textFieldDay.getText(),i,5);
			    	model.setValueAt(discount*100,i,6);
			    	model.setValueAt(totalPrice,i,7);
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnUpdate.setBounds(260, 481, 146, 38);
		contentPane.add(btnUpdate);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					table.print();
				} catch (java.awt.print.PrinterException e1) {
					System.err.format("No printer found", e1.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPrint.setBounds(450, 480, 146, 38);
		contentPane.add(btnPrint);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				File file = new File("C:\\Users\\Win 8\\git\\ProgAssg3\\ProgAssg3\\src\\CustomerList.txt");
				if(!file.exists()) {
					file.createNewFile();
					}
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				
				for (int i=0; i<table.getRowCount(); i++) {
					for (int j=0; j<table.getColumnCount(); j++) {
						bw.write(table.getModel().getValueAt(i, j) + "  ");
						}
					bw.write("\n________\n");
					}
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null, "Data Exported");
				}
				catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnUpload.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnUpload.setBounds(648, 480, 146, 38);
		contentPane.add(btnUpload);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(217, 0, 624, 68);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblAdvertisement_1 = new JLabel("Customer Registration");
		lblAdvertisement_1.setBounds(52, 0, 491, 60);
		panel_1.add(lblAdvertisement_1);
		lblAdvertisement_1.setForeground(Color.BLACK);
		lblAdvertisement_1.setFont(new Font("Rockwell", Font.BOLD, 40));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(526, 10, 66, 50);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Win 8\\git\\ProgAssg3\\ProgAssg3\\Icon\\shopping cart.jpg"));
		
		comboBoxStorageType = new JComboBox();
		comboBoxStorageType.setModel(new DefaultComboBoxModel(new String[] {"Select Storage Type", String.valueOf(t.getValueAt(0, 0)), String.valueOf(t.getValueAt(1, 0)), String.valueOf(t.getValueAt(2, 0))}));
		comboBoxStorageType.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		comboBoxStorageType.setBounds(360, 213, 196, 31);
		contentPane.add(comboBoxStorageType);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Day :");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_1_1_1_1.setBounds(576, 213, 91, 27);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		textFieldDay = new JTextField();
		textFieldDay.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldDay.setColumns(10);
		textFieldDay.setBounds(635, 213, 196, 31);
		contentPane.add(textFieldDay);
	}
	
	public static JTable getTable() {
		return table;
	}
}
