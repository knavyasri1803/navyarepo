package myproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class onlinebookstore {
	int items=0;
	int amount=0;

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
					onlinebookstore window = new onlinebookstore();
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
	public onlinebookstore() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(177, 207, 204));
		frame.setBounds(100, 100, 535, 460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("ONLINE BOOK STORE");
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3.setBounds(43, 41, 303, 20);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ITEM");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(224, 89, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("AMOUNT");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(224, 140, 86, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		tb1 = new JTextField();
		tb1.setFont(new Font("Tahoma", Font.BOLD, 12));
		tb1.setBounds(320, 88, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setFont(new Font("Tahoma", Font.BOLD, 12));
		tb2.setBounds(320, 139, 86, 20);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\img6.jpg"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				items=items+1;
				amount=amount+600;
				tb1.setText(""+items);
				tb2.setText(""+amount);
			
}
		});
		btnNewButton_1.setBounds(190, 182, 86, 137);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\img3.jpg"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				amount=amount+450;
				tb1.setText(""+items);
				tb2.setText(""+amount);
			
			}
		});
		btnNewButton_2.setBounds(347, 185, 86, 130);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				amount=amount+500;
				tb1.setText(""+items);
				tb2.setText(""+amount);
			}
		});
		btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\img2.jpg"));
		btnNewButton_1_1.setBounds(43, 185, 86, 137);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JLabel lblNewLabel = new JLabel("RS 500");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(65, 334, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("RS 600");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(212, 334, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("RS 450");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(376, 334, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("BUY NOW");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String items=tb1.getText();
				String amount=tb2.getText();

				JOptionPane.showMessageDialog(btnNewButton,"ITEMS:"+items+"\nAMOUNT:"+amount);
			

				JOptionPane.showMessageDialog(btnNewButton,"ORDER CONFIRMED");
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setBounds(290, 371, 132, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
