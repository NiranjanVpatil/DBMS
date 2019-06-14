import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class frame12 {

	private JFrame frame;
	private JTextField Customer_id;
	private JTextField Vehicle_number;
	private JTextField Model_number;
	private JTextField model_name;
	private JTextField cc;
	private JTextField Engine_number;
	private JTextField Manufacturing_year;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame12 window = new frame12();
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
	public frame12() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 533, 477);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Vehicle_Number = new JLabel("Vehicle Number");
		Vehicle_Number.setForeground(Color.WHITE);
		Vehicle_Number.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		Vehicle_Number.setBackground(new Color(0, 0, 139));
		Vehicle_Number.setBounds(63, 106, 157, 27);
		frame.getContentPane().add(Vehicle_Number);
		
		JLabel Model_Number = new JLabel("Model Number");
		Model_Number.setForeground(Color.WHITE);
		Model_Number.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		Model_Number.setBackground(new Color(0, 0, 139));
		Model_Number.setBounds(63, 151, 157, 27);
		frame.getContentPane().add(Model_Number);
		
		JLabel CC = new JLabel("CC");
		CC.setForeground(Color.WHITE);
		CC.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		CC.setBackground(new Color(0, 0, 139));
		CC.setBounds(63, 239, 157, 27);
		frame.getContentPane().add(CC);
		
		JLabel Engine_Number = new JLabel("Engine Number");
		Engine_Number.setForeground(Color.WHITE);
		Engine_Number.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		Engine_Number.setBackground(new Color(0, 0, 139));
		Engine_Number.setBounds(63, 282, 157, 27);
		frame.getContentPane().add(Engine_Number);
		
		JLabel Model_name = new JLabel("Model Name");
		Model_name.setForeground(Color.WHITE);
		Model_name.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		Model_name.setBackground(new Color(0, 0, 139));
		Model_name.setBounds(63, 194, 157, 27);
		frame.getContentPane().add(Model_name);
		
		JLabel lblCustomerId = new JLabel("Customer ID");
		lblCustomerId.setForeground(Color.WHITE);
		lblCustomerId.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblCustomerId.setBackground(new Color(0, 0, 139));
		lblCustomerId.setBounds(63, 65, 157, 27);
		frame.getContentPane().add(lblCustomerId);
		
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
		
		JLabel lblInsurance = new JLabel("Insurance");
		lblInsurance.setForeground(Color.WHITE);
		lblInsurance.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 19));
		lblInsurance.setBackground(new Color(0, 0, 139));
		lblInsurance.setBounds(207, 12, 157, 27);
		frame.getContentPane().add(lblInsurance);
		
		JButton btnSelectYourPolicy = new JButton("Select Your Policy");
		btnSelectYourPolicy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance","root" ,"root" );
					Statement stmt = con.createStatement();
					String sql="insert into vehicle"
							+"(customer_id,vehicle_no,model_no,model_name,cc,engine_no,Manufacturing_year) "
							+" values(?,?,?,?,?,?,?)";
					PreparedStatement pst=null;
					pst=con.prepareStatement(sql);
					pst.setString(1,Customer_id.getText());
					pst.setString(2,Vehicle_number.getText());
					pst.setString(3,Model_number.getText());
					pst.setString(4,model_name.getText());
					pst.setString(5,cc.getText());
					pst.setString(6,Engine_number.getText());
					pst.setString(7,Manufacturing_year.getText());

					pst.executeUpdate();
					
				   JOptionPane.showMessageDialog(null,"Vehicle Data is successfully Saved and now purchase policy for vehicle.");
				   frame13 info = new frame13( );
				   frame.setVisible(false);
				   frame13.main(null);
				   con.close();
					
				
				   
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null,e);
						
				}
				
			}
		});
		btnSelectYourPolicy.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		btnSelectYourPolicy.setBackground(Color.WHITE);
		btnSelectYourPolicy.setBounds(154, 385, 195, 39);
		frame.getContentPane().add(btnSelectYourPolicy);
		
		Customer_id = new JTextField();
		Customer_id.setFont(new Font("Cambria", Font.PLAIN, 14));
		Customer_id.setColumns(10);
		Customer_id.setBackground(Color.WHITE);
		Customer_id.setBounds(251, 68, 226, 22);
		frame.getContentPane().add(Customer_id);
		
		Vehicle_number = new JTextField();
		Vehicle_number.setFont(new Font("Cambria", Font.PLAIN, 14));
		Vehicle_number.setColumns(10);
		Vehicle_number.setBackground(Color.WHITE);
		Vehicle_number.setBounds(251, 109, 226, 22);
		frame.getContentPane().add(Vehicle_number);
		
		Model_number = new JTextField();
		Model_number.setFont(new Font("Cambria", Font.PLAIN, 14));
		Model_number.setColumns(10);
		Model_number.setBackground(Color.WHITE);
		Model_number.setBounds(251, 154, 226, 22);
		frame.getContentPane().add(Model_number);
		
		model_name = new JTextField();
		model_name.setFont(new Font("Cambria", Font.PLAIN, 14));
		model_name.setColumns(10);
		model_name.setBackground(Color.WHITE);
		model_name.setBounds(251, 197, 226, 22);
		frame.getContentPane().add(model_name);
		
		cc = new JTextField();
		cc.setFont(new Font("Cambria", Font.PLAIN, 14));
		cc.setColumns(10);
		cc.setBackground(Color.WHITE);
		cc.setBounds(251, 242, 226, 22);
		frame.getContentPane().add(cc);
		
		Engine_number = new JTextField();
		Engine_number.setFont(new Font("Cambria", Font.PLAIN, 14));
		Engine_number.setColumns(10);
		Engine_number.setBackground(Color.WHITE);
		Engine_number.setBounds(251, 285, 226, 22);
		frame.getContentPane().add(Engine_number);
		
		
		Manufacturing_year = new JTextField();
		Manufacturing_year.setFont(new Font("Cambria", Font.PLAIN, 14));
		Manufacturing_year.setColumns(10);
		Manufacturing_year.setBackground(Color.WHITE);
		Manufacturing_year.setBounds(251, 333, 226, 22);
		frame.getContentPane().add(Manufacturing_year);
		
		JLabel lblYyyymmdd = new JLabel("");
		lblYyyymmdd.setForeground(Color.WHITE);
		lblYyyymmdd.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblYyyymmdd.setBackground(new Color(0, 0, 139));
		lblYyyymmdd.setBounds(31, 341, 210, 44);
		frame.getContentPane().add(lblYyyymmdd);
		
		JLabel lblManufacturingyear = new JLabel("Manufacturing_year");
		lblManufacturingyear.setForeground(Color.WHITE);
		lblManufacturingyear.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblManufacturingyear.setBackground(new Color(0, 0, 139));
		lblManufacturingyear.setBounds(31, 320, 210, 44);
		frame.getContentPane().add(lblManufacturingyear);
		
		JLabel lblNewLabel = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("/common.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(image));
		lblNewLabel.setBounds(0, 0, 514, 435);
		frame.getContentPane().add(lblNewLabel);
	}
}
