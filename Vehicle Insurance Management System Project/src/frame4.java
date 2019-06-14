import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JPasswordField;
import javax.swing.JLabel;

public class frame4 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame4 window = new frame4();
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
	public frame4() {
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
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame1 info = new frame1( );
				frame.setVisible(false);
				frame1.main(null);
			}
		});
		btnLogout.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		btnLogout.setBackground(Color.WHITE);
		btnLogout.setBounds(397, 0, 118, 39);
		frame.getContentPane().add(btnLogout);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame1 info = new frame1( );
				frame.setVisible(false);
				frame1.main(null);
			}
		});
		btnBack.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(0, 0, 118, 39);
		frame.getContentPane().add(btnBack);
		
		JButton btnPayment = new JButton("Payment");
		btnPayment.setForeground(Color.BLACK);
		btnPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame6 info = new frame6( );
				frame.setVisible(false);
				frame6.main(null);
			}
		});
		btnPayment.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		btnPayment.setBackground(Color.WHITE);
		btnPayment.setBounds(91, 269, 118, 39);
		frame.getContentPane().add(btnPayment);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 515, 382);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBackground(Color.WHITE);
		panel.setBackground(Color.DARK_GRAY);
		Image image = new ImageIcon(this.getClass().getResource("/home.png")).getImage();
		
		JButton btnMyProfile = new JButton("My Profile");
		btnMyProfile.setBounds(292, 271, 137, 39);
		panel.add(btnMyProfile);
		btnMyProfile.setForeground(Color.BLACK);
		btnMyProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame7 info = new frame7( );
				frame.setVisible(false);
				frame7.main(null);
			}
		});
		btnMyProfile.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		btnMyProfile.setBackground(Color.WHITE);
		
		JButton btnInsurance = new JButton("Insurance");
		btnInsurance.setBounds(83, 178, 137, 39);
		panel.add(btnInsurance);
		btnInsurance.setForeground(Color.BLACK);
		btnInsurance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame12 info = new frame12( );
				frame.setVisible(false);
				frame12.main(null);
			}
		});
		btnInsurance.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		btnInsurance.setBackground(Color.WHITE);
		
		JButton btnChangePassword = new JButton("Change password");
		btnChangePassword.setBounds(262, 178, 195, 39);
		panel.add(btnChangePassword);
		btnChangePassword.setForeground(Color.BLACK);
		btnChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame5 info = new frame5( );
				frame.setVisible(false);
				frame5.main(null);
			}
		});
		btnChangePassword.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		btnChangePassword.setBackground(Color.WHITE);
		lblNewLabel_1.setIcon(new ImageIcon(image));
		lblNewLabel_1.setBounds(0, 0, 515, 382);
		panel.add(lblNewLabel_1);
	}
}
