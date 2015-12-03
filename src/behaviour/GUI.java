package behaviour;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JSplitPane;

public class GUI {

	public static void main(String[] args){
		String title = "Simulation";
		JFrame window = new JFrame(title);
		Scene scene = new Scene();
		Workspace work = new Workspace();
		JSplitPane pane;
		
		pane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, scene, work);
		pane.setPreferredSize(new Dimension(920+270, 540));
		
		window.add(pane, BorderLayout.CENTER);
		window.pack();
		
		pane.setDividerSize(3);
		pane.setDividerLocation(0.6);
		
		
		window.setVisible(true);
	}
	
}
