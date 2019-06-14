import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTree;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.*;

public class frame1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 window = new frame1();
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
	public frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 615, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JLabel label = new JLabel("");
		label.setBounds(166, 63, 46, 14);
		frame.getContentPane().add(label);
		
		JButton btnSignIn = new JButton("Sign in");
		btnSignIn.setBackground(Color.WHITE);
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame3 info = new frame3( );
				frame.setVisible(false);
				frame3.main(null);
			}
		});
		btnSignIn.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		btnSignIn.setBounds(324, 0, 118, 39);
		frame.getContentPane().add(btnSignIn);
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame11 info = new frame11( );
				frame.setVisible(false);
				frame11.main(null);
				
			}
		});
		btnSignUp.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		btnSignUp.setBackground(Color.WHITE);
		btnSignUp.setBounds(480, 0, 118, 39);
		frame.getContentPane().add(btnSignUp);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 606, 400);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("/first.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(image));
		lblNewLabel.setBounds(0, 0, 606, 400);
		panel.add(lblNewLabel);
	}
}
