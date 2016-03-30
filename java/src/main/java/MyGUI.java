import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

/**
 * A demo of GUI programming with Swing
 */
public class MyGUI extends JFrame {
	
	public MyGUI() {
		super("MyGUI");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton theButton = new JButton("Click me!");
		theButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("You clicked me!");
			}
		});

		JButton button2 = new JButton("No, click me!");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("haha I win");
			}
		});

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		panel.add(theButton);
		panel.add(button2);
		this.add(panel);
		
		this.pack();
		this.setVisible(true);		
	}
	
	public static void main(String[] args) {
    	new MyGUI(); //create the frame
  	}
}
