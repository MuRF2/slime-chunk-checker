package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

import chunk.SlimeChunk;


/**
 * 
 * @author MuRF2
 *
 */
public class StartFrame extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -750988579919629416L;
	
	JFrame frame = new JFrame();
	ImageIcon icon;
	ImageIcon image;
	JPanel top;
	JPanel bottom;
	JLabel intro;
	JTextField seedField;
	JTextField xChunkCo;
	JTextField zChunkCo;
	JButton submitButton;
	JButton mapButton;
	SlimeChunk chunk = new SlimeChunk();
	
	private boolean seedFieldStart=true;
	private boolean xChunkCoStart=true;
	private boolean zChunkCoStart=true;
	
	javax.swing.border.Border border = BorderFactory.createLineBorder(Color.green,3);
	
	/**
	 * Constructor 
	 */
	public StartFrame(){
		showWindow();
	}
	
	public void showWindow() {
		frame.setTitle("Slime Chunk Checker 1.16+"); //sets title of the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of frame 
		frame.setResizable(false); //prevent frame from being resized 
		//frame.setSize(420, 420); //sets the x-dimension and y-dimension of frame 
		//frame.setSize(425, 255);
		//frame.setSize(430, 260);
		frame.setSize(500, 260);
		icon = new ImageIcon(this.getClass().getResource("/images/icon.png")); //create an ImageIcon
		frame.setIconImage(icon.getImage()); // change icon of frame 
		frame.setBackground(new Color(220,220,220));
		//this.getContentPane().setBackground(new Color(220,220,220)); // change color of background 
		frame.getContentPane().setLayout(null);
		
		top = new JPanel();
		//top.setBackground(Color.red);
		//top.setBounds(0, 0, 420, 170);
		top.setBounds(34, 0, 420, 170);
		
		bottom = new JPanel();
		bottom.setLayout(new FlowLayout());
		//bottom.setBackground(Color.green);
		//bottom.setBounds(0, 170, 420, 50);
		bottom.setBounds(0, 170, 494, 50);
		
		intro = new JLabel();
		image = new ImageIcon(this.getClass().getResource("/images/Tropical_Slime.gif"));
		intro.setText("<html><body> In Java Edition, \"slime chunks\" are determined <br>pseudo-randomly by combining their chunk <br> coordinates with the seed of the world.<br>This tool checks if the specified chunk can<br> spawn slimes using the world seed and the<br> specific chunk coordinates.  </body></html>"); //set text of Label
		intro.setIcon(image);
		intro.setHorizontalTextPosition(JLabel.RIGHT); //set text LEFT, CENTER; RIGHT of imageicon
		intro.setVerticalTextPosition(JLabel.CENTER); //set text TOP, CENTER, BOTTOM of imageicon
		intro.setForeground(Color.black); //set color of text
		intro.setFont(new Font("Arial",Font.PLAIN,11)); //set font of text
		intro.setIconTextGap(10); //set gap of text to image
		//intro.setBackground(new Color(220,220,220)); //set background color
		intro.setOpaque(true); //display background color
		//intro.setBorder(border); 
		intro.setVerticalAlignment(JLabel.TOP); //set vertical position of icon+text within label
		intro.setHorizontalAlignment(JLabel.LEFT); //set horizontal position of icon+text within frame
		//intro.setBounds(0,10,413,160); //set x,y position within frame as well as dimension
		
		seedField = new JTextField();
		seedField.setPreferredSize(new Dimension(200,40));
		seedField.setFont(new Font("Arial", Font.BOLD, 15));
		seedField.setHorizontalAlignment(JTextField.CENTER);
		seedField.setForeground(Color.black);
		seedField.setBackground(Color.white);
		seedField.setCaretColor(Color.black);
		seedField.setText("Enter Seed");
		
		/**
		 * FocusListener to remove the placeholder text with mouse or tab
		 */
		seedField.addFocusListener(new FocusListener() {
	        @Override
	        public void focusGained(FocusEvent e) {                
	        	if(seedFieldStart==true) {
		    		seedField.setText("");
		    		setseedFieldStart(false);
		    	}
	        }

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
			}
		});    
		
		xChunkCo = new JTextField();
		xChunkCo.setPreferredSize(new Dimension(50,40));
		xChunkCo.setFont(new Font("Arial", Font.BOLD, 15));
		xChunkCo.setHorizontalAlignment(JTextField.CENTER);
		xChunkCo.setForeground(Color.black);
		xChunkCo.setBackground(Color.white);
		xChunkCo.setCaretColor(Color.black);
		xChunkCo.setText("X");
		
		/**
		 * FocusListener to remove the placeholder text with mouse or tab
		 */
		xChunkCo.addFocusListener(new FocusListener() {
	        @Override
	        public void focusGained(FocusEvent e) {                
	        	if(xChunkCoStart==true) {
		    		xChunkCo.setText("");
		    		setxChunkCoStart(false);
		    	}
	        }

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
			}
		});    
	    
		zChunkCo = new JTextField();
		zChunkCo.setPreferredSize(new Dimension(50,40));
		zChunkCo.setFont(new Font("Arial", Font.BOLD, 15));
		zChunkCo.setHorizontalAlignment(JTextField.CENTER);
		zChunkCo.setForeground(Color.black);
		zChunkCo.setBackground(Color.white);
		zChunkCo.setCaretColor(Color.black);
		zChunkCo.setText("Z");
		
		/**
		 * FocusListener to remove the placeholder text with mouse or tab
		 */
		zChunkCo.addFocusListener(new FocusListener() {
	        @Override
	        public void focusGained(FocusEvent e) {                
	        	if(zChunkCoStart==true) {
		    		zChunkCo.setText("");
		    		setzChunkCoStart(false);
		    	}
	        }

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
			}
		});    
		
		submitButton = new JButton("Submit");
		submitButton.addActionListener(this);
		submitButton.setFocusable(false);
		submitButton.setFont(new Font("Arial", Font.BOLD, 15));
		
		mapButton = new JButton("Map");
		mapButton.addActionListener(this);
		mapButton.setFocusable(false);
		mapButton.setFont(new Font("Arial", Font.BOLD, 15));
		
		top.add(intro);
		
		bottom.add(seedField);
		bottom.add(xChunkCo);
		bottom.add(zChunkCo);
		bottom.add(submitButton);
		bottom.add(mapButton);
		
		frame.getContentPane().add(top);
		frame.getContentPane().add(bottom);
		
		frame.setVisible(true); //make frame visible
		frame.requestFocusInWindow(); //focus on window
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/**
		 * if Submit button is pressed 
		 */
		if(e.getSource()==submitButton) {
			
			try {
				chunk.setSeed(Long.parseLong(seedField.getText()));
			} catch(Exception nolong) {
				JOptionPane.showMessageDialog(null, "Please enter a valid seed!", "Invalid Input", JOptionPane.ERROR_MESSAGE);	
				seedField.requestFocusInWindow();
				return;
			}
			try {
				chunk.setxPosition(Integer.parseInt(xChunkCo.getText()));
			} catch(Exception noint) {
				JOptionPane.showMessageDialog(null, "Please enter a valid X-Chunk-Coordinate!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
				xChunkCo.requestFocusInWindow();
				return;
			}
			try {
				chunk.setzPosition(Integer.parseInt(zChunkCo.getText()));
			} catch(Exception noint) {
				JOptionPane.showMessageDialog(null, "Please enter a valid Z-Chunk-Coordinate!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
				zChunkCo.requestFocusInWindow();
				return;
			}
			
			chunk.checkChunk();
			if(chunk.isDebugBoolean() == true) {
				JOptionPane.showMessageDialog(null, "The specified chunk is a slime chunk. Slimes will spawn here.", "Slime Chunk found", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(chunk.isDebugBoolean()==false){
				JOptionPane.showMessageDialog(null, "The specified chunk is not a slime chunk. Slimes won't spawn.", "No Slime Chunk found", JOptionPane.INFORMATION_MESSAGE);
			}
		
		}
		
		/**
		 * If Map button is pressed
		 */
		if(e.getSource()==mapButton) {
			MapFrame newFrame = new MapFrame();
			newFrame.setSeedFieldText(seedField.getText());
		}
	}	
	
	public void setxChunkCoStart(boolean status) {
		this.xChunkCoStart = status;
	}
	
	public void setzChunkCoStart(boolean status) {
		this.zChunkCoStart = status;
	}
	
	public void setseedFieldStart(boolean status) {
		this.seedFieldStart = status;
	}
	
}
	


