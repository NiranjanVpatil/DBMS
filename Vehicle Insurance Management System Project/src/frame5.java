import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.management.MBeanException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class frame5 {

	private JFrame frame;
	private JTextField Customer_ID;
	private JPasswordField Old_password;
	private JPasswordField New_password;
	private JPasswordField Conform_password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame5 window = new frame5();
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
	public frame5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 530, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCustomerId = new JLabel("Customer ID");
		lblCustomerId.setForeground(Color.WHITE);
		lblCustomerId.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblCustomerId.setBackground(new Color(0, 0, 139));
		lblCustomerId.setBounds(44, 75, 118, 27);
		frame.getContentPane().add(lblCustomerId);
		
		JLabel lblOldPassword = new JLabel("Old Password");
		lblOldPassword.setForeground(Color.WHITE);
		lblOldPassword.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblOldPassword.setBackground(new Color(0, 0, 139));
		lblOldPassword.setBounds(44, 119, 131, 27);
		frame.getContentPane().add(lblOldPassword);
		
		JLabel lblNewPassword = new JLabel("New Password");
		lblNewPassword.setForeground(Color.WHITE);
		lblNewPassword.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblNewPassword.setBackground(new Color(0, 0, 139));
		lblNewPassword.setBounds(44, 173, 142, 27);
		frame.getContentPane().add(lblNewPassword);
		
		JLabel lblConformPassword = new JLabel("Conform Password");
		lblConformPassword.setForeground(Color.WHITE);
		lblConformPassword.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblConformPassword.setBackground(new Color(0, 0, 139));
		lblConformPassword.setBounds(44, 223, 190, 27);
		frame.getContentPane().add(lblConformPassword);
		
		Old_password = new JPasswordField();
		Old_password.setBounds(259, 124, 226, 20);
		frame.getContentPane().add(Old_password);
		
		Customer_ID = new JTextField();
		Customer_ID.setForeground(Color.BLACK);
		Customer_ID.setFont(new Font("Cambria", Font.PLAIN, 14));
		Customer_ID.setColumns(10);
		Customer_ID.setBackground(Color.WHITE);
		Customer_ID.setBounds(259, 78, 226, 22);
		frame.getContentPane().add(Customer_ID);
		
		JButton btnSet = new JButton("Set");
		btnSet.setForeground(Color.BLACK);
		btnSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance","root" ,"root" );
					String query = "update customer set password ='"+New_password.getText()+"'where customer_id='"+Customer_ID.getText()+"'";
					java.sql.PreparedStatement statement = con.prepareStatement(query);
					statement.execute();
					JOptionPane.showMessageDialog(null,"Password is Change");
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				frame4 info = new frame4( );
				frame.setVisible(false);
				frame4.main(null);
			}
		});
		
		New_password = new JPasswordField();
		New_password.setBounds(259, 178, 226, 20);
		frame.getContentPane().add(New_password);
		btnSet.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		btnSet.setBackground(Color.WHITE);
		btnSet.setBounds(193, 292, 118, 39);
		frame.getContentPane().add(btnSet);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame4 info = new frame4( );
				frame.setVisible(false);
				frame4.main(null);
			}
		});
		btnHome.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		btnHome.setBackground(Color.WHITE);
		btnHome.setBounds(0, 0, 118, 39);
		frame.getContentPane().add(btnHome);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setForeground(Color.WHITE);
		Image image = new ImageIcon(this.getClass().getResource("/common.png")).getImage();
		
		Conform_password = new JPasswordField();
		Conform_password.setBounds(259, 228, 226, 20);
		frame.getContentPane().add(Conform_password);
		lblNewLabel.setIcon(new ImageIcon(image));
		lblNewLabel.setBounds(0, 0, 514, 381);
		frame.getContentPane().add(lblNewLabel);
	}

}
