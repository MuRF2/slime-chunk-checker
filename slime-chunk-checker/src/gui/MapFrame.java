package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MapFrame extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1509559009780568402L;
	JFrame frame = new JFrame();
	ImageIcon icon;
	JPanel top;
	JPanel bottom;
	JTextField seedField;
	JButton refreshButton;
	
	MapFrame(){
		showWindow();
	}
	
	public void showWindow() {
		frame.setTitle("Slime Chunk Checker 1.16+");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		frame.setResizable(false); 
		frame.setSize(600, 600);
		icon = new ImageIcon(frame.getClass().getResource("/images/icon.png"));
		frame.setIconImage(icon.getImage()); 
		frame.setBackground(new Color(220,220,220));
		frame.getContentPane().setLayout(null);
		
		top = new JPanel();
		top.setBounds(0, 0, 594, 519);
		
		bottom = new JPanel();
		bottom.setLayout(new FlowLayout());
		bottom.setBackground(Color.green);
		bottom.setBounds(0, 521, 594, 50);
		
		seedField = new JTextField();
		seedField.setPreferredSize(new Dimension(200,40));
		seedField.setFont(new Font("Arial", Font.BOLD, 15));
		seedField.setHorizontalAlignment(JTextField.CENTER);
		seedField.setForeground(Color.black);
		seedField.setBackground(Color.white);
		seedField.setCaretColor(Color.black);
		seedField.setText("Enter Seed");
		
		refreshButton = new JButton("Refresh");
		refreshButton.addActionListener(this);
		refreshButton.setFocusable(false);
		refreshButton.setFont(new Font("Arial", Font.BOLD, 15));
		
		bottom.add(seedField);
		bottom.add(refreshButton);
		
		frame.getContentPane().add(top);
		frame.getContentPane().add(bottom);
		
		
		frame.setVisible(true); //make frame visible
	}
	
	public void setseedFieldText(String toSet)
	{
		this.seedField.setText(toSet);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
