import java.awt.EventQueue;

import java.sql.*;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;

import net.proteanit.sql.DbUtils;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JTable;

public class frame11 {

	private JFrame frame;
	private JLabel lblStreetName;
	private JTextField Last_name;
	private JTextField First_name;
	private JTextField City;
	private JTextField Street_name;
	private JTextField Pincode;
	private JTextField Phone_number;
	private JTextField Annual_income;
	private JLabel lblCity;
	private JLabel Create_password;
	private JLabel lblNewLabel;
	private JPasswordField Password;
	private JTable table;
	private JButton btnCustomerid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame11 window = new frame11();
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
	public frame11() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 507, 678);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 516, 639);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblFirstName.setBackground(new Color(0, 0, 139));
		lblFirstName.setBounds(36, 184, 162, 20);
		panel.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblLastName.setBackground(new Color(0, 0, 139));
		lblLastName.setBounds(36, 225, 162, 20);
		panel.add(lblLastName);
		lblStreetName = new JLabel("Street Name");
		lblStreetName.setForeground(Color.WHITE);
		lblStreetName.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblStreetName.setBackground(new Color(0, 0, 139));
		lblStreetName.setBounds(36, 321, 162, 20);
		panel.add(lblStreetName);
		
		JLabel lblPinCode = new JLabel("Pin Code");
		lblPinCode.setForeground(Color.WHITE);
		lblPinCode.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblPinCode.setBackground(new Color(0, 0, 139));
		lblPinCode.setBounds(36, 430, 162, 20);
		panel.add(lblPinCode);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setForeground(Color.WHITE);
		lblPhoneNumber.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblPhoneNumber.setBackground(new Color(0, 0, 139));
		lblPhoneNumber.setBounds(36, 278, 162, 20);
		panel.add(lblPhoneNumber);
		
		JLabel lblAnnualIncome = new JLabel("Annual Income");
		lblAnnualIncome.setForeground(Color.WHITE);
		lblAnnualIncome.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblAnnualIncome.setBackground(new Color(0, 0, 139));
		lblAnnualIncome.setBounds(36, 475, 162, 20);
		panel.add(lblAnnualIncome);
		
		Last_name = new JTextField();
		Last_name.setForeground(Color.BLACK);
		Last_name.setFont(new Font("Cambria", Font.PLAIN, 14));
		Last_name.setColumns(10);
		Last_name.setBackground(Color.WHITE);
		Last_name.setBounds(225, 225, 226, 22);
		panel.add(Last_name);
		
		First_name = new JTextField();
		First_name.setForeground(Color.BLACK);
		First_name.setFont(new Font("Cambria", Font.PLAIN, 14));
		First_name.setColumns(10);
		First_name.setBackground(Color.WHITE);
		First_name.setBounds(225, 184, 226, 22);
		panel.add(First_name);
		
		City = new JTextField();
		City.setForeground(Color.BLACK);
		City.setFont(new Font("Cambria", Font.PLAIN, 14));
		City.setColumns(10);
		City.setBackground(Color.WHITE);
		City.setBounds(225, 375, 226, 22);
		panel.add(City);
		
		Street_name = new JTextField();
		Street_name.setForeground(Color.BLACK);
		Street_name.setFont(new Font("Cambria", Font.PLAIN, 14));
		Street_name.setColumns(10);
		Street_name.setBackground(Color.WHITE);
		Street_name.setBounds(225, 321, 226, 22);
		panel.add(Street_name);
		
		Pincode = new JTextField();
		Pincode.setForeground(Color.BLACK);
		Pincode.setFont(new Font("Cambria", Font.PLAIN, 14));
		Pincode.setColumns(10);
		Pincode.setBackground(Color.WHITE);
		Pincode.setBounds(225, 428, 226, 22);
		panel.add(Pincode);
		
		Phone_number = new JTextField();
		Phone_number.setForeground(Color.BLACK);
		Phone_number.setFont(new Font("Cambria", Font.PLAIN, 14));
		Phone_number.setColumns(10);
		Phone_number.setBackground(Color.WHITE);
		Phone_number.setBounds(225, 278, 226, 22);
		panel.add(Phone_number);
		
		Annual_income = new JTextField();
		Annual_income.setForeground(Color.BLACK);
		Annual_income.setFont(new Font("Cambria", Font.PLAIN, 14));
		Annual_income.setColumns(10);
		Annual_income.setBackground(Color.WHITE);
		Annual_income.setBounds(225, 475, 226, 22);
		panel.add(Annual_income);
		
		Password = new JPasswordField();
		Password.setBounds(225, 143, 226, 20);
		panel.add(Password);
		
		lblCity = new JLabel("City");
		lblCity.setForeground(Color.WHITE);
		lblCity.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblCity.setBackground(new Color(0, 0, 139));
		lblCity.setBounds(36, 375, 162, 20);
		panel.add(lblCity);
		
		JButton Submit = new JButton("Submit");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance","root" ,"root" );
					Statement stmt = con.createStatement();
					String sql="insert into Customer"
							+"(Password, Customer_firstname, Customer_lastname, Phone_number, Street_name, City, Pincode,Annual_income) "
							+" values(?,?,?,?,?,?,?,?)";
					PreparedStatement pst=null;
					pst=con.prepareStatement(sql);
					pst.setString(1,Password.getText());
					pst.setString(2,First_name.getText());
					pst.setString(3,Last_name.getText());
					pst.setString(4,Phone_number.getText());
					pst.setString(5,Street_name.getText());
					pst.setString(6,City.getText());
					pst.setString(7,Pincode.getText());
					pst.setString(8,Annual_income.getText());
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null,"Account is successfully created.");
				  //  String sql1="select Customer_ID from customer where Phone_number= '"+Phone_number.getText()+"'";
				    //pst=con.prepareStatement(sql1);
				    //JOptionPane.showMessageDialog(null,);
					String query ="select Customer_ID from customer where Phone_number= '"+Phone_number.getText()+"'";
					//+ " where terms like '%cc.getText()%cc'";
			Statement stmt1 = con.createStatement();
			ResultSet rs = stmt1.executeQuery(query);
			table.setModel(DbUtils.resultSetToTableModel(rs));
				
					
					 	
					con.close();
					
				
				   
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null,e);
						
				}
				
		
			}
		});
		Submit.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		Submit.setBackground(Color.WHITE);
		Submit.setBounds(176, 539, 118, 39);
		panel.add(Submit);
		
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame1 info = new frame1( );
				frame1.main(null);
			}
		});
		btnBack.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(0, 0, 118, 39);
		panel.add(btnBack);
		Image image = new ImageIcon(this.getClass().getResource("/signup.png")).getImage();
		
		table = new JTable();
		table.setBounds(265, 608, 226, 20);
		panel.add(table);
		
		Create_password = new JLabel("Create Passord");
		Create_password.setForeground(Color.WHITE);
		Create_password.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		Create_password.setBackground(new Color(0, 0, 139));
		Create_password.setBounds(36, 141, 162, 20);
		panel.add(Create_password);
		
		lblNewLabel = new JLabel("");
		Image image1 = new ImageIcon(this.getClass().getResource("/logi.jpg")).getImage();
		
		btnCustomerid = new JButton("Customer_ID");
		btnCustomerid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection connection1 =DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance","root" ,"root" );
					String query = "select Customer_ID from customer where Phone_number= '"+Phone_number.getText()+"'";
					Statement stmt1 = connection1.createStatement();
					ResultSet rs = stmt1.executeQuery(query);
					table.setModel(DbUtils.resultSetToTableModel(rs));
					frame3 info = new frame3( );
					frame.setVisible(false);
					frame3.main(null);
					connection1.close();
					
				}catch(Exception e1)
			{
					System.err.println(e1);
			}
				
				
			}
		});
		btnCustomerid.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		btnCustomerid.setBackground(Color.WHITE);
		btnCustomerid.setBounds(25, 589, 145, 39);
		panel.add(btnCustomerid);
		lblNewLabel.setIcon(new ImageIcon(image1));
		lblNewLabel.setBounds(0, 0, 491, 639);
		panel.add(lblNewLabel);
	}
}
