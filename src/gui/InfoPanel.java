package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import behaviour.Element;
import behaviour.GameObject;
import behaviour.RigidBody;

import com.sun.javafx.Utils;

public class InfoPanel extends JPanel {
	
	private static final long serialVersionUID = -334073011480490870L;
	
	Element obj = new RigidBody("Square");
	JPanel namePanel = new JPanel();
	GameObjectPanel gameObjPanel = new GameObjectPanel((GameObject) obj);
	RigidBodyPanel rigidBodyPanel = new RigidBodyPanel((RigidBody) obj);
	
	public void setObj(Element obj){
		this.obj = obj;
	}
	
	public void rename(String name){
		obj.setName(name);
	}
	
	public InfoPanel(){
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
		if(obj != null){
			// Name //
			JTextField nameField = new JTextField(obj.getName());
			JButton renameButton = new JButton("Rename");
			nameField.setPreferredSize(new Dimension(150, 25));
			renameButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0) {
					String newName = nameField.getText();
					if(obj.getName() != newName && !Utils.contains(newName, "\\/:*?\"<>|")){
						rename(newName);
					}
				}
			});
			
			namePanel.add(new JLabel("Name"));
			namePanel.add(nameField);
			namePanel.add(renameButton);
			
			// TODO make these by class of obj
				add(namePanel);
				add(new JSeparator());
				add(gameObjPanel);
				add(new JSeparator());
				add(rigidBodyPanel);
				add(new JSeparator());
			
		}
	}
	
	
}
