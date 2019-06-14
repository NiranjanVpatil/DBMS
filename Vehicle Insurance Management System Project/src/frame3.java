import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

public class frame3 {

	private JFrame frame;
	private JTextField Customer_Id;
	private JLabel lblPassword;
	private JButton btnBack;
	private JPasswordField l_passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame3 window = new frame3();
					window.frame.setVisible(true);
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
	public frame3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 531, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { 
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance","root" ,"root" );
					Statement stmt = con.createStatement();
					String sql="select * from customer where Customer_ID='"+Customer_Id.getText()+"'and Password ='"+l_passwordField.getText()+"'";
				    ResultSet rs=stmt.executeQuery(sql); 
				    
					if(rs.next())
					{
						JOptionPane.showMessageDialog(null,"Sucessfully Login");
						frame4 info = new frame4( );
						frame.setVisible(false);
						frame4.main(null);
		
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Account is unsuccessfully Login.");
						
					}
					con.close();
				}catch(Exception e) {System.out.println(e);}
				
		
				
		}
		});
		btnSubmit.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		btnSubmit.setBackground(Color.WHITE);
		btnSubmit.setBounds(200, 251, 118, 39);
		frame.getContentPane().add(btnSubmit);
		
		JLabel lblNewLabel = new JLabel("Customer ID");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(83, 112, 118, 27);
		frame.getContentPane().add(lblNewLabel);
		
		Customer_Id = new JTextField();
		Customer_Id.setFont(new Font("Cambria", Font.PLAIN, 14));
		Customer_Id.setBackground(Color.WHITE);
		Customer_Id.setBounds(244, 115, 226, 22);
		frame.getContentPane().add(Customer_Id);
		Customer_Id.setColumns(10);
		
		lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblPassword.setBackground(new Color(0, 0, 139));
		lblPassword.setBounds(94, 174, 107, 27);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("/login.png")).getImage();
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame1 info = new frame1( );
				frame.setVisible(false);
				frame1.main(null);
			}
		});
		
		l_passwordField = new JPasswordField();
		l_passwordField.setBounds(244, 179, 226, 20);
		frame.getContentPane().add(l_passwordField);
		btnBack.setForeground(Color.BLACK);
		btnBack.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(0, 0, 118, 39);
		frame.getContentPane().add(btnBack);
		lblNewLabel_1.setIcon(new ImageIcon(image));
		lblNewLabel_1.setBounds(0, 0, 515, 382);
		frame.getContentPane().add(lblNewLabel_1);
		
	}
}
