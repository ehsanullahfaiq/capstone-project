package swing_demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Checkoutpage extends JFrame {

	private JPanel contentPane;
	private JTextField txtXxxxxxxxxxxxxxxx;
	private JTextField txtXxx;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Checkoutpage frame = new Checkoutpage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Checkoutpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 856, 628);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 842, 591);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 165, 0));
		panel_1.setBounds(422, 0, 420, 597);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\MFP2\\Desktop\\New folder\\checkout.jpg"));
		lblNewLabel.setBounds(32, 43, 350, 175);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CARD NUMBER");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(32, 244, 266, 32);
		panel_1.add(lblNewLabel_1);
		
		txtXxxxxxxxxxxxxxxx = new JTextField();
		txtXxxxxxxxxxxxxxxx.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtXxxxxxxxxxxxxxxx.setBounds(32, 284, 259, 30);
		panel_1.add(txtXxxxxxxxxxxxxxxx);
		txtXxxxxxxxxxxxxxxx.setColumns(10);
		
		txtXxx = new JTextField();
		txtXxx.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtXxx.setBounds(310, 284, 72, 30);
		panel_1.add(txtXxx);
		txtXxx.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("CVV");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(345, 248, 100, 30);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("CARD HOLDER NAME");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(32, 324, 266, 32);
		panel_1.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBounds(32, 366, 259, 30);
		panel_1.add(textField);
		
		JLabel lblNewLabel_1_2 = new JLabel("EXPIRATION DATE");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(32, 406, 266, 32);
		panel_1.add(lblNewLabel_1_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV,", "DEC,"}));
		comboBox.setBounds(32, 468, 132, 30);
		panel_1.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox_1.setBounds(250, 468, 132, 30);
		panel_1.add(comboBox_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\MFP2\\Desktop\\photoes\\ONLIN.jpg"));
		lblNewLabel_3.setBounds(0, 0, 425, 591);
		panel.add(lblNewLabel_3);
	}
}
