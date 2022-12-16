package swing_demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JSeparator;

public class productFrame2 extends JFrame {

	private JPanel contentPane;
	protected Object lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					productFrame2 frame = new productFrame2();
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
	public productFrame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1045, 671);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(24, 22, 997, 602);
		contentPane.add(tabbedPane);
		
		JPanel Mens = new JPanel();
		tabbedPane.addTab("Mens", null, Mens, null);
		Mens.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 972, 555);
		panel.setBackground(new Color(192, 192, 192));
		Mens.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\MFP2\\Desktop\\New folder\\men jeans.jpg"));
		lblNewLabel_3.setBounds(45, 37, 150, 150);
		panel.add(lblNewLabel_3);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(50, 205, 50));
		separator.setForeground(new Color(34, 139, 34));
		separator.setBounds(432, 10, 0, 508);
		panel.add(separator);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setIcon(new ImageIcon("C:\\Users\\MFP2\\Desktop\\New folder\\men t shit (1).jpeg"));
		lblNewLabel_3_1.setBounds(45, 205, 150, 150);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("New label");
		lblNewLabel_3_2.setIcon(new ImageIcon("C:\\Users\\MFP2\\Desktop\\New folder\\men jaket (1).jpg"));
		lblNewLabel_3_2.setBounds(45, 365, 150, 150);
		panel.add(lblNewLabel_3_2);
		
		JTextArea txtrDescribtion_2 = new JTextArea();
		txtrDescribtion_2.setFont(new Font("Monospaced", Font.BOLD, 14));
		txtrDescribtion_2.setText("80% POLYSTER\r\n20% WOOL\r\nMACHINE WASH\r\n COLD");
		txtrDescribtion_2.setBounds(220, 390, 165, 100);
		panel.add(txtrDescribtion_2);
		
		JTextArea txtrDescribtion_1 = new JTextArea();
		txtrDescribtion_1.setEditable(false);
		txtrDescribtion_1.setFont(new Font("Monospaced", Font.BOLD, 14));
		txtrDescribtion_1.setText("This T-shirts are\r\n a comfortable and\r\n durable alternative\r\n to standard cotton\r\n tees.");
		txtrDescribtion_1.setBounds(220, 241, 165, 100);
		panel.add(txtrDescribtion_1);
		
		JLabel lblNewLabel_4 = new JLabel("Qty");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(500, 95, 30, 30);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Qty");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_1.setBounds(500, 288, 30, 30);
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Qty");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_2.setBounds(500, 427, 30, 30);
		panel.add(lblNewLabel_4_2);
		
		JButton btnNewButton_3 = new JButton("Add Card");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PaymentFrame pm= new PaymentFrame();
				pm.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.setBounds(710, 95, 100, 25);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("Add Card");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PaymentFrame pm= new PaymentFrame();
				pm.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3_1.setBounds(708, 292, 100, 25);
		panel.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_2 = new JButton("Add Card");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PaymentFrame pm= new PaymentFrame();
				pm.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3_2.setBounds(708, 442, 100, 25);
		panel.add(btnNewButton_3_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox.setEditable(true);
		comboBox.setBounds(551, 102, 62, 21);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_1.setEditable(true);
		comboBox_1.setBounds(551, 295, 62, 21);
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_2.setToolTipText("");
		comboBox_2.setEditable(true);
		comboBox_2.setBounds(551, 430, 62, 21);
		panel.add(comboBox_2);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\MFP2\\Desktop\\New folder\\thank.jpeg"));
		lblNewLabel_7.setBounds(432, 0, 540, 555);
		panel.add(lblNewLabel_7);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"Product Description", "Zip Pockets", "Water-Resistant,", "External Pocket(s)", "Lightweight,", "Fabric & Care,", "45% Polyester, ", "45% Recycled Polyester,", " 10% Spandex", "Imported."}));
		comboBox_9.setBounds(205, 37, 217, 30);
		panel.add(comboBox_9);
		
		JPanel Womens = new JPanel();
		tabbedPane.addTab("Womens", null, Womens, null);
		Womens.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(27, 21, 972, 555);
		Womens.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\MFP2\\Desktop\\New folder\\women jeans (1).jpg"));
		lblNewLabel.setBounds(45, 45, 150, 150);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Wjl");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\MFP2\\Desktop\\New folder\\women t shirt.jpg"));
		lblNewLabel_1.setBounds(45, 205, 150, 150);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\MFP2\\Desktop\\New folder\\women jaket.jpg"));
		lblNewLabel_1_1.setBounds(45, 359, 150, 150);
		panel_1.add(lblNewLabel_1_1);
		
		JTextArea txtrDescription = new JTextArea();
		txtrDescription.setText("Description");
		txtrDescription.setBounds(215, 70, 165, 100);
		panel_1.add(txtrDescription);
		
		JTextArea txtrDescription_1 = new JTextArea();
		txtrDescription_1.setText("This shirts are\r\na comfortable and\r\ndurable alternative\r\nto standard cotton\r\ntees.");
		txtrDescription_1.setBounds(215, 241, 165, 100);
		panel_1.add(txtrDescription_1);
		
		JTextArea txtrDescription_2 = new JTextArea();
		txtrDescription_2.setText("80% POLYSTER\r\n20% WOOL\r\nMACHINE WASH\r\n COLD");
		txtrDescription_2.setBounds(215, 384, 165, 100);
		panel_1.add(txtrDescription_2);
		
		JLabel lblNewLabel_2 = new JLabel("Qty");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(500, 95, 30, 30);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Qty");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(500, 285, 30, 30);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Qty");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_2.setBounds(511, 417, 30, 30);
		panel_1.add(lblNewLabel_2_2);
		
		JButton btnNewButton = new JButton("Add Card");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(710, 95, 100, 25);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add Card");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(710, 289, 100, 25);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add Card");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(710, 421, 100, 25);
		panel_1.add(btnNewButton_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox_3.setEditable(true);
		comboBox_3.setBounds(563, 102, 62, 21);
		panel_1.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox_4.setEditable(true);
		comboBox_4.setBounds(563, 291, 62, 21);
		panel_1.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox_5.setEditable(true);
		comboBox_5.setBounds(563, 423, 62, 21);
		panel_1.add(comboBox_5);
		
		JLabel blue = new JLabel("New label");
		blue.setIcon(new ImageIcon("C:\\Users\\MFP2\\Desktop\\New folder\\women page.jpg"));
		blue.setBounds(379, 8, 583, 550);
		blue.setOpaque(true);
		blue.setBackground(new Color(30, 144, 255,150));
		panel_1.add(blue);
		
		JPanel Kids = new JPanel();
		tabbedPane.addTab("Kids", null, Kids, null);
		Kids.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(192, 192, 192));
		panel_2.setBounds(10, 10, 972, 555);
		Kids.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\MFP2\\Desktop\\New folder\\kid pant.jpg"));
		lblNewLabel_5.setBounds(40, 37, 150, 150);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("New label");
		lblNewLabel_5_1.setIcon(new ImageIcon("C:\\Users\\MFP2\\Desktop\\New folder\\kid t shirt.jpeg"));
		lblNewLabel_5_1.setBounds(40, 205, 150, 150);
		panel_2.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("New label");
		lblNewLabel_5_2.setIcon(new ImageIcon("C:\\Users\\MFP2\\Desktop\\New folder\\kid jacket.jpg"));
		lblNewLabel_5_2.setBounds(40, 365, 150, 150);
		panel_2.add(lblNewLabel_5_2);
		
		JTextArea txtrDescription_3 = new JTextArea();
		txtrDescription_3.setText("Description");
		txtrDescription_3.setBounds(264, 64, 150, 100);
		panel_2.add(txtrDescription_3);
		
		JTextArea txtrDescription_3_1 = new JTextArea();
		txtrDescription_3_1.setText("This T-shirts are\r\na comfortable and\r\ndurable alternative\r\nto standard cotton\r\ntees.");
		txtrDescription_3_1.setBounds(264, 233, 150, 100);
		panel_2.add(txtrDescription_3_1);
		
		JTextArea txtrDescription_3_2 = new JTextArea();
		txtrDescription_3_2.setText("80% POLYSTER\r\n20% WOOL\r\nMACHINE WASH\r\n COLD");
		txtrDescription_3_2.setBounds(264, 396, 150, 100);
		panel_2.add(txtrDescription_3_2);
		
		JLabel lblNewLabel_6 = new JLabel("Qty");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_6.setBounds(500, 95, 30, 30);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("Qty");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_6_1.setBounds(500, 274, 30, 30);
		panel_2.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("Qty");
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_6_2.setBounds(500, 423, 30, 30);
		panel_2.add(lblNewLabel_6_2);
		
		JButton btnNewButton_4 = new JButton("Add Card");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_4.setBounds(710, 95, 100, 25);
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("Add Card");
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_4_1.setBounds(723, 281, 100, 25);
		panel_2.add(btnNewButton_4_1);
		
		JButton btnNewButton_4_2 = new JButton("Add Card");
		btnNewButton_4_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_4_2.setBounds(723, 427, 100, 25);
		panel_2.add(btnNewButton_4_2);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox_6.setEditable(true);
		comboBox_6.setBounds(566, 101, 62, 21);
		panel_2.add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox_7.setEditable(true);
		comboBox_7.setBounds(566, 280, 62, 21);
		panel_2.add(comboBox_7);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		comboBox_8.setEditable(true);
		comboBox_8.setBounds(566, 429, 62, 21);
		panel_2.add(comboBox_8);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\MFP2\\Desktop\\New folder\\kid page.jpg"));
		lblNewLabel_8.setBounds(413, 0, 549, 553);
		panel_2.add(lblNewLabel_8);
	}
}
