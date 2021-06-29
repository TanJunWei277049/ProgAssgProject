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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class SEmployee extends JFrame {

	private JPanel contentPane;
	private static JTable table;
	private JTextField textFieldName;
	private JTextField textFieldContact;
	private JTextField textFieldAge;
	private JTextField textFieldSalary;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SEmployee frame = new SEmployee();
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
	public SEmployee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 595);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 51, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmployee = new JLabel("Employee");
		lblEmployee.setForeground(Color.WHITE);
		lblEmployee.setFont(new Font("Dialog", Font.BOLD, 35));
		lblEmployee.setBounds(272, 22, 183, 44);
		contentPane.add(lblEmployee);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(153, 255, 255));
		contentPane_1.setBounds(10, 88, 693, 175);
		contentPane.add(contentPane_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name :");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(21, 11, 66, 27);
		contentPane_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Age :");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(37, 63, 66, 27);
		contentPane_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Gender :");
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_1_1.setBounds(10, 118, 76, 27);
		contentPane_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Contact :");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_1_1_1.setBounds(373, 11, 112, 27);
		contentPane_1.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Position :");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_1_1_1_1.setBounds(373, 63, 112, 27);
		contentPane_1.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Salary :");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(387, 118, 112, 27);
		contentPane_1.add(lblNewLabel_1_1_1_1_1_1_1);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldName.setBounds(97, 7, 212, 31);
		contentPane_1.add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldContact = new JTextField();
		textFieldContact.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldContact.setColumns(10);
		textFieldContact.setBounds(471, 7, 212, 31);
		contentPane_1.add(textFieldContact);
		
		textFieldAge = new JTextField();
		textFieldAge.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldAge.setColumns(10);
		textFieldAge.setBounds(97, 59, 212, 31);
		contentPane_1.add(textFieldAge);
		
		JComboBox comboBoxGender = new JComboBox();
		comboBoxGender.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		comboBoxGender.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female"}));
		comboBoxGender.setBounds(97, 116, 161, 31);
		contentPane_1.add(comboBoxGender);
		
		textFieldSalary = new JTextField();
		textFieldSalary.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldSalary.setColumns(10);
		textFieldSalary.setBounds(471, 118, 212, 31);
		contentPane_1.add(textFieldSalary);
		
		JComboBox comboBoxPosition = new JComboBox();
		comboBoxPosition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBoxPosition.getSelectedItem().equals("Salesman")) {
					textFieldSalary.setText("1500");
				}
				else {
					textFieldSalary.setText("2500");
				}
			}
		});
		comboBoxPosition.setModel(new DefaultComboBoxModel(new String[] {"Select Position", "Salesman", "Manager"}));
		comboBoxPosition.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		comboBoxPosition.setBounds(471, 67, 161, 31);
		contentPane_1.add(comboBoxPosition);
		
		JPanel contentPane_1_1 = new JPanel();
		contentPane_1_1.setLayout(null);
		contentPane_1_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1_1.setBackground(new Color(153, 255, 255));
		contentPane_1_1.setBounds(10, 336, 693, 149);
		contentPane.add(contentPane_1_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 693, 149);
		contentPane_1_1.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Age", "Gender", "Contact", "Position", "Salary"
			}
		));
		table.setFont(new Font("Tahoma", Font.BOLD, 9));
		scrollPane_1.setViewportView(table);
		
		JButton btnNewButton = new JButton("ADD RECORD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				
				model.addRow(new Object[]{
						textFieldName.getText(),
						textFieldAge.getText(),
						comboBoxGender.getSelectedItem(),
						textFieldContact.getText(),
						comboBoxPosition.getSelectedItem(),
						textFieldSalary.getText(),
				});
				
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Membership Update confirmed", "Membership Management System",
								JOptionPane.OK_OPTION);
					}
				}
				}
		});
		btnNewButton.setBounds(22, 274, 143, 38);
		contentPane.add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		
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
		btnDelete.setBounds(362, 274, 146, 38);
		contentPane.add(btnDelete);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldName.setText("");
				textFieldAge.setText("");
				comboBoxGender.setSelectedItem("Select Gender");
				textFieldContact.setText("");
				comboBoxPosition.setSelectedItem("Select position");
				textFieldSalary.setText("");
			}
		});
		btnReset.setBounds(188, 274, 146, 38);
		contentPane.add(btnReset);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				int i = table.getSelectedRow();
			    if(i>=0) //if single row is selected than update
			    {
			    	model.setValueAt(textFieldName.getText(),i,0);
			    	model.setValueAt(textFieldAge.getText(),i,1);
			    	model.setValueAt(comboBoxGender.getSelectedItem(),i,2);
			    	model.setValueAt(textFieldContact.getText(),i,3);
			    	model.setValueAt(comboBoxPosition.getSelectedItem(),i,4);
			    	model.setValueAt(textFieldSalary.getText(),i,5);
					JOptionPane.showMessageDialog(null, "Update Successfully");
			    }
			    else 
			    {
			    	JOptionPane.showMessageDialog(null, "Please Select a Row First!");
			    }
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnUpdate.setBounds(533, 274, 146, 38);
		contentPane.add(btnUpdate);
		
		JButton btnUpload = new JButton("UPLOAD");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				File file = new File("C:\\Users\\Win 8\\git\\ProgAssg3\\ProgAssg3\\src\\EmployeeList.txt");
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
		btnUpload.setBounds(82, 496, 146, 38);
		contentPane.add(btnUpload);
		
		JButton btnFinance = new JButton("FINANCE");
		btnFinance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SFinance f = new SFinance(); //calling another frame/window
				f.setModalExclusionType(null);
				f.setVisible(true);
				dispose();
			}
		});
		btnFinance.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnFinance.setBounds(497, 496, 146, 38);
		contentPane.add(btnFinance);
		
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
		backButton.setBounds(10, 7, 77, 30);
		contentPane.add(backButton);
		
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
		btnPrint.setBounds(284, 496, 146, 38);
		contentPane.add(btnPrint);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Win 8\\git\\ProgAssg3\\ProgAssg3\\Icon\\human.png"));
		lblNewLabel.setBounds(467, 0, 88, 88);
		contentPane.add(lblNewLabel);	
	}
	
	public static JTable getTable() {
		return table;
	}
}
