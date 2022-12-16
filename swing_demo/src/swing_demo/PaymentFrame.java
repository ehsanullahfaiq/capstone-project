package swing_demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class PaymentFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaymentFrame frame = new PaymentFrame();
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
	public PaymentFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 996, 603);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Product Description", "Profesh meets performance. With business-casual style, lightweight fabric, and liquid-resistant tech, this elevated performance pant has all the essentials to go from office hours to happy hours.", "Features", "Zip Pockets", "Water-Resistant", "External Pocket(s)", "Lightweight", "Fabric & Care", "45% Polyester, 45% Recycled Polyester, 10% Spandex", "Imported."}));
		comboBox.setBounds(280, 105, 295, 130);
		contentPane.add(comboBox);
	}
}
