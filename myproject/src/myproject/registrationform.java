package myproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class registrationform {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registrationform window = new registrationform();
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
	public registrationform() {
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
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTRATION FORM");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(66, 11, 296, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("ROLLNO");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(43, 73, 67, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("BRANCH");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_3.setBounds(43, 108, 67, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("GENDER");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_4.setBounds(43, 144, 67, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("PROM LANGS");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_5.setBounds(22, 175, 88, 14);
		frame.getContentPane().add(lblNewLabel_5);

		tb1 = new JTextField();
		tb1.setBounds(120, 37, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(120, 70, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT ", "EEE", "ECE", "CSE"}));
		cb1.setBounds(120, 104, 86, 22);
		frame.getContentPane().add(cb1);
		
		JRadioButton r1 = new JRadioButton("MALE");
		r1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		r1.setBounds(117, 140, 109, 23);
		frame.getContentPane().add(r1);
		
		
		JComboBox cb11 = new JComboBox();
		cb11.setFont(new Font("Times New Roman", Font.BOLD, 11));
		cb11.setModel(new DefaultComboBoxModel(new String[] {"SELECT ", "EEE", "ECE", "CSE"}));
		cb11.setBounds(120, 104, 86, 22);
		frame.getContentPane().add(cb11);
		
		JRadioButton r11 = new JRadioButton("MALE");
		JRadioButton r2 = new JRadioButton("FEMALE");
		r2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		r2.setBounds(230, 140, 109, 23);
		frame.getContentPane().add(r2);
		
		JCheckBox c1 = new JCheckBox("C");
		c1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		c1.setBounds(117, 171, 89, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("PYTHON");
		c2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		c2.setBounds(213, 171, 97, 23);
		frame.getContentPane().add(c2);
		
		JCheckBox c3 = new JCheckBox("JAVA");
		c3.setFont(new Font("Times New Roman", Font.BOLD, 11));
		c3.setBounds(312, 171, 97, 23);
		frame.getContentPane().add(c3);

		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				String name=tb1.getText();
				String rollno=tb2.getText();
				String branch=(String)cb11.getSelectedItem();
				String gender="";
				String langs="";
				if(r11.isSelected())
				{
					gender="male";
				}
				if(r2.isSelected())
				{
					gender="female";
				}
				if(c1.isSelected())
				{
					langs=langs+"c";
				}
				if(c2.isSelected())
				{
					langs=langs+"python";
				}
				if(c3.isSelected())
				{
					langs=langs+"java";
				}
				
			JOptionPane.showMessageDialog(btnNewButton,"NAME:"+name+"\n ROLLNO:"+rollno+"\nBRANCH:"+branch+"\nGENDER:"+gender+"\nLANGS:"+langs);
			}	
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(228, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\R (4).jpg"));
		lblNewLabel_1.setBounds(0, 0, 454, 341);
		frame.getContentPane().add(lblNewLabel_1);
		
	}
}
