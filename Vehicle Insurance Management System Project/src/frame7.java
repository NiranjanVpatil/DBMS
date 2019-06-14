import java.awt.EventQueue;
import java.awt.image.*;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frame7 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame7 window = new frame7();
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
	public frame7() {
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
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(327, 197, 4, 22);
		frame.getContentPane().add(textArea);
		
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
		
		JButton Purchased_Policy = new JButton("Purchased Policy");
		Purchased_Policy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame10 info = new frame10( );
				frame.setVisible(false);
				frame10.main(null);
			}
		});
		Purchased_Policy.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		Purchased_Policy.setBackground(Color.WHITE);
		Purchased_Policy.setBounds(269, 169, 206, 39);
		frame.getContentPane().add(Purchased_Policy);
		
		JButton btnVehicle = new JButton("Vehicle ");
		btnVehicle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame10 info = new frame10( );
				frame.setVisible(false);
				frame10.main(null);
			}
		});
		btnVehicle.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		btnVehicle.setBackground(Color.WHITE);
		btnVehicle.setBounds(69, 169, 158, 39);
		frame.getContentPane().add(btnVehicle);
		
		JLabel lblNewLabel = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("/common3.png")).getImage();
		
		JLabel lblMyProfile = new JLabel("My Profile");
		lblMyProfile.setForeground(Color.WHITE);
		lblMyProfile.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 19));
		lblMyProfile.setBackground(new Color(0, 0, 139));
		lblMyProfile.setBounds(219, 34, 157, 27);
		frame.getContentPane().add(lblMyProfile);
		lblNewLabel.setIcon(new ImageIcon(image));
		lblNewLabel.setBounds(0, 0, 514, 381);
		frame.getContentPane().add(lblNewLabel);
		
		
	}
}
