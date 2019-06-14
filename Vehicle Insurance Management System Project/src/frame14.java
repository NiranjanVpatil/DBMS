import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class frame14 {

	private JFrame frame;
	private JTextField Policy_id;
	private JTextField vehicle_no;
	private JTextField customer_id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame14 window = new frame14();
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
	public frame14() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 521, 477);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("Home");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame4 info = new frame4( );
				frame.setVisible(false);
				frame4.main(null);
			}
		});
		button.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		button.setBackground(Color.WHITE);
		button.setBounds(0, 0, 118, 39);
		frame.getContentPane().add(button);
		
		JLabel Policy_Id = new JLabel(" Policy Id");
		Policy_Id.setForeground(Color.WHITE);
		Policy_Id.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		Policy_Id.setBackground(new Color(0, 0, 139));
		Policy_Id.setBounds(67, 237, 157, 27);
		frame.getContentPane().add(Policy_Id);
		
		JLabel lblVehicleNumber = new JLabel("Vehicle Number");
		lblVehicleNumber.setForeground(Color.WHITE);
		lblVehicleNumber.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblVehicleNumber.setBackground(Color.WHITE);
		lblVehicleNumber.setBounds(67, 165, 157, 27);
		frame.getContentPane().add(lblVehicleNumber);
		
		Policy_id = new JTextField();
		Policy_id.setFont(new Font("Cambria", Font.PLAIN, 14));
		Policy_id.setColumns(10);
		Policy_id.setBackground(Color.WHITE);
		Policy_id.setBounds(263, 240, 219, 22);
		frame.getContentPane().add(Policy_id);
		
		vehicle_no = new JTextField();
		vehicle_no.setFont(new Font("Cambria", Font.PLAIN, 14));
		vehicle_no.setColumns(10);
		vehicle_no.setBackground(Color.WHITE);
		vehicle_no.setBounds(263, 168, 219, 22);
		frame.getContentPane().add(vehicle_no);
		
		JLabel lblTerms = new JLabel("Customer ID");
		lblTerms.setForeground(Color.WHITE);
		lblTerms.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblTerms.setBackground(new Color(0, 0, 139));
		lblTerms.setBounds(67, 97, 157, 27);
		frame.getContentPane().add(lblTerms);
		
		JLabel lblPolicy = new JLabel(" Policy ");
		lblPolicy.setForeground(Color.WHITE);
		lblPolicy.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblPolicy.setBackground(new Color(0, 0, 139));
		lblPolicy.setBounds(210, 12, 157, 27);
		frame.getContentPane().add(lblPolicy);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance","root" ,"root" );
					 java.util.Date date=new java.util.Date();
			            
			            java.sql.Date sqlDate=new java.sql.Date(date.getTime());
			            java.sql.Date sqlDate1=new java.sql.Date(date.getTime()+7*24*60*60*1000);
			            
			            java.sql.Timestamp sqlTime=new java.sql.Timestamp(date.getTime());
					
					Statement stmt = con.createStatement();
					String sql="insert into purchase_policy"
							+"(customer_id,vehicle_no,policy_id,purchase_date,expiry_date) "
							+" values(?,?,?,?,?)";
					String sql1="select period from policy where policy_id='"+Policy_id.getText()+"'";
					PreparedStatement pst=null;
					pst=con.prepareStatement(sql1);
					pst=con.prepareStatement(sql);
					pst.setString(1,customer_id.getText());
					pst.setString(2,vehicle_no.getText());
					pst.setString(3,Policy_id.getText());
					pst.setDate(4,sqlDate);
				    pst.setDate(5,sqlDate1);
				//	pst.setString(4,purchase_date.curdate());
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null,"Thank You For Purchasing Policy.");
					
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
		btnSubmit.setBounds(191, 324, 118, 39);
		frame.getContentPane().add(btnSubmit);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.WHITE);
		Image image = new ImageIcon(this.getClass().getResource("/common3.png")).getImage();
		
		customer_id = new JTextField();
		customer_id.setFont(new Font("Cambria", Font.PLAIN, 14));
		customer_id.setColumns(10);
		customer_id.setBackground(Color.WHITE);
		customer_id.setBounds(263, 102, 219, 22);
		frame.getContentPane().add(customer_id);
		lblNewLabel.setIcon(new ImageIcon(image));
		lblNewLabel.setBounds(0, 0, 505, 435);
		frame.getContentPane().add(lblNewLabel);
	}
}
