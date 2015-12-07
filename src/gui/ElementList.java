package gui;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import behaviour.Element;
import behaviour.GameObject;
import behaviour.RigidBody;

public class ElementList extends JList<Element> {

	private static final long serialVersionUID = 1157114008976063573L;

	public ElementList(DefaultListModel<Element> model, InfoPanel panel){
		super(model);
		setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		setLayoutOrientation(JList.VERTICAL);
		
		model.addElement(new RigidBody("Square"));	// DEBUG
		model.addElement(new RigidBody("Sphere"));
		model.addElement(new GameObject("Ground"));
		
		addListSelectionListener(new ListSelectionListener(){
			public void valueChanged(ListSelectionEvent e) {
				if(!e.getValueIsAdjusting()){
					Element obj = model.get(getSelectedIndex());
					panel.setObj(obj);
				}
			}
		});
		
	}
	
}
