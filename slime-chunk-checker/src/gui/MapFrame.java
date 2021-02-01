package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MapFrame extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1509559009780568402L;
	JFrame frame = new JFrame();
	ImageIcon icon;
	
	MapFrame(){
		showWindow();
	}
	
	public void showWindow() {
		frame.setTitle("Slime Chunk Checker 1.16+"); //sets title of the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of frame 
		frame.setResizable(false); //prevent frame from being resized 
		frame.setSize(600, 600);
		icon = new ImageIcon(frame.getClass().getResource("/images/icon.png")); //create an ImageIcon
		frame.setIconImage(icon.getImage()); // change icon of frame 
		frame.setBackground(new Color(220,220,220));
		frame.getContentPane().setLayout(null);
		
		frame.setVisible(true); //make frame visible
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
