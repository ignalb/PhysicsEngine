package behaviour;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RigidBodyPanel extends JPanel {

	private static final long serialVersionUID = 2146620027857085465L;

	RigidBody obj;
	
	public RigidBodyPanel(RigidBody obj){
		this.obj = obj;
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
		JPanel propertiesPanel = new JPanel();
		
		propertiesPanel.setBorder(BorderFactory.createTitledBorder("Properties"));
		
		// Mass //
		JTextField massM = new JTextField(String.valueOf(obj.getMass()));
		massM.setPreferredSize(new Dimension(50, 25));
		propertiesPanel.add(new JLabel("Mass"));
		propertiesPanel.add(massM);
		
		add(propertiesPanel);
		
		// ActionEvents //
		massM.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				obj.setMass(Double.parseDouble(massM.getText()));
			}
		});
		
	}
	
}
