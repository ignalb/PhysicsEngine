package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import util.Utils;
import behaviour.Element;


public class ElementPanel extends JPanel {

	private static final long serialVersionUID = -7351436766990785653L;

	Element obj;
	JTextField nameField;
	
	public void rename(String name){
		obj.setName(name);
	}
	
	public ElementPanel(Element obj){
		this.obj = obj;
		
		JPanel namePanel = new JPanel();
		namePanel.setBorder(BorderFactory.createTitledBorder("Name"));
		
		// Name //
		nameField = new JTextField(obj.getName());
		JButton renameButton = new JButton("Rename");
		nameField.setPreferredSize(new Dimension(150, 25));
		namePanel.add(nameField);
		namePanel.add(renameButton);
		renameButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				String newName = nameField.getText();
				if(obj.getName() != newName && !Utils.contains(newName, "\\/:*?\"<>|")){
					Utils.debug("Renaming [" + obj + "] to " + " [" + newName + "]");
					rename(newName);
				} else {
					nameField.setText(obj.getName());
				}
			}
		});
		
		add(namePanel);
		
	}
	
}
