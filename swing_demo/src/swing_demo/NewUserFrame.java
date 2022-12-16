package swing_demo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class NewUserFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtNam;
	private JTextField txtUser;
	private JPasswordField txtPassword;
	private JPasswordField txtPassword1;
	private JTextField txtMobile;
	private JTextField txtEmail;
	private JTextField txtAddr;
	private JTextField txtdigit;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewUserFrame frame = new NewUserFrame();
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
	public NewUserFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 598);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(77, 35, 58, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UserName");
		lblNewLabel_1.setBounds(77, 73, 69, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(80, 122, 55, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Confirm Password");
		lblNewLabel_3.setBounds(59, 145, 101, 20);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mobile");
		lblNewLabel_4.setBounds(77, 219, 45, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Email");
		lblNewLabel_5.setBounds(77, 242, 45, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Address");
		lblNewLabel_6.setBounds(77, 277, 45, 13);
		contentPane.add(lblNewLabel_6);
		
		txtNam = new JTextField();
		txtNam.setBounds(178, 40, 96, 19);
		contentPane.add(txtNam);
		txtNam.setColumns(10);
		
		txtUser = new JTextField();
		txtUser.setBounds(178, 73, 96, 19);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(178, 119, 138, 19);
		contentPane.add(txtPassword);
		
		txtPassword1 = new JPasswordField();
		txtPassword1.setBounds(178, 157, 138, 19);
		contentPane.add(txtPassword1);
		
		txtMobile = new JTextField();
		txtMobile.setBounds(178, 216, 138, 19);
		contentPane.add(txtMobile);
		txtMobile.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(178, 239, 271, 19);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtAddr = new JTextField();
		txtAddr.setBounds(178, 274, 271, 19);
		contentPane.add(txtAddr);
		txtAddr.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Do you have membership card?");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(45, 325, 200, 28);
		contentPane.add(lblNewLabel_7);
		
		JRadioButton rbYes = new JRadioButton("Yes");
		buttonGroup.add(rbYes);
		rbYes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rbYes.setBounds(251, 327, 69, 21);
		contentPane.add(rbYes);
		
		JRadioButton rbNo = new JRadioButton("No");
		buttonGroup.add(rbNo);
		rbNo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rbNo.setBounds(375, 329, 58, 21);
		contentPane.add(rbNo);
		
		JLabel lblNewLabel_8 = new JLabel("Enter your 3 digit secret code number");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_8.setBounds(45, 396, 244, 20);
		contentPane.add(lblNewLabel_8);
		
		txtdigit = new JTextField();
		txtdigit.setBounds(353, 398, 96, 19);
		contentPane.add(txtdigit);
		txtdigit.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setFont(new Font("Tahoma", Font.BOLD, 18));
btnRegister.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	String Name=txtNam.getText();
	String userName=txtUser.getText();
	String password=txtPassword.getText();;
	int mobileNumber= Integer.parseInt(txtMobile.getText());
	String emailId =txtEmail.getText();
	String address= txtAddr.getText();
	int cardno=Integer.parseInt(txtdigit.getText());
			
			
				try {
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					//PreparedStatement st= con.prepareStatement("Select user_name, password from Newaccount where user_name=? and password=?");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/capsdb","root","Ehsan1999@1378");
					
					
					//String query = "INSERT INTO Newaccount values('" + txtNam + "','" + txtUser + "','" + txtPassword + "','" + txtPassword1 +"','" +
	                   // txtMobile + "','" + txtEmail + "','" + txtAddr + "','"+txtdigit+ "')";
					//String query = "INSERT INTO newaccount values('" + Name + "','" + userName + "','" + password + "','" +
	                  //         mobileNumber + "','" + emailId + "','" + address + "','"+cardno+ "')";
	                     //  PreparedStatement sta = connection.prepareStatement(query);
	                    //   int x = sta.executeUpdate(query);
	                     //  if (x == 0) {
	                         //  JOptionPane.showMessageDialog(btnNewButton, "The record already exist");
	                     // } else {
	                         //  JOptionPane.showMessageDialog(btnNewButton,
	                     //      "Welcome, " + msg + "Your account is sucessfully created");
	                 //      }
	                    // connection.close();
	               
			//}catch(Exception e1){
			//	e1.printStackTrace();
					//String query="insert into Newaccount values(?,?,?,?,?,?,?,)";
					//PreparedStatement st= con.prepareStatement("Select login_name, login_pass from login where login_name=? and login_pass=?");
					PreparedStatement ps=con.prepareStatement("insert into newaccount(name,user_name,password,mobile_number,email_id,address,cardno) values(?,?,?,?,?,?,?)");
					ps.setString(1, txtNam.getText());
					ps.setString(2, txtUser.getText());
					ps.setString(3, txtPassword.getText());
					//ps.setString(4, txtPassword1.getText());
					ps.setInt(4, Integer.parseInt(txtMobile.getText()));
					ps.setString(5, txtEmail.getText());
					ps.setString(6, txtAddr.getText());
					//if(rbYes.isSelected())
						//ps.setString(8,rbYes.getText());
				//	else
						//ps.setString(9,rbNo.getText());
					ps.setInt(7, Integer.parseInt(txtdigit.getText()));
					int i=ps.executeUpdate();
					JOptionPane.showMessageDialog(btnRegister, i+"Successfully Registerd!");
					ps.close();
					con.close();
				} catch (Exception  e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnRegister.setBounds(50, 486, 175, 28);
		contentPane.add(btnRegister);
		
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNam.setText("");
				txtUser.setText("");
				txtPassword.setText("");
				txtPassword1.setText("");
				txtMobile.setText("");
				txtEmail.setText("");
				txtAddr.setText("");
				buttonGroup.clearSelection();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(301, 486, 85, 28);
		contentPane.add(btnNewButton_1);
	}
}
