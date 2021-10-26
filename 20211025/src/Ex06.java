import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Ex06 {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel lblNewLabel;
	private JTextField txtId;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex06 window = new Ex06();
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
	public Ex06() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(61, 50, 116, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(61, 81, 116, 21);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton_1 = new JButton("go!");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBounds(189, 80, 97, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		lblNewLabel = new JLabel("\t\tHi Hi");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 12));
		lblNewLabel.setBounds(12, 10, 237, 30);
		frame.getContentPane().add(lblNewLabel);
		
		txtId = new JTextField();
		txtId.setFont(new Font("±¼¸²", Font.BOLD, 12));
		txtId.setHorizontalAlignment(SwingConstants.CENTER);
		txtId.setText("ID");
		txtId.setBounds(12, 50, 39, 21);
		frame.getContentPane().add(txtId);
		txtId.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setFont(new Font("±¼¸²", Font.BOLD, 12));
		txtPassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtPassword.setText("P.W");
		txtPassword.setBounds(12, 81, 39, 21);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
	}
}
