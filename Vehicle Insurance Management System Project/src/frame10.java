import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;
import javax.swing.JTextField;

public class frame10 {

	private JFrame frame;
	private JTable table;
	private JTextField Customer_ID;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame10 window = new frame10();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frame10() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 779, 456);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("Home");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame4 info = new frame4( );
				frame.setVisible(false);
				frame4.main(null);
			}
		});
		button.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		button.setBackground(Color.WHITE);
		button.setBounds(0, 0, 118, 39);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("My Profile");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame7 info = new frame7( );
				frame.setVisible(false);
				frame7.main(null);
			}
		});
		button_1.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(633, 0, 130, 39);
		frame.getContentPane().add(button_1);
		
		JLabel lblVehicle = new JLabel("Vehicle Details");
		lblVehicle.setForeground(Color.WHITE);
		lblVehicle.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblVehicle.setBackground(new Color(0, 0, 139));
		lblVehicle.setBounds(10, 69, 157, 27);
		frame.getContentPane().add(lblVehicle);
		
		JLabel lblVehicleNumber = new JLabel("Vehicle Number");
		lblVehicleNumber.setForeground(Color.WHITE);
		lblVehicleNumber.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblVehicleNumber.setBackground(new Color(0, 0, 139));
		lblVehicleNumber.setBounds(38, 101, 140, 27);
		frame.getContentPane().add(lblVehicleNumber);
		
		JLabel lblModelNumber = new JLabel("Model Number");
		lblModelNumber.setForeground(Color.WHITE);
		lblModelNumber.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblModelNumber.setBackground(new Color(0, 0, 139));
		lblModelNumber.setBounds(188, 101, 130, 27);
		frame.getContentPane().add(lblModelNumber);
		
		table = new JTable();
		table.setFont(new Font("Bookman Old Style", Font.ITALIC, 16));
		table.setBounds(38, 139, 700, 39);
		frame.getContentPane().add(table);
		
		JLabel lblModelName = new JLabel("Model Name");
		lblModelName.setForeground(Color.WHITE);
		lblModelName.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblModelName.setBackground(new Color(0, 0, 139));
		lblModelName.setBounds(606, 101, 132, 27);
		frame.getContentPane().add(lblModelName);
		
		JButton btnVehicle = new JButton("Vehicle");
		btnVehicle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance","root" ,"root" );
					String query ="Select Vehicle_No,model_no,cc,engine_no,model_name from vehicle where customer_id='"+Customer_ID.getText()+"'";
					Statement stmt = connection.createStatement();
					ResultSet rs = stmt.executeQuery(query);
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}catch(Exception e1)
			{
					System.err.println(e1);
			}
			}
		});
		
		JLabel label_1 = new JLabel("Customer ID");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		label_1.setBackground(new Color(0, 0, 139));
		label_1.setBounds(183, 34, 118, 27);
		frame.getContentPane().add(label_1);
		
		Customer_ID = new JTextField();
		Customer_ID.setForeground(Color.BLACK);
		Customer_ID.setFont(new Font("Cambria", Font.PLAIN, 14));
		Customer_ID.setColumns(10);
		Customer_ID.setBackground(Color.WHITE);
		Customer_ID.setBounds(333, 37, 226, 22);
		frame.getContentPane().add(Customer_ID);
		
		JLabel lblPurchasedpolicy = new JLabel("Purchased_Policy");
		lblPurchasedpolicy.setForeground(Color.WHITE);
		lblPurchasedpolicy.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblPurchasedpolicy.setBackground(new Color(0, 0, 139));
		lblPurchasedpolicy.setBounds(10, 234, 178, 27);
		frame.getContentPane().add(lblPurchasedpolicy);
		
		table_1 = new JTable();
		table_1.setFont(new Font("Bookman Old Style", Font.ITALIC, 16));
		table_1.setBounds(38, 304, 700, 52);
		frame.getContentPane().add(table_1);
		btnVehicle.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		btnVehicle.setBackground(Color.WHITE);
		btnVehicle.setBounds(333, 195, 118, 39);
		frame.getContentPane().add(btnVehicle);
		
		JLabel lblCc = new JLabel("CC");
		lblCc.setForeground(Color.WHITE);
		lblCc.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblCc.setBackground(new Color(0, 0, 139));
		lblCc.setBounds(311, 101, 157, 27);
		frame.getContentPane().add(lblCc);
		
		JLabel lblEngineNumber = new JLabel("Engine Number");
		lblEngineNumber.setForeground(Color.WHITE);
		lblEngineNumber.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblEngineNumber.setBackground(new Color(0, 0, 139));
		lblEngineNumber.setBounds(447, 101, 140, 27);
		frame.getContentPane().add(lblEngineNumber);
		
		JLabel label = new JLabel(" Policy Id");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		label.setBackground(new Color(0, 0, 139));
		label.setBounds(215, 266, 157, 27);
		frame.getContentPane().add(label);
		
		JButton btnPurchasePolicy = new JButton("Purchase Policy");
		btnPurchasePolicy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance","root" ,"root" );
					String query ="Select Vehicle_No,Policy_id, purchase_date, expiry_date from Purchase_policy where customer_id='"+Customer_ID.getText()+"'";
					Statement stmt = connection.createStatement();
					ResultSet rs = stmt.executeQuery(query);
					table_1.setModel(DbUtils.resultSetToTableModel(rs));
					
				}catch(Exception e1)
			{
					System.err.println(e1);
			}
			}
		});
		btnPurchasePolicy.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		btnPurchasePolicy.setBackground(Color.WHITE);
		btnPurchasePolicy.setBounds(310, 367, 188, 39);
		frame.getContentPane().add(btnPurchasePolicy);
		
		JLabel label_4 = new JLabel("Expiry date");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		label_4.setBackground(new Color(0, 0, 139));
		label_4.setBounds(581, 266, 157, 27);
		frame.getContentPane().add(label_4);
		
		JLabel label_3 = new JLabel("Purchased Date");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		label_3.setBackground(new Color(0, 0, 139));
		label_3.setBounds(402, 266, 157, 27);
		frame.getContentPane().add(label_3);
		
		JLabel lblNewLabel = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("/common2.png")).getImage();
		
		JLabel label_2 = new JLabel("Vehicle Number");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		label_2.setBackground(new Color(0, 0, 139));
		label_2.setBounds(38, 266, 167, 27);
		frame.getContentPane().add(label_2);
		lblNewLabel.setIcon(new ImageIcon(image));
		lblNewLabel.setBounds(0, 0, 763, 417);
		frame.getContentPane().add(lblNewLabel);
		;
	}
}
