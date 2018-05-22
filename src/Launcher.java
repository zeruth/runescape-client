

import java.applet.Applet;

import javax.swing.JFrame;

import net.runelite.rs.RSAppletStub;

public class Launcher {
	
	public static void main(String args[]) {
		JFrame gameFrame = new JFrame("Old School Runescape");
		Applet gameApplet = new Client();
		gameFrame.setSize(800, 600);
		gameApplet.setSize(765, 503);
		gameApplet.setStub(new RSAppletStub());
		gameApplet.init();
		gameFrame.add(gameApplet);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.setVisible(true);
	}

}
