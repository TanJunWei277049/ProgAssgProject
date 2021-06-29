package Project;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class SStorageDescription extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SStorageDescription frame = new SStorageDescription();
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
	public SStorageDescription() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 688, 486);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(224, 96, 438, 225);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Storage Type", "Price Per Day", "Location"
			}
		));
		table.setFont(new Font("Tahoma", Font.BOLD, 11));
		scrollPane_1.setViewportView(table);
		
		JLabel lblStorageDescription = new JLabel("Storage Description");
		lblStorageDescription.setForeground(Color.BLACK);
		lblStorageDescription.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblStorageDescription.setBounds(251, 11, 411, 60);
		contentPane.add(lblStorageDescription);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(102, 153, 255));
		panel.setBounds(-4, 0, 218, 448);
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
		lblStorageDescription_1.setForeground(new Color(255, 255, 255));
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
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Win 8\\git\\ProgAssg3\\ProgAssg3\\Icon\\text-file-icon.png"));
		lblNewLabel_2.setBounds(495, 332, 135, 116);
		contentPane.add(lblNewLabel_2);
		
		JTable t = SManageStorageType.getTable();
		String type;
		String price;
		String location;
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		if (t != null) {
			for(int i = 0; i<t.getRowCount(); i++) {
				type = String.valueOf(t.getValueAt(i, 0));
				price = String.valueOf(t.getValueAt(i, 1));
				location = String.valueOf(t.getValueAt(i, 2));
				
				model.addRow(new Object[]{
						type,
						price,
						location,
				});
				
			}
		}
		
		
	}
}
