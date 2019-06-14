import java.awt.EventQueue;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class frame6 {

	private JFrame frame;
	private JTextField Customer_ID;
	private JTextField Vehicle_number;
	private JTextField Amount;
	private JTextField Payment;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame6 window = new frame6();
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
	public frame6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 530, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setForeground(Color.WHITE);
		lblAmount.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblAmount.setBackground(new Color(0, 0, 139));
		lblAmount.setBounds(80, 176, 107, 27);
		frame.getContentPane().add(lblAmount);
		
		JLabel lblPolicyId = new JLabel("Vehicle_number");
		lblPolicyId.setForeground(Color.WHITE);
		lblPolicyId.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblPolicyId.setBackground(new Color(0, 0, 139));
		lblPolicyId.setBounds(80, 121, 162, 27);
		frame.getContentPane().add(lblPolicyId);
		
		JLabel lblCustomerId = new JLabel("Customer ID");
		lblCustomerId.setForeground(Color.WHITE);
		lblCustomerId.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblCustomerId.setBackground(new Color(0, 0, 139));
		lblCustomerId.setBounds(80, 64, 129, 27);
		frame.getContentPane().add(lblCustomerId);
		
		JRadioButton rdbtnCreditCard = new JRadioButton("Credit card");
		rdbtnCreditCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnCreditCard.isSelected()==true) {
					Payment.setText("Credit card");
				}
			}
		});
		rdbtnCreditCard.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 13));
		rdbtnCreditCard.setBounds(48, 302, 109, 23);
		frame.getContentPane().add(rdbtnCreditCard);
		
		JLabel lblPaymentBy = new JLabel("Payment By");
		lblPaymentBy.setForeground(Color.WHITE);
		lblPaymentBy.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblPaymentBy.setBackground(new Color(0, 0, 139));
		lblPaymentBy.setBounds(80, 231, 144, 27);
		frame.getContentPane().add(lblPaymentBy);
		
		JRadioButton rdbtnBank = new JRadioButton("Bank");
		rdbtnBank.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnBank.isSelected()==true) {
					Payment.setText("Bank");
				}
			}
		});
		rdbtnBank.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 13));
		rdbtnBank.setBounds(190, 302, 109, 23);
		frame.getContentPane().add(rdbtnBank);
		
		JRadioButton rdbtnDebitCard = new JRadioButton("Debit card");
		rdbtnDebitCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtnDebitCard.isSelected()==true) {
					Payment.setText("Debit card");
				}
			}
		});
		rdbtnDebitCard.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 13));
		rdbtnDebitCard.setBounds(323, 302, 109, 23);
		frame.getContentPane().add(rdbtnDebitCard);
		
		Customer_ID = new JTextField();
		Customer_ID.setForeground(Color.BLACK);
		Customer_ID.setFont(new Font("Cambria", Font.PLAIN, 14));
		Customer_ID.setColumns(10);
		Customer_ID.setBackground(Color.WHITE);
		Customer_ID.setBounds(293, 64, 183, 22);
		frame.getContentPane().add(Customer_ID);
		
		Vehicle_number = new JTextField();
		Vehicle_number.setForeground(Color.BLACK);
		Vehicle_number.setFont(new Font("Cambria", Font.PLAIN, 14));
		Vehicle_number.setColumns(10);
		Vehicle_number.setBackground(Color.WHITE);
		Vehicle_number.setBounds(293, 124, 183, 22);
		frame.getContentPane().add(Vehicle_number);
		
		Amount = new JTextField();
		Amount.setForeground(Color.BLACK);
		Amount.setFont(new Font("Cambria", Font.PLAIN, 14));
		Amount.setColumns(10);
		Amount.setBackground(Color.WHITE);
		Amount.setBounds(293, 179, 183, 22);
		frame.getContentPane().add(Amount);
		
		JButton Home = new JButton("Home");
		Home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame4 info = new frame4( );
				frame.setVisible(false);
				frame4.main(null);
			}
		});
		
		Payment = new JTextField();
		Payment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
			
		});
		Payment.setForeground(Color.BLACK);
		Payment.setFont(new Font("Cambria", Font.PLAIN, 14));
		Payment.setColumns(10);
		Payment.setBackground(Color.WHITE);
		Payment.setBounds(293, 236, 183, 22);
		frame.getContentPane().add(Payment);
		Home.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		Home.setBackground(Color.WHITE);
		Home.setBounds(0, 0, 118, 39);
		frame.getContentPane().add(Home);
		
		JButton Logout = new JButton("Logout");
		Logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame1 info = new frame1( );
				frame.setVisible(false);
				frame1.main(null);
			}
		});
		Logout.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		Logout.setBackground(Color.WHITE);
		Logout.setBounds(396, 0, 118, 39);
		frame.getContentPane().add(Logout);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance","root" ,"root" );
					
					
					java.util.Date date=new java.util.Date();
		            
		            java.sql.Date sqlDate=new java.sql.Date(date.getTime());
		            java.sql.Date sqlDate1=new java.sql.Date(date.getTime()+31*24*60*60*1000);
		            
		            java.sql.Timestamp sqlTime=new java.sql.Timestamp(date.getTime());
				
					
					Statement stmt = con.createStatement();
					String sql="insert into payment"
							+"(customer_id,  payment_date, Premium_amount, card_details,vehicle_no) "
							+" values(?,?,?,?,?)";
					PreparedStatement pst=null;
					pst=con.prepareStatement(sql);
					pst.setString(1,Customer_ID.getText());
					pst.setString(5,Vehicle_number.getText());
					pst.setDate(2,sqlDate);
					pst.setString(3,Amount.getText());
					pst.setString(4,Payment.getText());
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null,"Payment is Done");
					
					 	frame3 info = new frame3( );
					 	frame.setVisible(false);
						frame3.main(null);
					con.close();
					
				
				   
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null,e);
						
				}
				
				frame4 info = new frame4( );
				frame4.main(null);
			}
		});
		btnSubmit.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		btnSubmit.setBackground(Color.WHITE);
		btnSubmit.setBounds(190, 332, 118, 39);
		frame.getContentPane().add(btnSubmit);
		
		JLabel lblNewLabel = new JLabel("New label");
		Image image = new ImageIcon(this.getClass().getResource("/common.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(image));
		lblNewLabel.setBounds(0, 0, 514, 382);
		frame.getContentPane().add(lblNewLabel);
	}
}
