import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MiniCalculator2 {

	public JFrame frmCalculator;
	private JTextField textField;
	private double a,b,c,d;
	private String op;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniCalculator2 window = new MiniCalculator2();
					window.frmCalculator.setVisible(true);
					window.frmCalculator.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MiniCalculator2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.getContentPane().setForeground(Color.BLACK);
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 638, 550);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("9");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(145, 213, 54, 32);
		frmCalculator.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_1.setBounds(237, 213, 54, 32);
		frmCalculator.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("7");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"7");
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_2.setBounds(331, 213, 54, 32);
		frmCalculator.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("6");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_3.setBounds(145, 273, 54, 32);
		frmCalculator.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_4.setBounds(237, 273, 54, 32);
		frmCalculator.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("4");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_5.setBounds(331, 273, 54, 32);
		frmCalculator.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("3");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_6.setBounds(145, 326, 54, 32);
		frmCalculator.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("2");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		btnNewButton_7.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_7.setBounds(237, 326, 54, 32);
		frmCalculator.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("1");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText()+"1");
			
			}
		});
		btnNewButton_8.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_8.setBounds(331, 326, 54, 32);
		frmCalculator.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		btnNewButton_9.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_9.setBounds(237, 384, 54, 32);
		frmCalculator.getContentPane().add(btnNewButton_9);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 30));
		textField.setBounds(117, 67, 479, 71);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_10 = new JButton("+");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			a= Double.parseDouble(textField.getText());	
			textField.setText("");
			op="+";
			textField.requestFocus();
			}
		});
		btnNewButton_10.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_10.setBounds(529, 211, 54, 32);
		frmCalculator.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("-");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a= Double.parseDouble(textField.getText());	
				textField.setText("");
				op="-";
				textField.requestFocus();
			}
		});
		btnNewButton_11.setFont(new Font("Times New Roman", Font.BOLD, 28));
		btnNewButton_11.setBounds(529, 270, 54, 32);
		frmCalculator.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("*");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a= Double.parseDouble(textField.getText());	
				textField.setText("");
				op="*";
				textField.requestFocus();
			}
		});
		btnNewButton_12.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_12.setBounds(529, 324, 54, 32);
		frmCalculator.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("/");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a= Double.parseDouble(textField.getText());	
				textField.setText("");
				op="/";
				textField.requestFocus();
			}
		});
		btnNewButton_13.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_13.setBounds(529, 382, 54, 32);
		frmCalculator.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("AC");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton_14.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_14.setBounds(449, 327, 54, 32);
		frmCalculator.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton(".");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+".");
				
			}
		});
		btnNewButton_15.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_15.setBounds(145, 381, 54, 35);
		frmCalculator.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("=");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(op)
				{
				case "+":
					b=Double.parseDouble(textField.getText());
					textField.setText("");
					c= a+b;
					textField.setText(String.valueOf(c));
					break;
				case "-":
					b=Double.parseDouble(textField.getText());
					textField.setText("");
					c= a-b;
					textField.setText(String.valueOf(c));
					break;
				case "*":
					b=Double.parseDouble(textField.getText());
					textField.setText("");
					c= a*b;
					textField.setText(String.valueOf(c));
					break;
				case "/":
					b=Double.parseDouble(textField.getText());
					textField.setText("");
					c= a/b;
					textField.setText(String.valueOf(c));
					break;
				}
			    
			}
		});
		btnNewButton_16.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnNewButton_16.setBounds(449, 384, 54, 32);
		frmCalculator.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("a \u00B2");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a= Double.parseDouble(textField.getText());
				c=a*a;
				textField.setText(String.valueOf(c));
				textField.requestFocus();	
			}
		});
		btnNewButton_17.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton_17.setBounds(449, 213, 54, 32);
		frmCalculator.getContentPane().add(btnNewButton_17);
		
		JButton btnNewButton_19 = new JButton("\u221Aa");
		btnNewButton_19.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b=Double.parseDouble(textField.getText());
				b=a*a;
				d=(b/a);
				textField.setText(String.valueOf(d));
				textField.requestFocus();
			}
		});
		btnNewButton_19.setBounds(449, 274, 54, 32);
		frmCalculator.getContentPane().add(btnNewButton_19);
		
		JButton btnNewButton_18 = new JButton("\u232B");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	          
			}
		});
		btnNewButton_18.setBounds(331, 386, 54, 32);
		frmCalculator.getContentPane().add(btnNewButton_18);
		
		JButton btnNewButton_20 = new JButton("Back");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyGuiapp window = new MyGuiapp();
				window.frame.setVisible(true);
				window.frame.setLocationRelativeTo(null);
				frmCalculator.setVisible(false);
				
			}
		});
		btnNewButton_20.setBounds(186, 445, 85, 21);
		frmCalculator.getContentPane().add(btnNewButton_20);
	}
}
