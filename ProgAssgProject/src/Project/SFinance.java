package Project;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.ImageIcon;

public class SFinance extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldIncome;
	private JTextField textFieldSalary;
	private JTextField textFieldMaintenance;
	private JTextField textFieldUtility;
	private JTextField textFieldAdvert;
	private JTextField textFieldRevenue;
	private JTextField textFieldExpenses;
	private JTextField textFieldNetIncome;
	private JTable t,s;
	static double Salary = 0.0;
	static double sales = 0.0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SFinance frame = new SFinance();
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
	public SFinance() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 757, 492);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 153, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Financial Report");
		lblNewLabel.setForeground(new Color(0, 51, 153));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 35));
		lblNewLabel.setBounds(230, 0, 294, 44);
		contentPane.add(lblNewLabel);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(153, 204, 255));
		contentPane_1.setBounds(22, 71, 368, 79);
		contentPane.add(contentPane_1);
		
		JLabel lblIncome = new JLabel("Sales");
		lblIncome.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblIncome.setBounds(10, 23, 115, 33);
		contentPane_1.add(lblIncome);
		
		textFieldIncome = new JTextField();
		s = SCustomer.getTable();
		if (s != null) {
			for (int i = 0; i < s.getRowCount(); i++) {
				sales += Double.valueOf(s.getValueAt(i, 7).toString());
			}
		}
		textFieldIncome.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldIncome.setColumns(10);
		textFieldIncome.setBounds(202, 23, 149, 33);
		textFieldIncome.setText(String.valueOf(sales));
		contentPane_1.add(textFieldIncome);
		
		JLabel lbl_1_1_3 = new JLabel(":");
		lbl_1_1_3.setFont(new Font("Rockwell", Font.BOLD, 20));
		lbl_1_1_3.setBounds(184, 23, 18, 33);
		contentPane_1.add(lbl_1_1_3);
		
		JPanel contentPane_1_1 = new JPanel();
		contentPane_1_1.setLayout(null);
		contentPane_1_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1_1.setBackground(new Color(153, 204, 255));
		contentPane_1_1.setBounds(22, 183, 368, 184);
		contentPane.add(contentPane_1_1);
		
		JLabel lblEmployeeSalary_1 = new JLabel("Employee Salary");
		lblEmployeeSalary_1.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblEmployeeSalary_1.setBounds(10, 8, 182, 33);
		contentPane_1_1.add(lblEmployeeSalary_1);
		
		JLabel lblMaintenanceFee_1 = new JLabel("Maintenance Fee :");
		lblMaintenanceFee_1.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblMaintenanceFee_1.setBounds(10, 52, 195, 33);
		contentPane_1_1.add(lblMaintenanceFee_1);
		
		JLabel lblUtilityFee_1 = new JLabel("Utility Fee ");
		lblUtilityFee_1.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblUtilityFee_1.setBounds(10, 96, 136, 33);
		contentPane_1_1.add(lblUtilityFee_1);
		
		JLabel lblAdvertisingFee_1 = new JLabel("Advertising Fee");
		lblAdvertisingFee_1.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblAdvertisingFee_1.setBounds(10, 140, 182, 33);
		contentPane_1_1.add(lblAdvertisingFee_1);
		
		JLabel lbl_1_1 = new JLabel(":");
		lbl_1_1.setFont(new Font("Rockwell", Font.BOLD, 20));
		lbl_1_1.setBounds(186, 96, 18, 33);
		contentPane_1_1.add(lbl_1_1);
		
		JLabel lbl_1_1_1 = new JLabel(":");
		lbl_1_1_1.setFont(new Font("Rockwell", Font.BOLD, 20));
		lbl_1_1_1.setBounds(186, 140, 18, 33);
		contentPane_1_1.add(lbl_1_1_1);
		
		JLabel lbl_1_1_2 = new JLabel(":");
		lbl_1_1_2.setFont(new Font("Rockwell", Font.BOLD, 20));
		lbl_1_1_2.setBounds(186, 8, 18, 33);
		contentPane_1_1.add(lbl_1_1_2);
		
		textFieldSalary = new JTextField();
		t = SEmployee.getTable();
		if (t != null) {
			for (int i = 0; i < t.getRowCount(); i++) {
				Salary += Double.valueOf(t.getValueAt(i, 5).toString());
			}
		}
		textFieldSalary.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldSalary.setColumns(10);
		textFieldSalary.setBounds(202, 9, 149, 33);
		textFieldSalary.setText(String.valueOf(Salary));
		contentPane_1_1.add(textFieldSalary);
		
		textFieldMaintenance = new JTextField();
		textFieldMaintenance.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldMaintenance.setColumns(10);
		textFieldMaintenance.setBounds(202, 53, 149, 33);
		contentPane_1_1.add(textFieldMaintenance);
		
		textFieldUtility = new JTextField();
		textFieldUtility.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldUtility.setColumns(10);
		textFieldUtility.setBounds(202, 97, 149, 33);
		contentPane_1_1.add(textFieldUtility);
		
		textFieldAdvert = new JTextField();
		textFieldAdvert.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldAdvert.setColumns(10);
		textFieldAdvert.setBounds(202, 141, 149, 33);
		contentPane_1_1.add(textFieldAdvert);
		
		JLabel lblExpenses = new JLabel("Expenses :");
		lblExpenses.setForeground(new Color(255, 255, 255));
		lblExpenses.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblExpenses.setBounds(20, 150, 115, 33);
		contentPane.add(lblExpenses);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldIncome.setText("");
				textFieldSalary.setText("");
				textFieldMaintenance.setText("");
				textFieldUtility.setText("");
				textFieldAdvert.setText("");
			}
		});
		btnReset.setFont(new Font("Rockwell", Font.BOLD, 25));
		btnReset.setBounds(22, 391, 161, 40);
		contentPane.add(btnReset);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double totalExpense = Integer.parseInt(textFieldSalary.getText())
						+ Integer.parseInt(textFieldMaintenance.getText())
						+ Integer.parseInt(textFieldUtility.getText())
						+ Integer.parseInt(textFieldAdvert.getText());
	
				double profit = Integer.parseInt(textFieldIncome.getText())- totalExpense;
				
				textFieldRevenue.setText(String.valueOf(Double.parseDouble(textFieldIncome.getText())));
				textFieldExpenses.setText(String.valueOf(totalExpense));
				textFieldNetIncome.setText(String.valueOf(profit));
			}
		});
		btnCalculate.setFont(new Font("Rockwell", Font.BOLD, 25));
		btnCalculate.setBounds(222, 391, 168, 40);
		contentPane.add(btnCalculate);
		
		JPanel contentPane_1_2 = new JPanel();
		contentPane_1_2.setLayout(null);
		contentPane_1_2.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1_2.setBackground(new Color(153, 204, 255));
		contentPane_1_2.setBounds(426, 71, 305, 279);
		contentPane.add(contentPane_1_2);
		
		JLabel lblSales = new JLabel("Total Revenue");
		lblSales.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblSales.setBounds(10, 49, 141, 33);
		contentPane_1_2.add(lblSales);
		
		textFieldRevenue = new JTextField();
		textFieldRevenue.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldRevenue.setColumns(10);
		textFieldRevenue.setBounds(161, 49, 134, 33);
		contentPane_1_2.add(textFieldRevenue);
		
		JLabel lblTotalExpenses = new JLabel("Total Expenses");
		lblTotalExpenses.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblTotalExpenses.setBounds(10, 120, 161, 33);
		contentPane_1_2.add(lblTotalExpenses);
		
		textFieldExpenses = new JTextField();
		textFieldExpenses.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldExpenses.setColumns(10);
		textFieldExpenses.setBounds(161, 120, 134, 33);
		contentPane_1_2.add(textFieldExpenses);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 187, 285, 2);
		contentPane_1_2.add(separator);
		
		JLabel lblNetIncome = new JLabel("Net Income");
		lblNetIncome.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblNetIncome.setBounds(10, 220, 161, 33);
		contentPane_1_2.add(lblNetIncome);
		
		textFieldNetIncome = new JTextField();
		textFieldNetIncome.setFont(new Font("Rockwell", Font.PLAIN, 20));
		textFieldNetIncome.setColumns(10);
		textFieldNetIncome.setBounds(161, 220, 134, 33);
		contentPane_1_2.add(textFieldNetIncome);
		
		JLabel lblIncome_1 = new JLabel("Revenue :");
		lblIncome_1.setForeground(Color.WHITE);
		lblIncome_1.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblIncome_1.setBounds(22, 36, 115, 33);
		contentPane.add(lblIncome_1);
		
		JLabel lblIncome_1_1 = new JLabel("Report");
		lblIncome_1_1.setForeground(new Color(255, 255, 255));
		lblIncome_1_1.setFont(new Font("Rockwell", Font.BOLD, 20));
		lblIncome_1_1.setBounds(538, 36, 115, 33);
		contentPane.add(lblIncome_1_1);
		
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
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Win 8\\git\\ProgAssg3\\ProgAssg3\\Icon\\Finance-Money.png"));
		lblNewLabel_1.setBounds(639, 361, 76, 81);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\Win 8\\git\\ProgAssg3\\ProgAssg3\\Icon\\Finance-Money-Bag-icon.png"));
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(665, 0, 76, 70);
		contentPane.add(lblNewLabel_1_1);
	}
}
