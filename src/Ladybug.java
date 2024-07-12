/* Assignment: C11A-1
 * Authors: Haleema Elsayed, Mimi Rai
 * Ladybug Class
 * Draws a Ladybug!
 * 
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Ladybug {
	// drawing constants are private - noone needs to know what we're doing
		// pick a head dimension
		private static final int BODY = 150;
		//spots on the ladybug
		private static final int SPOTS = 25;
		// eyes will be about 1/4 from top of head and 1/4 from left
		
		
		// draw will render the Ladybug on the Graphics object
		public void draw(Graphics g, int bugX, int bugY)
		{
			Graphics2D g2 = (Graphics2D) g;
			int x=bugX;
			int y=bugY;
			
			// Draw the head
			g2.setColor(Color.red);
			g2.fillOval(x, y, BODY, BODY);
			// Draw the spots
			g2.setColor(Color.black);
			g2.fillOval(x+BODY/2, y+BODY/2, SPOTS, SPOTS);
			g2.fillOval(x+BODY/3, y+ BODY/4, SPOTS, SPOTS);
			g2.fillOval((int)(x+BODY/1.5), y+BODY/4, SPOTS, SPOTS);
			g2.fillOval(x+BODY/10, (int)(y+BODY/1.5), SPOTS, SPOTS);
			g2.fillOval((int)(x+BODY/1.75), (int)(y+BODY/1.4), SPOTS, SPOTS);
			
			g2.setColor(Color.black);
			// Flutter text appears below ladybug head, +10 places below 
			// so it doesn't overlap the drawing
			g2.drawString("Flutter, Flutter!", bugX, bugY+BODY+10);	
		}

}
