import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frame8 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame8 window = new frame8();
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
	public frame8() {
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
		
		JLabel Personal_info = new JLabel("Personal Info");
		Personal_info.setForeground(Color.WHITE);
		Personal_info.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		Personal_info.setBackground(new Color(0, 0, 139));
		Personal_info.setBounds(190, 6, 139, 27);
		frame.getContentPane().add(Personal_info);
		
		JLabel lblCustomerId = new JLabel("Customer ID");
		lblCustomerId.setForeground(Color.WHITE);
		lblCustomerId.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblCustomerId.setBackground(new Color(0, 0, 139));
		lblCustomerId.setBounds(58, 60, 107, 27);
		frame.getContentPane().add(lblCustomerId);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblFirstName.setBackground(new Color(0, 0, 139));
		lblFirstName.setBounds(58, 98, 107, 27);
		frame.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblLastName.setBackground(new Color(0, 0, 139));
		lblLastName.setBounds(58, 136, 107, 27);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblAddress.setBackground(new Color(0, 0, 139));
		lblAddress.setBounds(58, 176, 107, 27);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblStreetName = new JLabel("Street Name");
		lblStreetName.setForeground(Color.WHITE);
		lblStreetName.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblStreetName.setBackground(new Color(0, 0, 139));
		lblStreetName.setBounds(58, 214, 139, 27);
		frame.getContentPane().add(lblStreetName);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setForeground(Color.WHITE);
		lblCity.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblCity.setBackground(new Color(0, 0, 139));
		lblCity.setBounds(58, 252, 107, 27);
		frame.getContentPane().add(lblCity);
		
		JLabel lblPincode = new JLabel("Pincode");
		lblPincode.setForeground(Color.WHITE);
		lblPincode.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblPincode.setBackground(new Color(0, 0, 139));
		lblPincode.setBounds(58, 290, 107, 27);
		frame.getContentPane().add(lblPincode);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setForeground(Color.WHITE);
		lblPhoneNumber.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblPhoneNumber.setBackground(new Color(0, 0, 139));
		lblPhoneNumber.setBounds(58, 333, 139, 27);
		frame.getContentPane().add(lblPhoneNumber);
		
		JButton Home = new JButton("Home");
		Home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame4 info = new frame4( );
				frame.setVisible(false);
				frame4.main(null);
			}
		});
		Home.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		Home.setBackground(Color.WHITE);
		Home.setBounds(0, 0, 118, 39);
		frame.getContentPane().add(Home);
		
		JButton btnMyProfile = new JButton("My Profile");
		btnMyProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame7 info = new frame7( );
				frame.setVisible(false);
				frame7.main(null);
			}
		});
		btnMyProfile.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		btnMyProfile.setBackground(Color.WHITE);
		btnMyProfile.setBounds(384, 0, 130, 39);
		frame.getContentPane().add(btnMyProfile);
		
		JTabbedPane Customer_id = new JTabbedPane(JTabbedPane.TOP);
		Customer_id.setBounds(240, 65, 193, 22);
		frame.getContentPane().add(Customer_id);
		
		JTabbedPane First_name = new JTabbedPane(JTabbedPane.TOP);
		First_name.setBounds(240, 103, 193, 22);
		frame.getContentPane().add(First_name);
		
		JTabbedPane Last_name = new JTabbedPane(JTabbedPane.TOP);
		Last_name.setBounds(240, 136, 193, 22);
		frame.getContentPane().add(Last_name);
		
		JTabbedPane Address = new JTabbedPane(JTabbedPane.TOP);
		Address.setBounds(240, 176, 193, 22);
		frame.getContentPane().add(Address);
		
		JTabbedPane Street_name = new JTabbedPane(JTabbedPane.TOP);
		Street_name.setBounds(240, 214, 193, 22);
		frame.getContentPane().add(Street_name);
		
		JTabbedPane City = new JTabbedPane(JTabbedPane.TOP);
		City.setBounds(240, 257, 193, 22);
		frame.getContentPane().add(City);
		
		JTabbedPane Pincode = new JTabbedPane(JTabbedPane.TOP);
		Pincode.setBounds(240, 295, 193, 22);
		frame.getContentPane().add(Pincode);
		
		JTabbedPane Phone_number = new JTabbedPane(JTabbedPane.TOP);
		Phone_number.setBounds(240, 338, 193, 22);
		frame.getContentPane().add(Phone_number);
		
		JLabel lblNewLabel = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("/common3.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(image));
		lblNewLabel.setBounds(0, 0, 514, 382);
		frame.getContentPane().add(lblNewLabel);
	}
}
