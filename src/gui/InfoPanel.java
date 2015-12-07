package gui;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import behaviour.Element;
import behaviour.GameObject;
import behaviour.RigidBody;

public class InfoPanel extends JPanel {
	
	private static final long serialVersionUID = -334073011480490870L;
	
	Element obj;
	ElementPanel elementPanel;
	
	public void setObj(Element obj){
		clear();
		this.obj = obj;
		draw();
	}
	
	public void draw(){
		if(obj != null){
			if(obj.getClass() == Element.class){
				elementPanel = new ElementPanel(obj);
			} else if(obj.getClass() == GameObject.class){
				elementPanel = new GameObjectPanel((GameObject) obj);
			} else if(obj.getClass() == RigidBody.class){
				elementPanel = new RigidBodyPanel((RigidBody) obj);
			}
			add(elementPanel);
			revalidate();
		}
	}
	public void clear(){
		if(elementPanel != null)
			elementPanel.removeAll();
	}
	
	/*public void reload(){
		if(obj != null){
			nameField.setText(obj.getName());
			gameObjPanel.reload();
			rigidBodyPanel.reload();
		}
	}*/
	
	public InfoPanel(){
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
		clear();
		draw();
	}
	
	
}
