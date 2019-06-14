import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;

public class frame13 {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame13 window = new frame13();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//Connection connection = null;
	/**
	 * Create the application.
	 */
	public frame13() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//connection = sqliteConnection.dbConnector();
		frame = new JFrame();
		
		frame.setBounds(100, 100, 531, 477);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton Home = new JButton("Home");
		Home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame4 info = new frame4( );
				frame.setVisible(false);
				frame4.main(null);
			}
		});
		Home.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		Home.setBackground(Color.WHITE);
		Home.setBounds(0, 0, 118, 39);
		frame.getContentPane().add(Home);
		//Image image = new ImageIcon(this.getClass().getResource("/common3.png")).getImage();
		
		JButton btnApplyForPolicy = new JButton("Apply For Policy");
		btnApplyForPolicy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame14 info = new frame14( );
				frame.setVisible(false);
				frame14.main(null);
			}
		});
		
		JButton btnShowPolicy = new JButton("Show Policies");
		btnShowPolicy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance","root" ,"root" );
						String query ="Select * from policy";
								//+ " where terms like '%cc.getText()%cc'";
						Statement stmt = connection.createStatement();
						ResultSet rs = stmt.executeQuery(query);
						table.setModel(DbUtils.resultSetToTableModel(rs));
						
					}catch(Exception e1)
				{
						System.err.println(e1);
				}
			}
		});
		btnShowPolicy.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		btnShowPolicy.setBackground(Color.WHITE);
		btnShowPolicy.setBounds(30, 65, 155, 29);
		frame.getContentPane().add(btnShowPolicy);
		btnApplyForPolicy.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		btnApplyForPolicy.setBackground(Color.WHITE);
		btnApplyForPolicy.setBounds(149, 341, 220, 39);
		frame.getContentPane().add(btnApplyForPolicy);
		
		JLabel lblPolicyId = new JLabel("Policy ID");
		lblPolicyId.setForeground(Color.WHITE);
		lblPolicyId.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblPolicyId.setBackground(new Color(0, 0, 139));
		lblPolicyId.setBounds(10, 132, 157, 27);
		frame.getContentPane().add(lblPolicyId);
		
		table = new JTable();
		table.setBounds(10, 170, 495, 138);
		frame.getContentPane().add(table);
		
		JLabel lblNewLabel = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("/common2.png")).getImage();
		
		JLabel lblPolicyName = new JLabel("Policy Name");
		lblPolicyName.setForeground(Color.WHITE);
		lblPolicyName.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblPolicyName.setBackground(new Color(0, 0, 139));
		lblPolicyName.setBounds(101, 132, 157, 27);
		frame.getContentPane().add(lblPolicyName);
		
		JLabel lblTerms = new JLabel("Terms");
		lblTerms.setForeground(Color.WHITE);
		lblTerms.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblTerms.setBackground(new Color(0, 0, 139));
		lblTerms.setBounds(226, 132, 157, 27);
		frame.getContentPane().add(lblTerms);
		
		JLabel lblPeriod = new JLabel("Period");
		lblPeriod.setForeground(Color.WHITE);
		lblPeriod.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblPeriod.setBackground(new Color(0, 0, 139));
		lblPeriod.setBounds(298, 132, 157, 27);
		frame.getContentPane().add(lblPeriod);
		
		JLabel lblPrimiumAmount = new JLabel("Primium amount");
		lblPrimiumAmount.setForeground(Color.WHITE);
		lblPrimiumAmount.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblPrimiumAmount.setBackground(new Color(0, 0, 139));
		lblPrimiumAmount.setBounds(380, 132, 157, 27);
		frame.getContentPane().add(lblPrimiumAmount);
		lblNewLabel.setIcon(new ImageIcon(image));
		lblNewLabel.setBounds(0, 0, 515, 438);
		frame.getContentPane().add(lblNewLabel);
	}
}
