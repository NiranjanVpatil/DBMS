import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class notification {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					notification window = new notification();
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
	public notification() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 520, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNotification = new JLabel("Notification");
		lblNotification.setForeground(Color.WHITE);
		lblNotification.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblNotification.setBackground(new Color(0, 0, 139));
		lblNotification.setBounds(167, 12, 190, 27);
		frame.getContentPane().add(lblNotification);
		
		JButton button = new JButton("Home");
		button.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 17));
		button.setBackground(Color.WHITE);
		button.setBounds(0, 0, 118, 39);
		frame.getContentPane().add(button);
		
		JLabel lblThisPolicyIs = new JLabel("This Policy is expired on date ");
		lblThisPolicyIs.setForeground(Color.WHITE);
		lblThisPolicyIs.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblThisPolicyIs.setBackground(new Color(0, 0, 139));
		lblThisPolicyIs.setBounds(10, 89, 347, 27);
		frame.getContentPane().add(lblThisPolicyIs);
		
		JTabbedPane Expiry_date = new JTabbedPane(JTabbedPane.TOP);
		Expiry_date.setBounds(305, 94, 168, 22);
		frame.getContentPane().add(Expiry_date);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(43, 190, 439, 164);
		frame.getContentPane().add(tabbedPane);
		
		JLabel lblAvailablePolicies = new JLabel("Available  Policies");
		lblAvailablePolicies.setForeground(Color.WHITE);
		lblAvailablePolicies.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
		lblAvailablePolicies.setBackground(new Color(0, 0, 139));
		lblAvailablePolicies.setBounds(10, 151, 347, 27);
		frame.getContentPane().add(lblAvailablePolicies);
		
		JLabel lblNewLabel = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("/common2.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(image));
		lblNewLabel.setBounds(0, 0, 504, 381);
		frame.getContentPane().add(lblNewLabel);
	}

}
