/* Assignment: C11A-1
 * Authors: Haleema Elsayed, Mimi Rai
 * MyDrawings Class
 * Main method and creating a new cat object
 * 
 */

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyDrawing extends JPanel {
	private Cat cat;
	private Cat cat2;
	private Cat cat3;
	private Ladybug bug;
	private Ladybug bug2;
	
	//constructor
	public MyDrawing() 
	{
		// Add critters to the drawing
		cat = new Cat();
		cat2 = new Cat();
		cat3 = new Cat();
		bug = new Ladybug();
		bug2 = new Ladybug();
	}
	// paintComponent is called automatically when the frame needs
	// to display (e.g., when the program starts)
	public void paintComponent(Graphics g) {
		cat.draw(g, 50, 50);
		cat2.draw(g, 250,  150);
		cat3.draw(g, 500, 500);
		bug.draw(g, 400, 100);
		bug2.draw(g,  100,  400);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		// Create a JPanel (MyDrawing), we'll draw on this
		frame.setContentPane(new MyDrawing());
		// Program will end when the window is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Set the size (otherwise only title bar displays)
		frame.setSize(750, 750);
		
		// Frame will not display until you set visible true
		frame.setVisible(true);
	}

}
