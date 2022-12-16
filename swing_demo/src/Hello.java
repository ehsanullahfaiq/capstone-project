import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import swing_demo.NewUserFrame;
//import swing_demo.ProductFrame2;
import swing_demo.productFrame2;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
public class Hello extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hello frame = new Hello();
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
	public Hello() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 666);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel userLabel = new JLabel("UserName:");
		userLabel.setForeground(Color.MAGENTA);
		userLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		userLabel.setBounds(100, 60, 200, 26);
		contentPane.add(userLabel);
		
		JLabel pwdLabel = new JLabel("Password");
		pwdLabel.setBackground(Color.DARK_GRAY);
		pwdLabel.setForeground(Color.MAGENTA);
		pwdLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		pwdLabel.setBounds(100, 120, 200, 30);
		contentPane.add(pwdLabel);
		
		textField = new JTextField();
		textField.setBounds(245, 61, 200, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(245, 123, 200, 30);
		contentPane.add(passwordField);
		
		JButton loginButton = new JButton("Login");
		loginButton.setForeground(Color.MAGENTA);
		loginButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		 loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=textField.getText();
				String password=passwordField.getText();
				
				// It is optional for JDBC4.x version
			      try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			      // variables
			      final String url = "jdbc:mysql:///capsdb";
			      final String user = "root";
			      final String password1 = "Ehsan1999@1378";
			      // establish the connection
			      Connection con;
				try {
					con = DriverManager.getConnection(url, user, password1);
				      // display status message
				      if (con == null) {
				         System.out.println("JDBC connection is not established");
				         return;
				      } else
				         System.out.println("Congratulations," +
				              " JDBC connection is established successfully.\n");
					
				//PreparedStatement st= con.prepareStatement("Select * from login ");
					PreparedStatement st= con.prepareStatement("Select login_name, login_pass from login where login_name=? and login_pass=?");
					//PreparedStatement st= con.prepareStatement("Select user_name, password from Newaccount where user_name=? and password=?");
					st.setString(1, username);
					st.setString(2, password);
					ResultSet rs = st.executeQuery();
					//System.out.println(rs);
					
		
			      if(rs.next()) {
						System.out.println("Hello  " +username +" !");
						productFrame2 pd =new productFrame2();
						//ProductFrame pd =new ProductFrame();
						pd.setVisible(true);
						dispose();
						
					}
					else
						System.out.println("Wrong password");
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			    
			      // close JDBC connection
			     // con.close();
			}
		});
		 loginButton.setBounds(286, 181, 85, 21);
		contentPane.add( loginButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setForeground(Color.MAGENTA);
		btnNewButton_1.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
		btnNewButton_1.setBounds(349, 404, 96, 26);
	    contentPane.add(btnNewButton_1);
	    ImageIcon icon=new ImageIcon(this.getClass().getResource("/shoping.jpg"));
	    
	    JButton btnNewButton = new JButton("New User");
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		NewUserFrame User = new NewUserFrame();
	    		User.setVisible(true);
	    		
	    	}
	    	
	    });
	    btnNewButton.setForeground(Color.MAGENTA);
	    btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
	    btnNewButton.setBounds(83, 185, 123, 26);
	    contentPane.add(btnNewButton);
	    
	    JLabel NewLabel = new JLabel("");
	    NewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
	    NewLabel.setFont(new Font("Tahoma", Font.BOLD, 54));
	    NewLabel.setBounds(10, 10, 510, 619);
	    NewLabel.setIcon(icon);
	    
	    contentPane.add(NewLabel);
		
	}
}