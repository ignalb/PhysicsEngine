package gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import util.Utils;
import behaviour.RigidBody;

public class RigidBodyPanel extends GameObjectPanel {	//TODO extend GameObject and so on to get class

	private static final long serialVersionUID = 2146620027857085465L;

	JTextField massM;
	RigidBody obj;
	
	public void reload(){
		super.reload();
		if(obj != null){
			massM.setText(String.valueOf(((RigidBody) obj).getMass()));
		}
	}
	
	public RigidBodyPanel(RigidBody obj){
		super(obj);
		this.obj = obj;
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
		JPanel propertiesPanel = new JPanel();
		
		propertiesPanel.setBorder(BorderFactory.createTitledBorder("Properties"));
		
		// Mass //
		massM = new JTextField(String.valueOf(obj.getMass()));
		massM.setPreferredSize(new Dimension(50, 25));
		propertiesPanel.add(new JLabel("Mass"));
		propertiesPanel.add(massM);
		
		add(propertiesPanel);
		
		// ActionEvents //
		massM.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				obj.setMass(Double.parseDouble(massM.getText()));
				Utils.debug("Changed mass of " + obj + " to " + massM.getText());
			}
		});
		
	}
	
}
