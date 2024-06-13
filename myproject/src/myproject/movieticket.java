package myproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTree;

public class movieticket {

	protected static final int YESOPTION = 0;
	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movieticket window = new movieticket();
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
	public movieticket() {
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
		
		JLabel lblNewLabel = new JLabel("MOVIE TICKET BOOKING");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(82, 11, 273, 21);
		frame.getContentPane().add(lblNewLabel);
		
		
		tb1 = new JTextField();
		tb1.setBounds(183, 59, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setBackground(new Color(255, 255, 255));
		cb1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "crew", "mr&mrs MAHI"}));
		cb1.setBounds(183, 106, 118, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5", "6", "7"}));
		cb2.setBounds(183, 151, 118, 22);
		frame.getContentPane().add(cb2);

		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(50, 62, 69, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MOVIE");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setBounds(50, 110, 100, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NO.OF TICKETS");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3.setBounds(50, 155, 123, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String movie=(String)cb1.getSelectedItem();
				String tickets=(String)cb2.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				int bill=0;
				if(movie.equals("crew"))
				{
					bill=bill+nt*150;
				}
				if(movie.equals("mr&mrs MAHI"))
				{
					bill=bill+nt*250;
				}
				int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton,"NAME:"+name+"\n MOVIE:"+movie+"\nTICKETS:"+tickets+"\nAMOUNT:"+bill);
                if(res==YESOPTION)
                {
                	JOptionPane.showMessageDialog(btnNewButton,"Ticket confirmed HAVE FUN");
                	
                }
                else
                {
                	JOptionPane.showMessageDialog(btnNewButton,"booking Cancelled");
                }			
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnNewButton.setBounds(212, 205, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\R (2).jpg"));
		lblNewLabel_4.setBounds(172, -52, 373, 388);
		frame.getContentPane().add(lblNewLabel_4);
		
			}
}
